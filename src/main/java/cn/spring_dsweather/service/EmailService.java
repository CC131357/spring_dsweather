package cn.spring_dsweather.service;

import cn.spring_dsweather.model.Weather;

import java.util.List;

public interface EmailService {
    boolean sendSimpleMessage();
    List<Weather> getWeather();
}
