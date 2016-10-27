<%@ page import="Objects.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jspf/Left_Menu.jspf"%>
    <article>

    <div class="content">
        <h4>Книги</h4>
        <ul style="text-align: left">
            <jsp:useBean id="books" class="Controller.BookList" scope="page"/>
            <%
                ArrayList<Book> booksList = books.getBookList();
                for(Book book: booksList) {
            %>
            <li><strong> <a href="book.jsp?book_id=<%=book.getId()%>&name=<%=book.getBookName()%>"><%=book.getBookName()%></a></strong></li>
            <%}%>
        </ul>

    </div>
    </article>

