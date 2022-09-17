package com.example.appnhac.Sevice;

public class APISevice {

    private static String base_url = "https://inept-equivalent.000webhostapp.com/Server/";

    public static Datasevice getSevice(){
        return APIRetrofitClient.getClient(base_url).create(Datasevice.class);
    }
}
