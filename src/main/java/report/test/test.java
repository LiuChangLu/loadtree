package report.test;


import org.junit.Test;
import report.dao.NodeDao;
import report.domain.NodeTree;
import report.domain.OrepNode;
import report.service.NodeService;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

public class test {
    @Test
    public void run() throws SQLException, PropertyVetoException {
        NodeService nodeService = new NodeService();
        NodeDao nodeDao = new NodeDao();
        List<OrepNode> nodes = nodeDao.findNodes();
        NodeTree nodeTree = nodeService.loadNodeTree(nodes);
        System.out.println(nodeTree);
    }
}
