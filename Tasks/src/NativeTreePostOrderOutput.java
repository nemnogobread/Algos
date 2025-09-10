/*Дано число N ≤ 104 и последовательность целых чисел из [-231..231] длиной N. Требуется построить бинарное дерево,
заданное наивным порядком вставки. Т.е., при добавлении очередного числа K в дерево с корнем root, если root→Key ≤ K,
то узел K добавляется в правое поддерево root; иначе в левое поддерево root. Выведите элементы в порядке post-order (снизу вверх).
Рекурсия запрещена.
*/

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NativeTreePostOrderOutput {

    public class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public NativeTreePostOrderOutput() {
        this.root = null;
    }

    public Node root;

    public void nativeInsert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node cur = root;
        Node newNode = new Node(value);
        while (true) {
            if (value < cur.data) {
                if (cur.left == null) {
                    cur.left = newNode;
                    return;
                } else {
                    cur = cur.left;
                }
            } else {
                if (cur.right == null) {
                    cur.right = newNode;
                    return;
                } else {
                    cur = cur.right;
                }
            }
        }
    }

    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()){
            Node node = stack1.pop();
            stack2.push(node);

            if (node.left != null){
                stack1.push(node.left);
            }
            if (node.right != null){
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()){
            result.add(stack2.pop().data);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        NativeTreePostOrderOutput tree = new NativeTreePostOrderOutput();

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            tree.nativeInsert(num);
        }

        List<Integer> postOrder = tree.postOrder();
        for (int num : postOrder) {
            System.out.print(num + " ");
        }
    }
}