package hand_dot.Thailand_Love.humans;

import hand_dot.Thailand_Love.enums.Sex;
import hand_dot.Thailand_Love.humans.abstracts.Man;

public class GayKing  extends  Man{
	public GayKing(){
		this.setVisual(Sex.MAN);
		this.addLoveTergets(Sex.MAN);
	}
}
