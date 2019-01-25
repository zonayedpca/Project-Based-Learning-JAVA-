import java.util.Scanner;

class Table1 {
	int index;
	float sallary;
	String indextChar;
	public int EmpNo[] = { 1001,1002,1003,1004,1005,1006,1007 };
	public String EmpName[] = {"Shahadat","Mahe","Moon","Tanvir","Mounis","Shafoon","Zonayed"};
	public String JoinData[] = {"01/04/2009","31/03/2012","14/05/2007","01/10/2013","20/12/2014","27/03/2017","31/07/2012"};
	public String DesignCode[] = {"e","c","k","r","m","e","c",};
	public String Department[] = {"R&D","PM","Acct","Front Desk","Engg","Manufactring","PM",};
	public String Basic[] = {"20000","30000","10000","12000","50000","23000","29000",};
	public String HRA[] = {"8000","12000","8000","6000","20000","9000","12000",};
	public String IT[] = {"3000","9000","1000","2000","20000","4400","10000",};

	public String myFun(String string) {
	   for(int k=0;k<EmpName.length;k++) {
	      if(string.equals(EmpName[k])) {
	         index=k;
	      }
	   }

	   indextChar=DesignCode[index];
	   return indextChar;
	}
	public int myFun1(){
		return Integer.parseInt(Basic[index])+Integer.parseInt(HRA[index])+Integer.parseInt(IT[index]);
	}
}

class Table2 {
int desig, Actualsallery;
public String DesignationCode[] = {"e","c","k","r","m"};
public String Designation[] = {"Engineering","Consultant","Clerk","Receptionist","Manager"};
public String DA[] = {"20000","32000","12000","15000","40000"};

public void myFun2(String string,int sallery) {
for(int i=0;i<Designation.length;i++)
  {
if(string.equals(DesignationCode[i]))
   {
desig=i;
   }
  }
Actualsallery=sallery+Integer.parseInt(DA[desig]);
System.out.println("\nDesignation is : "+Designation[desig]);
System.out.println("Sallery is : "+Actualsallery);
 }
}


public class Launcher {

public static void main(String[] args) {

int choice;
  String choice1;
  String IndexChar;
int sallery;

  Table1 t1=new Table1();
  Table2 t2=new Table2();
do {
	System.out.println("1. Shahadat \n"+"2. Mahe\n"+"3. Moon \n"+"4. Tanvir \n"+"5. Mounis \n"+"6. Shafoon \n"+"7. Zonayed \n");
	  Scanner sc=new Scanner(System.in);
	System.out.print("Enter your choice : ");
	choice=sc.nextInt();
	switch(choice)
	   {
		case 1:
			IndexChar=t1.myFun("Vikas");
			sallery=t1.myFun1();
			t2.myFun2(IndexChar,sallery);
			break;
		case 2:
			IndexChar=t1.myFun("Surinder");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		case 3:
			IndexChar=t1.myFun("Jatin(taimurchacha)");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		case 4:
			IndexChar=t1.myFun("Sahil_Susti");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		case 5:
			IndexChar=t1.myFun("Sahil_LLB");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		case 6:
			IndexChar=t1.myFun("Awasthi");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		case 7:
			IndexChar=t1.myFun("Bureta");
			sallery=t1.myFun1();
				t2.myFun2(IndexChar,sallery);
			break;
		default:
			System.out.println("Please enter the correct Employe name");
			break;
			}
	System.out.print("\nDo you want to continue Y/N  : ");
	choice1=sc.next();

  }
while(choice1.equals("Y") || choice1.equals("y"));
 }
}
