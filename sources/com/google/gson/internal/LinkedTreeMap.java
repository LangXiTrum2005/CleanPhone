package com.google.gson.internal;

import com.p004ironsource.d9;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator j0 = new AnonymousClass1();
    public final Comparator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f21233Y;
    public Node Z;
    public int e0;
    public int f0;
    public final Node g0;
    public EntrySet h0;
    public KeySet i0;

    /* JADX INFO: renamed from: com.google.gson.internal.LinkedTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.google.gson.internal.LinkedTreeMap$EntrySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Node nodeA;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        nodeA = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                        nodeA = null;
                    }
                } else {
                    nodeA = null;
                }
                if (nodeA != null && ((obj2 = nodeA.i0) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    node = nodeA;
                }
                if (node != null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Node nodeA;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        nodeA = linkedTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                        nodeA = null;
                    }
                } else {
                    nodeA = null;
                }
                if (nodeA != null && ((obj2 = nodeA.i0) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    node = nodeA;
                }
                if (node != null) {
                    linkedTreeMap.c(node, true);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.e0;
        }
    }

    public final class KeySet extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.gson.internal.LinkedTreeMap$KeySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.google.gson.internal.LinkedTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                return a().g0;
            }
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            Node nodeA = null;
            if (obj != null) {
                try {
                    nodeA = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (nodeA != null) {
                linkedTreeMap.c(nodeA, true);
            }
            return nodeA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.e0;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f21234Y = null;
        public int Z;

        public LinkedTreeMapIterator() {
            this.X = LinkedTreeMap.this.g0.e0;
            this.Z = LinkedTreeMap.this.f0;
        }

        public final Node a() {
            Node node = this.X;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node == linkedTreeMap.g0) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f0 != this.Z) {
                throw new ConcurrentModificationException();
            }
            this.X = node.e0;
            this.f21234Y = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X != LinkedTreeMap.this.g0;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.f21234Y;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.c(node, true);
            this.f21234Y = null;
            this.Z = linkedTreeMap.f0;
        }
    }

    public LinkedTreeMap(boolean z2) {
        Comparator comparator = j0;
        this.e0 = 0;
        this.f0 = 0;
        this.X = comparator;
        this.f21233Y = z2;
        this.g0 = new Node(z2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Node a(Object obj, boolean z2) {
        int iCompareTo;
        Node node;
        Node node2 = this.Z;
        Comparator comparator = j0;
        Comparator comparator2 = this.X;
        if (node2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = node2.g0;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return node2;
                }
                Node node3 = iCompareTo < 0 ? node2.f21235Y : node2.Z;
                if (node3 == null) {
                    break;
                }
                node2 = node3;
            }
        } else {
            iCompareTo = 0;
        }
        Node node4 = node2;
        if (!z2) {
            return null;
        }
        Node node5 = this.g0;
        if (node4 != null) {
            node = new Node(this.f21233Y, node4, obj, node5, node5.f0);
            if (iCompareTo < 0) {
                node4.f21235Y = node;
            } else {
                node4.Z = node;
            }
            b(node4, true);
        } else {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            node = new Node(this.f21233Y, node4, obj, node5, node5.f0);
            this.Z = node;
        }
        this.e0++;
        this.f0++;
        return node;
    }

    public final void b(Node node, boolean z2) {
        while (node != null) {
            Node node2 = node.f21235Y;
            Node node3 = node.Z;
            int i2 = node2 != null ? node2.j0 : 0;
            int i3 = node3 != null ? node3.j0 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Node node4 = node3.f21235Y;
                Node node5 = node3.Z;
                int i5 = (node4 != null ? node4.j0 : 0) - (node5 != null ? node5.j0 : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    e(node);
                } else {
                    f(node3);
                    e(node);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                Node node6 = node2.f21235Y;
                Node node7 = node2.Z;
                int i6 = (node6 != null ? node6.j0 : 0) - (node7 != null ? node7.j0 : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    f(node);
                } else {
                    e(node2);
                    f(node);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                node.j0 = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                node.j0 = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            node = node.X;
        }
    }

    public final void c(Node node, boolean z2) {
        Node node2;
        Node node3;
        int i2;
        if (z2) {
            Node node4 = node.f0;
            node4.e0 = node.e0;
            node.e0.f0 = node4;
        }
        Node node5 = node.f21235Y;
        Node node6 = node.Z;
        Node node7 = node.X;
        int i3 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                d(node, node5);
                node.f21235Y = null;
            } else if (node6 != null) {
                d(node, node6);
                node.Z = null;
            } else {
                d(node, null);
            }
            b(node7, false);
            this.e0--;
            this.f0++;
            return;
        }
        if (node5.j0 > node6.j0) {
            Node node8 = node5.Z;
            while (true) {
                Node node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.Z;
                }
            }
        } else {
            Node node10 = node6.f21235Y;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.f21235Y;
                }
            }
            node3 = node2;
        }
        c(node3, false);
        Node node11 = node.f21235Y;
        if (node11 != null) {
            i2 = node11.j0;
            node3.f21235Y = node11;
            node11.X = node3;
            node.f21235Y = null;
        } else {
            i2 = 0;
        }
        Node node12 = node.Z;
        if (node12 != null) {
            i3 = node12.j0;
            node3.Z = node12;
            node12.X = node3;
            node.Z = null;
        }
        node3.j0 = Math.max(i2, i3) + 1;
        d(node, node3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.Z = null;
        this.e0 = 0;
        this.f0++;
        Node node = this.g0;
        node.f0 = node;
        node.e0 = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node nodeA = null;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nodeA != null;
    }

    public final void d(Node node, Node node2) {
        Node node3 = node.X;
        node.X = null;
        if (node2 != null) {
            node2.X = node3;
        }
        if (node3 == null) {
            this.Z = node2;
        } else if (node3.f21235Y == node) {
            node3.f21235Y = node2;
        } else {
            node3.Z = node2;
        }
    }

    public final void e(Node node) {
        Node node2 = node.f21235Y;
        Node node3 = node.Z;
        Node node4 = node3.f21235Y;
        Node node5 = node3.Z;
        node.Z = node4;
        if (node4 != null) {
            node4.X = node;
        }
        d(node, node3);
        node3.f21235Y = node;
        node.X = node3;
        int iMax = Math.max(node2 != null ? node2.j0 : 0, node4 != null ? node4.j0 : 0) + 1;
        node.j0 = iMax;
        node3.j0 = Math.max(iMax, node5 != null ? node5.j0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        EntrySet entrySet = this.h0;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.h0 = entrySet2;
        return entrySet2;
    }

    public final void f(Node node) {
        Node node2 = node.f21235Y;
        Node node3 = node.Z;
        Node node4 = node2.f21235Y;
        Node node5 = node2.Z;
        node.f21235Y = node5;
        if (node5 != null) {
            node5.X = node;
        }
        d(node, node2);
        node2.Z = node;
        node.X = node2;
        int iMax = Math.max(node3 != null ? node3.j0 : 0, node5 != null ? node5.j0 : 0) + 1;
        node.j0 = iMax;
        node2.j0 = Math.max(iMax, node4 != null ? node4.j0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Node nodeA;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
                nodeA = null;
            }
        } else {
            nodeA = null;
        }
        if (nodeA != null) {
            return nodeA.i0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.i0;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.i0 = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f21233Y) {
            throw new NullPointerException("value == null");
        }
        Node nodeA = a(obj, true);
        Object obj3 = nodeA.i0;
        nodeA.i0 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Node nodeA;
        if (obj != null) {
            try {
                nodeA = a(obj, false);
            } catch (ClassCastException unused) {
                nodeA = null;
            }
        } else {
            nodeA = null;
        }
        if (nodeA != null) {
            c(nodeA, true);
        }
        if (nodeA != null) {
            return nodeA.i0;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e0;
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Node X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f21235Y;
        public Node Z;
        public Node e0;
        public Node f0;
        public final Object g0;
        public final boolean h0;
        public Object i0;
        public int j0;

        public Node(boolean z2) {
            this.g0 = null;
            this.h0 = z2;
            this.f0 = this;
            this.e0 = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.g0;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.i0;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.g0;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.i0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.g0;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.i0;
            return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj == null && !this.h0) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.i0;
            this.i0 = obj;
            return obj2;
        }

        public final String toString() {
            return this.g0 + d9.i.f24747b + this.i0;
        }

        public Node(boolean z2, Node node, Object obj, Node node2, Node node3) {
            this.X = node;
            this.g0 = obj;
            this.h0 = z2;
            this.j0 = 1;
            this.e0 = node2;
            this.f0 = node3;
            node3.e0 = this;
            node2.f0 = this;
        }
    }
}
