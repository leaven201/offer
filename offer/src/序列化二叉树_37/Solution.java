package 序列化二叉树_37;

public class Solution {
	// 利用前序遍历序列化，空标记为$
	String Serialize(TreeNode root) {
		if (root == null) {
			return "";
		}
		StringBuffer res = new StringBuffer();
		SerializeMethod(root, res);
		return res.toString();
	}

	private void SerializeMethod(TreeNode root, StringBuffer res) {
		if (root == null) {
			res.append("$,");
			return;
		}
        res.append(root.val);
        res.append(',');
		SerializeMethod(root.left, res);
		SerializeMethod(root.right, res);
	}

	TreeNode Deserialize(String str) {
        if(str.equals(""))
        	return null;
        String[] strs=str.split(",");
        return DeserializeMethod(strs);
	}
	//指向当前需要操作的字符
	int index=-1;
	private TreeNode DeserializeMethod(String[] strs) {
		index++;
		//如果该字符不等于$，则生成该节点并通过递归生成其左右节点
		if(!strs[index].equals("$")) {
			TreeNode node = new TreeNode(Integer.parseInt(strs[index]));
			node.left=DeserializeMethod(strs);
			node.right=DeserializeMethod(strs);
			return node;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node3.left=node5;
		node3.right=node6;
		Solution s=new Solution();
		String res=s.Serialize(node1);
		System.out.println(res);
		

        
	}

}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}