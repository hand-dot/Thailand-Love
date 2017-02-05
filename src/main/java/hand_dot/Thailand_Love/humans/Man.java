package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;

public class Man  extends hand_dot.Thailand_Love.humans.abstracts.Man{

	public Man() {
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.WOMAN);
	}
}
