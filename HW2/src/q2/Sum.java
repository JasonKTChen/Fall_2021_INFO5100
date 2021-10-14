package q2;

public class Sum {
    public int add(int first, int second){
        return first+second;
    }
    public int add(int first, int second, int third){
        return first+second+third;
    }
    public double add(int first, double second){
        return first+second;
    }
    public double add(double first, int second){
        return first+second;
    }
    public double add(double first, double second){
        return first+second;
    }

    public static void main(String[] args){
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4
    }
}
