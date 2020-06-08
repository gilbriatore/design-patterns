package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class EstoqueSubject implements Subject {

	private double percentual;
	private List<Observer> observers;

	public EstoqueSubject() {
		this.observers = new ArrayList<Observer>();
	}

	public void setReajuste(double percentual) {
		this.percentual = percentual;
		notificarObservers();
	}

	@Override
	public void notificarObservers() {
		for (Observer observer : observers) {
			observer.reajustarPreco(percentual);
		}
	}

	@Override
	public void registrarObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}
}