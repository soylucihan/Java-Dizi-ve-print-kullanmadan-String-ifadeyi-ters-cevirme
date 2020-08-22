
package javaapplication5;

/**
 *
 * @author cihan
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String s ="12345";
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1 = input1.reverse();
        String yazi=s.substring(0, s.length()-1)+input1;
        //System.out.print(yazi);
        //System.out.format("%1$"+10+"s", " ");
        //System.out.println("asdasdasd");
        long n=461012;
        //System.out.format("%10.3f%n", "asdad");
        String yaz;
        int a=0;
        int bos=0;
        while(a<(s.length())){
            
            System.out.printf("%"+bos+"+s\n",yazi.substring(a,yazi.length()-a));
            bos++;
            System.out.printf("%20s\n", "qqweqwe"); 
            a++;
        }
        
        
    }
    
}
