/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Runner {
    
    public static void main(String[] args) {
        
    
    BinaryTree binary=new BinaryTree();
    
 
    binary.insert(45);
    binary.insert(15);
      binary.insert(35);
    binary.insert(65);
      binary.insert(50);
    binary.insert(1);
      binary.insert(40);
    binary.insert(100);
      binary.insert(90);
    binary.insert(10);
    
      // Node rootNode = null;
      //  System.out.println(binary);
       binary.preorderTraverse();
        System.out.println("");
    binary.inorderTraverse();
        System.out.println("");
binary.postorderTraverse();       
}
}