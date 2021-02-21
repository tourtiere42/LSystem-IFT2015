package lindenmayer;

import java.awt.geom.Rectangle2D;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lindenmayer.Symbol.Seq;

public class LSystem extends AbstractLSystem{

	
	private Map<Character, Symbol> symTab = new HashMap<Character, Symbol>();
	private Map<Symbol, List<Symbol.Seq>> ruleTab = new HashMap<Symbol, List<Symbol.Seq>>();
	
	@Override
	public Symbol addSymbol(char sym) {
		Symbol symbol = new Symbol(sym);
		symTab.put(sym, symbol);
		return symbol;
	}

	

	
	@Override
	public void addRule(Symbol sym, String expansion) {
		List<Symbol> constructedRule = new ArrayList<Symbol>();
		
		for(int i =0; i<expansion.length();i++) {
			char temp = expansion.charAt(i);
			constructedRule.add(symTab.get(temp));
		}
		
		ruleTab.put(sym, constructedRule);
		
	}

	@Override
	public void setAction(Symbol sym, String action) {
		
		
	}

	@Override
	public void setAxiom(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seq getAxiom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seq rewrite(Symbol sym) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tell(Turtle turtle, Symbol sym) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seq applyRules(Seq seq, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D tell(Turtle turtle, Seq seq, int rounds) {
		// TODO Auto-generated method stub
		return null;
	}

}
