package hand_dot.Thailand_Love.enums;

import hand_dot.Thailand_Love.humans.Adum;
import hand_dot.Thailand_Love.humans.Anjii;
import hand_dot.Thailand_Love.humans.Bi;
import hand_dot.Thailand_Love.humans.Bout;
import hand_dot.Thailand_Love.humans.Cherry;
import hand_dot.Thailand_Love.humans.Dee;
import hand_dot.Thailand_Love.humans.Gay;
import hand_dot.Thailand_Love.humans.GayKing;
import hand_dot.Thailand_Love.humans.GayQueen;
import hand_dot.Thailand_Love.humans.Lesbian;
import hand_dot.Thailand_Love.humans.Man;
import hand_dot.Thailand_Love.humans.Okama;
import hand_dot.Thailand_Love.humans.Sumyean;
import hand_dot.Thailand_Love.humans.Tom;
import hand_dot.Thailand_Love.humans.TomGay;
import hand_dot.Thailand_Love.humans.TomGay2Way;
import hand_dot.Thailand_Love.humans.TomGayKing;
import hand_dot.Thailand_Love.humans.TomGayQueen;
import hand_dot.Thailand_Love.humans.Woman;
import hand_dot.Thailand_Love.humans.abstracts.Human;

public enum Sex {
	MAN(new Man()),
	WOMAN(new Woman()),
	GAY(new Gay()),
	TOM(new Tom()),
	DEE(new Dee()),
	TOMGAY(new TomGay()),
	TOMGAYKING(new TomGayKing()),
	BI(new Bi()),
	BOUT(new Bout()),
	GAYQUEEN(new GayQueen()),
	GAYKING(new GayKing()),
	TOMGAY2WAY(new TomGay2Way()),
	TOMGAYQUEEN(new TomGayQueen()),
	LESBIAN(new Lesbian()),
	OKAMA(new Okama()),
	ADUM(new Adum()),
	ANJII(new Anjii()),
	CHERRY(new Cherry()),
	SUMYEAN(new Sumyean()),
	UNKNOWN(null);

    private final Human human;

    private Sex(final Human human) {
        this.human = human;
    }

	public Human getHuman() {
		return human;
	}
}
