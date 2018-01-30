package animals;


public class Cat extends Animals {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name,String headForm) {
        this.name=name;
        super.setHeadForm(headForm);

    }
    private String murluk(){
        return "mur";
    }
    @Override
    protected void sayMyHeadFormAndWhatICan() {
        super.sayMyHeadFormAndWhatICan();
        System.out.println(murluk()+" So i cat and my name"+getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return !(name != null ? !name.equals(cat.name) : cat.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    private String age;
    private String cost;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
