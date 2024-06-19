package org.jochoa.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jochoa.constants.Constant;
import org.jochoa.models.Evaluation;
import org.jochoa.models.Evaluator;
import org.jochoa.models.Land;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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

    private URL url;
    private HttpURLConnection httpURLConnection;

    public List<Land> getLands(){
        List<Land> landsList = new ArrayList<>();
        String response = this.makeHttpRequestGet(Constant.URL_ALL_LANDS, Constant.GET);

        Gson jsonResponse = new Gson();
        Type landListType = new TypeToken<List<Land>>() {}.getType();
        List<Land> landList = jsonResponse.fromJson(response.toString(), landListType);
        return landList;

    }

    public List<Evaluator> getEvaluators(){
        List<Evaluator> evaluatorList = new ArrayList<>();
        String response = this.makeHttpRequestGet(Constant.URL_ALL_EVALUATORS, Constant.GET);
        Gson jsonResponse = new Gson();
        Type evaluatorListType = new TypeToken<List<Evaluator>>() {}.getType();
        List<Evaluator> evaluators = jsonResponse.fromJson(response.toString(), evaluatorListType);
        return evaluators;

    }


    private String makeHttpRequestGet(String URL, String methodHTTP){
        String responseResult = null;
        this.prepareRequest(URL, methodHTTP);

        try {
            int responseCode = httpURLConnection.getResponseCode();
            responseResult = this.prepareResponse();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return responseResult;
    }

    private void prepareRequest(String URL, String methodHTTP){
        try {

                 url = new URL(URL);



                httpURLConnection  = (HttpURLConnection) url.openConnection();


            httpURLConnection.setRequestMethod(methodHTTP);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String prepareResponse(){
        String responseResult = null;
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  responseResult;
    }


    public void sendPostRequest(String evaluation) {
        prepareRequest(Constant.URL_SAVE_EVALUATIONS, Constant.POST);
        OutputStream outputStream = null;
        System.out.println(evaluation.toString());

        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            outputStream = httpURLConnection.getOutputStream();
            System.out.println(evaluation.toString());
            outputStream.write(evaluation.getBytes());
            outputStream.flush();
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
