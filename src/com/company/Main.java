package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Watch watch = new Watch("Саат","Apple Series 5",2019,399);
        Phone phone = new Phone("Телефон","Samsung S21",2021,770);
        Camera camera = new Camera("Камера","Canon M50",2018,770+990);

        Chain chain = new Chain("Чепь для часов","Golden",2020,299);
        Lens lens = new Lens("Линза для камеры","Zoom lens",2022,900);
        Charger charger = new Charger("Беспроводное зарядное устройство","Apple Watch Magnetic Charging Dock",2015,79);
        Case cases = new Case("Чехол для телефона","Protective Standing Cover",2019,39);
        Belt belt = new Belt("Ремешок для часов","Sunnywoo Metal Stainless Steel Band",2019,14);
        Airpod airpod = new Airpod("Беспроводный наушники","Airpods 2",2019,249);
        Tehnika[] tehnikas = {watch,phone,camera,chain,lens,charger,cases,belt,airpod};
        for(Tehnika tehnika1: tehnikas){
            System.out.println(tehnika1.getName() + " " + tehnika1.getModel() + " " + tehnika1.getYear() + " " + tehnika1.getBaasy()+"$");
        }

    }
}
