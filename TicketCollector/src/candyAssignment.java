
public class candyAssignment {

	public static void main(String args[]) {
		Candy Red = new Candy("red");
		Candy purple = new Candy("purple");
		Candy green = new Candy("green");
		Candy pink = new Candy("pink");
		Candy Yellow = new Candy("yellow");
		
		LinkedStack<Candy> Stack = new LinkedStack<Candy>();
		Stack.push(Red);
		Stack.push(purple);
		Stack.push(green);
		Stack.push(pink);
		Stack.push(Yellow);
		Stack.push(pink);
		Stack.push(Red);
		Stack.push(Yellow);
		Stack.push(green);
		Stack.push(Yellow);
                
               
		//Print the stack using the printStack method
                // @returns String: elements of the stack
                System.out.println("This is Stack 1:");
                printStack(Stack);
	
		System.out.println("After dave eats all the banana flavor");
	
		
                LinkedStack<Candy> Stack2 = new LinkedStack<Candy>();
                int number = 0, ate=0;
                while (!Stack.isEmpty()) {
                    Candy x = Stack.pop();
		
                    if(x.colour != "yellow") {
                    Stack2.push(x);
			number ++;
							  }
			else {
				ate++;
				 }	
                }
                
                System.out.println("This is Stack2:  ");					  
                printStack(Stack2);
                System.out.println("The number of Candy Remaining " + number);
                System.out.println("He ate " + ate);
        }
        
      
        public static void printStack(LinkedStack<Candy> s){
            if(s.isEmpty())
                return;
            
            Candy x = s.peek();
            
            //Pop the top element of the stack
            s.pop();
            
            //Recursively call the function PrintStack
            printStack(s);
            
            //Print the stack element starting from the bottom
           System.out.println(x.colour + " ");
            
            //push the same element on the stack to preserve order
            s.push(x);
        }
	

}
