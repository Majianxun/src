package Actions.Book;
import java.util.List;

import model.*;
import DAO.*;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MyBooKListAction extends ActionSupport {
	
	private List<BookInfo> books ;
	private IBookInfoDAO biDAO = new BookInfoDAO();
	
	public String execute()
	{
		this.setBooks(biDAO.GetAllBook());
		return SUCCESS;
	}

	public void setBooks(List<BookInfo> books) {
		this.books = books;
	}

	public List<BookInfo> getBooks() {
		return books;
	}
	
	

}
