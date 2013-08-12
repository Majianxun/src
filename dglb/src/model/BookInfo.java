package model;

@SuppressWarnings("serial")
public class BookInfo extends BaseModel {
	private int BookId;
	private String BookName;
	private String Author;
	private String Publisher;
	private String Category;
	private int CreditValue;
	private String Path;
	private String Comments;
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookName() {
		return BookName;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getAuthor() {
		return Author;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getCategory() {
		return Category;
	}
	public void setCreditValue(int creditValue) {
		CreditValue = creditValue;
	}
	public int getCreditValue() {
		return CreditValue;
	}
	public void setPath(String path) {
		Path = path;
	}
	public String getPath() {
		return Path;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getComments() {
		return Comments;
	}

}
