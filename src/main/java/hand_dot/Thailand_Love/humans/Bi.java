package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;

public class Bi extends Woman {

	public Bi() {
		this.setVisual(Sex.UNKNOWN);
		this.addLoveTergets(Sex.BI);
		this.addLoveTergets(Sex.TOM);
		this.addLoveTergets(Sex.LESBIAN);
		this.addLoveTergets(Sex.MAN);
	}

}
