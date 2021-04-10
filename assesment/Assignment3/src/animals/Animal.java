package animals;
import java.util.Arrays;
import java.util.HashMap;

/**
 * You can modify the contents of this class, but you cannot:
 * - change the name, parameters or return types of provided methods
 * - remove it entirely
 */
public abstract class Animal
{
	/**
	 * @return Returns this animal's given name.
	 */
	public String getNickname() {
		return this.getClass().getSimpleName();
	};
	
	/**
	 * Check whether two animals can live together.
	 * @param animal The animal for which to check compatibility with this animal.
	 * @return Returns true for compatible animals and false otherwise.
	 */
	public boolean isCompatibleWith(Animal animal) {
		HashMap<String, String[]> compatible = new HashMap<String, String[]>();
		compatible.put("Buzzard", new String[]{});
		compatible.put("Gazelle", new String[]{"Zebra"});
		compatible.put("Lion", new String[]{});
		compatible.put("Parrot", new String[]{});
		compatible.put("Seal", new String[]{"Starfish"});
		compatible.put("Shark", new String[]{"Starfish"});
		compatible.put("Starfish", new String[]{"Seal", "Shark"});
		compatible.put("Zebra", new String[]{"Gazelle"});
		String[] temp = compatible.get(this.getNickname());
		if (Arrays.asList(temp).contains(animal.getNickname())) {
			return true;
		}
		return false;
	};
}
