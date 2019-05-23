package newdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonManager {
    private static PersonManager personManager = new PersonManager();

    private PersonManager() {
    }

    ;

    public static PersonManager getInstance() {
        return personManager;
    }

    public void addPerson(Person person) {

        String sql = "insert into person values (NULL, ?, ?, ?)";

        try (Connection connection = ConnectionManager.getInstance().getConnection();
             PreparedStatement writeStatement = connection.prepareStatement(sql)) {
            writeStatement.setString(1, person.getFirstName());
            writeStatement.setString(2, person.getLastName());
            writeStatement.setString(3, String.valueOf(person.getAge()));
            System.out.println(writeStatement.executeUpdate() == 1 ? person.getFirstName() + " was added " : " Insert failed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
