package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Man;

public class Bout  extends Man{

	public Bout() {
		this.setVisual(Sex.UNKNOWN);
		this.addLoveTergets(Sex.WOMAN);
		this.addLoveTergets(Sex.GAYKING);
		this.addLoveTergets(Sex.GAYQUEEN);
	}

}
