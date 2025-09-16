import java.util.ArrayList;
import java.util.Random;

public class Tree {

    // We recommend attempting this class last, as it hasn't been scaffolded for your team.
    // Even if your team doesn't have time to implement this class, it is a useful exercise
    // to think about how you might split up the work to get the Tree and TreeMultiSet
    // implemented.

    private int root;
    private ArrayList<Tree> children;
    private boolean empty;

    public Tree() {
        this.empty = true;
    }

    public Tree(int root) {
        this.root = root;
        this.children = new ArrayList<Tree>();
        this.empty = false;
    }

    public void insert(int item) {

        if (this.empty) {
            this.root = item;
            this.children = new ArrayList<Tree>();
            this.empty = false;
        } //if the tree is empty add item to the root
        else if (this.children.isEmpty()) {
            this.children.add(new Tree(item));
        } //if the tree has no subtrees, create a tree with item and add it to the subtree
        else {
            Random r1 = new Random();
            int index = r1.nextInt(3) + 1;
            if (index == 3) {
                this.children.add(new Tree(item));
            } else {
                int treeindex = r1.nextInt(this.children.size());
                this.children.get(treeindex).insert(item);
            }
        }
    }

    public boolean delete_item(int item) {
        if (this.empty){
            return false;
        } else if (this.root == item) {
            this.delete_root_help();
            return true;
        }else {
            for (Tree child : this.children) {
                boolean deleted = child.delete_item(item);
                if (deleted && child.is_empty()){
                    this.children.remove(child);
                    return true;
                } else if (deleted) {
                    return true;
                }else {continue;}
            }
            return false;
        }

    }

    private void delete_root_help(){
        
        if(this.children.isEmpty()){
            this.empty = true;
        }else {
            Tree curr = this.children.removeLast();
            this.root = curr.getRoot();
            this.children.addAll(curr.getChildren());
            curr.setChildren(null);
        }
        
    }

    public boolean contains(int item) {
        if (this.empty) {
            return false;
        } else if (this.root == item) {
            return true;
        } else {
            for (Tree child : this.children) {
                if (child.contains(item)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean is_empty() {
        return this.empty;
    }

    public int count(int item) {
        if (this.empty) {
            return 0;
        } else {
            int num = 0;
            if (this.root == item) {
                num += 1;
            }
            for (Tree child : this.children) {
                num += child.count(item);
            }
            return num;
        }
    }

    public int size() {
        if (this.empty){
            return 0;
        }else{
            int count = 1;
            for (Tree child : this.children) {
                count += child.size();
            }
            return count;
        }
    }


    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public ArrayList<Tree> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Tree> children) {
        this.children = children;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
