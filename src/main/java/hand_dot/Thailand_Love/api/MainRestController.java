package hand_dot.Thailand_Love.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hand_dot.Thailand_Love.humans.abstracts.Human;

@RestController
@RequestMapping("api")
public class MainRestController {
	static final ClassLoader loader = ClassLoader.getSystemClassLoader();
	static final String PACKAGE = "hand_dot.Thailand_Love.humans.";

	@SuppressWarnings("unchecked")
	@RequestMapping(value="{human}",method=RequestMethod.GET)
	Human getHuman(@PathVariable String human){
		Human returnHuman = null;
		Class<Human> clazz;
		try {
			clazz = (Class<Human>) loader.loadClass(PACKAGE+human);
			returnHuman = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException |ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return returnHuman;
	}


}
