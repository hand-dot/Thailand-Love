package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;

public class Sumyean extends Woman{

	public Sumyean() {
		this.setVisual(Sex.UNKNOWN);
		this.addLoveTergets(Sex.LESBIAN);
		this.addLoveTergets(Sex.TOM);
		this.addLoveTergets(Sex.WOMAN);

	}

}
