package com.widerplanet.refactor04.before;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceCharge {

    private Date SUMMER_START = null;
    private Date SUMMER_END = null;
    private double winterRate = 0.3;
    private double summerRate = 0.5;

    public ServiceCharge() throws Exception{

        String summerStart = "2020-07-01 00:00:00.0";
        String summerEnd = "2020-08-31 24:00:00.0";

        SUMMER_START = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(summerStart);
        SUMMER_END = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(summerEnd);

    }

    public double getSeanServiceCharge(Date date, double quantity, double winterServiceCharge){
        double charge = 0.0;
        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        }
        else {
            charge = quantity * summerRate;
        }

        return charge;
    }
}
