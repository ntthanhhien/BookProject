package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.entity.PublisherExample;

public interface PublisherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    long countByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int deleteByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int deleteByPrimaryKey(String publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int insert(Publisher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int insertSelective(Publisher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    List<Publisher> selectByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    Publisher selectByPrimaryKey(String publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int updateByExampleSelective(@Param("row") Publisher row, @Param("example") PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int updateByExample(@Param("row") Publisher row, @Param("example") PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int updateByPrimaryKeySelective(Publisher row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Mar 18 14:37:28 JST 2023
     */
    int updateByPrimaryKey(Publisher row);
}