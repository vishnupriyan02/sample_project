
class student{

      System.out.println("welcome to java");

    String[] arr={"AjithKumar","venkat","vishnu"};

    int[] id={01,02,03};

    public void demo(String Name){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(Name)){

            System.out.println("id="+id[i]+"  Name="+arr[i]);
           }
           
       }
    }
    public static void main(String[] args){

       
       student s=new student();
      

       String Name="vishnu";
      

       s.demo(Name);

  System.out.println("Program end");

    }
}