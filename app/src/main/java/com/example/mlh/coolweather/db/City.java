package com.example.mlh.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MLH on 2017/2/20.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        return this.id;
    }

    public void  setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return  cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName ;
    }

    public  int getCityCode(){
        return cityCode;
    }

    public  void setCityCode(int citycode){
        this.cityCode = citycode;
    }

    public int getProvinceId(){
        return  provinceId;
    }
    public  void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
