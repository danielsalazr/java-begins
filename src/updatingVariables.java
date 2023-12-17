public class updatingVariables {
    public static void main(String[] args){
        int salary = 1000;

        salary += 2000;
        salary -= 50;
        salary += (30*2)-45;

        String employeeName = "Mauricio";
        employeeName +=" Moreno Lopez";

        employeeName = "Steven " + employeeName;

        System.out.println(salary);
        System.out.println("El nombre del sr es: " + employeeName);
    }
}
