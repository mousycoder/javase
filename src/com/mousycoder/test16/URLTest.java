package com.mousycoder.test16;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 4:09 PM
 */
public class URLTest {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://api.xdclass.net:8081/pub/api/v1/web/find_ad_by_id?id=1");
        System.out.println(url.getHost());
        System.out.println(url.getProtocol());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
        System.out.println(url.getFile());

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();

        if (200 <= responseCode && responseCode <= 299) {
            try (InputStream inputStream = httpURLConnection.getInputStream();
                 BufferedReader in = new BufferedReader(new InputStreamReader(inputStream))) {

                StringBuilder response = new StringBuilder();

                String currentLine;
                while ((currentLine = in.readLine()) != null) {
                    response.append(currentLine);
                }

                String jsonStr = response.toString();
                System.out.println(jsonStr);

                Gson gson = new Gson();
                Map<String,Object> map = gson.fromJson(jsonStr, Map.class);

                Object code = map.get("code");
                System.out.println(code);


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}
