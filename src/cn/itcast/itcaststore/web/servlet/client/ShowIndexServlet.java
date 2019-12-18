package cn.itcast.itcaststore.web.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.itcaststore.domain.Notice;
import cn.itcast.itcaststore.service.NoticeService;
import cn.itcast.itcaststore.service.ProductService;

public class ShowIndexServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		NoticeService nService = new NoticeService();
		Notice notice = nService.getRecentNotice();
		req.setAttribute("n", notice);
		
		
		ProductService pService = new ProductService();
		List<Object[]> pList =  pService.getWeekHotProduct();
		/*for(Object[] os:pList){
			for(Object o:os){
				System.out.println(o);
			}
			System.out.println("---------------------");
		}*/
		req.setAttribute("pList", pList);
		
	
		req.getRequestDispatcher("/client/index.jsp").forward(req, resp);
	}
}
