package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.PrivateMessage;
import cn.com.novo.user.db.po.PrivateMessageExample.Criteria;
import cn.com.novo.user.db.po.PrivateMessageExample.Criterion;
import cn.com.novo.user.db.po.PrivateMessageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PrivateMessageSqlProvider {

    public String countByExample(PrivateMessageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("private_message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PrivateMessageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("private_message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PrivateMessage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("private_message");
        
        if (record.getMsgid() != null) {
            sql.VALUES("msgId", "#{msgid,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkdate() != null) {
            sql.VALUES("workDate", "#{workdate,jdbcType=VARCHAR}");
        }
        
        if (record.getWorktime() != null) {
            sql.VALUES("workTime", "#{worktime,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderid() != null) {
            sql.VALUES("senderId", "#{senderid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverid() != null) {
            sql.VALUES("receiverId", "#{receiverid,jdbcType=VARCHAR}");
        }
        
        if (record.getSendstatus() != null) {
            sql.VALUES("sendStatus", "#{sendstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgstatus() != null) {
            sql.VALUES("msgStatus", "#{msgstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsg() != null) {
            sql.VALUES("msg", "#{msg,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve1() != null) {
            sql.VALUES("reserve1", "#{reserve1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve2() != null) {
            sql.VALUES("reserve2", "#{reserve2,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve3() != null) {
            sql.VALUES("reserve3", "#{reserve3,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PrivateMessageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("msgId");
        } else {
            sql.SELECT("msgId");
        }
        sql.SELECT("workDate");
        sql.SELECT("workTime");
        sql.SELECT("senderId");
        sql.SELECT("receiverId");
        sql.SELECT("sendStatus");
        sql.SELECT("msgStatus");
        sql.SELECT("msg");
        sql.SELECT("reserve1");
        sql.SELECT("reserve2");
        sql.SELECT("reserve3");
        sql.FROM("private_message");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PrivateMessage record = (PrivateMessage) parameter.get("record");
        PrivateMessageExample example = (PrivateMessageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("private_message");
        
        if (record.getMsgid() != null) {
            sql.SET("msgId = #{record.msgid,jdbcType=VARCHAR}");
        }
        
        if (record.getWorkdate() != null) {
            sql.SET("workDate = #{record.workdate,jdbcType=VARCHAR}");
        }
        
        if (record.getWorktime() != null) {
            sql.SET("workTime = #{record.worktime,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderid() != null) {
            sql.SET("senderId = #{record.senderid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverid() != null) {
            sql.SET("receiverId = #{record.receiverid,jdbcType=VARCHAR}");
        }
        
        if (record.getSendstatus() != null) {
            sql.SET("sendStatus = #{record.sendstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgstatus() != null) {
            sql.SET("msgStatus = #{record.msgstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsg() != null) {
            sql.SET("msg = #{record.msg,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve1() != null) {
            sql.SET("reserve1 = #{record.reserve1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve2() != null) {
            sql.SET("reserve2 = #{record.reserve2,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve3() != null) {
            sql.SET("reserve3 = #{record.reserve3,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("private_message");
        
        sql.SET("msgId = #{record.msgid,jdbcType=VARCHAR}");
        sql.SET("workDate = #{record.workdate,jdbcType=VARCHAR}");
        sql.SET("workTime = #{record.worktime,jdbcType=VARCHAR}");
        sql.SET("senderId = #{record.senderid,jdbcType=VARCHAR}");
        sql.SET("receiverId = #{record.receiverid,jdbcType=VARCHAR}");
        sql.SET("sendStatus = #{record.sendstatus,jdbcType=VARCHAR}");
        sql.SET("msgStatus = #{record.msgstatus,jdbcType=VARCHAR}");
        sql.SET("msg = #{record.msg,jdbcType=VARCHAR}");
        sql.SET("reserve1 = #{record.reserve1,jdbcType=VARCHAR}");
        sql.SET("reserve2 = #{record.reserve2,jdbcType=VARCHAR}");
        sql.SET("reserve3 = #{record.reserve3,jdbcType=VARCHAR}");
        
        PrivateMessageExample example = (PrivateMessageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PrivateMessage record) {
        SQL sql = new SQL();
        sql.UPDATE("private_message");
        
        if (record.getWorkdate() != null) {
            sql.SET("workDate = #{workdate,jdbcType=VARCHAR}");
        }
        
        if (record.getWorktime() != null) {
            sql.SET("workTime = #{worktime,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderid() != null) {
            sql.SET("senderId = #{senderid,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverid() != null) {
            sql.SET("receiverId = #{receiverid,jdbcType=VARCHAR}");
        }
        
        if (record.getSendstatus() != null) {
            sql.SET("sendStatus = #{sendstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsgstatus() != null) {
            sql.SET("msgStatus = #{msgstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getMsg() != null) {
            sql.SET("msg = #{msg,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve1() != null) {
            sql.SET("reserve1 = #{reserve1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve2() != null) {
            sql.SET("reserve2 = #{reserve2,jdbcType=VARCHAR}");
        }
        
        if (record.getReserve3() != null) {
            sql.SET("reserve3 = #{reserve3,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("msgId = #{msgid,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PrivateMessageExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}