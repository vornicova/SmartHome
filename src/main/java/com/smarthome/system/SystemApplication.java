package com.smarthome.system;

import com.smarthome.system.model.Device;
import com.smarthome.system.model.Heating;
import com.smarthome.system.model.Light;
import com.smarthome.system.structural.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}


	@Override
	public void run(String... args) {
		System.out.println("=== Тест паттернов ===");

		// ADAPTER
		LegacyAlarm legacy = new LegacyAlarm();
		Device adaptedAlarm = new AlarmAdapter(legacy);
		adaptedAlarm.turnOn();
		adaptedAlarm.turnOff();

		// COMPOSITE
		Device light = new Light();
		Device heating = new Heating();
		DeviceGroup group = new DeviceGroup();
		group.add(light);
		group.add(heating);
		group.turnOn();
		group.turnOff();

		// PROXY
		Device userProxy = new SecureDeviceProxy(light, "USER");
		Device adminProxy = new SecureDeviceProxy(light, "ADMIN");
		userProxy.turnOff();
		adminProxy.turnOff();

		// DECORATOR
		Device loggedLight = new LoggingDeviceDecorator(light);
		loggedLight.turnOn();
		loggedLight.turnOff();

		// FACADE
		HomeFacade facade = new HomeFacade(light, heating, adaptedAlarm);
		facade.leaveHome();

		System.out.println("=== Тест завершён ===");
	}

}
