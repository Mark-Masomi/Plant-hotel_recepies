package com.company;

public class kaktus extends växt {
    public kaktus(double längd, String namn) {
        super(längd, namn);
    }

    @Override
    public String mängd_näring() {
        return getNamn()+" behöver 2 cl mineravatten per dag!";
    }

}
