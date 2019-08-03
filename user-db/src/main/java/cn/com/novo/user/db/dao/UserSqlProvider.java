package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.User;
import cn.com.novo.user.db.po.UserExample.Criteria;
import cn.com.novo.user.db.po.UserExample.Criterion;
import cn.com.novo.user.db.po.UserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_info");
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("userName", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPhonenum() != null) {
            sql.VALUES("phoneNum", "#{phonenum,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstatus() != null) {
            sql.VALUES("userStatus", "#{userstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsvip() != null) {
            sql.VALUES("isVip", "#{isvip,jdbcType=VARCHAR}");
        }
        
        if (record.getViprank() != null) {
            sql.VALUES("vipRank", "#{viprank,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowers() != null) {
            sql.VALUES("followers", "#{followers,jdbcType=INTEGER}");
        }
        
        if (record.getFans() != null) {
            sql.VALUES("fans", "#{fans,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.VALUES("createDate", "#{createdate,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedate() != null) {
            sql.VALUES("updateDate", "#{updatedate,jdbcType=VARCHAR}");
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

    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("userId");
        } else {
            sql.SELECT("userId");
        }
        sql.SELECT("userName");
        sql.SELECT("gender");
        sql.SELECT("email");
        sql.SELECT("phoneNum");
        sql.SELECT("userStatus");
        sql.SELECT("isVip");
        sql.SELECT("vipRank");
        sql.SELECT("followers");
        sql.SELECT("fans");
        sql.SELECT("createDate");
        sql.SELECT("updateDate");
        sql.SELECT("reserve1");
        sql.SELECT("reserve2");
        sql.SELECT("reserve3");
        sql.FROM("user_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_info");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{record.userid,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("userName = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{record.gender,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getPhonenum() != null) {
            sql.SET("phoneNum = #{record.phonenum,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstatus() != null) {
            sql.SET("userStatus = #{record.userstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsvip() != null) {
            sql.SET("isVip = #{record.isvip,jdbcType=VARCHAR}");
        }
        
        if (record.getViprank() != null) {
            sql.SET("vipRank = #{record.viprank,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowers() != null) {
            sql.SET("followers = #{record.followers,jdbcType=INTEGER}");
        }
        
        if (record.getFans() != null) {
            sql.SET("fans = #{record.fans,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createDate = #{record.createdate,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedate() != null) {
            sql.SET("updateDate = #{record.updatedate,jdbcType=VARCHAR}");
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
        sql.UPDATE("user_info");
        
        sql.SET("userId = #{record.userid,jdbcType=VARCHAR}");
        sql.SET("userName = #{record.username,jdbcType=VARCHAR}");
        sql.SET("gender = #{record.gender,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("phoneNum = #{record.phonenum,jdbcType=VARCHAR}");
        sql.SET("userStatus = #{record.userstatus,jdbcType=VARCHAR}");
        sql.SET("isVip = #{record.isvip,jdbcType=VARCHAR}");
        sql.SET("vipRank = #{record.viprank,jdbcType=VARCHAR}");
        sql.SET("followers = #{record.followers,jdbcType=INTEGER}");
        sql.SET("fans = #{record.fans,jdbcType=INTEGER}");
        sql.SET("createDate = #{record.createdate,jdbcType=VARCHAR}");
        sql.SET("updateDate = #{record.updatedate,jdbcType=VARCHAR}");
        sql.SET("reserve1 = #{record.reserve1,jdbcType=VARCHAR}");
        sql.SET("reserve2 = #{record.reserve2,jdbcType=VARCHAR}");
        sql.SET("reserve3 = #{record.reserve3,jdbcType=VARCHAR}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user_info");
        
        if (record.getUsername() != null) {
            sql.SET("userName = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPhonenum() != null) {
            sql.SET("phoneNum = #{phonenum,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstatus() != null) {
            sql.SET("userStatus = #{userstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsvip() != null) {
            sql.SET("isVip = #{isvip,jdbcType=VARCHAR}");
        }
        
        if (record.getViprank() != null) {
            sql.SET("vipRank = #{viprank,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowers() != null) {
            sql.SET("followers = #{followers,jdbcType=INTEGER}");
        }
        
        if (record.getFans() != null) {
            sql.SET("fans = #{fans,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createDate = #{createdate,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedate() != null) {
            sql.SET("updateDate = #{updatedate,jdbcType=VARCHAR}");
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
        
        sql.WHERE("userId = #{userid,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
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