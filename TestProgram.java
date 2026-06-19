/* 
 * Gabriella Bruno
 * Lab 8
 * Title: TestProgram.java
 * Description: creates the tree and prints out different traversals
 * Date: 11/24/25
 */
public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree<Character> treex = new BinaryTree<Character>('X',null,null);
		BinaryTree<Character> treey = new BinaryTree<Character>('Y',null,null);
		BinaryTree<Character> op1 = new BinaryTree<Character>('+',treex,treey);
		
		BinaryTree<Character> treea = new BinaryTree<Character>('a',null,null);
		BinaryTree<Character> treeb = new BinaryTree<Character>('b',null,null);
		BinaryTree<Character> op2 = new BinaryTree<Character>('+',treea,treeb);
		BinaryTree<Character> treec = new BinaryTree<Character>('c',null,null);
		BinaryTree<Character> op3 = new BinaryTree<Character>('/',op2,treec);
		BinaryTree<Character> root = new BinaryTree<Character>('*',op1,op3);
		
		System.out.println("preorder:");
		root.preOrder();
		
		System.out.println();
		
		System.out.println("inorder:");
		root.inOrder();
		
		System.out.println();

		System.out.println("postorder:");
		root.postOrder();
		
		System.out.println();

		System.out.println("breadth first:");
		root.showBreadthFirstTraverse();
		
	}//end main
}//end class

/*
 * console output
 * 
preorder:
*
    +
        X
            null
            null
        Y
            null
            null
    /
        +
            a
                null
                null
            b
                null
                null
        c
            null
            null

inorder:
            null
        X
            null
    +
            null
        Y
            null
*
                null
            a
                null
        +
                null
            b
                null
    /
            null
        c
            null

postorder:
            null
            null
        X
            null
            null
        Y
    +
                null
                null
            a
                null
                null
            b
        +
            null
            null
        c
    /
*

breath first:
* + / X Y + c a b 
 * 
 */
