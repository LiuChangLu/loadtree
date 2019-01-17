package report.service;


import report.domain.NodeTree;
import report.domain.OrepNode;

import java.util.List;

public class NodeService {

    public NodeTree loadNodeTree(List<OrepNode> nodes) {
        NodeTree nodeTree = new NodeTree(0, "根节点", 0);
        findNodeChildren(nodes, nodeTree);
        return nodeTree;
    }


    private void findNodeChildren(List<OrepNode> nodes, NodeTree nodeTree) {
        List<NodeTree> childrenNode = nodeTree.getChildrenNode();
        for (OrepNode node : nodes) {
            if (node.getNodePId() == (nodeTree.getNodeId())) {
                NodeTree cNodeTree = new NodeTree(node.getNodeId(), node.getNodeName(), node.getNodePId());
                childrenNode.add(cNodeTree);
            }
        }
        for (NodeTree cNode : childrenNode) {
            findNodeChildren(nodes, cNode);
        }
    }

}
