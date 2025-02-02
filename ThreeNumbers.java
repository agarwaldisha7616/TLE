// https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Z
// Brute Force Approach : use three loop and iterate through every number, O(n^3) will give TLE
// Optimized Opproach O(n^2)
import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int s=sc.nextInt();
        int count=0;
        for(int x=0;x<=k;x++){
            for(int y=0;y<=k;y++){
                //x+y+z=s
                int z=s-(x+y);
                if(z>=0 && z<=k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
