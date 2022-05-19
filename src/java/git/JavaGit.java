/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.git;

/**
 *
 * @author dj
 */
public class JavaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome Javagit");
       int sum=0;
        for(int i=0;i<5;i++)
        {
          sum=sum+i;
            System.out.println("Sum is\t"+sum);
            
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
    }
    
}
