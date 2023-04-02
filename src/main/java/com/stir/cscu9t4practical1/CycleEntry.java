/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stir.cscu9t4practical1;

/**
 *
 * @author shuha
 */
public class CycleEntry extends Entry{
	String terrain;
	String tempo;
	
	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist,String terrain, String tempo) {
		super(n, d, m, y, h, min, s, dist);
		this.terrain = terrain;
		this.tempo = tempo;
	}

	/**
	 * @return the terrain
	 */
	public String getTerrain() {
		return terrain;
	}

	/**
	 * @param terrain the terrain to set
	 */
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	/**
	 * @return the tempo
	 */
	public String getTempo() {
		return tempo;
	}

	/**
	 * @param tempo the tempo to set
	 */
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	
	public String getCycleEntry () {
		   String result = getName()+" cycled " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear() + " on "
		             +getTerrain()+ " at " +getTempo()+ " tempo" + "\n";
		   return result;
		  }
	
}
