package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookCustomized;
import vn.com.vti.springexam.entity.Category;
import vn.com.vti.springexam.entity.CategoryExample;
import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.entity.PublisherExample;
import vn.com.vti.springexam.form.BookForm;
import vn.com.vti.springexam.mapper.BookCustomMapper;
import vn.com.vti.springexam.mapper.BookMapper;
import vn.com.vti.springexam.mapper.CategoryMapper;
import vn.com.vti.springexam.mapper.PublisherMapper;

@Controller
@RequestMapping("book")
public class BookController {
	@ModelAttribute
	public BookForm createForm() {
		return new BookForm();
	}

	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private BookCustomMapper bookCustomMapper;
	@Autowired
	private PublisherMapper publisherMapper;
	@Autowired
	private CategoryMapper categoryMapper;

	@RequestMapping("list")
	public String listBooks(Model model) {
		List<BookCustomized> books = bookCustomMapper.selectByExample();
		model.addAttribute("books", books);
		return "book/list";
	}

	@RequestMapping("show")
	public String showBookDetail(@RequestParam String bookId, Model model) {
	    Book book = bookMapper.selectByPrimaryKey(bookId);
	    Category category = categoryMapper.selectByPrimaryKey(book.getCategoryId());
	    Publisher publisher = publisherMapper.selectByPrimaryKey(book.getPublisherId());

	    model.addAttribute("categoryName", category.getCategoryName());
	    model.addAttribute("publisherName", publisher.getPublisherName());
	    model.addAttribute("book", book);

	    return "book/show";
	}

	//	//入力画面 book/search ・ jsp: book/searchInput
	//	@RequestMapping("search")
	//	public String search() {
	//		return "book/searchInput";
	//	}
	//
	//	//結果画面 book/searchResult・ jsp: book/searchResult
	//	@RequestMapping("searchResult")
	//	public String searchResult(@RequestParam("bookId") String bookId, Model model) {
	//		Book book = bookMapper.selectByPrimaryKey(bookId);
	//		model.addAttribute("book", book);
	//
	//		//demo formatDate
	//		OrderHeader orderHeader = orderHeaderMapper.selectByPrimaryKey("OD000001");
	//		model.addAttribute("orderHeader", orderHeader);
	//
	//		return "book/searchResult";
	//	}

	////		bookExample.createCriteria().andPriceBetween(1000, 2000);

	@RequestMapping("input")
	public String input(BookForm bookForm, Model model) {

		CategoryExample categoryExample = new CategoryExample();
		categoryExample.setOrderByClause("category_Id");
		List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
		model.addAttribute("categoryList", categoryList);

		PublisherExample publisherExample = new PublisherExample();
		publisherExample.setOrderByClause("publisher_Id");
		List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
		model.addAttribute("publisherList", publisherList);

		return "book/input";
	}

	@RequestMapping("inputConfirm")
	public String inputConfirm(BookForm bookForm, Model model) {
		Category category = categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
		model.addAttribute("categoryName", category.getCategoryName());
		Publisher publisher = publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
		model.addAttribute("publisherName", publisher.getPublisherName());
		return "book/inputConfirm";
	}

	@RequestMapping("inputExecute")
	public String inputExecute(BookForm bookForm, Model model) {
		Book book = new Book();
		book.setBookId(bookForm.getBookId());
		book.setBookName(bookForm.getBookName());
		book.setPrice(bookForm.getPrice());
		book.setDiscount(bookForm.getDiscount());
		book.setPageCount(bookForm.getPageCount());
		book.setIsbn13(bookForm.getIsbn13());
		book.setOnSaleDate(bookForm.getOnSaleDate());
		
		book.setPublisherId(bookForm.getPublisherId());
		book.setCategoryId(bookForm.getCategoryId());
		bookMapper.insert(book);
		return "redirect:/book/list";
	}

	//	@RequestMapping("search-by-name")
	//	public String searchByName(@RequestParam String bookName, Model model) {
	//		List<BookCustomized> bookList = bookCustomMapper.selectByNamePart("%" + bookName + "%");
	//		model.addAttribute("bookList", bookList);
	//		return "book/bookSearchResult";
	//	}

	@RequestMapping("edit")
	public String edit(@RequestParam String bookId, BookForm bookForm, Model model) {
		Book book = bookMapper.selectByPrimaryKey(bookId);
		bookForm.setBookId(book.getBookId());
		bookForm.setBookName(book.getBookName());
		bookForm.setPrice(book.getPrice());
		bookForm.setDiscount(book.getDiscount());
		bookForm.setPageCount(book.getPageCount());
		bookForm.setIsbn13(book.getIsbn13());
		bookForm.setOnSaleDate(book.getOnSaleDate());
		bookForm.setIsbn13(book.getIsbn13());
		bookForm.setCategoryId(book.getCategoryId());
		bookForm.setPublisherId(book.getPublisherId());

		CategoryExample categoryExample = new CategoryExample();
		categoryExample.setOrderByClause("category_Id");
		List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
		model.addAttribute("categoryList", categoryList);

		PublisherExample publisherExample = new PublisherExample();
		publisherExample.setOrderByClause("publisher_Id");
		List<Publisher> publisherList = publisherMapper.selectByExample(publisherExample);
		model.addAttribute("publisherList", publisherList);
		return "book/edit";
	}

	@RequestMapping("editConfirm")
	public String editConfirm (BookForm bookForm,Model model) {
		Category category = categoryMapper.selectByPrimaryKey(bookForm.getCategoryId());
		model.addAttribute("categoryName", category.getCategoryName());
		Publisher publisher = publisherMapper.selectByPrimaryKey(bookForm.getPublisherId());
		model.addAttribute("publisherName", publisher.getPublisherName());
		return "book/editConfirm";
}

	@RequestMapping("editExecute")
	public String editExecute(BookForm bookForm, Model model) {
		Book book = new Book();
		book.setBookId(bookForm.getBookId());
		book.setBookName(bookForm.getBookName());
		book.setDiscount(bookForm.getDiscount());
		book.setIsbn13(bookForm.getIsbn13());
		book.setOnSaleDate(bookForm.getOnSaleDate());
		book.setPageCount(bookForm.getPageCount());
		book.setPrice(bookForm.getPrice());
		book.setCategoryId(bookForm.getCategoryId());
		book.setPublisherId(bookForm.getPublisherId());
		bookMapper.updateByPrimaryKey(book);

		return "redirect:./list";
	}

	@RequestMapping("delete")
	public String delete(@RequestParam String bookId, Model model) {
		Book book = bookMapper.selectByPrimaryKey(bookId);
	    Category category = categoryMapper.selectByPrimaryKey(book.getCategoryId());
	    Publisher publisher = publisherMapper.selectByPrimaryKey(book.getPublisherId());

	    model.addAttribute("categoryName", category.getCategoryName());
	    model.addAttribute("publisherName", publisher.getPublisherName());
	    model.addAttribute("book", book);
		return "book/delete";
	}
		

	@RequestMapping("deleteExecute")
	public String deleteExecute (@RequestParam String bookId) {	
		bookMapper.deleteByPrimaryKey(bookId);
		return "redirect:./list";
	}
}