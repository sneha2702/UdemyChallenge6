/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class BinaryTree {
    
    Node rootNode;
    
    BinaryTree()
    {
        rootNode=null;
    }
    
    void insert(int value)
    {
      rootNode= insertRec(rootNode, value);
    }

    private Node insertRec(Node rootNode, int value) {
        if(rootNode==null)
        {
            return new Node(value);
        }
        
        if(value<rootNode.data)
        {
           rootNode.left=insertRec(rootNode.left,value);
        }
        if(value>rootNode.data)
        {
          
            rootNode.right=insertRec(rootNode.right,value);
        }
        return rootNode;
    }
    
    void inorderTraverse()
    {
        inorderTraverse(rootNode);
    }
    
    void inorderTraverse(Node node)
    {
        if(node==null)
        {
            return;
                    
        }
        inorderTraverse(node.left);
        System.out.print(" "+node.data);
        inorderTraverse(node.right);
        
    }
    
    
    void preorderTraverse()
    {
        preorderTraverse(rootNode);
    }

    private void preorderTraverse(Node node) {
        
        if(node==null)
        {
            return;
        }
        System.out.print(" "+node.data);
        preorderTraverse(node.left);
        preorderTraverse(node.right);

        
    }
    
    
    void postorderTraverse()
    {
        postorderTraverse(rootNode);
    }

    private void postorderTraverse(Node node) {
        if(node==null)
        {
            return;
        }
        postorderTraverse(node.right);
        postorderTraverse(node.left);
        System.out.print(node.data+" ");

    }
    
    
}
