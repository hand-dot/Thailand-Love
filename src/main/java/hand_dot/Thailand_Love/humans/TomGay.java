package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Woman;


public class TomGay  extends Woman{

	public TomGay() {
		this.setVisual(Sex.WOMAN);
		this.addLoveTergets(Sex.WOMAN);
		this.addLoveTergets(Sex.TOM);
		this.addLoveTergets(Sex.DEE);
	}
}
