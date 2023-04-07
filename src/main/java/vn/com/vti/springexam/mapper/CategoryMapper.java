package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Category;
import vn.com.vti.springexam.entity.CategoryExample;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    long countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int deleteByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    Category selectByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbg.generated Sun Mar 26 18:37:35 JST 2023
     */
    int updateByPrimaryKey(Category record);
}