import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;


public class MainClass {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setName("lifengxing");
//		person1.setAge(30);
//		person1.setSex("男");
//		
////		Person person2 = person1;
//		Person person2 = person1.clone();
//		
//		System.out.println(person1.getName());
//		System.out.println(person1.getAge());
//		System.out.println(person1.getSex());
//		
//		System.out.println(person2.getName());
//		System.out.println(person2.getAge());
//		System.out.println(person2.getSex());
		
		Person person1 = new Person();
		List<String> friends = new ArrayList<String>();
		friends.add("James");
		friends.add("Yao");
		
		person1.setFriends(friends);
		
		Person person2 = person1.clone();
		
		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());
		
		friends.add("Mike");
		person1.setFriends(friends);
		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());
		
		//实际的开发过程中用BeanUtils来解决所有的问题。
		/*CopyOfPerson c = new CopyOfPerson();
		try {
            BeanUtils.copyProperties(c, person2);
        } catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println(c.toString());*/
	}
}
