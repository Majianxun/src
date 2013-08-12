package DAO;

import java.util.List;

import org.hibernate.Criteria;

import model.BookInfo;

public class BookInfoDAO extends hibernateDAO implements IBookInfoDAO  {

	@Override
	public void SaveBookInfo(BookInfo book) {
		// TODO Auto-generated method stub
		if(book == null) return;
		super.saveObject(book);	
	}

	@Override
	public BookInfo GetBookInfoById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookInfo> GetAllBook() {
		// TODO Auto-generated method stub
		//return (List<BookInfo>) super.getObjects("from Book");
		Criteria criteria = super.getCurrentSession().createCriteria(BookInfo.class);
		return criteria.list();
		
	}

}
