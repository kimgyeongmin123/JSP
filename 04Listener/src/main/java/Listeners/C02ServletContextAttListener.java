package Listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class C02ServletContextAttListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		//속성 추가 시 감지해서 동작하는 이벤트 함수
		System.out.println("C02ServletContextAttListener's attributeAdded!");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		//속성 제거 시 감지해서 동작하는 이벤트 함수
		System.out.println("C02ServletContextAttListener's attributeRemoved!");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		//속성 변경 시 감지해서 동작하는 이벤트 함수
		System.out.println("C02ServletContextAttListener's attributeReplaced!");
	}	
	
}
