/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

/**
 *
 * @author shuha
 */


public class SwimEntry extends Entry {
    private String where;

    public SwimEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String w) {
        super(n, d, m, y, h, min, s, dist);
        this.where = w;
    }

    public String getWhere() {
        return where;
    }

    public String getSwimEntry () {
        String result = getName()+" swam " + getDistance() + " km in "
                + getWhere() + " in "
                + getHour()+":"+ getMin()+":"+ getSec() + " on "
                + getDay()+"/"+ getMonth()+"/"+ getYear() + "\n";
        return result;
    }
}
