package report.dao;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import report.domain.OrepNode;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

public class NodeDao {
    public List<OrepNode> findNodes() throws SQLException, PropertyVetoException {
        String sql = "select CONVERT(INT,nodeid) nodeId,nodename nodeName,CONVERT(INT,nodeparent) nodePId from orep_node";
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("sa");
        dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setPassword("xxxx");
        dataSource.setJdbcUrl("jdbc:sqlserver://localhost:1433;DatabaseName=THIS4");
        QueryRunner qr = new QueryRunner(dataSource);
        return qr.query(sql, new BeanListHandler<>(OrepNode.class));
    }
}
