package com.pre.upandrun.document;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.pre.upandrun.document.TimeServer")
public class TimeServerImpl {

	public String getTimeAsString(){
		return new Date().toString();
	}
	public long getTimeAsElapsed() {
	return new Date().getTime();	
	}
}
