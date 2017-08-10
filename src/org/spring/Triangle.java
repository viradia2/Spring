package org.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle {
	
	/*
	 * For Initializing Collection in Spring
		private List<Point> points;
		public List<Point> getPoints() {
			return points;
		}
		public void setPoints(List<Point> points) {
			this.points = points;
		}
		public void draw(){
			for(Point point : points){
				System.out.println("Point : (" +point.getX()+","+point.getY()+") ");
			}
		}
	*
	*/
	
	
		private Point pointA;
		private Point pointB;
		private Point pointC;
		private ApplicationContext context = null;
		
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		public void draw(){
			System.out.println("Point: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
			System.out.println("Point: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
			System.out.println("Point: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		}
		//@Override
		/*public void setApplicationContext(ApplicationContext context) throws BeansException {
			// TODO Auto-generated method stub
			this.context = context;
		}
		@Override
		public void setBeanName(String beanName) {
			// TODO Auto-generated method stub
			System.out.println("Bean Name: " + beanName);
		}*/
	
	
	
	
}
