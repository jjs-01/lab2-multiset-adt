import java.util.ArrayList;

public class Tree {

    // We recommend attempting this class last, as it hasn't been scaffolded for your team.
    // Even if your team doesn't have time to implement this class, it is a useful exercise
    // to think about how you might split up the work to get the Tree and TreeMultiSet
    // implemented.

    private int root;
    private ArrayList<Tree> children;
    private boolean empty;

    public Tree(){
        this.empty = true;
    }
    public Tree(int root){
        this.root = root;
        this.children = new ArrayList<Tree>();
        this.empty = false;
    }

    public void insert(int item){
    }

    public void delete_item(int item){

    }

    public boolean contains(int item){
        return false;
    }

    public boolean is_empty(){
        return this.empty;
    }

    public int count(int item){
        return -1;
    }

    public int size(){
        return -1;
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
