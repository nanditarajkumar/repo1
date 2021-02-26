package Groups;

import org.testng.annotations.DataProvider;

public class Sample1 {
	
	@DataProvider(name="datas")
     public static Object[][] data(){
		return new Object[][] { {"nandita","aaaaa"},{"divya","qqqqqq"},{"kamalee","eeeeee"}};
		
	}
}
