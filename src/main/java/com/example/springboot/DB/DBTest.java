package com.example.springboot.DB;

import java.sql.*;

public class DBTest {
    public static void dbSelect(){
        String url = "jdbc:mysql://127.0.0.1:3006/db_practice";
        String userName = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String memberTypeValue = "C1";

        try {
            connection = DriverManager.getConnection(url, userName, password);

            String sql = "select * " +
                    "from wifi " +
                    "where C1 = ? ";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberTypeValue);

            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String C1 = rs.getString("C1");
                String C2 = rs.getString("C2");
                String C3 = rs.getString("C3");
                String C4 = rs.getString("C4");
                String C5 = rs.getString("C5");
                String C6 = rs.getString("C6");
                String C7 = rs.getString("C7");
                String C8 = rs.getString("C8");

                System.out.println(C1 + ", " + C2 + ", " + C3 + ", " + C4 + ", " + C5 + ", " + C6 + ", " + C7 + ", " + C8);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbInsert(){
        String url = "jdbc:mysql://127.0.0.1:3006/db_practice";
        String userName = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String ID_Values = "ID";
        String Service_Values = "Service";
        String OPENAPI_Values = "OPEN_API_Service";
        String Address_Values = "Address";
        try {
            connection = DriverManager.getConnection(url, userName, password);

            String sql = "insert into wifi (C1, C2, C3, C4)" +
                    "values (?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID_Values);
            preparedStatement.setString(2, Service_Values);
            preparedStatement.setString(3, OPENAPI_Values);
            preparedStatement.setString(4, Address_Values);

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("success");
            } else {
                System.out.println("fail");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dbUpdate(){
        String url = "jdbc:mysql://127.0.0.1:3006/db_practice";
        String userName = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        String ID_Values = "ID";
        String Service_Values = "Service";
        String OPENAPI_Values = "OPEN_API_Service";
        String Address_Values = "Address";
        try {
            connection = DriverManager.getConnection(url, userName, password);

            String sql = "insert into wifi (C1, C2, C3, C4)" +
                    "values (?, ?, ?, ?);";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID_Values);
            preparedStatement.setString(2, Service_Values);
            preparedStatement.setString(3, OPENAPI_Values);
            preparedStatement.setString(4, Address_Values);

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("success");
            } else {
                System.out.println("fail");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
