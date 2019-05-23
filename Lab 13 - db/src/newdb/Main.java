package newdb;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        PersonManager personManager = PersonManager.getInstance();
        personManager.addPerson(new Person(21, "Andrei", "Dinca"));
//
//        String selectSql = "select first_name, age from person";
//        PreparedStatement selectStatement = connection.prepareStatement(selectSql);
//        ResultSet resultSet = selectStatement.executeQuery();
//        while (resultSet.next()){
//            String firstName = resultSet.getString("first_name");
//            int age = resultSet.getInt("age");
//            System.out.println(firstName + " has " + age + " years.");
//        }

        // todo: add select method to PersonManager - public List<Person> getPersonList()
        // todo: show a list of persons ordered by age

    }
}
