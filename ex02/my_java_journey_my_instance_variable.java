class MyFirstClass {

    String name;
    MyFirstClass(String name) {
        this.name = name;
    }
    //getter end setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //method
    public void sayHello() {
        System.out.println(name);
    }

}