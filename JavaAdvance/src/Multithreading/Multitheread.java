package Multithreading;

public class Multitheread 
{
	public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            MultitherdingDemo object = new MultitherdingDemo(); 
            object.start(); 
        } 
    } 
}
