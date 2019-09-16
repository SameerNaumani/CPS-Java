import java.util.Iterator;
import java.util.PriorityQueue;

public class HuffmanTree extends LinkedBinaryTree<HuffmanPair> implements Comparable<HuffmanTree> {
    public HuffmanPair root;
    public HuffmanTree pair;
    public HuffmanTree firstRemoval;
    public HuffmanTree secondRemoval;
    ArrayOrderedList<HuffmanPair> BuildList;
    
    // Constructor 1
    // Creates an empty Hufman Tree
    public HuffmanTree() {
    	super();
    }

    // Constructor 2
    public HuffmanTree(HuffmanPair pair1) {
        super(pair1);		
    }
	
    // Constructor 3
    public HuffmanTree(HuffmanPair pair3, HuffmanTree leftSubtree, HuffmanTree rightSubtree) {
	// Creates a Huffman Tree rooted at a node containing element
        super(pair3, leftSubtree, rightSubtree);
        
    }
    
    // Constructor 4
    public HuffmanTree(ArrayOrderedList<HuffmanPair> pairsList) {
        ArrayOrderedList<HuffmanTree> buildList = new ArrayOrderedList<HuffmanTree>();
	
        //foreach hoffman pair in pairslist
        for( HuffmanPair pair : pairsList ) {
            HuffmanTree tree = new HuffmanTree(pair);
            buildList.add(tree);
        }
	
        while(buildList.size()>1) {
          HuffmanTree leftChild = buildList.removeFirst();
            HuffmanTree rightChild = buildList.removeFirst();
			int FrequencyNode= leftChild.getRoot().getElement().getFrequency() +
					rightChild.getRoot().getElement().getFrequency();
			HuffmanPair makePair = new HuffmanPair(FrequencyNode);
			HuffmanTree huffTree = new HuffmanTree(makePair,leftChild,rightChild);
			buildList.add(huffTree);
			}
		super.setRoot(buildList.removeFirst().getRoot());
		while(buildList.size() == 1) {
			HuffmanTree removal = buildList.removeFirst();
			int node = removal.getRoot().getElement().getFrequency();
			HuffmanPair newNode = new HuffmanPair(node);
			HuffmanTree tree = new HuffmanTree(newNode,removal,null);
			buildList.add(tree);
			
		}
		
		}
			
			
	@Override
	public int compareTo(HuffmanTree otherTree) {
		HuffmanPair obj1 = this.getRoot().getElement();
		HuffmanPair obj2 = otherTree.getRoot().getElement();
	/*	final int frequencyComparison = Integer.compare(this.frequency, that.frequency)
		if(frequencyComparison !=0) {
			return frequencyComparison;
		}
		return Integer.compare(this.character, that.character);*/
		return 0;
	}

}
