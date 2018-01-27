package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {		

		// **** Application Context & Beans **** //
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Vegetable v = appContext.getBean("vegetable",Vegetable.class);
		Fruit f = appContext.getBean("fruit", Fruit.class);
		
		Vegetable otherVegetable = appContext.getBean("otherVegetable",Vegetable.class);
		Fruit otherFruit = appContext.getBean("otherFruit", Fruit.class);
		
		Vegetable vegPName = appContext.getBean("vegPName",Vegetable.class);
		
		System.out.println(v.talk());
		System.out.println(f.talk());
		System.out.println(otherFruit.talk());
		System.out.println(otherVegetable.talk());
		System.out.println(vegPName.talk());
		
		
		// **** Dependency Injection by Setter & Constructor **** //
		Meal mealSetter = appContext.getBean("mealSetter", Meal.class);
		System.out.println("Setter injection: " + mealSetter.whatIsInThisMeal());
		
		Meal mealConst = appContext.getBean("mealConst", Meal.class);
		System.out.println("Constructor injection: " + mealConst.whatIsInThisMeal());
		
		Meal mealConstAlt = appContext.getBean("mealConstAlt", Meal.class);
		System.out.println("Constructor Injection Alternative: " + mealConstAlt.whatIsInThisMeal());
		
		
		// **** Property value from Property File **** //
		Grain externalGrain = appContext.getBean("externalGrain", Grain.class);
		System.out.println("Setter Injection external: " + externalGrain.talk());
		
		
		// **** Inner and Outer Beans **** //
		Meal myInnerBean = appContext.getBean("mealOuter", Meal.class);
		System.out.println("Inner Beans: " + myInnerBean.whatIsInThisMeal());
		
		
		// **** Autowire **** //
		Vehicle vAutowiredByType = appContext.getBean("vAutowiredByType", Vehicle.class);
		System.out.println("Autowired byType: " + vAutowiredByType.whatVehicle());
		
		Meal mAutowiredByName = appContext.getBean("mAutowiredByName", Meal.class);
		System.out.println("Autowired byName: " + mAutowiredByName.whatIsInThisMeal());
		
		Vehicle vAutowiredByConstructor = appContext.getBean("vAutowiredByConstructor", Vehicle.class);
		System.out.println("Autowired byConstructor: " + vAutowiredByConstructor.whatVehicle());
	}
}
