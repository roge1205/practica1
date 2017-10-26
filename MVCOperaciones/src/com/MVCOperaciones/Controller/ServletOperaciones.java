package com.MVCOperaciones.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MVCOperaciones.Model.OperacionesMatematicas;

/**
 * Servlet implementation class ServletOperaciones
 */
@WebServlet("/ServletOperaciones")
public class ServletOperaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOperaciones() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Usaste get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		OperacionesMatematicas ops;
		ops = new OperacionesMatematicas();
		
		String num1;
		String num2;
		float fnumero1,fnumero2;
		boolean isBigger=false, isNegative=false, isCalification=false;
		
		num1 = request.getParameter("txtNumber1");
		num2 = request.getParameter("txtNumber2");
		
		fnumero1 = Float.parseFloat(num1);
		fnumero2 = Float.parseFloat(num2);
		
		ops.setNumero1(fnumero1);
		ops.setNumero2(fnumero2);
		
		response.getWriter().append("La suma es: "+ops.sumar()+"<br>");
		response.getWriter().append("La resta es: "+ops.restar()+"<br>");
		response.getWriter().append("La multiplicacion es "+ops.multiplicar()+"<br>");
		response.getWriter().append("La division es "+ops.dividir()+"<br>");
		
		if(ops.sumar()>10.0)
		{
			response.sendRedirect("mayor10.jsp");
			response.getWriter().append("La suma es: "+ops.sumar()+"<br>");
		}
		else if(ops.sumar()<0)
		{
			response.sendRedirect("negativos.jsp");
			response.getWriter().append("La suma es: "+ops.sumar()+"<br>");
		}
		else if(ops.sumar()>=0 && ops.sumar()<=10)
		{
			response.sendRedirect("calificaciones.jsp");
			response.getWriter().append("La suma es: "+ops.sumar()+"<br>");
		}
	}

}
