package com.company;

public class köttätande extends växt{

    public köttätande(double längd, String namn) {
        super(längd, namn);
    }

    @Override
    public String mängd_näring() {
        return "köttätande växten "+getNamn()+" behöver "+ 0.1+(0.2*getLängd())+" liter proteindryck per dag.";
    }
}
