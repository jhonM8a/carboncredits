package org.jochoa.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jochoa.constants.Constant;
import org.jochoa.models.Land;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RequestService {
    private static String URL = "";
    public RequestService(){}

    public List<Land> getLands(){
        List<Land> landsList = new ArrayList<>();
        String response = this.makeHttpRequest(Constant.URL_ALL_LANDS, Constant.GET);

        System.out.println(response.toString());
        Gson jsonResponse = new Gson();
        Type landListType = new TypeToken<List<Land>>() {}.getType();
        List<Land> landList = jsonResponse.fromJson(response.toString(), landListType);
        return landList;

    }


    private String makeHttpRequest(String URL, String methodHTTP){
        String responseResult = null;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(URL);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(methodHTTP);
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // 200 OK
                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                responseResult = response.toString();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return responseResult;
    }

}
