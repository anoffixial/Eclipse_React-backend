package microsoft.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext a1=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
//    	Employee e1=(Employee)a1.getBean("emp");
//    	System.out.println( "*******Employee********" );
//    	e1.demo();
//    	
//    	System.out.println("");
//    	Student s1=(Student)a1.getBean("student");
//    	System.out.println( "*******Student********" );
//        s1.demo();
    	
//    	Product p1=(Product) a1.getBean("product");
//    	System.out.println( "*******Product********" );
//    	System.out.println(p1);
    	
    	Category c1=(Category) a1.getBean("cat");
    	System.out.println( "*******Category********" );
    	System.out.println(c1);
    }
}
