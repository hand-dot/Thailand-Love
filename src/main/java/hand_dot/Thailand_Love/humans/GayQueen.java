package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Gay;

public class GayQueen extends Gay {

	public GayQueen() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.MAN);
	}
}
