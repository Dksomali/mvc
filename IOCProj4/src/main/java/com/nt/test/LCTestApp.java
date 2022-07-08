package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

@SuppressWarnings("deprecation")
public class LCTestApp {
public static void main(String[]args) {
	//create Beanfactory obj to create IOC contianer
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	//Get Bean obj
	Flipkart bean= factory.getBean("fpk",Flipkart.class);
	String billmsg=bean.purchase(new String[] {"shirt","mobile","books"});
	System.out.println(billmsg);
}//main
}//class
