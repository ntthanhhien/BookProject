package vn.com.vti.springexam.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookCustomized {
	private String bookId;
	private String bookName;
	private Integer price;
	private Integer discount;
	private Integer pageCount;
	private String isbn13;
	private Date onSaleDate;
	private String publisherId;
	private String publisherName;
	private String categoryId;
	private String categoryName;

}
