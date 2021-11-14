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
public class BSTimplementation {
    
    public static void main(String args[]){
        BST bs = new BST(5);
        bs.insert(10);        
        System.out.println(bs.contains(130));
        
  }
    
    
  public  static class BST {
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

    public boolean contains(int value) {
      // Write your code here.
      if(value<this.value){
          if(left==null){
              return false;
          }else{
              return left.contains(value);
          }
      }else if(value>this.value){
          if(right==null){
              return false;
          }else{
              return right.contains(value);
          }
      }else{
        return true;
      }
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      return this;
    }
  }
    
}
