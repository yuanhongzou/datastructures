package datastructures.graph2.path;
/**
 * ������װԴ��;���Ķ���
 */
public class DistanceSrcVertex {
	private int srcVertex;
	private int distance;
	
	public DistanceSrcVertex(int srcVertex, int distance) {
		this.srcVertex = srcVertex;
		this.distance = distance;
	}
	public int getSrcVertex() {
		return srcVertex;
	}
	public void setSrcVertex(int srcVertex) {
		this.srcVertex = srcVertex;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
}