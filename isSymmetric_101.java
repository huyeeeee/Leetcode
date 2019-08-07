import java.util.ArrayList;

public class isSymmetric_101 {

    public boolean isSymmetric(TreeNode root){
        ArrayList<Integer> lrr = new ArrayList<>();
        ArrayList<Integer> rrl = new ArrayList<>();
        LRR(root,lrr);
        RRL(root,rrl);
        System.out.println(lrr);
        System.out.println(rrl);
        if (lrr.size() != rrl.size())
            return false;
        for (int i = 0;i < lrr.size();i++){
            if (lrr.get(i) != rrl.get(i)){
                return false;
            }
        }
        return true;
    }

    public void LRR(TreeNode root,ArrayList<Integer> lrr){
        if (root != null){
            LRR(root.left,lrr);
            lrr.add(root.val);
            LRR(root.left,lrr);
        }
    }

    public void RRL(TreeNode root,ArrayList<Integer> rrl){
        if (root != null){
            RRL(root.right,rrl);
            rrl.add(root.val);
            RRL(root.left,rrl);
        }
    }
}