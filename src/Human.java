public class Human {
    private String name;
    private int age;

    public Human() {}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Human))
            return false;
        Human other = (Human) obj;
        if(name == null) {
            if(other.name == null)
                return false;
        }else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
}
