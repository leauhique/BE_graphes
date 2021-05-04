package org.insa.graphs.algorithm.shortestpath;
import org.insa.graphs.model.Arc;


public class Label implements Comparable<Label> {
	private  int sommetCourrant;
	private boolean marque;
	private double cost;
	private Arc pere;
	
	public Label(int sommetCourrant) {
		this.sommetCourrant = sommetCourrant;
		this.marque = false;
		this.cost = Double.POSITIVE_INFINITY;
		this.pere=null;
		
	}
	public int getSommetCourrant() {
		return sommetCourrant;
	}

	public void setSommetCourrant(int sommetCourrant) {
		this.sommetCourrant = sommetCourrant;
	}

	public boolean isMarque() {
		return marque;
	}

	public void setMarque(boolean marque) {
		this.marque = marque;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Arc getPere() {
		return pere;
	}

	public void setPere(Arc pere) {
		this.pere = pere;
	}
	
	@Override 
	public int compareTo(Label label) {
        return Double.compare(this.getCost(), label.getCost());
    }
}
