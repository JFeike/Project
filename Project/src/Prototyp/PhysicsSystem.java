package Prototyp;

import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;

public class PhysicsSystem {
	
	private World world;
	
	public PhysicsSystem(World w) {
		world = w;
		}
	
	public ArrayList<A_GameObject> getCollisions(A_GameObject object)  {
		
	ArrayList<A_GameObject> result = new ArrayList<A_GameObject>();
	int len = world.gameObjects.size();
	
	for(int i=0; i<len; i++)    {
		A_GameObject obj2 = world.gameObjects.get(i);
		
		if(obj2==object) continue;
		
		// check if they touch 
		double dist = object.radius + obj2.radius;
		double dx   = Math.abs(object.x-obj2.x);
		double dy   = Math.abs(object.y-obj2.y);
		
		if(dx<dist && dy<dist) {
			if(dx*dx+dy*dy < dist*dist) {
				result.add(obj2);
				}
			} 
		}
			return result;
			}
	

	
	}

