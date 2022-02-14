package invidia.test.question1;

// The below is valid, but the question was to extend multiple classes

// Choice: wont compile because it is possible to inherit only from one class


public class Class extends SuperClass1 implements Interface1, Interface2{

    int value;

    public Class(int value){
        this.value = value;
    }

}
