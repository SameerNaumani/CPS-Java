/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
import java.util.*;

public class HuffmanCoder {
    private HuffmanTree huffTree;
    private BinaryTreeNode node;
    private ArrayUnorderedList<EncodingData> encodingList;
    
    public HuffmanCoder(ArrayOrderedList<HuffmanPair> pairsList){
        huffTree = new HuffmanTree(pairsList);
       
    }
    
    public char decode(String code){
        //convert String to char[] array
        char[] chars = code.toCharArray();
        BinaryTreeNode<HuffmanPair> root = huffTree.getRoot();
        //iterate over char[] array using enhanced for loop
        for(char ch: chars){
            if(ch == '0'){
               root.getLeft();
            }
            else if(ch == '1'){
                root.getRight();
            }
            else if(root.isLeaf() == true){
                return root.getElement().toString().charAt(ch);
            }
        }
        return (char)0;
        
    }
    
    public String encode(char c) throws ElementNotFoundException 
    {
        //takes the specified character and returns the string representation of the
        //binary Huffman encoding of that character
        String s = String.valueOf(c);
        
        return s;

    }
    
    //@return a string representation of the encoding list.
    public String toString(){
        return "s";
    }
    
    private void buildEncodingList(BinaryTreeNode<HuffmanPair> node, String encoding){
        //build the unordered list encodingList
        buildEncodingList(huffTree.getRoot(), null);
        
        if (node.isLeaf() == true){
           EncodingData data = new EncodingData(node.getElement().getCharacter(), encoding);
           encodingList.addToFront(data);
        }
        
        else{
            buildEncodingList(node.getLeft(), encoding + '0');
            buildEncodingList(node.getRight(), encoding + '1');
        }
        
        
    }
    
}
