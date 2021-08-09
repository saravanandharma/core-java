package com.core;

public class LucidCar extends Vehicle {


    @Override
    public String honk() {
        return "Paam...";
    }

    public static void main(String []a){
        LucidCar lucidAir = new LucidCar();
        System.out.println(lucidAir.honk() + lucidAir.drive());

        Pullack pullack = new Pullack() {
            @Override
            String go() {
                return super.go();
            }

            @Override
            String stop() {
                return super.stop();
            }
        };

        System.out.print(pullack.go()+pullack.stop());
    }

}
