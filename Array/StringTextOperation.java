/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreek
 */

/*
result.add(result.get(result.size()-1)+" "+queries[i][1]);   
*/
public class StringTextOperation {
    
    
    public static void main(String args[]){
        

        
       String[][] test = { 
           {"APPEND", "Never give up"}, 
           {"MOVE", "-10"}, 
           {"APPEND", "START."},
           {"MOVE", "20"},
           {"APPEND", "END."} };
      
        System.out.println(solution(test));
        
        String[] example1 = {"INSERT Code", "INSERT Signal", "DELETE", "UNDO"};
        System.out.println(getMyString(example1));
    }
    
static List<String> solution(String[][] queries) {
    
  //String[] result = new String[queries.length-1];  
  List<String> result = new ArrayList<>();
  int index = -1;
    
  for(int i=0;i<queries.length;i++){
      
      if(queries[i][0].equals("APPEND")){
          if(result.size()>0){
              int lastValueSize =  result.get(result.size()-1).length();
              if(index>lastValueSize ){
                  result.add(result.get(result.size()-1)+" "+queries[i][1]);  
              }else if(index==lastValueSize){
                  result.add(result.get(result.size()-1));  
              }else{
                  result.add(result.get(result.size()-1)+" "+queries[i][1]);  
              }
              
          }else{
              result.add(queries[i][1]); 
          }
                  
      }else if(queries[i][0].equals("MOVE")){
          index = Integer.parseInt(queries[i][1]); 
      }else if(queries[i][0].equals("DELETE")){
          
      }
      
  }
    return  result;
}
    
    public static String getMyString(String[] myString){
    String finalString="", insert ="", copiedString="", pastedString="";
    char deletedChar=' ';
    int copyIndex=0;
    String recentActivity="";
    for (String operation : myString){
        if (operation.contains("INSERT")){
            recentActivity="INSERT";
            insert=operation.split("INSERT ")[1].trim();
            finalString+=insert;
        }
        else if (operation.contains("DELETE")){
            recentActivity="DELETE";
            deletedChar = finalString.charAt(finalString.length()-1);
            finalString = finalString.substring(0,finalString.length()-1);
        }
        else if (operation.contains("COPY")){
            copyIndex = Integer.parseInt(operation.split("COPY ")[1].trim());
            copiedString = finalString.substring(copyIndex);
        }
        else if (operation.contains("PASTE")){
            recentActivity="PASTE";
            pastedString = copiedString;
            finalString+=copiedString;
        }
        else if(operation.contains("UNDO")){
            if (recentActivity.equalsIgnoreCase("INSERT")){
                finalString = finalString.substring(0,finalString.length()-insert.length());
            }
            else if (recentActivity.equalsIgnoreCase("DELETE")){
                finalString+=Character.toString(deletedChar);
            }
            else if (recentActivity.equalsIgnoreCase("PASTE")){
                finalString+=finalString.split(pastedString)[0];
            }
        }
    }
    return  finalString;
}

    
    
    
//   static List<String> solution(String[][] queries) {
//    
//  //String[] result = new String[queries.length-1];  
//  List<String> result = new ArrayList<>();
//  int index = -1;
//    
//  for(int i=0;i<queries.length;i++){
//      
//      if(queries[i][0].equals("APPEND")){
//          result.add(moveInsert(result,index,String.valueOf(queries[i][1])));         
//      }else if(queries[i][0].equals("MOVE")){
//          index = Integer.parseInt(queries[i][1]);   
//          //result[i] =  moveInsert(i,result,index,String.valueOf(queries[i][1]));          
//      }else if(queries[i][0].equals("DELETE")){
//          
//      }
//      
//  }
//    

//return  result;
//}

public static String moveInsert(List<String> input,int index,String newString){
    StringBuffer tempString = new StringBuffer();
    if(index == -1) {
        if(input.size()>0){
            tempString.append(input.get(input.size()-1));
            tempString.append(" ");
            tempString.append(newString);
            newString =   tempString.toString();
        }        
        return newString;
    }
    
    int lastValueSize =  input.get(input.size()-1).length();
    if(index > lastValueSize){        
        tempString.append(input.get(input.size()-1));
        tempString.append(" ");
        tempString.append(newString);
    }else if(index == lastValueSize){
        tempString.append(input.get(input.size()-1));
        tempString.append(" ");
        tempString.append(newString);
    }
    else  {
        tempString.append(input.get(input.size()-1).substring(0,index));
        tempString.append(newString);
    }        
    
    return tempString.toString();
}


}
