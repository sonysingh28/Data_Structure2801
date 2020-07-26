

public class BT_InorderTraverse 
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
		
		public void InorderTraverse(TreeNode root)
		{
			if(root!=null)
			{
				InorderTraverse(root.ln);
				
				System.out.print(""+root.data +" ");
				
				InorderTraverse(root.rn);

			}
			
			
		}
		
	public static void main(String args[])
		{
			BT_InorderTraverse bt = new BT_InorderTraverse();
			
			TreeNode rn = createBT();
			bt.InorderTraverse(rn);
		}
		

	

	

}
