package org.example;

public class Bai1 {
    public static void main(String[] args) {
        String s = "Abcs12321421@$$%#@#@#$%#$$$#@#@";
        StringBuilder builder = new StringBuilder();
        for (int i=0;i< s.length();i++){
            char c = s.charAt(i);
            if (isNormal(c)){
                builder.append(c);
            }
        }
        String result = builder.toString();
        System.out.println(result );
    }

    static boolean isNormal(char c){



        if (Character.isDigit(c) || Character.isLetter(c)){


            return true;
        }
        return false;

    }
}