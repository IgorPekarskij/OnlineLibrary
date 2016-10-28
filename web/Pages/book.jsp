<%@ page import="Objects.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<article>
    <div class="sideBarDescr">
        <jsp:useBean id="books" class="Controller.BookList" scope="page"/>
        <%
            ArrayList<Book> currentBook = books.getBooksByID(Long.valueOf(request.getParameter("book_id")));
            session.setAttribute("currentBooksList", currentBook);
            for(Book book: currentBook){
        %>
        <strong>Краткое описание : </strong></br>
        <p style="text-align: justify; padding: 3px"> <%=book.getBookDescription()%> </p>
    </div>
    <div class="content">
        <h4>${param.name}</h4>


            <div class="description">
                <strong>ISBN : </strong> <span><%=book.getIsbn()%></span>  </br>
                <strong>Автор : </strong> <span><%=book.getAuthor()%></span> </br>
                <strong>Год издания : </strong> <span><%=book.getPublisherYear()%></span> </br>
                <strong>Страниц : </strong> <span><%=book.getPageCount()%></span> </br>
                <strong>Жанр : </strong> <span><%=book.getGenre()%></span> </br>
                <strong>Издательство : </strong> <span><%=book.getPublisher()%></span> </br>
                <a href="#"> Читать </a></br>
                <a href="main.jsp?login=<%=session.getAttribute("user")%>"> К жанрам </a> </br>
            </div>
            <div class="image">
                <a href="#"> <img src="<%=request.getContextPath()%>/ShowImage?index=0" width="280" height ="325" alt="Обложка"/></a>
            </div>
        <%}%>
    </div>
</article>