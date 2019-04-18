package toys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PAOToysService {
    private List<Employee> employeeList = new ArrayList<>();
    private Set<String> employeeFirstNames = new HashSet<>();
    private Map<String, Employee> contestants = new HashMap<>();
    private Map<String, Integer> nameFrequencies = new HashMap<>();

    private PAOToysService() {
    }

    private static PAOToysService paoToysService = new PAOToysService();

    public static PAOToysService getServiceInstance(){
        return paoToysService;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        employeeFirstNames.add(employee.getFirstName());
    }

    public void registerEmployee(String nickName, Employee employee){
        contestants.put(nickName, employee);
    }

    public Employee getRandomEmployee(){
        int randomIndex = getRandomIndex(employeeList.size());
        System.out.println(randomIndex);

        return employeeList.get(randomIndex);
    }

    private int getRandomIndex(int size) {
        Random random = new Random();
        return random.nextInt(size);
    }

    public void showAllFirstNames(){
        for(Iterator<String> iterator = employeeFirstNames.iterator(); iterator.hasNext();){
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public Employee winner(){
        int randomIndex = getRandomIndex(contestants.size());

        Set<String> strings = contestants.keySet();

        Object[] objects = strings.toArray();
        String winnerNickName = (String) objects[randomIndex];

        return contestants.get(winnerNickName);
    }

    public String getTheMostFrequentFirstName(){
        return null;
    }
}
