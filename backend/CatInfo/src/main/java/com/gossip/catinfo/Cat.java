package com.gossip.catinfo;

public class Cat {
    private String fact;
    private Integer length;

    public String getFact() {
        return fact;
    }

    public Cat(){}

    public Cat(String info, Integer length) {
        this.fact = info;
        this.length = length;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
