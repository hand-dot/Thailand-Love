package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;

public class TomGayQueen extends Woman{

	public TomGayQueen() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.TOM);
	}
}
