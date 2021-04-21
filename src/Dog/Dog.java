package Dog;

public class Dog {
    private String name;
    private String sex;
    private int age;
    private int health;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(int sex) {
        if (sex == 1) {
            this.sex = "公仔";
        }else{
            if (sex == 2) {
                this.sex = "母妹";
            } else {
                this.sex = "公仔";
                System.out.println("无效的性别输入，性别默认为公仔");
            }
        }


    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 20) {
            this.age = age;
        } else {
            this.age = 1;
            System.out.println("无效的年龄输入,年龄默认为1");
        }
    }

    public int getAge() {
        return age;
    }

    public void setHealth(int health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        } else {
            this.health = 60;
            System.out.println("无效的健康值输入，健康值默认为60");
        }

    }

    public int getHealth() {
        return health;
    }
}
