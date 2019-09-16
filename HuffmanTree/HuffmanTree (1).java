import java.util.PriorityQueue;

public class HuffmanTree extends LinkedBinaryTree<HuffmanPair> implements Comparable<HuffmanTree> {
public HuffmanPair root;
public HuffmanTree pair;
public HuffmanTree firstRemoval;
public HuffmanTree secondRemoval;
int count = 0;
ArrayOrderedList<HuffmanPair> BuildList;


	public HuffmanTree() {
		super();
	}
	public HuffmanTree(HuffmanPair pair1) {
		super(pair1);
		
	}
	

	public HuffmanTree(HuffmanPair pair3, HuffmanTree tree1, HuffmanTree tree2) {
	super(pair3, tree1, tree2);
	
	}
	public HuffmanTree(ArrayOrderedList<HuffmanPair>pairsList) {
		ArrayOrderedList<HuffmanTree> buildList = new ArrayOrderedList<HuffmanTree>();
		//do while loop is wrong
		do {
			buildList.add(pair);
		}while(buildList.size()>=0);
		
		
		while(buildList.size()>1) {
			HuffmanTree firstRemoval = buildList.removeFirst();
			HuffmanTree secondRemoval = buildList.removeFirst();
			int FrequencyNode= firstRemoval.getRoot().getElement().getFrequency() +
					secondRemoval.getRoot().getElement().getFrequency();
			HuffmanPair newNode = new HuffmanPair(FrequencyNode);
			HuffmanTree newTree = new HuffmanTree(newNode,firstRemoval,secondRemoval);
			buildList.add(newTree);
			}
		while(buildList.size() == 1) {
			HuffmanTree removal = buildList.removeFirst();
			int node = removal.getRoot().getElement().getFrequency();
			HuffmanPair newNode = new HuffmanPair(node);
			HuffmanTree tree = new HuffmanTree(newNode,removal,null);
			buildList.add(tree);
			
		}
		}
			
			
			
		
		
		
	
	
	@Override
	public int compareTo(HuffmanTree o) {
	/*	final int frequencyComparison = Integer.compare(this.frequency, that.frequency)
		if(frequencyComparison !=0) {
			return frequencyComparison;
		}
		return Integer.compare(this.character, that.character);*/
		return 0;
	}

}
