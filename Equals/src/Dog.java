import java.util.Objects;

public class Dog {

    private int age;
    private String name;

    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Dog other = (Dog)obj;

        return Objects.equals(this.getName(), other.getName()) &&
                Objects.equals(this.getAge(), other.getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
