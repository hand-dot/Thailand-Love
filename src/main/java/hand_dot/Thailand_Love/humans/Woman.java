package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;

public class Woman extends hand_dot.Thailand_Love.humans.abstracts.Woman{

	public Woman() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.MAN);
	}

}
