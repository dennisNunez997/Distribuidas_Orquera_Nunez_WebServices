<%-- 
    Document   : consumo.jsp
    Created on : 20/08/2020, 12:29:45
    Author     : dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%!
            String num;
        %>
        
        <form action="Consumo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_nombre">Numero</label>
                <input type="text" name="txt_num1"/>
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-primary">Enviar Datos</button>
            </div>
        </form>
        <%num = request.getParameter("txt_num1");%>        
        
    </body>
</html>
    
    <%-- start web service invocation --%><hr/>
    <%
    try {
	uddi.Primo_Service service = new uddi.Primo_Service();
	uddi.Primo port = service.getPrimoPort();
	 // TODO initialize WS operation arguments here
	int primo = Integer.parseInt(num);
	// TODO process result here
	java.lang.String result = port.primo(primo);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
