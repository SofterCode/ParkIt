package com.map524.parkit.parkit;

import java.util.ArrayList;

public class ParkingDataModel{
    private Integer id;
    private Double lat;
    private Double lng;
    private String max_height; //changed Double for String
    private String rate;
    private String address;
    private String carpark_type;
    private String capacity; // changed carpark_desc for capacity
    private String payment_methods;
    private String payment_options;
    private String rate2; // Unknown variable, row22

    public ParkingDataModel(Integer id, Double lat, Double lng, String rate, String max_height, String address, String carpark_type, String capacity, String payment_methods, String payment_options){
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.rate = rate;
        this.max_height = max_height;
        this.address = address;
        this.capacity = capacity;
        this.carpark_type = carpark_type;
        this.payment_methods = payment_methods;
        this.payment_options = payment_options;
        this.rate2 = rate2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMax_height() {
        return max_height;
    }

    public void setMax_height(String max_height) {
        this.max_height = max_height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarpark_type() {
        return carpark_type;
    }

    public void setCarpark_type(String carpark_type) {
        this.carpark_type = carpark_type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPayment_methods() {
        return payment_methods;
    }

    public void setPayment_methods(String payment_methods) {
        this.payment_methods = payment_methods;
    }

    public String getPayment_options() {
        return payment_options;
    }

    public void setPayment_options(String payment_options) {
        this.payment_options = payment_options;
    }

    /*public String getRate2() {
        return rate2;
    }

    public void setRate2(String rate2) {
        this.rate2 = rate2;
    }*/
}
/*
* Incoming Array data structure
* 0 - Id                                | int
*
* 1 - address                           | String
* 2 - lat                               | Double
* 3 - lng                               | Double
* 4 - rate                              | String
* 5 - rate_half_hour                    | String
* 6 - carpark_type                      | String
* 7 - carpark_type_str                  | String
* 8 - capacity                          | String
* 9 - max_height                        | String
* 10 - payment_methods                  | String
* 11 - payment_options                  | String
* 12 - rate_details                     |
* 13 - periods                          | *didn't use
* 14 - title                            | *didn't use
* 15 - rates                            | *didn't use
* 16 - notes                            | *didn't use
* 17 - addenda                          | *didn't use
* 18 - enable_streetview                | *didn't use
* 19 - streetview_lat                   | *didn't use
* 20 - streetview_lng                   | *didn't use
* 21 - streetview_yaw                   | *didn't use
* 22 - streetview_pitch                 | *didn't use
* 23 - streetview_zoom                  | *didn't use
*/