package org.objectweb.asm.tree;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.objectweb.asm.MethodVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class InsnList implements Iterable<AbstractInsnNode> {
    AbstractInsnNode[] cache;
    private AbstractInsnNode firstInsn;
    private AbstractInsnNode lastInsn;
    private int size;

    public final class InsnListIterator implements ListIterator {
        AbstractInsnNode nextInsn;
        AbstractInsnNode previousInsn;
        AbstractInsnNode remove;

        public InsnListIterator(int i) {
            if (i < 0 || i > InsnList.this.size()) {
                throw new IndexOutOfBoundsException();
            }
            if (i == InsnList.this.size()) {
                this.nextInsn = null;
                this.previousInsn = InsnList.this.getLast();
                return;
            }
            AbstractInsnNode first = InsnList.this.getFirst();
            for (int i2 = 0; i2 < i; i2++) {
                first = first.nextInsn;
            }
            this.nextInsn = first;
            this.previousInsn = first.previousInsn;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            AbstractInsnNode abstractInsnNode = this.nextInsn;
            if (abstractInsnNode != null) {
                InsnList.this.insertBefore(abstractInsnNode, (AbstractInsnNode) obj);
            } else {
                AbstractInsnNode abstractInsnNode2 = this.previousInsn;
                if (abstractInsnNode2 != null) {
                    InsnList.this.insert(abstractInsnNode2, (AbstractInsnNode) obj);
                } else {
                    InsnList.this.add((AbstractInsnNode) obj);
                }
            }
            this.previousInsn = (AbstractInsnNode) obj;
            this.remove = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.nextInsn != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.previousInsn != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            AbstractInsnNode abstractInsnNode = this.nextInsn;
            if (abstractInsnNode == null) {
                throw new NoSuchElementException();
            }
            this.previousInsn = abstractInsnNode;
            this.nextInsn = abstractInsnNode.nextInsn;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            if (this.nextInsn == null) {
                return InsnList.this.size();
            }
            InsnList insnList = InsnList.this;
            if (insnList.cache == null) {
                insnList.cache = insnList.toArray();
            }
            return this.nextInsn.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            AbstractInsnNode abstractInsnNode = this.previousInsn;
            if (abstractInsnNode == null) {
                throw new NoSuchElementException();
            }
            this.nextInsn = abstractInsnNode;
            this.previousInsn = abstractInsnNode.previousInsn;
            this.remove = abstractInsnNode;
            return abstractInsnNode;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            if (this.previousInsn == null) {
                return -1;
            }
            InsnList insnList = InsnList.this;
            if (insnList.cache == null) {
                insnList.cache = insnList.toArray();
            }
            return this.previousInsn.index;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            AbstractInsnNode abstractInsnNode = this.remove;
            if (abstractInsnNode == null) {
                throw new IllegalStateException();
            }
            AbstractInsnNode abstractInsnNode2 = this.nextInsn;
            if (abstractInsnNode == abstractInsnNode2) {
                this.nextInsn = abstractInsnNode2.nextInsn;
            } else {
                this.previousInsn = this.previousInsn.previousInsn;
            }
            InsnList.this.remove(abstractInsnNode);
            this.remove = null;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            AbstractInsnNode abstractInsnNode = this.remove;
            if (abstractInsnNode == null) {
                throw new IllegalStateException();
            }
            AbstractInsnNode abstractInsnNode2 = (AbstractInsnNode) obj;
            InsnList.this.set(abstractInsnNode, abstractInsnNode2);
            if (this.remove == this.previousInsn) {
                this.previousInsn = abstractInsnNode2;
            } else {
                this.nextInsn = abstractInsnNode2;
            }
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        for (AbstractInsnNode abstractInsnNode = this.firstInsn; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.nextInsn) {
            abstractInsnNode.accept(methodVisitor);
        }
    }

    public void add(AbstractInsnNode abstractInsnNode) {
        this.size++;
        AbstractInsnNode abstractInsnNode2 = this.lastInsn;
        if (abstractInsnNode2 == null) {
            this.firstInsn = abstractInsnNode;
            this.lastInsn = abstractInsnNode;
        } else {
            abstractInsnNode2.nextInsn = abstractInsnNode;
            abstractInsnNode.previousInsn = abstractInsnNode2;
        }
        this.lastInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void clear() {
        removeAll(false);
    }

    public boolean contains(AbstractInsnNode abstractInsnNode) {
        AbstractInsnNode abstractInsnNode2 = this.firstInsn;
        while (abstractInsnNode2 != null && abstractInsnNode2 != abstractInsnNode) {
            abstractInsnNode2 = abstractInsnNode2.nextInsn;
        }
        return abstractInsnNode2 != null;
    }

    public AbstractInsnNode get(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (this.cache == null) {
            this.cache = toArray();
        }
        return this.cache[i];
    }

    public AbstractInsnNode getFirst() {
        return this.firstInsn;
    }

    public AbstractInsnNode getLast() {
        return this.lastInsn;
    }

    public int indexOf(AbstractInsnNode abstractInsnNode) {
        if (this.cache == null) {
            this.cache = toArray();
        }
        return abstractInsnNode.index;
    }

    public void insert(AbstractInsnNode abstractInsnNode) {
        this.size++;
        AbstractInsnNode abstractInsnNode2 = this.firstInsn;
        if (abstractInsnNode2 == null) {
            this.firstInsn = abstractInsnNode;
            this.lastInsn = abstractInsnNode;
        } else {
            abstractInsnNode2.previousInsn = abstractInsnNode;
            abstractInsnNode.nextInsn = abstractInsnNode2;
        }
        this.firstInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode.index = 0;
    }

    public void insertBefore(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        this.size++;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.previousInsn;
        if (abstractInsnNode3 == null) {
            this.firstInsn = abstractInsnNode2;
        } else {
            abstractInsnNode3.nextInsn = abstractInsnNode2;
        }
        abstractInsnNode.previousInsn = abstractInsnNode2;
        abstractInsnNode2.nextInsn = abstractInsnNode;
        abstractInsnNode2.previousInsn = abstractInsnNode3;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void remove(AbstractInsnNode abstractInsnNode) {
        this.size--;
        AbstractInsnNode abstractInsnNode2 = abstractInsnNode.nextInsn;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.previousInsn;
        if (abstractInsnNode2 == null) {
            if (abstractInsnNode3 == null) {
                this.firstInsn = null;
                this.lastInsn = null;
            } else {
                abstractInsnNode3.nextInsn = null;
                this.lastInsn = abstractInsnNode3;
            }
        } else if (abstractInsnNode3 == null) {
            this.firstInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = null;
        } else {
            abstractInsnNode3.nextInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = abstractInsnNode3;
        }
        this.cache = null;
        abstractInsnNode.index = -1;
        abstractInsnNode.previousInsn = null;
        abstractInsnNode.nextInsn = null;
    }

    public void removeAll(boolean z) {
        if (z) {
            AbstractInsnNode abstractInsnNode = this.firstInsn;
            while (abstractInsnNode != null) {
                AbstractInsnNode abstractInsnNode2 = abstractInsnNode.nextInsn;
                abstractInsnNode.index = -1;
                abstractInsnNode.previousInsn = null;
                abstractInsnNode.nextInsn = null;
                abstractInsnNode = abstractInsnNode2;
            }
        }
        this.size = 0;
        this.firstInsn = null;
        this.lastInsn = null;
        this.cache = null;
    }

    public void resetLabels() {
        for (AbstractInsnNode abstractInsnNode = this.firstInsn; abstractInsnNode != null; abstractInsnNode = abstractInsnNode.nextInsn) {
            if (abstractInsnNode instanceof LabelNode) {
                ((LabelNode) abstractInsnNode).resetLabel();
            }
        }
    }

    public void set(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.nextInsn;
        abstractInsnNode2.nextInsn = abstractInsnNode3;
        if (abstractInsnNode3 != null) {
            abstractInsnNode3.previousInsn = abstractInsnNode2;
        } else {
            this.lastInsn = abstractInsnNode2;
        }
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.previousInsn;
        abstractInsnNode2.previousInsn = abstractInsnNode4;
        if (abstractInsnNode4 != null) {
            abstractInsnNode4.nextInsn = abstractInsnNode2;
        } else {
            this.firstInsn = abstractInsnNode2;
        }
        AbstractInsnNode[] abstractInsnNodeArr = this.cache;
        if (abstractInsnNodeArr != null) {
            int i = abstractInsnNode.index;
            abstractInsnNodeArr[i] = abstractInsnNode2;
            abstractInsnNode2.index = i;
        } else {
            abstractInsnNode2.index = 0;
        }
        abstractInsnNode.index = -1;
        abstractInsnNode.previousInsn = null;
        abstractInsnNode.nextInsn = null;
    }

    public int size() {
        return this.size;
    }

    public AbstractInsnNode[] toArray() {
        AbstractInsnNode abstractInsnNode = this.firstInsn;
        AbstractInsnNode[] abstractInsnNodeArr = new AbstractInsnNode[this.size];
        int i = 0;
        while (abstractInsnNode != null) {
            abstractInsnNodeArr[i] = abstractInsnNode;
            abstractInsnNode.index = i;
            abstractInsnNode = abstractInsnNode.nextInsn;
            i++;
        }
        return abstractInsnNodeArr;
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractInsnNode> iterator() {
        return iterator(0);
    }

    public ListIterator<AbstractInsnNode> iterator(int i) {
        return new InsnListIterator(i);
    }

    public void add(InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        AbstractInsnNode abstractInsnNode = this.lastInsn;
        if (abstractInsnNode == null) {
            this.firstInsn = insnList.firstInsn;
            this.lastInsn = insnList.lastInsn;
        } else {
            AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
            abstractInsnNode.nextInsn = abstractInsnNode2;
            abstractInsnNode2.previousInsn = abstractInsnNode;
            this.lastInsn = insnList.lastInsn;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insert(InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        AbstractInsnNode abstractInsnNode = this.firstInsn;
        if (abstractInsnNode == null) {
            this.firstInsn = insnList.firstInsn;
            this.lastInsn = insnList.lastInsn;
        } else {
            AbstractInsnNode abstractInsnNode2 = insnList.lastInsn;
            abstractInsnNode.previousInsn = abstractInsnNode2;
            abstractInsnNode2.nextInsn = abstractInsnNode;
            this.firstInsn = insnList.firstInsn;
        }
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insertBefore(AbstractInsnNode abstractInsnNode, InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
        AbstractInsnNode abstractInsnNode3 = insnList.lastInsn;
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.previousInsn;
        if (abstractInsnNode4 == null) {
            this.firstInsn = abstractInsnNode2;
        } else {
            abstractInsnNode4.nextInsn = abstractInsnNode2;
        }
        abstractInsnNode.previousInsn = abstractInsnNode3;
        abstractInsnNode3.nextInsn = abstractInsnNode;
        abstractInsnNode2.previousInsn = abstractInsnNode4;
        this.cache = null;
        insnList.removeAll(false);
    }

    public void insert(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        this.size++;
        AbstractInsnNode abstractInsnNode3 = abstractInsnNode.nextInsn;
        if (abstractInsnNode3 == null) {
            this.lastInsn = abstractInsnNode2;
        } else {
            abstractInsnNode3.previousInsn = abstractInsnNode2;
        }
        abstractInsnNode.nextInsn = abstractInsnNode2;
        abstractInsnNode2.nextInsn = abstractInsnNode3;
        abstractInsnNode2.previousInsn = abstractInsnNode;
        this.cache = null;
        abstractInsnNode2.index = 0;
    }

    public void insert(AbstractInsnNode abstractInsnNode, InsnList insnList) {
        int i = insnList.size;
        if (i == 0) {
            return;
        }
        this.size += i;
        AbstractInsnNode abstractInsnNode2 = insnList.firstInsn;
        AbstractInsnNode abstractInsnNode3 = insnList.lastInsn;
        AbstractInsnNode abstractInsnNode4 = abstractInsnNode.nextInsn;
        if (abstractInsnNode4 == null) {
            this.lastInsn = abstractInsnNode3;
        } else {
            abstractInsnNode4.previousInsn = abstractInsnNode3;
        }
        abstractInsnNode.nextInsn = abstractInsnNode2;
        abstractInsnNode3.nextInsn = abstractInsnNode4;
        abstractInsnNode2.previousInsn = abstractInsnNode;
        this.cache = null;
        insnList.removeAll(false);
    }
}
