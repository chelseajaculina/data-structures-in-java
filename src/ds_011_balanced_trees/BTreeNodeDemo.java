package ds_011_balanced_trees;

public class BTreeNodeDemo {

	public static void main(String[] args) {
		BTreeNode<Integer> root = prepareRoot();
		
		System.out.println("Found: " + root.find(37));
	}
	
	private static BTreeNode<Integer> prepareRoot() {
		BTreeNode<Integer> root = new BTreeNode<>(2);
		
		// level 0
		root.add(11);
		root.add(25);
		
		// level 1
		// child1
		BTreeNode<Integer> child1 = new BTreeNode<>(2);
		child1.add(2);
		child1.add(5);
		
		root.branches[0] = child1;
		
		// child2
		BTreeNode<Integer> child2 = new BTreeNode<>(2);
		child2.add(13);
		child2.add(15);
		child2.add(16);
		child2.add(18);
		
		root.branches[1] = child2;
		
		// child3
		
		BTreeNode<Integer> child3 = new BTreeNode<>(2);
		child3.add(32);
		child3.add(37);
		
		root.branches[2] = child3;
		
		return root;
	}
	
//	private static BTreeNode<Integer> find(BTreeNode<Integer> node, Integer value) {
//		int i = 0;
//		for(; i < node.size; i++) {
////			System.out.printf("\t\tValue: %s, Node_Value: %s\n", value, node.values[i]);
//			if(value.equals((Integer)node.values[i])) {
//				return node;
//			}
//			
//			if(value.compareTo(node.values[i]) < 0) {
//				return find(node.branches[i], value);
//			}
//		}
//		
//		if(i == node.size) {
//			BTreeNode<Integer> next = node.branches[node.size];
//			return find(next, value);
////			return find(branches[size], value);
//		}
//		
//		return null;
//	}

}