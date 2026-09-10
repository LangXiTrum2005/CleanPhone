package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.BinaryHeap.Node;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BinaryHeap<T extends Node> {
    private final boolean isMaxHeap;
    private Node[] nodes;
    public int size;

    public static class Node {
        int index;
        float value;

        public Node(float f) {
            this.value = f;
        }

        public float getValue() {
            return this.value;
        }

        public String toString() {
            return Float.toString(this.value);
        }
    }

    public BinaryHeap() {
        this(16, false);
    }

    private void down(int i) {
        Node node;
        float f;
        Node[] nodeArr = this.nodes;
        int i2 = this.size;
        Node node2 = nodeArr[i];
        float f2 = node2.value;
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            int i5 = i3 + 2;
            Node node3 = nodeArr[i4];
            float f3 = node3.value;
            if (i5 >= i2) {
                f = this.isMaxHeap ? -3.4028235E38f : Float.MAX_VALUE;
                node = null;
            } else {
                node = nodeArr[i5];
                f = node.value;
            }
            boolean z = f3 < f;
            boolean z2 = this.isMaxHeap;
            if (z ^ z2) {
                if (f3 == f2) {
                    break;
                }
                if ((f3 > f2) ^ z2) {
                    break;
                }
                nodeArr[i] = node3;
                node3.index = i;
                i = i4;
            } else {
                if (f == f2) {
                    break;
                }
                if ((f > f2) ^ z2) {
                    break;
                }
                nodeArr[i] = node;
                if (node != null) {
                    node.index = i;
                }
                i = i5;
            }
        }
        nodeArr[i] = node2;
        node2.index = i;
    }

    private void up(int i) {
        Node[] nodeArr = this.nodes;
        Node node = nodeArr[i];
        float f = node.value;
        while (i > 0) {
            int i2 = (i - 1) >> 1;
            Node node2 = nodeArr[i2];
            if (!((f < node2.value) ^ this.isMaxHeap)) {
                break;
            }
            nodeArr[i] = node2;
            node2.index = i;
            i = i2;
        }
        nodeArr[i] = node;
        node.index = i;
    }

    public T add(T t) {
        int i = this.size;
        Node[] nodeArr = this.nodes;
        if (i == nodeArr.length) {
            Node[] nodeArr2 = new Node[i << 1];
            System.arraycopy(nodeArr, 0, nodeArr2, 0, i);
            this.nodes = nodeArr2;
        }
        int i2 = this.size;
        t.index = i2;
        this.nodes[i2] = t;
        this.size = i2 + 1;
        up(i2);
        return t;
    }

    public void clear() {
        Arrays.fill(this.nodes, 0, this.size, (Object) null);
        this.size = 0;
    }

    public boolean contains(T t, boolean z) {
        if (t == null) {
            throw new IllegalArgumentException("node cannot be null.");
        }
        if (z) {
            for (Node node : this.nodes) {
                if (node == t) {
                    return true;
                }
            }
        } else {
            for (Node node2 : this.nodes) {
                if (node2.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BinaryHeap)) {
            return false;
        }
        BinaryHeap binaryHeap = (BinaryHeap) obj;
        int i = binaryHeap.size;
        int i2 = this.size;
        if (i != i2) {
            return false;
        }
        Node[] nodeArr = this.nodes;
        Node[] nodeArr2 = binaryHeap.nodes;
        for (int i3 = 0; i3 < i2; i3++) {
            if (nodeArr[i3].value != nodeArr2[i3].value) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Node[] nodeArr = this.nodes;
        int i = this.size;
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(nodeArr[i2].value);
        }
        return iFloatToIntBits;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public T peek() {
        if (this.size != 0) {
            return (T) this.nodes[0];
        }
        throw new IllegalStateException("The heap is empty.");
    }

    public T pop() {
        Node[] nodeArr = this.nodes;
        T t = (T) nodeArr[0];
        int i = this.size - 1;
        this.size = i;
        if (i > 0) {
            nodeArr[0] = nodeArr[i];
            nodeArr[i] = null;
            down(0);
        } else {
            nodeArr[0] = null;
        }
        return t;
    }

    public T remove(T t) {
        int i = this.size - 1;
        this.size = i;
        if (i > 0) {
            Node[] nodeArr = this.nodes;
            Node node = nodeArr[i];
            nodeArr[i] = null;
            int i2 = t.index;
            nodeArr[i2] = node;
            if ((node.value < t.value) ^ this.isMaxHeap) {
                up(i2);
            } else {
                down(i2);
            }
        } else {
            this.nodes[0] = null;
        }
        return t;
    }

    public void setValue(T t, float f) {
        float f2 = t.value;
        t.value = f;
        if ((f < f2) ^ this.isMaxHeap) {
            up(t.index);
        } else {
            down(t.index);
        }
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        Node[] nodeArr = this.nodes;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(nodeArr[0].value);
        for (int i = 1; i < this.size; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(nodeArr[i].value);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public BinaryHeap(int i, boolean z) {
        this.isMaxHeap = z;
        this.nodes = new Node[i];
    }

    public T add(T t, float f) {
        t.value = f;
        return (T) add(t);
    }
}
