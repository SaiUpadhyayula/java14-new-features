package com.techie.demo;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        String sport = "Football";
        String bestPlayer = switch (sport) {
            case "Football" -> "XXX";
            case "Tennis" -> "YYY";
            case "Cricket" -> "ZZZ";
            case "F1" -> "AAA";
            default -> "Unknown";
        };

        System.out.println(bestPlayer);
    }
}
