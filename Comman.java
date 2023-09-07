import java.util.ArrayList;
import java.util.List;

public class Comman {
	public static void main(String[] args) {
		String ar[] = {"geeksforgeeks", "geeks","geek", "geezer"};
		String min = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min.length()>ar[i].length()) {
				min = ar[i];
			}
		}
		List<String> list = new ArrayList<>();
		for(int i=0;i<ar.length;i++) {
			if(!min.equals(ar[i])) {
				list.add(ar[i]);
			}
		}
		System.out.println(list);
		int n = min.length();
		for(int i=0;i<min.length();i++) {
			String compare = min.substring(0,n-i-1);
			int count = 0;
			for(String s: list) {
				if(s.contains(compare)) {
					count++;
				}
			}
			if(count==list.size()) {
				System.out.println(compare);
				System.exit(0);
			}
		}
	}
}
