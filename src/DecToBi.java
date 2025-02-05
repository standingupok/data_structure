public class DecToBi {
    public static void toBi(int number){
        ArrayStack<Integer> stack = new ArrayStack<>();
        while(number > 0){
            stack.push(number % 2);
            number = number / 2;
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
