/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

/**
 *
 * @author shuha
 */
public class SprintEntry extends Entry {

        private int repetitions;
        private int recovery;
        private int dist;

        public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec) {
            super(n, d, m, y, h, min, s, dist);
            this.repetitions = rep;
            this.recovery = rec;
            this.dist = (int) dist;
        }

    public int getDista() {
        return dist;
    }

    public int getRepetitions() {
            return repetitions;
        }

        public int getRecovery() {
            return recovery;
        }

        public String getSprintEntry () {
		   String result = getName()+" sprinted " + getRepetitions()+ "x" +getDistance() + "m in " +getHour()+":"+getMin()+":"+ getSec() + " with " + getRecovery() + " minutes recovery on " +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
		   return result;
		  } //getEntry
}
