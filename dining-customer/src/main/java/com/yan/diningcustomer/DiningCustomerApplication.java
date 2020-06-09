package com.yan.diningcustomer;

import com.yan.diningcustomer.entity.CusUser;
import com.yan.diningcustomer.service.CusUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.DigestUtils;

@SpringBootApplication
public class DiningCustomerApplication implements CommandLineRunner {
	@Autowired
	CusUserService cusUserService;

	public static void main(String[] args) {
		SpringApplication.run(DiningCustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String pwdMd5 = DigestUtils.md5DigestAsHex("123456".getBytes());
		CusUser loginUser = cusUserService.loginByAccount("sk404", pwdMd5);
		System.out.println(loginUser);
	}
}
