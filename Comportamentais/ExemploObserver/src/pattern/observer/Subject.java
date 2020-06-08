package pattern.observer;

public interface Subject {
	
	public void registrarObserver(Observer observer);
	public void removerObserver(Observer observer);
	public void notificarObservers();

}
