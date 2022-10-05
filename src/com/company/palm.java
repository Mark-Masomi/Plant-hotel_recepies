package com.company;

public class palm extends växt implements näringsformeln {

    public palm(double längd,String name) {
        super(längd,name);
    }

    @Override
    public String mängd_näring() {
        return "palmen "+getNamn()+" behöver " + (0.5*getLängd())+" liter vatten per dag !";
    }
}
