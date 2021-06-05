package aufgabe7;

import java.util.*;

public class Slack implements Publisher {

	private Set<Listener> listeners;
	private int nrOfMessages;

	public Slack() {
		super();
		this.listeners = new HashSet<>();
		this.nrOfMessages = 0;
	}

	@Override
	public boolean register(Listener listener) {

		if (listeners.contains(listener)) {
			return false;
		}

		else {
			listeners.add(listener);
		}
		return true;
	}

	@Override
	public boolean unregister(Listener listener) {

		if (listeners.contains(listener)) {
			listeners.remove(listener);
			return true;
		}

		else {
			return false;
		}

	}

	@Override
	public void notifyListeners() {

		for (Listener listener : listeners) {
			listener.update();
		}

	}

	@Override
	public String getUpdate(Listener obj) {

		return "Breaking News " + this.nrOfMessages;
	}

	public void publishNews() {
		this.nrOfMessages += 1;
		notifyListeners();
	}
}