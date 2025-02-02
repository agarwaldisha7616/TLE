// https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/K
// brute force: just iterate from [1....n]
// Time Complexity: O(n)
// Space complexity: O(1)

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}


// More Efficient:
// Approach: 
// let (x,y) be a pair 
// x*y <= n
// x*x <= n
// x <= under root(n)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                
                if(n/i!=i){
                    arr.add(n/i);
                }
            }
        }
        
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}  
