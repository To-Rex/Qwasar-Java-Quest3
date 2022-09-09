class MyFirstClass{
    static int s_value = 10;

    static int getValue() {
      return s_value = 42;
    } // static member function
    static void setValue() {
      System.out.println(MyFirstClass.getValue());
    } // static member function
};