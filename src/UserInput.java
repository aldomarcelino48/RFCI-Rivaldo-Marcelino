import java.util.Scanner; 

class UserInput {
  public static void main(String[] args) {
    String data_final;
    String tmp;

    Scanner myObj = new Scanner(System.in); 

    if(!keyboarListener()){
      System.out.print("Masukan inputan anda : ");
      tmp = myObj.nextLine(); 
      System.out.print("Masukan inputan anda : " + tmp);
      data_final = tmp;
    }.then(
      switch(keyboardListener()){
        case 'ctrl+z'
          System.out.print("Masukan inputan anda : ");
          tmp = myObj.nextLine(); 
          data_final = tmp;
          System.out.print("Masukan inputan anda : " + data_final);
          break;
        case 'ctrl+shift+z'
          System.out.print("Masukan inputan anda : ");
          tmp = myObj.nextLine(); 
          System.out.print("Masukan inputan anda : " + tmp);
          data_final = tmp;
          break;
      }
    )
    }
  }
}

  

