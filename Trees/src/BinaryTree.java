public class BinaryTree {
    public Node root;

    public void insert(int value){
        if (root == null){
            root = new Node(value);
            return;
        }

        Node cur = root;
        Node newNode = new Node(value);
        while (true){
            if (value < cur.data){
                if (cur.left == null){
                    cur.left = newNode;
                    return;
                } else {
                    cur = cur.left;
                }
            } else {
                if (cur.right == null){
                    cur.right = newNode;
                    return;
                } else {
                    cur = cur.right;
                }
            }
        }
    }

    public void delete(int value){
        Node cur = root;
        Node par = root;
        boolean isCurLeft = true;

        while (cur.data != value){
            par = cur;
            if (value < cur.data){
                cur = cur.left;
                isCurLeft = true;
            } else {
                cur = cur.right;
                isCurLeft = false;
            }
        }

        if (cur.left == null && cur.right == null){
            if (cur == root){
                root = null;
            } else if (isCurLeft){
                par.left = null;
            } else {
                par.right = null;
            }
        } else if (cur.left != null && cur.right != null){
            Node successor = getSuccessor(cur);
            if (cur == root){
                root = successor;
            } else if (isCurLeft) {
                par.left = successor;
            } else {
                par.right = successor;
            }
        } else if (cur.left == null) {
            if (cur == root){
                root = cur.right;
            } else if (isCurLeft){
                par.left = cur.right;
            } else {
                par.right = cur.right;
            }
        } else {
            if (cur == root){
                root = cur.left;
            } else if (isCurLeft) {
                par.left = cur.left;
            } else {
                par.right = cur.left;
            }
        }
    }

    public Node find(int value){
        Node cur = root;
        while (cur.data != value){
            if (value < cur.data){
                cur = cur.left;
            } else {
                cur = cur.right;
            }

            if (cur == null){
                return null;
            }
        }
        return cur;
    }

    public void inOrder(Node localRoot){
        if (localRoot != null){
            inOrder(localRoot.left);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.right);
        }
    }

    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode.right;
        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != delNode.right){
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        successor.left = delNode.left;

        return successor;
    }

    public void display() {
        if (root == null) {
            System.out.println("Дерево пустое");
            return;
        }
        displayRecursive(root, 0);
    }

    private void displayRecursive(Node node, int level) {
        if (node == null) {
            return;
        }

        displayRecursive(node.right, level + 1);

        // Отступ в зависимости от уровня глубины
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);

        displayRecursive(node.left, level + 1);
    }
}
