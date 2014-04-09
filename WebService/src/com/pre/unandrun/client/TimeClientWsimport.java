package com.pre.unandrun.client;

public class TimeClientWsimport {
 public static void main(String[] args) {
	TimeServerImplService tms =new TimeServerImplService();
	TimeServer eif= tms.getTimeServerImplPort();
	System.out.println(eif.getTimeAsElapsed());
	System.out.println(eif.getTimeAsString());
}
}
