import java.util.*;
public class StringRev{
  public static void main(String[] args){
    Scanner Keyboard=new Scanner(System.in); // Predefined Class
    System.out.print("ENTER THE STRING:");
    String Str=Keyboard.nextLine(); // Input String From User
    char Schar[]=new char[Str.length()]; // For Store Special Character
    String RevStr=""; // For Store Reverse String Without Special Character
    for(int i=Str.length()-1;i>=0;i--){
      if(Str.charAt(i)<=90 && Str.charAt(i)>=65 || Str.charAt(i)>=97 && Str.charAt(i)<=122)
        RevStr+=Str.charAt(i); // Assign Character By Character 
      else Schar[i]=Str.charAt(i); // Assign in Special Character in Char Array with Exact Position
    }
    int Back=0; // For Not Overwrite and Skip
    for(int i=0;i<Str.length();i++){
      if(Str.charAt(i)<=90 && Str.charAt(i)>=65 || Str.charAt(i)>=97 && Str.charAt(i)<=122)
        Schar[i]=RevStr.charAt(i-Back); // If Special Character found Subtract and Assign( Skip Special Character Overwrite Assign)
      else Back++; // Special Character found and Subtract ( For Sequentiallly Assign Reverse Character)
    }
    for(char A:Schar)
      System.out.print(A);
    Keyboard.close();
  }
}
