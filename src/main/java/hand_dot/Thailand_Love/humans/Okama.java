package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Man;

public class Okama  extends Man{

	public Okama() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.UNKNOWN);
	}

}
