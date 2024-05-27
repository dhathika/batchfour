package com.vidvaan.bus.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.vidvaan.bus.model.*;
import com.vidvaan.bus.queries.*;
import com.vidvaan.bus.util.*;
import com.vidvaan.bus.date.*;

public class BusDAOImpl implements BusDAO {
	private static Connection connection = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;

	public void insert(Bus bus) {
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.BUS_INSERT);
			preparedStatement.setInt(1, bus.getBid());
			preparedStatement.setString(2, bus.getBname());
			preparedStatement.setString(3, bus.getBtype());
			preparedStatement.setString(4, bus.getRoute());
			preparedStatement.setDate(5, DateConversionMethods.getDate(bus.getTodate()));
			preparedStatement.setDate(6, DateConversionMethods.getDate(bus.getFromdate()));
			preparedStatement.setInt(7, bus.getBcapacity());
			preparedStatement.executeUpdate();
			System.out.println("Inserted Successfully ");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}
	/*public static void main(String[] args) {
		BusDAOImpl b = new BusDAOImpl();
		Bus b1 = new Bus(3,"a","ac","bd","15-09-2010","16-09-2010",40);
		b.insert(b1);
	}*/

	@Override
	public void update(Bus bus) {
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.BUS_UPDATE);
			preparedStatement.setInt(7, bus.getBid());
			preparedStatement.setString(1, bus.getBname());
			preparedStatement.setString(2, bus.getBtype());
			preparedStatement.setString(3, bus.getRoute());
			preparedStatement.setDate(4, DateConversionMethods.getDate(bus.getTodate()));
			preparedStatement.setDate(5, DateConversionMethods.getDate(bus.getFromdate()));
			preparedStatement.setInt(6, bus.getBcapacity());
			preparedStatement.executeUpdate();
			System.out.println("updated Successfully ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}

	@Override
	public void delete(int bid) {

		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.BUS_DELETE);
			preparedStatement.setInt(1, bid);
			preparedStatement.executeUpdate();
			System.out.println("Deleted Successfully ");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}
	/*public static void main(String[] args) {
		BusDAO b = new BusDAOImpl();
		b.delete(2);
	}*/

	@Override
	public Bus findById(int bid) {
		Bus bus = new Bus();
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.BUS_FIND_BY_ID);
			preparedStatement.setInt(1, bid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				bus.setBid(resultSet.getInt(1));
				bus.setBname(resultSet.getString(2));
				bus.setBtype(resultSet.getString(3));
				bus.setRoute(resultSet.getString(4));
				bus.setTodate(resultSet.getString(5));
				bus.setFromdate(resultSet.getString(6));
				bus.setBcapacity(resultSet.getInt(7));
				System.out.println(" Read one record success");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return bus;
		
	}
	/*public static void main(String[] args) {
		BusDAO busDAO=new BusDAOImpl();
		//Bus b = new Bus();
		//List<Bus> emp=busDAO.findAll();
		busDAO.findById(1);
	}*/

	@Override
	public List<Bus> findAll() {
		List<Bus> list = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement=connection.prepareStatement(Queries.BUS_FINDALL);
			resultSet=preparedStatement.executeQuery();
			list =new ArrayList<>();
			while (resultSet.next()) {
				Bus bus = new Bus();
				bus.setBid(resultSet.getInt("bid"));
				bus.setBname(resultSet.getString("bname"));
				bus.setBtype(resultSet.getString("btype"));
				bus.setRoute(resultSet.getString("route"));
				//java.util.Date todate = resultSet.getDate(5);
				bus.setTodate(resultSet.getString("todate"));
				bus.setFromdate(resultSet.getString("fromdate"));
//				bus.setTodate(DateConversionMethods.stringDate(todate));
//				java.util.Date fromdate = resultSet.getDate(6);
//				bus.setFromdate(DateConversionMethods.stringDate(fromdate));
				bus.setBcapacity(resultSet.getInt("bcapacity"));
				System.out.println(" Read one record success");
				list.add(bus);
				System.out.println("Read by all Records");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return list;
	}
	
	/*public static void main(String[] args) {
		BusDAO busDAO=new BusDAOImpl();
		List<Bus> emp=busDAO.findAll();
		System.out.println(emp);
	}*/
}
