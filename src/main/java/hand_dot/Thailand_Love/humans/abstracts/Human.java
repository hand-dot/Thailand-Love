package hand_dot.Thailand_Love.humans.abstracts;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import hand_dot.Thailand_Love.enums.Sex;

public abstract class Human {
	private Sex sex;
	private Sex visual;
	private Set<Sex> loveTergets = new HashSet<>();

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Set<Sex> getLoveTergets() {
		return loveTergets;
	}

	public void setLoveTergets(Set<Sex> loveTergets) {
		this.loveTergets = loveTergets;
	}

	public void addLoveTergets(Sex loveTerget) {
		this.loveTergets.add(loveTerget);
	}

	public Sex getVisual() {
		return visual;
	}

	public void setVisual(Sex visual) {
		this.visual = visual;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
