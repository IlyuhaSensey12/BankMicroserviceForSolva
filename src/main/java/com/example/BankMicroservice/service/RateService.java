package com.example.BankMicroservice.service;

import com.example.BankMicroservice.model.RateEntity;
import com.example.BankMicroservice.repository.Repo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

@Service
public class RateService implements IRateService {
    @Autowired
    private Repo repo;

    private RateEntity mapToCurrencyEntity(String jString) {
        JSONObject jObject = new JSONObject(jString);
        RateEntity rateEntity = new RateEntity();
        rateEntity.setCurrency(jObject.getJSONObject("meta").getString("symbol"));
        rateEntity.setClose(jObject.getJSONArray("values").getJSONObject(0).getBigDecimal("close"));
        rateEntity.setDateTime(jObject.getJSONArray("values").getJSONObject(0).getString("datetime"));
        return rateEntity;
    }

    @Override
    public void getAndSaveData() {
        String urlAddress = "https://api.twelvedata.com/time_series?symbol=USD/KZT&interval=1day&apikey=96871c814bad4e3d8e054a33204e5c31";
        repo.save(
                mapToCurrencyEntity(
                        getJsonFromUrl(urlAddress)));
    }


    private static String getJsonFromUrl(String from){
        URL url;
        try {
            url = new URL(from);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        StringBuilder builder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName("UTF-8")))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }

}
