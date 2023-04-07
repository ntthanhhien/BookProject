package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Section3;
import vn.com.vti.springexam.entity.Section3Example;

public interface Section3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    long countByExample(Section3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int deleteByExample(Section3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int insert(Section3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int insertSelective(Section3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    List<Section3> selectByExample(Section3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    Section3 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int updateByExampleSelective(@Param("record") Section3 record, @Param("example") Section3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int updateByExample(@Param("record") Section3 record, @Param("example") Section3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int updateByPrimaryKeySelective(Section3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section3
     *
     * @mbg.generated Sat Mar 25 12:56:21 JST 2023
     */
    int updateByPrimaryKey(Section3 record);
}