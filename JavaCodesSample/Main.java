import java.util.*;
import java.io.*;
import java.lang.*;

class Node{
    int x,y;
	char z;
    Node next;
    Node(int x,int y,char z)
    {
        this.x=x;
        this.y=y;
		this.z=z;
		this.next=null;
    }
}

class Main
{
	// remove last element of snake
	public static Node removeLast(Node snake)
	{
		 Node second_last = snake; 
        while (second_last.next.next != null) 
            second_last = second_last.next;
			second_last.next=null;
			second_last.z='B';
		return snake;
	}
	
	
	
	
	
	// form a snake of length 3
	
public static Node FormASnake(Node snake){

Node addX=new Node(5,16,'x');
Node addX2=new Node(5,17,'x');
Node addB=new Node(5,18,'B');
snake.next=addX;
snake.next.next=addX2;
snake.next.next.next=addB;
return snake;
}


    // To go In Downwards Direction where user wants to go
    public static Node goToDownwards(Node snake)
	{
		Node add=new Node(snake.x+1,snake.y,'A');
		// check if snake has touched its body
		Node trav=snake;
		while(trav!=null)
		{
			if(add.x==trav.x && add.y==trav.y)
			return null;
			
			
			trav=trav.next;
		}
		snake.z='x';
		if(add.x>=10)
		return null;
		
		add.next=snake;
		// We will pass X and Y in  this fuction the then also check food  if at this position is there a food if there then increment the length of snake
		if(add.x==3 && add.y==10)
		{
			snake=add;
		}
		else
		snake=removeLast(add);
		
		return snake;
	}
	
	// To go In Upwards Direction where user wants to go
	
	public static Node goToUpwards(Node snake)
	{
		Node add=new Node(snake.x-1,snake.y,'A');
		
		// check if snake has touched its body
		
		Node trav=snake;
		while(trav!=null)
		{
			if(add.x==trav.x && add.y==trav.y)
			return null;
			
			
			trav=trav.next;
		}
		snake.z='x';
		if(add.x<0)
		return null;
		
		add.next=snake;
		// We will pass X and Y in  this fuction the then also check food 
		if(add.x==3 && add.y==10)
		{
			snake=add;
		}
		else
		snake=removeLast(add);
		return snake;
	}
	
	
	// To go In Left Direction where user wants to go
	public static Node goToLeft(Node snake)
	{
		Node add=new Node(snake.x,snake.y-1,'A');
		
		// check if snake has touched its body
		Node trav=snake;
		while(trav!=null)
		{
			if(add.x==trav.x && add.y==trav.y)
			return null;
			
			
			trav=trav.next;
		}
		
		
		
		snake.z='x';
		if(add.x<0)
		return null;
		
		add.next=snake;
		
		// We will pass X and Y in  this fuction the then also check food 
		if(add.x==3 && add.y==10)
		{
			snake=add;
		}
		else
		snake=removeLast(add);
		return snake;
	}
// To go In right Direction where user wants to go
   
	public static Node goToRight(Node snake)
	{
		Node add=new Node(snake.x,snake.y+1,'A');
		
		// check if snake has touched its body
		Node trav=snake;
		while(trav!=null)
		{
			if(add.x==trav.x && add.y==trav.y)
			return null;
			
			
			trav=trav.next;
		}
		
		
		snake.z='x';
		if(add.x>=20)
		return null;
		
		add.next=snake;
		// We will pass X and Y in  this fuction the then also check for food 
		if(add.x==3 && add.y==10)
		{
			snake=add;
		}
		else
		snake=removeLast(add);
		return snake;
	}
	
	
	
	
    public static void main(String[] args)
    {
        // Write your code here
        char board[][]=new char[10][20];
		
		
          //BOARD WHERE we will be displaying Snake and Playing Snake game
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<20;j++)
            {
                board[i][j]='*';
            }
        }
		
		
		board[3][10]='F';
        System.out.println("Board Of length   20 x 20   ");
		System.out.println();
		
        for(int i=0;i<10;i++)
        {
            System.out.println(board[i]);
        }
		System.out.println();
		
        System.out.println("Form a Snake in it");
		System.out.println();
		
		Node Snake=new Node(5,15,'A');
		Snake=FormASnake(Snake);
		Node trav=Snake;
		while(trav!=null)
		{
			board[trav.x][trav.y]=trav.z;
			trav=trav.next;
		}
		System.out.println("Snake On the BOard");
		System.out.println();
		for(int i=0;i<10;i++)
        {
            System.out.println(board[i]);
        }
		System.out.println();
		for(int i=0;i<10;i++)
        {
            for(int j=0;j<20;j++)
            {
                board[i][j]='*';
            }
        }
		board[3][10]='F';
		Scanner sc=new Scanner(System.in);
		char prev=' ';
		for(int i=0;i<10;i++)
		{
			System.out.println("Where you need to go Left= l,Right=r,Upward=u And Downward=d");
            char whereToGo=sc.next().charAt(0);
			
			
			if(whereToGo=='r')
			{
				if(Snake.y+1 !=Snake.next.y)
				{
				Snake=goToRight(Snake);
				}
				else 
				{
					System.out.println();System.out.println();
				    System.out.println("Sir I think You are new To this game Rule no7: You cannot take U Turn ");
                    System.out.println();					
				}
				
			}
			else if(whereToGo=='l')
			{
				if(Snake.y-1 !=Snake.next.y)
				{
				Snake=goToLeft(Snake);
				}
				else 
				{
					System.out.println();System.out.println();
				    System.out.println("Sir I think You are new To this game Rule no7: You cannot take U Turn ");	
					System.out.println();
				}
				
			}
			else if(whereToGo=='u')
			{
				if(Snake.x-1 !=Snake.next.x)
				{
				Snake=goToUpwards(Snake);
				}
				else 
				{
					System.out.println();
					System.out.println();
				    System.out.println("Sir I think You are new To this game Rule no7: You cannot take U Turn ");	
					System.out.println();
				}
				
			}
			else if(whereToGo=='d')
			{
				if(Snake.x+1 !=Snake.next.x)
				{
				Snake=goToDownwards(Snake);
				prev=whereToGo;
				}
				else 
				{
					
					System.out.println();System.out.println();
				    System.out.println("Sir I think You are new To this game Rule no7: You cannot take U Turn ");	
					System.out.println();
				}
				
			}
			else{
				System.out.println();
				System.out.println();
				System.out.println("Sir I think You Have presed the wrong key");
				System.out.println();
				
			}
			if(Snake==null)
			{
				System.out.println("Game Over      Play Next   Time");
				break;
			}
			Node trav1=Snake;
			
		while(trav1!=null)
		{
			board[trav1.x][trav1.y]=trav1.z;
			
			
			
			trav1=trav1.next;
		}
		System.out.println();
		for(int j=0;j<10;j++)
        {
            System.out.println(board[j]);
        }
		System.out.println();
         for(int j=0;j<10;j++)
        {
            for(int k=0;k<20;k++)
            {
                board[j][k]='*';
            }
        }
		if(board[3][10]=='*')
		board[3][10]='F';
		}			
    }
    
}