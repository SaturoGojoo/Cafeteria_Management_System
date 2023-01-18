import java.util.Scanner;
class grossSal{
    public static void main(String args[]){
        float DA, HRA, PF, gr_sal, net_sal;
        float CCA=240f, PT=100f;

        Scanner a= new Scanner(System.in);
        System.out.println("Enter employee no.: ");
        int r=a.nextInt();
        System.out.println("Enter your basic:  ");
        float f=a.nextFloat();
        System.out.println("Enter employee name: ");
        String w=a.nextLine();

        DA=(0.7f)*f;
        HRA=(0.30f)*f;
        PF=(0.1f)*f;
        gr_sal=(f+DA+HRA);
        net_sal=(gr_sal-CCA-PT-PF);

        System.out.println("Your Gross Salary: "+gr_sal);
        System.out.println("Your Net Salary: "+net_sal);
    }
}