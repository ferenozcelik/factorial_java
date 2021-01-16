public class factorial{
    public static void main(String[] args){
        int a = factorial(10);
        System.out.println(a);
    }

    static int factorial(int n){    // e.g. 5
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=1; i<=n; i++){     // 1 2 3 4 5
            data.add(i);
        }
        int result = 1;
        for(int element : data){
            result *= element;
        }
        return result;
    }
}
