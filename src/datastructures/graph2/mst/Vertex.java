package datastructures.graph2.mst;
/**
 * 封装带权图的顶点对象
 */
public class Vertex {
	private String label;
	private boolean inTree;
	
	public Vertex(String label) {
		super();
		this.label = label;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isInTree() {
		return inTree;
	}
	public void setInTree(boolean inTree) {
		this.inTree = inTree;
	}
}