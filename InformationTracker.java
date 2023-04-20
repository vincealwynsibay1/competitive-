/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information.tracker;

/**
 *
 * @author 139673
 */
import java.util.*;
public class InformationTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        n = in.nextInt();
        m = in.nextInt();
       
        while(m > 0) {
            int f1 =  in.nextInt();
            int f2 =  in.nextInt();
                
            if (list.contains(f1) && !list.contains(f2)) {
                list.add(f2);
            } else if (!list.contains(f1) && list.contains(f2)) {
                list.add(f1);
            } 
            in.nextLine();
            m--;
        }
        
        System.out.println(list.size());
        
    }
    
}
