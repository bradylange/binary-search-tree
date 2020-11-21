package binary_search_tree;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: BinarySearchTreeApplication
 * Language: Java
 * Date: 4/11/18
 * Description: This program tests the functionality of the BinarySearchTree class.
 */

// This program test the methods and algorithms of binary search tree
public class BinarySearchTreeApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		// Instantiating the object
		System.out.println("***************************************** Binary Search Tree *******************************************");
		BinarySearchTree myBST = new BinarySearchTree();
		
		// Inserting nodes into the tree
		myBST.addNode(35);
		myBST.addNode(18);
		myBST.addNode(9);
		myBST.addNode(24);
		myBST.addNode(20);
		myBST.addNode(64);
		myBST.addNode(86);
		myBST.addNode(41);
		myBST.addNode(30);
		
		// Traversing through the tree: In-Order Traverse 
		System.out.println("Traversing through the Tree: ");
		System.out.println("********************************************************************************************************");
		myBST.traverse(2);
		System.out.println("********************************************************************************************************\n");
		
		// Searching for a node in the tree 
		System.out.println("Searching in the Tree: ");
		System.out.println("********************************************************************************************************");
		int key1 = 30;
		System.out.println("Searching the tree for " + key1 + "...");
		System.out.print("Found: ");
		myBST.inBST(key1).display();
		System.out.println("\n********************************************************************************************************\n");
		
		// Finding the total nodes inside the tree
		System.out.println("Total Nodes in the Tree: ");
		System.out.println("********************************************************************************************************");
		int getNumNodes = myBST.getNumNodes();
		System.out.println(getNumNodes);
		System.out.println("********************************************************************************************************\n");
		
		// Finding the height of the tree
		System.out.println("Height of the Tree: ");
		System.out.println("********************************************************************************************************");
		int height = myBST.heightCount();
		System.out.println(height);
		System.out.println("********************************************************************************************************\n");
		
		// Finding the amount of leaves the tree has 
		System.out.println("Total Leaves in the Tree: ");
		System.out.println("********************************************************************************************************");
		int leaves = myBST.leavesCount();
		System.out.println(leaves);
		System.out.println("********************************************************************************************************\n");
		
		// Removing a node from the tree
		System.out.println("Removing a Node from the Tree: ");
		System.out.println("********************************************************************************************************");
		int key2 = 18;
		System.out.print("Removing the key " + key2 + " from the tree...\n");
		if(myBST.remove(key2))
		{
			System.out.println("New in-order traverse of the tree: ");
			myBST.traverse(2);
		}
		else
		{
			System.out.println("Cannot find the key!");
		}
		System.out.println("********************************************************************************************************\n");
		
	}
// ------------------- End Main Method -------------------

} // End of class BinarySearchTreeApplication
