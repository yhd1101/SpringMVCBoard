<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //out.println( "board_write1_ok.jsp" );

    int flag = (Integer)request.getAttribute( "flag" );

    out.println( "<script type='text/javascript'>" );
    if ( flag == 0 ) {
        // 정상
        out.println( "alert( '글쓰기 성공' );" );
        out.println( "location.href='./list.do';" );
    } else {
        // 비정상
        out.println( "alert( '글쓰기 실패' );" );
        out.println( "history.back();" );
    }
    out.println( "</script>" );
%>