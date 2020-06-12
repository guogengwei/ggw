package cn.itcast.itcaststore.web.servlet.client;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.itcaststore.domain.Product;

import cn.itcast.itcaststore.domain.User;
import cn.itcast.itcaststore.service.ProductService;
public class RecommendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取名为“user”的session
		
		User user = (User) request.getSession().getAttribute("user");
		// 调用service中的方法,根据用户信息查找订单
		ProductService service = new ProductService();
		List<Product> product = service.Recommend(user);
		request.setAttribute("product", product);
		request.getRequestDispatcher("/client/Recommend.jsp").forward(request, response);
	}
}