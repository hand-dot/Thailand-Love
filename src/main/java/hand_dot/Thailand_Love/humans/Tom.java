package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;

public class Tom extends  hand_dot.Thailand_Love.humans.abstracts.Tom{

	public Tom() {
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.WOMAN);
		this.addLoveTergets(Sex.DEE);
	}

}
