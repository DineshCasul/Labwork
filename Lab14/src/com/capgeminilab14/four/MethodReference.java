package com.capgeminilab14.four;

interface Messageable{  
    Message getMessage(String msg);
}  
interface Messageable2{  
    void get();
}  
interface Messageable3{
	void set(int value);
}
class Message{  
	private static int value;
    Message(String msg){  
        System.out.print(msg);  
    }
	public static void getValue() {
		System.out.println("Value = " + value);
	}
	public static void setValue(int value) {
		Message.value = value;
	}  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        Messageable h1 = Message::new;  
        h1.getMessage("Hello\n");
        Messageable2 h2 = Message::getValue;
        h2.get();
        Messageable3 h3 = Message::setValue;
        h3.set(10);
        h2.get();
    }  
}  