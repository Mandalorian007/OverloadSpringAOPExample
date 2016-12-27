package com.example;

import com.example.test.CoolClass;
import com.example.test.CustomClass;
import com.example.test.EpicClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
    CoolClass coolClass;

    @Override
    public void run(String... strings) throws Exception {
        coolClass.execute(1L);
        coolClass.execute("awesomeText");
        coolClass.execute(new CustomClass("TotallyCustom"));
        coolClass.execute(new EpicClass("epicText"));
    }
}
