package com.example.behavioral.observer;

// 定义具体的观察者类
public class CurrentConditionsDisplay implements Observer {
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }

    private void display() {
        WeatherData data = (WeatherData) weatherData;
        System.out.println("当前天气状况: 温度" + data.getTemperature() + "摄氏度，湿度" + data.getHumidity() + "%，气压" + data.getPressure() + "hPa");
    }
}
