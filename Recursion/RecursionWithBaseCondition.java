class RecursionWithBaseCondition
{
  static int count=0;
  public static void main(String[] args) {
      f();
  }
  static void f()
  {
    if(count==3) return;
    System.err.println(count);
    count++;

    f();
  }
}