public class stringbulder {

public static void main(String[] args) {
    
    StringBuilder sb=new StringBuilder("Hemanth");
    //System.out.println(sb);


    //char at index
    //  System.out.println(sb.charAt(1));

    //set char at index
    sb.setCharAt(1, 'G');
    //System.out.println(sb);

    //insert

    sb.insert(2, 'H');
    System.out.println(sb);
    //delete
    sb.delete(0, 3);
    System.out.println(sb);

// append
sb.append('H');
System.out.println(sb);
System.out.println(sb.length());

}
    
}
