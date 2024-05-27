package com.vidvaan.bus.model;

public class Bus { 
	private int bid;
	private String bname;
	private String btype;
	private String route;
	private String todate;
	private String fromdate;
	private int bcapacity;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int bid, String bname, String btype, String route, String todate, String fromdate, int bcapacity) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btype = btype;
		this.route = route;
		this.todate = todate;
		this.fromdate = fromdate;
		this.bcapacity = bcapacity;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public int getBcapacity() {
		return bcapacity;
	}
	public void setBcapacity(int bcapacity) {
		this.bcapacity = bcapacity;
	}
	@Override
	public String toString() {
		return "Users [bid=" + bid + ", bname=" + bname + ", btype=" + btype + ", route=" + route + ", todate=" + todate
				+ ", fromdate=" + fromdate + ", bcapacity=" + bcapacity + "]";
	}
	
	
	

}
