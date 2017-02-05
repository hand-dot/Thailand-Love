package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Tom;

public class TomGayKing  extends Tom{

	public TomGayKing() {
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.TOM);
	}

}
