package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f9938Y;

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class AvlBuilder<K, V> {
    }

    public static class AvlIterator<K, V> {
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$EntrySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Map.Entry<Object, Object>> {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Object key;
            if (!(obj instanceof Map.Entry) || (key = ((Map.Entry) obj).getKey()) == null) {
                return false;
            }
            try {
                key.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Object key;
            if (!(obj instanceof Map.Entry) || (key = ((Map.Entry) obj).getKey()) == null) {
                return false;
            }
            try {
                key.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    public final class KeySet extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap$KeySet$1, reason: invalid class name */
        class AnonymousClass1 extends LinkedHashTreeMap<Object, Object>.LinkedTreeMapIterator<Object> {
            @Override // com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
            public final Object next() {
                a();
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f9939Y;
        public int Z;

        public LinkedTreeMapIterator() {
            throw null;
        }

        public final Node a() {
            Node node = this.X;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.getClass();
            if (node == null) {
                throw new NoSuchElementException();
            }
            if (linkedHashTreeMap.f9938Y != this.Z) {
                throw new ConcurrentModificationException();
            }
            this.X = node.e0;
            this.f9939Y = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Node node = this.X;
            LinkedHashTreeMap.this.getClass();
            return node != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.f9939Y;
            if (node == null) {
                throw new IllegalStateException();
            }
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.a(node, true);
            this.f9939Y = null;
            this.Z = linkedHashTreeMap.f9938Y;
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Node X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f9940Y;
        public Node Z;
        public Node e0;
        public Node f0;
        public Object g0;
        public int h0;

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.g0;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.g0;
            this.g0 = obj;
            return obj2;
        }

        public final String toString() {
            throw null;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void a(Node node, boolean z2) {
        Node node2;
        Node node3;
        int i2;
        if (z2) {
            Node node4 = node.f0;
            node4.e0 = node.e0;
            node.e0.f0 = node4;
            node.f0 = null;
            node.e0 = null;
        }
        Node node5 = node.f9940Y;
        Node node6 = node.Z;
        int i3 = 0;
        if (node5 != null && node6 != null) {
            if (node5.h0 > node6.h0) {
                Node node7 = node5.Z;
                while (true) {
                    Node node8 = node7;
                    node3 = node5;
                    node5 = node8;
                    if (node5 == null) {
                        break;
                    } else {
                        node7 = node5.Z;
                    }
                }
            } else {
                Node node9 = node6.f9940Y;
                while (true) {
                    node2 = node6;
                    node6 = node9;
                    if (node6 == null) {
                        break;
                    } else {
                        node9 = node6.f9940Y;
                    }
                }
                node3 = node2;
            }
            a(node3, false);
            Node node10 = node.f9940Y;
            if (node10 != null) {
                i2 = node10.h0;
                node3.f9940Y = node10;
                node10.X = node3;
                node.f9940Y = null;
            } else {
                i2 = 0;
            }
            Node node11 = node.Z;
            if (node11 != null) {
                i3 = node11.h0;
                node3.Z = node11;
                node11.X = node3;
                node.Z = null;
            }
            node3.h0 = Math.max(i2, i3) + 1;
            b(node, node3);
            return;
        }
        if (node5 != null) {
            b(node, node5);
            node.f9940Y = null;
        } else if (node6 != null) {
            b(node, node6);
            node.Z = null;
        } else {
            b(node, null);
        }
        for (Node node12 = node.X; node12 != null; node12 = node12.X) {
            Node node13 = node12.f9940Y;
            Node node14 = node12.Z;
            int i4 = node13 != null ? node13.h0 : 0;
            int i5 = node14 != null ? node14.h0 : 0;
            int i6 = i4 - i5;
            if (i6 == -2) {
                Node node15 = node14.f9940Y;
                Node node16 = node14.Z;
                int i7 = (node15 != null ? node15.h0 : 0) - (node16 != null ? node16.h0 : 0);
                if (i7 == -1 || i7 == 0) {
                    c(node12);
                } else {
                    d(node14);
                    c(node12);
                }
            } else if (i6 != 2) {
                if (i6 != 0) {
                    node12.h0 = Math.max(i4, i5) + 1;
                    break;
                }
                node12.h0 = i4 + 1;
            } else {
                Node node17 = node13.f9940Y;
                Node node18 = node13.Z;
                int i8 = (node17 != null ? node17.h0 : 0) - (node18 != null ? node18.h0 : 0);
                if (i8 == 1 || i8 == 0) {
                    d(node12);
                } else {
                    c(node13);
                    d(node12);
                }
            }
        }
        this.X--;
        this.f9938Y++;
    }

    public final void b(Node node, Node node2) {
        Node node3 = node.X;
        node.X = null;
        if (node2 != null) {
            node2.X = node3;
        }
        node3.getClass();
        if (node3.f9940Y == node) {
            node3.f9940Y = node2;
        } else {
            node3.Z = node2;
        }
    }

    public final void c(Node node) {
        Node node2 = node.f9940Y;
        Node node3 = node.Z;
        Node node4 = node3.f9940Y;
        Node node5 = node3.Z;
        node.Z = node4;
        if (node4 != null) {
            node4.X = node;
        }
        b(node, node3);
        node3.f9940Y = node;
        node.X = node3;
        int iMax = Math.max(node2 != null ? node2.h0 : 0, node4 != null ? node4.h0 : 0) + 1;
        node.h0 = iMax;
        node3.h0 = Math.max(iMax, node5 != null ? node5.h0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill((Object[]) null, (Object) null);
        this.X = 0;
        this.f9938Y++;
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            obj.hashCode();
            throw null;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final void d(Node node) {
        Node node2 = node.f9940Y;
        Node node3 = node.Z;
        Node node4 = node2.f9940Y;
        Node node5 = node2.Z;
        node.f9940Y = node5;
        if (node5 != null) {
            node5.X = node;
        }
        b(node, node2);
        node2.Z = node;
        node.X = node2;
        int iMax = Math.max(node3 != null ? node3.h0 : 0, node5 != null ? node5.h0 : 0) + 1;
        node.h0 = iMax;
        node2.h0 = Math.max(iMax, node4 != null ? node4.h0 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj != null) {
            try {
                obj.hashCode();
                throw null;
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.X;
    }
}
