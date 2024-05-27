package com.vidvaan.bus.queries;

public interface Queries { 
	String BUS_INSERT = "INSERT INTO BUS VALUES(?,?,?,?,?,?,?)";
	String BUS_UPDATE = "UPDATE BUS SET BUS_NAME =?,BUS_TYPE =?,BUS_ROUTE =?,BUS_TODATE =?,BUS_FROMDATE =?,BUS_CAPACITY =? WHERE BUS_ID =?";
	String BUS_DELETE = "DELETE FROM BUS WHERE BUS_ID = ?";
	String BUS_FIND_BY_ID = "SELECT * FROM BUS WHERE BUS_ID =?";
	String BUS_FINDALL = "SELECT * FROM BUS";
}
