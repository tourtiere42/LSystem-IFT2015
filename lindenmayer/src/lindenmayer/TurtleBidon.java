package lindenmayer;

import java.awt.geom.Point2D;
import java.util.Stack;

public class TurtleBidon implements Turtle{
	private Stack<State> states = new Stack<State>();
	private State currentState = new State();
	private double step;
	private double delta;
	
	
	public TurtleBidon() {
		
	}
	
	private class State{
		double x;
		double y;
		double theta;
		
		private State(double x, double y, double theta) {
			this.x = x;
			this.y = y;
			this.theta = theta;
			
		}
		
		private State() {};
		
		private void pos(double x, double y, double theta) {
			this.x = x;
			this.y = y;
			this.theta = theta;
		}
	}
	

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		
		
	}

	@Override
	public void turnR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnL() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push() {
		states.push(currentState);
		
	}

	@Override
	public void pop() {
		currentState = states.pop();
	}

	@Override
	public void stay() {
		//nothing
	}

	@Override
	public void init(Point2D pos, double angle_deg) {
		states.clear();
		currentState = new State(pos.getX(),pos.getY(),angle_deg);
		
	}

	@Override
	public Point2D getPosition() {
		return new Point2D.Double(currentState.x,currentState.y);
	}

	@Override
	public double getAngle() {
		return currentState.theta;
	}

	@Override
	public void setUnits(double step, double delta) {
		this.step = step;
		this.delta = delta;
		
	}
}
