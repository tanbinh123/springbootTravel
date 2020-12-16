package com.bsm.dao;

import com.bsm.entity.TPlace;
import com.bsm.entity.TPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TPlaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    long countByExample(TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int deleteByExample(TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int insert(TPlace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int insertSelective(TPlace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    List<TPlace> selectByExampleWithBLOBsWithRowbounds(TPlaceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    List<TPlace> selectByExampleWithBLOBs(TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    List<TPlace> selectByExampleWithRowbounds(TPlaceExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    List<TPlace> selectByExample(TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    TPlace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TPlace record, @Param("example") TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TPlace record, @Param("example") TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TPlace record, @Param("example") TPlaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPlace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TPlace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_place
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TPlace record);
}