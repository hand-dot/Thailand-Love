package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;


public class Tom extends Woman{

	public Tom() {
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.WOMAN);
		this.addLoveTergets(Sex.DEE);
	}

}
