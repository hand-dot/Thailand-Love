package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Man;

public class Gay extends  Man{

	public Gay() {
		this.setVisual(Sex.UNKNOWN);
		this.addLoveTergets(Sex.MAN);
	}
}
