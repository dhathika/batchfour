package com.vidvaan.bus.queries;

public interface Queries { 
	String BUS_INSERT = "INSERT INTO BUS VALUES(?,?,?,?,?,?,?)";
	String BUS_UPDATE = "UPDATE BUS SET BNAME =?,BTYPE =?,ROUTE =?,TODATE =?,FROMDATE =?,BCAPACITY =? WHERE BID =?";
	String BUS_DELETE = "DELETE FROM BUS WHERE BID = ?";
	String BUS_FIND_BY_ID = "SELECT * FROM BUS WHERE BID =?";
	String BUS_FINDALL = "SELECT * FROM BUS";
}
