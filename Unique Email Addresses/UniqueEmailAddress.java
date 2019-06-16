package unsolvedpackage;
import java.util.*;
public class UniqueEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
		System.out.println(numUniqueEmails(emails));
	}
    public static int numUniqueEmails(String[] emails) {
    	//edge case
        if(emails == null || emails.length == 0)
            return 0;
        //keep track of seen email
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < emails.length ; i++) {
        	//split by local and domain name
            String[] res = emails[i].split("@");
            //remove all the . periods
            res[0] = res[0].replace(".","");
            //find the index in local name from where we need to ignore
            int index = res[0].indexOf("+");
            if(index != -1)
                res[0] = res[0].substring(0 , index);
            //add the changes email to the set
            set.add(res[0]+"@"+res[1]);
        }
        //size of set denotes the unique email address to which mail ha sent
        return set.size();
    }
}
