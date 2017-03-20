import java.util.ArrayList;
import java.util.List;

public class CopyOfPerson implements Cloneable{
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 性别
	private String sex;
	//朋友
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

    @Override
    public String toString() {
        return "CopyOfPerson [name=" + name + ", age=" + age + ", sex=" + sex + ", friends=" + friends + "]";
    }

}
