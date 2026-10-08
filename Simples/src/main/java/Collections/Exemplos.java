package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exemplos {

	public static void main(String[] args) {
		List<String> nomesArrayList = new ArrayList<>();
		nomesArrayList.add("João");
		nomesArrayList.add("Maria");
		nomesArrayList.add("José");
		nomesArrayList.remove(1);
		for(String s:nomesArrayList) {
			System.out.println("Item: "+ s);
		}
		
		Iterator iter=nomesArrayList.iterator();
		
		while(iter.hasNext()) {
			System.out.println("Item:"+iter.next());
		}
		
		List<String> nomesLinkedList = new LinkedList();
		
		nomesLinkedList.add("João");
		nomesLinkedList.add("Maria");
		nomesLinkedList.add("José");
		nomesLinkedList.remove(1);
		for(String s:nomesLinkedList) {
			System.out.println("Item: "+ s);
		}
		
		Set<String> nomeHashSet=new HashSet();
		nomeHashSet.add("Joao");
		nomeHashSet.add("Maria");
		nomeHashSet.add("José");
		for(String s:nomeHashSet) {
			System.out.println("Item: "+ s);
		}
		nomeHashSet.remove(1);
		
		Set<String> nomesTreeSet = new TreeSet();
		nomesTreeSet.add("João");
		nomesTreeSet.add("Maria");
		nomesTreeSet.add("José");
		for(String s:nomesTreeSet) {
			System.out.println("Item: "+ s);
		}
		nomesTreeSet.remove("José");
		
		Map<Integer,String> nomesHashMap=new HashMap();
		nomesHashMap.put(1, "Joao");
		nomesHashMap.put(2, "Maria");
		nomesHashMap.put(3, "Jose");
		System.out.println(""+nomesHashMap.get(1));
		nomesHashMap.remove(1);
		for(Map.Entry<Integer, String> item:nomesHashMap.entrySet()) {
			System.out.println(item.getKey()+"<->"+item.getValue());
		}
		for(Integer key:nomesHashMap.keySet()) {
			System.out.println(key+"<<->>"+nomesHashMap.get(key));
		}
		Map<Integer, String> mapux = new HashMap();
		nomesHashMap.forEach((key,value)->{
			System.out.println(key+" -> "+value);
			if(key>1) {
				mapux.put(key, value);
			}
		});
		nomesHashMap.forEach((key,value)->{
			System.out.println(key+" -> "+value);
		});
		
		Map<Integer, String> nomesTreeMap=new TreeMap();
		nomesTreeMap.put(1, "João");
		nomesTreeMap.put(2, "Maria");
		nomesTreeMap.put(3, "José");
		nomesTreeMap.forEach((k,v)->{
			System.out.println(k+" == "+v);
			System.out.println(nomesTreeMap.get(k));
		});
		
		Set<String> nomesLinkedHashSet=new LinkedHashSet();
		nomesLinkedHashSet.add("Joao");
		nomesLinkedHashSet.add("Maria");
		nomesLinkedHashSet.add("Jose");
		nomesLinkedHashSet.forEach((v)->{
			System.out.println(v);
		});
		
		Queue<String> nomesQueue = new PriorityQueue();
		nomesQueue.add("Joao");
		nomesQueue.offer("Maria");
		nomesQueue.offer("José");
		nomesQueue.remove();
		nomesQueue.remove("Maria");
		
		List<List<String>> listaS = new ArrayList();
		
		Deque<String> deque = new ArrayDeque();
		deque.add("Joao");
		deque.addFirst("Primeiro");
		deque.add("Ultimo");
	}
	
	public static void mostrar(Collection c) {
		System.out.println("Iterator");
		Iterator iter= c.iterator();
		while(iter.hasNext()) {
			System.out.print(""+iter.next());
		}
	}
}