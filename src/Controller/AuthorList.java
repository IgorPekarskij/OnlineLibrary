package Controller;

import Connections.ConnectToDB;
import Objects.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AuthorList {

    private ArrayList<Author> authorsList = new ArrayList<>();
    private String query = "SELECT * FROM author ORDER BY fio ASC  ";
    private ArrayList<Author> getAuthors(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            connection = ConnectToDB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                authorsList.add(new Author(resultSet.getString("fio"), resultSet.getDate("birthday"), resultSet.getLong("id")));
            }
        }catch (SQLException e){}
        finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
                if (resultSet != null)
                    resultSet.close();

            }catch (Exception e){}
        }

        return authorsList;
    }

    public ArrayList<Author> getAuthorsList() {
        if(!authorsList.isEmpty()){
            return authorsList;
        }
        return getAuthors();
    }
}
