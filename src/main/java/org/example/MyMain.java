package org.example;

public class MyMain {

    public static void main(String[] args) {
        pascal.taie.Main.main(
                "-pp",
                "-cp", "src/test/resources",
                "-m", "MyClass",
                "-a", "pta=implicit-entries:false;only-app:true"
        );
    }

}
