package me.wiefferink.interactivemessenger.processing;

public class ReplacementLimitReachedException extends Exception {
	private static final long serialVersionUID = -3654685677996795433L;
	private Limit limit;

	public ReplacementLimitReachedException(Limit limit) {
		this.limit = limit;
	}

	public Limit getLimit() {
		return limit;
	}
}
