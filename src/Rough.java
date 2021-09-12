import java.util.*;
public class Rough {
	static int gcd(int a, int b){
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	static boolean arePermutation(String str1, String str2)
	{ 
	    int n1 = str1.length();
	    int n2 = str2.length();
	  
	    if (n1 != n2)
	    return false;
	    
	    char ch1[] = str1.toCharArray();
	    char ch2[] = str2.toCharArray();
	  
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	  
	    for (int i = 0; i < n1; i++)
		    if (ch1[i] != ch2[i])
		        return false;
	    
	    for(int i=0 ; i < n2-1 ; i++) {
	    	char c1 = ch2[i];
	    	char c2 = ch2[i+1];
	    	if((c1 == 'a' || c1=='e'|| c1=='i'|| c1=='o'|| c1=='u'|| c1=='A'|| c1=='E'|| c1=='I'|| c1=='O'|| c1=='U')
	    			&&(c2 == 'a' || c2=='e'|| c2=='i'|| c2=='o'|| c2=='u'|| c2=='A'|| c2=='E'|| c2=='I'|| c2=='O'|| c2=='U')) {
	    		return true;
	    	}
	    }
	 
	    return false;
	}
	public static int etf(int input1) {
		int count =0;
		for(int i = 1 ; i < input1 ; i++)
			if(gcd(i, input1)==1)
				count++;
		return count;
	}
	static int maxMarks(int[] input2) {
		   HashMap<Integer,Boolean> m = new HashMap<>(); 
	       ArrayList<Integer> a = new ArrayList<>();

	       for(int i=0;i<input2.length;i++){
	           int x = input2[i];
	           while(m.containsKey(x)){
	               x = x + 1;
	           }
	           m.put(x,true);
	           a.add(x);
	       }

	       int sum = 0;

	       for(int i=0; i<a.size();i++){
	           sum = sum + a.get(i); 
	       }
	       return sum;
	}
	 
	static int historyDocument(String input) {
		int count = 0;
		HashSet<String> set = new HashSet<>();
		for(int i = 0 ; i < input.length()-10;i++) {
			if(Character.isDigit(input.charAt(i)) 
					&& Character.isDigit(input.charAt(i+1)) && Character.isDigit(input.charAt(i+3))
					&& Character.isDigit(input.charAt(i+4)) && Character.isDigit(input.charAt(i+6)) 
					&& Character.isDigit(input.charAt(i+7)) && Character.isDigit(input.charAt(i+8)) 
					&& Character.isDigit(input.charAt(i+9))
					&& input.charAt(i+2)=='-' && input.charAt(i+5)=='-') {
				String s = input.substring(i+6,i+10);
				if(!set.contains(s)) {
					set.add(s);
					count++;
					i+=10;
				}
			}
		}
		return count;
	}
	static List<String> inputByLine = new ArrayList<>();
	static List<String> res(List<String> in) {
		List<String> r = new ArrayList<>();
		for(int i = 1 ; i < in.size() ;i++) { 
			Integer x = Integer.parseInt(in.get(i));
			if(x==0 || x==1) {
				r.add(""+x);
				continue;
			}
			int n = 0;
			int t = x;
			for(int j = 1 ; j <= x ;j++) {
				if(t>2*j) {
					t-=2*j;
					n+=2;
				}else if(t==j) {
					n++;
				}else {
					break;
				}	 
			}
			r.add(""+n); 
		}
		return r;
	}
	
	
	static List<String> m(List<String> inp) { 
		List<String> r = new ArrayList<>(); 
		for(int k = 1 ; k < inp.size() ;k++) { 
			StringBuilder s1 = new StringBuilder(inp.get(k));
			int size = s1.length();
			boolean del =false;
			for(int i = 1 ; i <= size ; i++) {
				for(int j = i+1 ; j < size ; j+=i) {
					if(j<size) {
						s1.deleteCharAt(j);
						size = s1.toString().length();
						if(!del)
							del=true;
					}
				}
			}
			if(del && s1.toString().length()>0)
				r.add("Yes"); 
			else
				r.add("No");
		}
		return r;
	}
	
	public static void m() {
		Scanner sc = new Scanner(System.in); 
		Integer n = 2819547;
		char[] a = Integer.toString(n).toCharArray();
		int i = a.length / 2;
		int j= 0 ;
		while(i>0) {
			char t = a[j];
			a[j] = a[j+1];
			a[j+1] = t;  
			j+=2;
			i--;
		}
		String s =new String(a);
		System.out.println(Integer.parseInt(s));
		
	}
	public static void m2() {
		Scanner sc = new Scanner(System.in); 
		Integer n = sc.nextInt();
		Integer m = sc.nextInt();
		
		ArrayList<TreeSet<Integer>>  a = new ArrayList<>();
		
		for(int i = 0 ; i<m ;i++) {
			TreeSet<Integer> t = new TreeSet<Integer>();
			a.add(t);
		}
		for(int i = 0 ; i< n;i++) {
			for(int j = 0 ; j < m ; j++) { 
				Integer x = sc.nextInt(); 
				TreeSet<Integer> t = a.get(j); 
				t.add(x);
				a.set(j, t);
			}
		}
		for(TreeSet<Integer> t : a) {
			System.out.print(t.pollFirst());
		}
		
	}
	
	
	static List<String> m3(List<String> inp){
		List<String> res = new ArrayList<>();
		for(int i = 1 ; i < inp.size(); i++) { 
			StringTokenizer st = new StringTokenizer(inp.get(i)," ");
			List<Long> a = new ArrayList<>();  
			while(st.hasMoreTokens()) {
				a.add(Long.parseLong(st.nextToken()));
			}
			Long num1 = a.get(0);
			Long num2 = a.get(1);
			if(num2-num1==1){
    		 	res.add(String.valueOf(num2&num1));
    		}
			else{
				if((num2&1)==0) 
					res.add(String.valueOf((num2-1)&(num2-2)));
				else
					res.add(String.valueOf(num2&(num2-1)));	 
			} 
		}
		return res;
	}
	public static void pg1() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0 ; i < t ; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int min=0 , max=0;
			int[] x=new int[n];
			for(int j = 0 ; j < n ; j++) {
				x[j] = sc.nextInt();
			}
			Arrays.sort(x);
			int c = n%(k+1) +n/(k+1); 
			for(int j = 0 ; j<c ;j++) {
				min+=x[j];
				max+=x[x.length-1-j];
			}
			System.out.println(min+" "+max);
		}
	}
	static List<String> pres2(List<String>inp){
		List<String> res = new ArrayList<String>();
		int T = Integer.parseInt(inp.get(0));
        for(int a0 = 1; a0 <=2*T; a0++){
            int n = Integer.parseInt(inp.get(a0++));
            int q[] = new int[n];
            for(int q_i=0; q_i < inp.get(a0).length(); q_i++){
                q[q_i] = Integer.parseInt(""+inp.get(a0).charAt(q_i));
            }
            
            int bribes = 0;
            for (int i = 1; i <= n; ++i) {
                 if (q[i - 1] - i > 2) {
                     res.add("Too chaotic");
                     bribes = -1;
                     break;
                 }
            }
            
            if (bribes == 0)
            {
                for (int i = 0; i < n; ++i) {
                    for (int j = i + 1; j < i + 100 && j < n; ++j) {
                        if (q[j] < q[i]) {
                            bribes++;
                        }
                    }
                }
                res.add(""+bribes);
            }
        }
		return res;
	}
	public static void main(String[] args) {  
		List<String> inp = new ArrayList<>();
		inp.add(""+3);
		inp.add(""+5);
		inp.add(""+2+1+5+3+4);
		inp.add(""+5);
		inp.add(""+2+5+3+1+4);
		inp.add(""+5);
		inp.add(""+2+3+5+4+1);
		inp = pres2(inp);
		for(String i : inp)
			System.out.println(i);
;	}
}
