package JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate入门
 */
public class _1_jdbcTemplate入门 {

    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(_02Druid连接池的工具类.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 500 where id = ?";
        int count  = template.update(sql,3);
        System.out.println(count);
    }
}
