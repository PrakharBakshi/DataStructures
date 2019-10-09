1import java.util.*;



class driver
{
 public static void main(String A[])
 {
  Scanner sc=new Scanner(System.in);
  linked l=new linked();
  int pos=sc.nextInt();
  l.remove(pos);
 }
}
class linked
{
 void remove(int p)
 {
  if(head==null)
  {return;}
   Node drop=head;  
   if (p==0) 
   { 
      head = drop.next;   
      
   } 
   else{ 
    for (int i=0; drop!=null && i<p; i++) 
    {drop = drop.next;} 
   
    if (drop== null || drop.next == null) 
    return; 
    Node next = drop.next.next; 
  
    drop.next = next;
   }}
}
  

