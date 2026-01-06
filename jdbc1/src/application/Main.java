package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement preparedStatement = null;

        try {
            Connection connection = DB.getConnection();
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl.purple@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(sdf.parse("22/11/1960").getTime()));
            preparedStatement.setDouble(4, 4000.00);
            preparedStatement.setInt(5, 2);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Id = " + id);
                }
            } else {
                System.out.println("No data found");
            }

            System.out.println("rows affected: " + rowsAffected);

        } catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
