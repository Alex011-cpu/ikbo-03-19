package ru.mirea.praktika;

public class Dogs {
        private int age;
        private String name;
        public Dogs(){
            age=1;
            name="Sharik";
        }
        public Dogs(int n){
            age=n;
            name="Sharik";
        }
        public Dogs(int n,String s){
            age=n;
            name=s;
        }
        public String toString(){
            return "Name="+name+" Age="+age;
        }
}
