package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataBaseUtility {
    private static ResultSet rset;
    private static ResultSetMetaData rSetMetaData;
    /*
    *This method create connection to the database, execute query and return object
    @param sqlQuery
    @return ResultSet
     */

    public static ResultSet getResultSet(String sqlQuery) {

        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection(
                    ConfigReader.getPropertyValue("DBUrl"),
                    ConfigReader.getPropertyValue("DBUsername"),
                    ConfigReader.getPropertyValue("DBPassword"));
            statement = conn.createStatement();
            rset = statement.executeQuery(sqlQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rset;
    }

        /*
        *This method returns an Object of ResultSetMetaData
        @param query
        @return ResultSEtMetaData
         */

    public static  ResultSetMetaData getRsetMetaDa(String query){
        rset = getResultSet(query);
        rSetMetaData=null;
        try{
            rSetMetaData=rset.getMetaData();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return rSetMetaData;
    }

    /*
     *This method extracts data from ResultSet and stores into List of Maps
     */

    public static List<Map<String, String>> getListOfMapsFromRset(String query) {
        rSetMetaData=getRsetMetaDa(query);
        List<Map<String, String>> ListFromRset=new ArrayList<>();
        Map<String, String>mapData;

        try {
            //iterates over the rows
            while (rset.next()) {
                mapData = new LinkedHashMap<>();
                //iterates over the columns
                for (int i = 1; i <= rSetMetaData.getColumnCount(); i++) {
                    String key = rSetMetaData.getColumnName(i);
                    String value = rset.getString(key);
                    //we store data from every column into a map
                    mapData.put(key, value);
                }
                //we store map with Data into a List
                ListFromRset.add(mapData);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ListFromRset;
    }
}



