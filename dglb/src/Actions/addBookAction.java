package Actions;

import model.*;
import DAO.*;

import com.opensymphony.xwork2.ActionSupport;

public class addBookAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3002180355366144647L;	
	private BookInfo bookinfo;
	IBookInfoDAO bookInfoDAO = new BookInfoDAO();
	
	public String execute()
	{
		BookInfo bi = new BookInfo();
		bi.setAuthor(bookinfo.getAuthor());
		bi.setBookName(bookinfo.getBookName());
		bi.setCategory(bookinfo.getCategory());
		bi.setComments(bookinfo.getComments());
		bi.setCreditValue(bookinfo.getCreditValue());
		bi.setPath(bookinfo.getPath());
		bi.setPublisher(bookinfo.getPublisher());
		
		bookInfoDAO.SaveBookInfo(bi);
		
		return SUCCESS;
		
	}
	
	public BookInfo getBookinfo()
	{
		return bookinfo;
	}
	public void setBookinfo(BookInfo bookinfo)
	{
		this.bookinfo = bookinfo;
	}

}
