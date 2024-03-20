package DSA.heapdemo;

import java.util.*;
class key {
    int freq;
    char ch ;
    key(int f,char c){
        freq=f;
        ch=c;
    }
}
class keyComparator implements Comparator<key> {
    public int compare(key k1,key k2){
        if(k1.freq>k2.freq){
            return 1;
        }
        else if(k1.freq<k2.freq){
            return -1;
        }
        else{
            return 0;
        }
    }
}





public class rearrangeCharacters {

	public static void main(String[] args) {
		

	}
	static String rearrangeCharacters(String s)
    {
	     int n =s.length();
	     if(n==0){
	         return "";
	     }
	     int[] count = new int[26];
	     for(int i=0;i<26;i++){
	         count[i]=0;
	     }
	     for(int i=0;i<s.length();i++){
	         count[i]++;
	     }
	     int max_count =findThemaxCount(count);
		return s;
	     
        	     
	}
	private static int findThemaxCount(int[] count) {
		// 
		int max_count=0;
		for(int i=0;i<count.length;i++) {
			if(count[i]>max_count) {
				max_count = count[i];
			}
		}
		return max_count;
		
	}

}
