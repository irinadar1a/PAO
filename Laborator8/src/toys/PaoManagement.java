package toys;

public class PaoManagement {
    public static void main(String[] args){
        Employee irina = new Employee("Irina", "Ciobotea");
        Employee ana = new Employee("Ana", "Soare");
        Employee rares = new Employee("Rares", "vasile");
        Employee cristina = new Employee("Cristina", "Bodic");

        PAOToysService paoService = PAOToysService.getServiceInstance();
        paoService.addEmployee(irina);
        paoService.addEmployee(ana);
        paoService.addEmployee(rares);
        paoService.addEmployee(cristina);

        Employee cristina2 = new Employee("Cristina", "Istudor");
        paoService.addEmployee(cristina2);

        Employee randomEmployee = paoService.getRandomEmployee();
        System.out.println(randomEmployee);

        System.out.println("Print all firstNames");
        paoService.showAllFirstNames();

        paoService.registerEmployee("cristinica", cristina);
        paoService.registerEmployee("nuShtiu", rares);

        System.out.println("the winner is " + paoService.winner());

    }
}
