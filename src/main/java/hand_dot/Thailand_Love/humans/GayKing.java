package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Gay;

public class GayKing extends Gay{
	public GayKing(){
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.MAN);
	}
}
