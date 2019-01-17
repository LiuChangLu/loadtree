package report.domain;

import java.util.LinkedList;
import java.util.List;

public class NodeTree {

    private int nodeId;

    private String nodeName;

    private Integer pNodeId;
    private List<NodeTree> childrenNode = new LinkedList<>();

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getpNodeId() {
        return pNodeId;
    }

    public void setpNodeId(int pNodeId) {
        this.pNodeId = pNodeId;
    }

    public List<NodeTree> getChildrenNode() {
        return childrenNode;
    }

    private NodeTree() {
    }

    public NodeTree(Integer nodeId, String nodeName, Integer pNodeId) {
        this();
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.pNodeId = pNodeId;
    }
}
