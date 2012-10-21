package com.github.charliecorner.jnarwhal;

import com.github.charliecorner.jnarwhal.constants.LocationStrings;
import com.github.charliecorner.jnarwhal.exceptions.NoValidUserAgentDeclaredException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Charlie Corner
 */
public class Session {

    private List<Cookie> cookies;
//    private Gson gson;
    private HttpClient httpClient;
    private HttpPost httpPost;
    private HttpParams params;
    private HttpContext localContext;
    private CookieStore cookieStore;
    private BasicClientCookie sessionCookie;
    private Date expireDate;
    private String sessionID;
    private String userAgent;
    private String urlPrefix;
    private boolean isUsingSSL;

    public static Session createNewSession(String userAgent)
            throws NoValidUserAgentDeclaredException {

        if (null == userAgent || "".equals(userAgent)) {
            throw new NoValidUserAgentDeclaredException();
        }

        Session session = new Session(userAgent);
        session.isUsingSSL = false;
        session.urlPrefix = "http://";
        return session;
    }

    public static Session createNewSSLSession(String userAgent)
            throws NoValidUserAgentDeclaredException {

        if (null == userAgent || "".equals(userAgent)) {
            throw new NoValidUserAgentDeclaredException();
        }

        Session session = new Session(userAgent);
        session.isUsingSSL = true;
        session.urlPrefix = "https://";
        return session;
    }

    private Session(String userAgent) {
        localContext = new BasicHttpContext();
        cookieStore = new BasicCookieStore();
        localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);


        params = new SyncBasicHttpParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(params, "UTF-8");
        HttpProtocolParams.setUserAgent(params, userAgent);
        HttpProtocolParams.setUseExpectContinue(params, true);
        httpClient = new DefaultHttpClient();
//        gson = new Gson();
    }

    public List<Object> login(String userName, String password) throws UnsupportedEncodingException {
        List<Object> errors = new ArrayList<Object>();
        String url;
        List<NameValuePair> loginParams = new ArrayList<NameValuePair>();
        loginParams.add(new BasicNameValuePair("api_type", "json"));
        loginParams.add(new BasicNameValuePair("user", userName));
        loginParams.add(new BasicNameValuePair("passwd", password));
        
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(loginParams, "UTF-8");
               
        if (isUsingSSL) {
            StringBuilder sb = new StringBuilder(urlPrefix)
                    .append(LocationStrings.SSL_LOGIN);
            sb = sb.append('/').append(userName);
            url = sb.toString();
        } else {
            StringBuilder sb = new StringBuilder(urlPrefix)
                    .append(LocationStrings.REDDIT_MAIN_SITE_URL)
                    .append(LocationStrings.SIMPLE_LOGIN);
            sb = sb.append('/').append(userName);
            url = sb.toString();
        }

        httpPost = new HttpPost(url);
        System.out.println(url);
        httpPost.setParams(params);
        httpPost.setEntity(entity);
        
        try {
            ObjectMapper om = new ObjectMapper();
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String response = httpClient.execute(httpPost, responseHandler);
            JsonNode jsonResponse = om.readTree(response).path("json");
            this.cookies = ((DefaultHttpClient)httpClient).
                    getCookieStore().getCookies();
            errors = om.readValue(
                    jsonResponse.path("errors"), ArrayList.class);
            
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
                
        return errors;
    }
}
