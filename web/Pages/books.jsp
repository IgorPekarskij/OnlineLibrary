<%@ page import="Objects.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jspf/Left_Menu.jspf"%>
<article>
<div class="content">
    <h4>${param.name}</h4>
    <table align="center">
        <jsp:useBean id="books" class="Controller.BookList" scope="page"/>
        <%
            ArrayList<Book> booksList = books.getBooksByGenre(Long.valueOf(request.getParameter("id")));
            session.setAttribute("currentBooksList", booksList);
            for(Book book: booksList) {
        %>
        <tr>
              <td class="bookDescr" >
                  <strong> <a href="book.jsp?book_id=<%=book.getId()%>&name=<%=book.getBookName()%>"><%=book.getBookName()%></a></strong> </br>
                  <strong>ISBN : </strong> <span><%=book.getIsbn()%></span>  </br>
                  <strong>Автор : </strong> <span><%=book.getAuthor()%></span> </br>
                  <strong>Год издания : </strong> <span><%=book.getPublisherYear()%></span> </br>
                  <strong>Страниц : </strong> <span><%=book.getPageCount()%></span> </br>
              </td>
              <td class="bookImage">
                  <a href="#"> <img src="<%=request.getContextPath()%>/ShowImage?index=<%=booksList.indexOf(book)%>" width="100" height ="100" alt="Обложка"/></a>
              </td>
        </tr>
        <%}%>
    </table>
</div>
</article>
