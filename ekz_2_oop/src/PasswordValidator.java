import java.util.Scanner;

public class PasswordValidator {
    
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль занадто короткий");
        } else {
            System.out.println("Пароль успішно збережено");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть пароль: ");
        String password = scanner.nextLine();
        
        try {
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}