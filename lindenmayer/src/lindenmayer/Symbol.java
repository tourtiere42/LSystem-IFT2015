package lindenmayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Symbol in an L-system's alphabet.
 * 
 * @author Mikl&oacute;s Cs&#369;r&ouml;s
 */
public class Symbol {
	private final char value;

	public Symbol(char c) {
		this.value = c;
	}

	@Override
	public String toString() {
		return Character.toString(value);
	}

	/**
	 * Common interface to a string of symbols.
	 * 
	 */
	public interface Seq extends Iterable<Symbol> {
		class List implements Seq {
			
			private ArrayList<Symbol> symbols = new ArrayList<Symbol>();
			
			@Override
			public Iterator<Symbol> iterator() {
				Iterator<Symbol> it = new Iterator<Symbol>() {
						
					private int index =0;
					@Override
					public boolean hasNext() {
						if(symbols.size()-1<index++) {
							return false;
						}else {
							return true;
						}
						
					}

					@Override
					public Symbol next() {
						index++;
						return symbols.get(index);
					}
					
				};
				
				return it;
				
			}
			
		}
		
	}

}
