package com.company;

public class växt implements näringsformeln {


    protected double längd;
    protected String namn;
    //inkapsling

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }



    public växt(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }


    @Override
    public String mängd_näring() {
        return null;
    }
}
