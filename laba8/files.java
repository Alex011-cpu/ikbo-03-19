package ru.mirea.praktika.laba8;
import java.io.*;
import java.util.Scanner;
public class files {
    public static void main(String[] args){
        /*Запись*/
        try(FileWriter writer=new FileWriter("C:\\SomeDir\\notes.txt",false)){
            Scanner in=new Scanner(System.in);
            String text=in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        /*Считывание*/
        try(FileReader reader = new FileReader("C:\\SomeDir\\notes.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
