package DAO;

import java.util.List;

import model.*;

public interface IBookInfoDAO {
	public void SaveBookInfo(BookInfo book);
	public BookInfo GetBookInfoById(int bookId);
	public List<BookInfo> GetAllBook();
}
