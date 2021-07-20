package Chapter4;

import java.util.Arrays;
import java.util.List;

public class Q4_7_BuildOrder_Test {

	public static void main(String[] args) {
		List<String> projects = Arrays.asList("a", "b", "c", "d", "e", "f");
		
			
        String[][] dependencies = {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"}};
        
        Q4_7_BuildOrder buildOrderProjects = new Q4_7_BuildOrder();
        
        try {
			System.out.println(buildOrderProjects.buildOrder(projects, dependencies));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
