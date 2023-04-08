package vn.com.vti.springexam.form;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookForm {

	@NotNull
	private String bookId;

	@NotBlank
	private String bookName;

	@NotNull
	private Integer price;

	@NotNull
	private Integer discount;

	@NotNull
	private String publisherName;

	@NotNull
	private String categoryName;
	
	private String publisherId;
	private String categoryId;

	@NotNull
	private Integer pageCount;

	@NotNull
	private String isbn13;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date onSaleDate;

}
