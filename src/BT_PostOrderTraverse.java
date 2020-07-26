

public class BT_PostOrderTraverse 
{

	  public static class TreeNode
	  {
		  int data;
		  TreeNode ln;
		  TreeNode rn;
		  TreeNode(int data)
		  {
			  this.data= data;
			  
		  }
	  }
		
		public static  TreeNode createBT()
		{
			TreeNode rn = new TreeNode(40);
			
			TreeNode rn20 = new TreeNode(20);
			TreeNode rn10 = new TreeNode(10);
			TreeNode rn30 = new TreeNode(30);
			TreeNode rn60 = new TreeNode(60);
			TreeNode rn50 = new TreeNode(50);
			TreeNode rn70 = new TreeNode(70);

			rn.ln= rn20;
			rn.rn= rn60;
			
			rn20.ln= rn10;
			rn20.rn=rn30;
			
			rn60.ln=rn50;
			rn60.rn=rn70;
			
		return rn;
			
		}
		
		// In-Order- Recursive Solution
		
		public void PostorderTraverse(TreeNode root)
		{
			if(root!=null)
			{
				PostorderTraverse(root.ln);
				PostorderTraverse(root.rn);
				System.out.print(""+root.data +" ");

			}
			
			
		}
		
	public static void main(String args[])
		{
		BT_PostOrderTraverse bt = new BT_PostOrderTraverse();
			
			TreeNode rn = createBT();
			bt.PostorderTraverse(rn);
		}
		

	

}
