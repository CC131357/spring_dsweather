package cn.spring_dsweather.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Whours {
    private String day;
    private String wea;
    private String tem;
    private String win;
    private String winSpeed;
}


