package Excel_sheet_Column_Number;

class Solution {
    public static int titleToNumber(String s) {
    		int res = 0;
    		int start = 0;
    		for (int i = s.length()-1; i>=0; i--) {
    			res += ((int)s.charAt(i) - 64) * Math.pow(26,start);
    			start+=1;
    	   		System.out.println(res);
    		}
   
        return res;
    }
    public static void main(String[] args) {
    		System.out.println(titleToNumber("ABB"));
 //  		System.out.println((int)('A'));
    }
}