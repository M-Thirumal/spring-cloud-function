/**
 * 
 */
package in.thirumal;

import java.util.function.Function;

import org.springframework.stereotype.Component;

/**
 * @author Thirumal
 *
 */
@Component
public class HelloFunction implements Function<String, String> {

	@Override
	public String apply(String input) {
		return "hello function " + input;
	}

}
