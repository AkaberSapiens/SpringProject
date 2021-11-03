package com.sapiens.springDemo;

import com.sapiens.springDemo.Employee;
import com.sapiens.springDemo.Address;
import com.sapiens.springDemo.Contact;
import com.sapiens.springDemo.OfficialDetails;
import com.sapiens.springDemo.di.SetterBasedDI;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;


@SpringBootApplication
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		System.out.println("Setter based DI Demo");
		AnnotationConfigApplicationContext configApplicationContext1 =
				new AnnotationConfigApplicationContext(SetterBasedDI.class);
		SetterBasedDI.AccountServiceClient accountServiceClient =
				configApplicationContext1.getBean(SetterBasedDI.AccountServiceClient.class);
		accountServiceClient.showPendingDetails();
// System.out.println("Constructor Based DI with Component Scan");
// AnnotationConfigApplicationContext configApplicationContext =
// new AnnotationConfigApplicationContext(ConstructorBasedDIWithComponentScan.class) ;
// ConstructorBasedDIWithComponentScan.OrderServiceClient beans=
// configApplicationContext.getBean(ConstructorBasedDIWithComponentScan.OrderServiceClient.class);
// beans.showPendingDetails();
//
//
// System.out.println("Constructor Based DI");
// AnnotationConfigApplicationContext context2 =
// new AnnotationConfigApplicationContext(ConstructorBasedDI.class);
// ConstructorBasedDI.OrderServiceClient bean =
// context2.getBean(ConstructorBasedDI.OrderServiceClient.class);
// bean.showPendingOrderDetails();
		System.out.println("Spring IOC Demo");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		Employee employee = (Employee) factory.getBean("employee");
		Address address = (Address) factory.getBean("address");
		Contact contact = (Contact) factory.getBean("contact");
		OfficialDetails officialDetails = (OfficialDetails) factory.getBean("officialDetails");




		System.out.println("------------- General Message --------------------");
		System.out.println("ID: "+employee.getID()+" \n"+"Name: "+employee.getName()+
				" \n"+employee.getAge()+" \n"+employee.getGender());
		System.out.println("city: "+address.getCity()+" \n"+"state: "+address.getCity()+" \n"+
				"country: "+address.getCountry()+" \n"+"pincode: "+address.getPincode()+" \n"+
				"po_box: "+address.getPo_box());
		System.out.println("primary_mobile: "+contact.getPrimary_mobile()+" \n"+"Secondary_mobile: "+contact.getSecondary_mobile()
				+" \n"+ "emergency_number: "+contact.getEmergency_number()+" \n"+"email: "+contact.getEmail()+" \n"+
				"off_email: "+contact.getOff_email());
		System.out.println("edu_qualification: "+officialDetails.getEdu_qualification()+" \n"+"percentage: "+officialDetails.getPercentage()
				+" \n"+"designation: "+officialDetails.getDesignation()+" \n"+"experience_years: "+officialDetails.getExperience_years()
				+" \n"+"company_name: "+officialDetails.getCompany_name());




	}

}
