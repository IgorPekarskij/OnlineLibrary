package Controller;

import Connections.ConnectToDB;
import Objects.Genre;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GenreList {

    private ArrayList<Genre> genreList = new ArrayList<>();


    private String genreQuery = "SELECT * FROM genre ORDER BY name";

    private ArrayList<Genre> getGenre() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            connection = ConnectToDB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(genreQuery);

            while (resultSet.next()){
                genreList.add(new Genre(resultSet.getString("name"), resultSet.getLong("id")));
            }
        } catch (SQLException e) {
        }finally {
            try {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
                if (resultSet != null)
                    resultSet.close();

            }catch (Exception e){}
        }
        return genreList;
    }

    public ArrayList<Genre> getGenreList() {

        if(!genreList.isEmpty()){
            return genreList;
        }
        return getGenre();
    }
}
