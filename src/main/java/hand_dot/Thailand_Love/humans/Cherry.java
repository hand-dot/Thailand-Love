package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;

public class Cherry extends Woman {

	public Cherry() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.GAY);
		this.addLoveTergets(Sex.OKAMA);
	}

}
