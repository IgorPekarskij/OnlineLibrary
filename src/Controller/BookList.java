package Controller;

import Connections.ConnectToDB;
import Objects.Book;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();


    private String bookQuery = "select\n" +
            "bk.id, bk.name, bk.content, bk.page_count, bk.isbn,\n" +
            "gn.name as genre,\n" +
            "au.fio as author,\n" +
            "pb.name as publisher, bk.publish_year,\n" +
            "bk.descr, bk.image\n" +
            "from book bk\n" +
            "INNER JOIN genre gn on bk.genre_id = gn.id\n" +
            "INNER JOIN author au on bk.author_id = au.id\n" +
            "INNER JOIN publisher pb on bk.publisher_id = pb.id\n" /*+
            " LIMIT 0, 10"*/;

    private ArrayList<Book> getBooks(String query) {
        Connection con = null;
        Statement state = null;
        ResultSet result = null;
        try {

            con = ConnectToDB.getConnection();
            state = con.createStatement();
            result = state.executeQuery(query);

            while (result.next()) {
                bookList.add(new Book(result.getLong("id"),
                        result.getString("name"),
                        result.getBytes("content"),
                        result.getInt("page_count"),
                        result.getString("isbn"),
                        result.getString("genre"),
                        result.getString("author"),
                        result.getInt("publish_year"),
                        result.getString("publisher"),
                        result.getBytes("image"),
                        result.getString("descr")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (con != null)
                    con.close();
                if (state != null)
                    state.close();
                if (result != null)
                    result.close();

            }catch (Exception e){}
        }
        return bookList;
    }

    public ArrayList<Book> getBookList() {

        if (!bookList.isEmpty()) {
            return bookList;
        }
        return getBooks(bookQuery);
    }

    public ArrayList<Book> getBooksByGenre(long id) {
        return getBooks("select\n" +
                "bk.id, bk.name, bk.content, bk.page_count, bk.isbn,\n" +
                "gn.name as genre,\n" +
                "au.fio as author,\n" +
                "pb.name as publisher, bk.publish_year,\n" +
                "bk.descr, bk.image\n" +
                "from book bk\n" +
                "INNER JOIN genre gn on bk.genre_id = gn.id\n" +
                "INNER JOIN author au on bk.author_id = au.id\n" +
                "INNER JOIN publisher pb on bk.publisher_id = pb.id\n" +
                "WHERE genre_id =" + id + " LIMIT 0, 3");
    }

    public ArrayList<Book> getBooksByID(long id) {
        return getBooks("select\n" +
                "bk.id, bk.name, bk.content, bk.page_count, bk.isbn,\n" +
                "gn.name as genre,\n" +
                "au.fio as author,\n" +
                "pb.name as publisher, bk.publish_year,\n" +
                "bk.descr, bk.image\n" +
                "from book bk\n" +
                "INNER JOIN genre gn on bk.genre_id = gn.id\n" +
                "INNER JOIN author au on bk.author_id = au.id\n" +
                "INNER JOIN publisher pb on bk.publisher_id = pb.id\n" +
                "WHERE bk.id =" + id + " LIMIT 0, 3");
    }
}
