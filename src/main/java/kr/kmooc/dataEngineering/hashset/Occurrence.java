package kr.kmooc.dataEngineering.hashset;

public class Occurrence {
	private int id;
	private int count;

	public Occurrence(int id, int count) {
		super();
		this.id = id;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Occurrence other = (Occurrence) obj;
		if (other.getId() == id)
			return true;
		return false;
	}

}
