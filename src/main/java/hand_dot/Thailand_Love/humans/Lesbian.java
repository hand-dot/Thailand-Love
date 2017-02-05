package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;


public class Lesbian  extends Woman{

	public Lesbian() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.WOMAN);
	}

}
