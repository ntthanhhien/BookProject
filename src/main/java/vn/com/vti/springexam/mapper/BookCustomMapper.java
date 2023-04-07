package vn.com.vti.springexam.mapper;

import java.util.List;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookCustomized;

public interface BookCustomMapper {
	public List<BookCustomized> selectByNamePart(String bookName);

	public List<BookCustomized> selectByExample();

	public Book selectByPrimaryKey(String bookId);

}
