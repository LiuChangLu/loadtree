package report.domain;

public class OrepNode {

    private int nodeId;
    private String nodeName;
    private int nodePId;

    public OrepNode() {
    }

    public OrepNode(int nodeId, String nodeName, int nodePId) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.nodePId = nodePId;
    }

    public int getNodeId() {
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

    public int getNodePId() {
        return nodePId;
    }

    public void setNodePId(int nodePId) {
        this.nodePId = nodePId;
    }
}
