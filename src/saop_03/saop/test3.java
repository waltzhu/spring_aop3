package saop_03.saop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
   public static void main(String[] args) {
	   /*
	    * Ĭ��״̬�£�Spring-AOPĬ��ʹ��JDK��̬��������Ҫ����Ķ���û��ʵ���κνӿ�ʱ����ʹ��cglib��̬����
	    */
	  ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContext.xml"); 
	  
	  //ʹ���Զ�����
	  Sleepable sa=(Sleepable)ac.getBean("me");
	  sa.sleep();
}
}
