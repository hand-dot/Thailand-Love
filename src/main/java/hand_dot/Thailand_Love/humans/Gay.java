package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;

public class Gay extends  hand_dot.Thailand_Love.humans.abstracts.Gay{

	public Gay() {
		this.setVisual(Sex.UNKNOWN);
		this.addLoveTergets(Sex.MAN);
	}
}
