package CollectionFrameWorkMyOwnWork;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
	private int id;
	private String name;
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+this.id+" name: "+this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}


public class HashCodeAndEquals {

	public static void main(String[] args) {

		
		Player player1=new Player(1,"Dovran");
		Player player2=new Player(2,"Allanur");
		Player player3=new Player(3,"Meret");
		Player player4=new Player(1,"Dovran");
		
		
		Set<Player> hashSet=new HashSet<Player>();
		
		/*hashSet.add("C");
		hashSet.add("C++");
		hashSet.add("C#");
		hashSet.add("Java");
		hashSet.add("Python");
		hashSet.add("Python");
		System.out.println(hashSet);*/
		
		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);
		System.out.println(hashSet.toString());
	}

}
