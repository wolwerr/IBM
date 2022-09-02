import java.util.*;

class JavaMap {
    public static void main(String []argh)
    {
        HashMap<String, Integer> hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name = in.nextLine();
           
            while (name.matches("[A-Z]{1,50}")) {
                System.out.println("Name can't contains uppercase letters");
                name = in.nextLine();
            }

            String phone = in.nextLine();
            while((phone.length() != 8) || phone.startsWith("0")){
                System.out.println("Phone have to be with 8 digits numbers, and can't start with 0");
                phone = in.nextLine();
            }
            hash.put(name, Integer.valueOf(phone));
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int out=hash.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }


    }
}