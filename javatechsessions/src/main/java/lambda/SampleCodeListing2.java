package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Classic example demonstrating List Iteration using Lambda expression
 *
 * @author mrajasekha
 * @since 1.0
 */
public class SampleCodeListing2
{
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Grapes");
		list.add("Mangoes");
		list.forEach(
				// lambda expression
				(names) -> System.out.println(names));
	}
}
