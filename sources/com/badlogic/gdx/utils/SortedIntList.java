package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public class SortedIntList<E> implements Iterable<Node<E>> {
    Node<E> first;
    private transient SortedIntList<E>.Iterator iterator;
    private NodePool<E> nodePool = new NodePool<>();
    int size = 0;

    public class Iterator implements java.util.Iterator<Node<E>> {
        private Node<E> position;
        private Node<E> previousPosition;

        public Iterator() {
            reset();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            Node<E> node = this.previousPosition;
            if (node != null) {
                SortedIntList sortedIntList = SortedIntList.this;
                if (node == sortedIntList.first) {
                    sortedIntList.first = this.position;
                } else {
                    Node<E> node2 = node.p;
                    Node<E> node3 = this.position;
                    node2.n = node3;
                    if (node3 != null) {
                        node3.p = node2;
                    }
                }
                sortedIntList.size--;
            }
        }

        public SortedIntList<E>.Iterator reset() {
            this.position = SortedIntList.this.first;
            this.previousPosition = null;
            return this;
        }

        @Override // java.util.Iterator
        public Node<E> next() {
            Node<E> node = this.position;
            this.previousPosition = node;
            this.position = node.n;
            return node;
        }
    }

    public static class Node<E> {
        public int index;
        protected Node<E> n;
        protected Node<E> p;
        public E value;
    }

    public static class NodePool<E> extends Pool<Node<E>> {
        public Node<E> obtain(Node<E> node, Node<E> node2, E e, int i) {
            Node<E> node3 = (Node) super.obtain();
            node3.p = node;
            node3.n = node2;
            node3.value = e;
            node3.index = i;
            return node3;
        }

        @Override // com.badlogic.gdx.utils.Pool
        public Node<E> newObject() {
            return new Node<>();
        }
    }

    public void clear() {
        while (true) {
            Node<E> node = this.first;
            if (node == null) {
                this.size = 0;
                return;
            } else {
                this.nodePool.free(node);
                this.first = this.first.n;
            }
        }
    }

    public E get(int i) {
        Node<E> node = this.first;
        if (node != null) {
            while (true) {
                Node<E> node2 = node.n;
                if (node2 == null || node.index >= i) {
                    break;
                }
                node = node2;
            }
            if (node.index == i) {
                return node.value;
            }
        }
        return null;
    }

    @Null
    public E insert(int i, E e) {
        Node<E> node;
        Node<E> node2 = this.first;
        if (node2 != null) {
            while (true) {
                node = node2.n;
                if (node == null || node.index > i) {
                    break;
                }
                node2 = node;
            }
            int i2 = node2.index;
            if (i > i2) {
                Node<E> nodeObtain = this.nodePool.obtain(node2, node, e, i);
                node2.n = nodeObtain;
                Node<E> node3 = nodeObtain.n;
                if (node3 != null) {
                    node3.p = nodeObtain;
                }
                this.size++;
            } else if (i < i2) {
                Node<E> nodeObtain2 = this.nodePool.obtain(null, this.first, e, i);
                this.first.p = nodeObtain2;
                this.first = nodeObtain2;
                this.size++;
            } else {
                node2.value = e;
            }
        } else {
            this.first = this.nodePool.obtain(null, null, e, i);
            this.size++;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<Node<E>> iterator() {
        if (Collections.allocateIterators) {
            return new Iterator();
        }
        SortedIntList<E>.Iterator iterator = this.iterator;
        if (iterator != null) {
            return iterator.reset();
        }
        SortedIntList<E>.Iterator iterator2 = new Iterator();
        this.iterator = iterator2;
        return iterator2;
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int size() {
        return this.size;
    }
}
