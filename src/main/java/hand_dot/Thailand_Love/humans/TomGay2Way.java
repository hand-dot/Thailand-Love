package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;

public class TomGay2Way  extends Woman{

	public TomGay2Way() {
		this.setVisual(Sex.MAN);
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.MAN);
	}

}
