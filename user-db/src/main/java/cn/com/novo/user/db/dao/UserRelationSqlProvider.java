package cn.com.novo.user.db.dao;

import cn.com.novo.user.db.po.UserRelation;
import cn.com.novo.user.db.po.UserRelationExample.Criteria;
import cn.com.novo.user.db.po.UserRelationExample.Criterion;
import cn.com.novo.user.db.po.UserRelationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserRelationSqlProvider {

    public String countByExample(UserRelationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserRelationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_relation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserRelation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_relation");
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowid() != null) {
            sql.VALUES("followId", "#{followid,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowdate() != null) {
            sql.VALUES("followDate", "#{followdate,jdbcType=VARCHAR}");
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

    public String selectByExample(UserRelationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("userId");
        } else {
            sql.SELECT("userId");
        }
        sql.SELECT("followId");
        sql.SELECT("followDate");
        sql.SELECT("reserve1");
        sql.SELECT("reserve2");
        sql.SELECT("reserve3");
        sql.FROM("user_relation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserRelation record = (UserRelation) parameter.get("record");
        UserRelationExample example = (UserRelationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_relation");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{record.userid,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowid() != null) {
            sql.SET("followId = #{record.followid,jdbcType=VARCHAR}");
        }
        
        if (record.getFollowdate() != null) {
            sql.SET("followDate = #{record.followdate,jdbcType=VARCHAR}");
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
        sql.UPDATE("user_relation");
        
        sql.SET("userId = #{record.userid,jdbcType=VARCHAR}");
        sql.SET("followId = #{record.followid,jdbcType=VARCHAR}");
        sql.SET("followDate = #{record.followdate,jdbcType=VARCHAR}");
        sql.SET("reserve1 = #{record.reserve1,jdbcType=VARCHAR}");
        sql.SET("reserve2 = #{record.reserve2,jdbcType=VARCHAR}");
        sql.SET("reserve3 = #{record.reserve3,jdbcType=VARCHAR}");
        
        UserRelationExample example = (UserRelationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserRelationExample example, boolean includeExamplePhrase) {
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