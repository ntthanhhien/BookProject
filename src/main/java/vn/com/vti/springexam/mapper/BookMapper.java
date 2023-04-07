package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.entity.BookExample;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    long countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int deleteByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int insert(Book row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int insertSelective(Book row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    Book selectByPrimaryKey(String bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int updateByExampleSelective(@Param("row") Book row, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int updateByExample(@Param("row") Book row, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int updateByPrimaryKeySelective(Book row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sat Mar 18 11:18:21 JST 2023
     */
    int updateByPrimaryKey(Book row);
}