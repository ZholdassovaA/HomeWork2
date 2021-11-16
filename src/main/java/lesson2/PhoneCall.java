package lesson2;

public class PhoneCall {
    public static void main (String[] args){
        Phone one = new Phone();
        Phone two = new Phone();

        one.number = "87053940927";
        one.model = "Apple";
        one.weight = 7;

        two.number = "87777777777";
        two.model = "Sumsung";
        two.weight = 10;

        System.out.println(one.number);
        System.out.println(one.model);
        System.out.println(one.weight);

        System.out.println(two.number);
        System.out.println(two.model);
        System.out.println(two.weight);

        one.receiveCall("Сестра");
        two.receiveCall("Мама");
    }
}
