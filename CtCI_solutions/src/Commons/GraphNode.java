package Commons;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

	public int value;
	public boolean visited;
	public List<GraphNode> neighbors;
	
	public GraphNode(int value) {
		this.value = value;
		visited = false;
		neighbors = new ArrayList<>();
	}
	
	public void addNeighbor(GraphNode neighbor) {
        neighbors.add(neighbor);
        neighbor.neighbors.add(this);
    }

    public void addDirectedNeighbor(GraphNode neighbor) {
        neighbors.add(neighbor);
    }
    
}
