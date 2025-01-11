package Generics;

import java.util.List;

public class Userutility {
    public static void printUsernames(List<? extends User> Users)
    {
        for(User u : Users)
        {
            System.out.println(u.getName());
        }
    }
    public static <T extends User> void printmails(List<T> emails)
    {
        for(User u : emails)
        {
            System.out.println(u.getName());
        }

    }
}
