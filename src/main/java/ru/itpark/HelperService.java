package ru.itpark;

public class HelperService {
    public String initials(String name){
        String[] parts = name.split(" ");
        String result = "";
        for (String part : parts) {
            result += part.substring(0, 1);
        }
        return result;
    }
}
