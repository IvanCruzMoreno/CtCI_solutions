package Commons;

import java.util.ArrayList;
import java.util.List;

public class NodeGraph {

	public String value;
	public Status status;
	public List<NodeGraph> neighbors;
	
	public NodeGraph(String value) {
        this.value = value;
        status = Status.NEW;
        neighbors = new ArrayList<>();
    }

    public void addDirectedNeighbor(NodeGraph neighbor) {
        neighbors.add(neighbor);
    }
    
}
