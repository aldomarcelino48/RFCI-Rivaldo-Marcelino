import java.util.Scanner; 

class Sorting {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        // System.out.print("Enter no. of elements you want in array:");
        // n = 1;
        int data[] = {4,9,7,5,8,9,3} ;
        System.out.println("input : ");
        for (int i = 0; i < data.length ; i++) 
        {
            data[i] = s.nextInt();
        }
        for (int i = 0; i < data.length; i++) 
        {
            for (int j = i + 1; j < data.length; j++) 
            {
                if (data[i] > data[j]) 
                {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i = 0; i < data.length - 1; i++) 
        {
            System.out.print(data[i] + ",");
        }
        System.out.print(data[data.length - 1]);
    }
}

  





