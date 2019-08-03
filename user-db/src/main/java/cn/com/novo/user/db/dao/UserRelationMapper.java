package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.UserRelation;
import cn.com.novo.user.db.po.UserRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UserRelationMapper {
    @SelectProvider(type=UserRelationSqlProvider.class, method="countByExample")
    long countByExample(UserRelationExample example);

    @DeleteProvider(type=UserRelationSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserRelationExample example);

    @Insert({
        "insert into user_relation (userId, followId, ",
        "followDate, reserve1, ",
        "reserve2, reserve3)",
        "values (#{userid,jdbcType=VARCHAR}, #{followid,jdbcType=VARCHAR}, ",
        "#{followdate,jdbcType=VARCHAR}, #{reserve1,jdbcType=VARCHAR}, ",
        "#{reserve2,jdbcType=VARCHAR}, #{reserve3,jdbcType=VARCHAR})"
    })
    int insert(UserRelation record);

    @InsertProvider(type=UserRelationSqlProvider.class, method="insertSelective")
    int insertSelective(UserRelation record);

    @SelectProvider(type=UserRelationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR),
        @Result(column="followId", property="followid", jdbcType=JdbcType.VARCHAR),
        @Result(column="followDate", property="followdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<UserRelation> selectByExampleWithRowbounds(UserRelationExample example, RowBounds rowBounds);

    @SelectProvider(type=UserRelationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR),
        @Result(column="followId", property="followid", jdbcType=JdbcType.VARCHAR),
        @Result(column="followDate", property="followdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<UserRelation> selectByExample(UserRelationExample example);

    @UpdateProvider(type=UserRelationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserRelation record, @Param("example") UserRelationExample example);

    @UpdateProvider(type=UserRelationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserRelation record, @Param("example") UserRelationExample example);
}