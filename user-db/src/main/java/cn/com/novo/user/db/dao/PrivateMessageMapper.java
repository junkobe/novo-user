package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.PrivateMessage;
import cn.com.novo.user.db.po.PrivateMessageExample;
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

public interface PrivateMessageMapper {
    @SelectProvider(type=PrivateMessageSqlProvider.class, method="countByExample")
    long countByExample(PrivateMessageExample example);

    @DeleteProvider(type=PrivateMessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(PrivateMessageExample example);

    @Delete({
        "delete from private_message",
        "where msgId = #{msgid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String msgid);

    @Insert({
        "insert into private_message (msgId, workDate, ",
        "workTime, senderId, ",
        "receiverId, sendStatus, ",
        "msgStatus, msg, ",
        "reserve1, reserve2, ",
        "reserve3)",
        "values (#{msgid,jdbcType=VARCHAR}, #{workdate,jdbcType=VARCHAR}, ",
        "#{worktime,jdbcType=VARCHAR}, #{senderid,jdbcType=VARCHAR}, ",
        "#{receiverid,jdbcType=VARCHAR}, #{sendstatus,jdbcType=VARCHAR}, ",
        "#{msgstatus,jdbcType=VARCHAR}, #{msg,jdbcType=VARCHAR}, ",
        "#{reserve1,jdbcType=VARCHAR}, #{reserve2,jdbcType=VARCHAR}, ",
        "#{reserve3,jdbcType=VARCHAR})"
    })
    int insert(PrivateMessage record);

    @InsertProvider(type=PrivateMessageSqlProvider.class, method="insertSelective")
    int insertSelective(PrivateMessage record);

    @SelectProvider(type=PrivateMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="msgId", property="msgid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="workDate", property="workdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="workTime", property="worktime", jdbcType=JdbcType.VARCHAR),
        @Result(column="senderId", property="senderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiverId", property="receiverid", jdbcType=JdbcType.VARCHAR),
        @Result(column="sendStatus", property="sendstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msgStatus", property="msgstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg", property="msg", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<PrivateMessage> selectByExampleWithRowbounds(PrivateMessageExample example, RowBounds rowBounds);

    @SelectProvider(type=PrivateMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="msgId", property="msgid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="workDate", property="workdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="workTime", property="worktime", jdbcType=JdbcType.VARCHAR),
        @Result(column="senderId", property="senderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiverId", property="receiverid", jdbcType=JdbcType.VARCHAR),
        @Result(column="sendStatus", property="sendstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msgStatus", property="msgstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg", property="msg", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    List<PrivateMessage> selectByExample(PrivateMessageExample example);

    @Select({
        "select",
        "msgId, workDate, workTime, senderId, receiverId, sendStatus, msgStatus, msg, ",
        "reserve1, reserve2, reserve3",
        "from private_message",
        "where msgId = #{msgid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="msgId", property="msgid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="workDate", property="workdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="workTime", property="worktime", jdbcType=JdbcType.VARCHAR),
        @Result(column="senderId", property="senderid", jdbcType=JdbcType.VARCHAR),
        @Result(column="receiverId", property="receiverid", jdbcType=JdbcType.VARCHAR),
        @Result(column="sendStatus", property="sendstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msgStatus", property="msgstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg", property="msg", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve1", property="reserve1", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve2", property="reserve2", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserve3", property="reserve3", jdbcType=JdbcType.VARCHAR)
    })
    PrivateMessage selectByPrimaryKey(String msgid);

    @UpdateProvider(type=PrivateMessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PrivateMessage record, @Param("example") PrivateMessageExample example);

    @UpdateProvider(type=PrivateMessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PrivateMessage record, @Param("example") PrivateMessageExample example);

    @UpdateProvider(type=PrivateMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PrivateMessage record);

    @Update({
        "update private_message",
        "set workDate = #{workdate,jdbcType=VARCHAR},",
          "workTime = #{worktime,jdbcType=VARCHAR},",
          "senderId = #{senderid,jdbcType=VARCHAR},",
          "receiverId = #{receiverid,jdbcType=VARCHAR},",
          "sendStatus = #{sendstatus,jdbcType=VARCHAR},",
          "msgStatus = #{msgstatus,jdbcType=VARCHAR},",
          "msg = #{msg,jdbcType=VARCHAR},",
          "reserve1 = #{reserve1,jdbcType=VARCHAR},",
          "reserve2 = #{reserve2,jdbcType=VARCHAR},",
          "reserve3 = #{reserve3,jdbcType=VARCHAR}",
        "where msgId = #{msgid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(PrivateMessage record);
}