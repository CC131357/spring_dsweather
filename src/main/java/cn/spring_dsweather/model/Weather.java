package cn.spring_dsweather.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class Weather {
    private String day;
    private String date;
    private String week;
    private String wea;
    private String weaImg;
    private String air;
    private String humidity;
    private String airLevel;
    private String airTips;
    private String term1;
    private String term2;
    private String term;
    private List<Whours> hours;

}
