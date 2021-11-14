/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Tree;

/**
 *
 * @author sreek
 */
public class ValidateBST {
    
    
    public static void main(String args[]){
        BST bs = new BST(5);
        bs.insert(10); 
        bs.insert(5); 
        bs.insert(2); 
        bs.insert(5); 
        bs.insert(1); 
        bs.insert(15); 
        bs.insert(22); 
        bs.insert(13); 
        bs.insert(1); 
        System.out.println(validateBst(bs));
  }
    
    public static boolean validateBst(BST tree) {
    // Write your code here.
		
    return validateBst(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
    
    	public static boolean  validateBst(BST node,int min,int max){
		if(node ==null){
			return false;
		}
		if(node.value < min ||  node.value >= max){
			 return false;
		}
		if(node.left !=null && !validateBst(node.left,min,node.value)){
			 return false;
		}
		if(node.right !=null && !validateBst(node.right,node.value,max)){
			 return false;
		}
		return true;
	}
        
    
    static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
    
     public BST insert(int value) {
        if(value<this.value){
            if(left==null){
                BST rbst = new BST(value);
                left = rbst;
            }else{
                left.insert(value);
            }
        }else{
            if(right==null){
                BST rbst = new BST(value);
                right = rbst;
            }else{
                right.insert(value);
            }
        }
        
      return this;
    }
    
    
  }
    
    
}
