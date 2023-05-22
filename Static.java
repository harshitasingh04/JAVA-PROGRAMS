public class Static {
    //Inside a static method we cannot use anything which is not static
    //A static method can only access static data
    //It cannot access non-static data
    //We know something which is not static, belongs to an object
    //You cannot use non-static inside static because non-static requires an instance 
    //but the method/function you are using it in does not depend upon objects or instances.
    //On the other hand, non-static methods can use static methods
    public static void main(String[] args) {
        //greeting(); //you cannot use it here because it requires an instance
        //but the function you are using it in is static, hence does not require an instance
        Static funn = new Static();
        funn.fun2();
    }
    static void fun() {
        Static obj = new Static();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello World");
    }
}
//you cannot use this and supper keywords inside a static function
//Outer classes cannot be static because it is not dependent on anything 
//but inner classes can be static because it depends on outer classes
//if we make a variable static then its value will be same for every instancs