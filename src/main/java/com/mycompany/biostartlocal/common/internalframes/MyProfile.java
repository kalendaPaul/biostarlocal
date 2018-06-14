/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biostartlocal.common.internalframes;

import com.google.gson.Gson;
import com.mycompany.biostartlocal.LoginAction;
import com.mycompany.biostartlocal.loginclass;
import com.mycompany.biostartlocal.userlist;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author gk
 */
public class MyProfile {
    public String myuserlist = null;
     public String myprofile(String snID) throws IOException, URISyntaxException
    {
//        loginclass lgin = new loginclass();
//        String snID = lgin.LoginAction(userid, password);
        String content= null;
        Gson gson = new Gson();
//        String json = "{\n" +
//"  \"enroll_quality\": 80,\n" +
//"  \"retrieve_raw_image\": true\n" +
//"}";
        
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        URI uri = new URIBuilder("http://127.0.0.1:8795/v2/users/my_profile")
                .build();
        HttpGet postNewUser = new HttpGet(uri);
        
        CookieStore cookieStore = new BasicCookieStore();
	BasicClientCookie cookie = new BasicClientCookie("bs-cloud-session-id",snID);
	cookie.setDomain("127.0.0.1");
	cookie.setPath("/");
	cookieStore.addCookie(cookie);
        
        HttpClientContext context = HttpClientContext.create();
        context.setCookieStore(cookieStore);

	try (CloseableHttpResponse httpResponse = httpClient.execute(postNewUser,context)) {
        content = EntityUtils.toString(httpResponse.getEntity());
 
        int statusCode = httpResponse.getStatusLine().getStatusCode();
//        System.out.println("statusCode = " + statusCode);
//        System.out.println("content = " + content);
        if(statusCode== 200)
        {
//            userlist uslist = new userlist();
//            uslist.jsonToMap(content);
            userprofile lgd = new userprofile
           myuserlist=content;
           System.out.println("My list"+myuserlist);

        }
 
        } catch (IOException e) {
            //handle exception
        }
        
        
        return myuserlist;
        
    }
}
