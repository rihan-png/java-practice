//parent class (superclass)
class Animal {
void eat()// Method of parent class
{
system.out.println("Animal is eating");
}
}
class Dog extend Animal //child class inherit parent class using extend
{
void bark()//method of child class
{
system.out.println("dog is bark")
}
//main program starts from here
public class void main(string[] args)
//creating object class of  Dog class
Dog d= new Dog();
d.eat();//calling inherit method from animal class
d.bark();//calling dog class method
}
}

