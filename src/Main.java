public class Main
{
    public static void main(String[] args)
    {
        User u1 = new User("Bob", 10);
        User u2 = new User("Alice", 20);
        User u3 = new User("Carl", 30);

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(list.getUsers());

        try {
            Persister.s(list.getUsers());
        } catch (Exception e) {
            System.out.println("Kunne ikke gemme brugere: " + e.getMessage());
        }
    }
}
