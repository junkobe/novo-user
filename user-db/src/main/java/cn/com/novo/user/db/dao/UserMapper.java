package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.User;
import cn.com.novo.user.db.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user_info",
        "where userId = #{userid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userid);

    @Insert({
        "insert into user_info (userId, userName, ",
        "gender, email, phoneNum, ",
        "userStatus, isVip, ",
        "vipRank, followers, ",
        "fans, createDate, ",
        "updateDate, reserve1, ",
        "reserve2, reserve3)",
        "values (#{userid,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{phonenum,jdbcType=VARCHAR}, ",
        "#{userstatus,jdbcType=VARCHAR}, #{isvip,jdbcType=VARCHAR}, ",
        "#{viprank,jdbcType=VARCHAR}, #{followers,jdbcType=INTEGER}, ",
        "#{fans,jdbcType=INTEGER}, #{createdate,jdbcType=VARCHAR}, ",
        "#{updatedate,jdbcType=VARCHAR}, #{reserve1,jdbcType=VARCHAR}, ",
        "#{reserve2,jdbcType=VARCHAR}, #{reserve3,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="userStatus", property="userstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="isVip", property="isvip", jdbcType=JdbcType.VARCHAR),
        @Result(column="vipRank", property="viprank", jdbcType=JdbcType.VARCHAR),
        @Result(column="followers", property="followers", jdbcType=JdbcType.INTEGER),
        @Result(column="fans", property="fans", jdbcType=JdbcType.INTEGER),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateDate", property="updatedate", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="userStatus", property="userstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="isVip", property="isvip", jdbcType=JdbcType.VARCHAR),
        @Result(column="vipRank", property="viprank", jdbcType=JdbcType.VARCHAR),
        @Result(column="followers", property="followers", jdbcType=JdbcType.INTEGER),
        @Result(column="fans", property="fans", jdbcType=JdbcType.INTEGER),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateDate", property="updatedate", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "userId, userName, gender, email, phoneNum, userStatus, isVip, vipRank, followers, ",
        "fans, createDate, updateDate, reserve1, reserve2, reserve3",
        "from user_info",
        "where userId = #{userid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phoneNum", property="phonenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="userStatus", property="userstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="isVip", property="isvip", jdbcType=JdbcType.VARCHAR),
        @Result(column="vipRank", property="viprank", jdbcType=JdbcType.VARCHAR),
        @Result(column="followers", property="followers", jdbcType=JdbcType.INTEGER),
        @Result(column="fans", property="fans", jdbcType=JdbcType.INTEGER),
        @Result(column="createDate", property="createdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="updateDate", property="updatedate", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(String userid);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user_info",
        "set userName = #{username,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "phoneNum = #{phonenum,jdbcType=VARCHAR},",
          "userStatus = #{userstatus,jdbcType=VARCHAR},",
          "isVip = #{isvip,jdbcType=VARCHAR},",
          "vipRank = #{viprank,jdbcType=VARCHAR},",
          "followers = #{followers,jdbcType=INTEGER},",
          "fans = #{fans,jdbcType=INTEGER},",
          "createDate = #{createdate,jdbcType=VARCHAR},",
          "updateDate = #{updatedate,jdbcType=VARCHAR},",
          "reserve1 = #{reserve1,jdbcType=VARCHAR},",
          "reserve2 = #{reserve2,jdbcType=VARCHAR},",
          "reserve3 = #{reserve3,jdbcType=VARCHAR}",
        "where userId = #{userid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(User record);
}