package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Tom;

public class Lesbian  extends Tom{

	public Lesbian() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.WOMAN);
	}

}
