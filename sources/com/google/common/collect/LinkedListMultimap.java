package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class LinkedListMultimap<K, V> extends AbstractMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public transient Node g0;
    public transient Node h0;
    public transient Map i0;
    public transient int j0;
    public transient int k0;

    /* JADX INFO: renamed from: com.google.common.collect.LinkedListMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSequentialList<Object> {
        public final /* synthetic */ Object X;

        public AnonymousClass1(Object obj) {
            this.X = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            return new ValueForKeyIterator(this.X, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            KeyList keyList = (KeyList) ((CompactHashMap) LinkedListMultimap.this.i0).get(this.X);
            if (keyList == null) {
                return 0;
            }
            return keyList.f19881c;
        }
    }

    public class DistinctKeyIterator implements Iterator<K> {
        public final HashSet X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f19878Y;
        public Node Z;
        public int e0;

        public DistinctKeyIterator() {
            this.X = new HashSet(Maps.c(LinkedListMultimap.this.keySet().size()));
            this.f19878Y = LinkedListMultimap.this.g0;
            this.e0 = LinkedListMultimap.this.k0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (LinkedListMultimap.this.k0 == this.e0) {
                return this.f19878Y != null;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Node node;
            if (LinkedListMultimap.this.k0 != this.e0) {
                throw new ConcurrentModificationException();
            }
            Node node2 = this.f19878Y;
            if (node2 == null) {
                throw new NoSuchElementException();
            }
            this.Z = node2;
            HashSet hashSet = this.X;
            hashSet.add(node2.X);
            do {
                node = this.f19878Y.Z;
                this.f19878Y = node;
                if (node == null) {
                    break;
                }
            } while (!hashSet.add(node.X));
            return this.Z.X;
        }

        @Override // java.util.Iterator
        public final void remove() {
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            if (linkedListMultimap.k0 != this.e0) {
                throw new ConcurrentModificationException();
            }
            Preconditions.o("no calls to next() since the last call to remove()", this.Z != null);
            Object obj = this.Z.X;
            linkedListMultimap.getClass();
            Iterators.b(new ValueForKeyIterator(obj));
            this.Z = null;
            this.e0 = linkedListMultimap.k0;
        }
    }

    public static class KeyList<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Node f19879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Node f19880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19881c;

        public KeyList(Node node) {
            this.f19879a = node;
            this.f19880b = node;
            node.g0 = null;
            node.f0 = null;
            this.f19881c = 1;
        }
    }

    public static final class Node<K, V> extends AbstractMapEntry<K, V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f19882Y;
        public Node Z;
        public Node e0;
        public Node f0;
        public Node g0;

        public Node(Object obj, Object obj2) {
            this.X = obj;
            this.f19882Y = obj2;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f19882Y;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f19882Y;
            this.f19882Y = obj;
            return obj2;
        }
    }

    public class NodeIterator implements ListIterator<Map.Entry<K, V>> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Node f19883Y;
        public Node Z;
        public Node e0;
        public int f0;

        public NodeIterator(int i2) {
            this.f0 = LinkedListMultimap.this.k0;
            int i3 = LinkedListMultimap.this.j0;
            Preconditions.k(i2, i3);
            if (i2 >= i3 / 2) {
                this.e0 = LinkedListMultimap.this.h0;
                this.X = i3;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    a();
                    Node node = this.e0;
                    if (node == null) {
                        throw new NoSuchElementException();
                    }
                    this.Z = node;
                    this.f19883Y = node;
                    this.e0 = node.e0;
                    this.X--;
                    i2 = i4;
                }
            } else {
                this.f19883Y = LinkedListMultimap.this.g0;
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 > 0) {
                        a();
                        Node node2 = this.f19883Y;
                        if (node2 == null) {
                            throw new NoSuchElementException();
                        }
                        this.Z = node2;
                        this.e0 = node2;
                        this.f19883Y = node2.Z;
                        this.X++;
                        i2 = i5;
                    }
                }
            }
            this.Z = null;
        }

        public final void a() {
            if (LinkedListMultimap.this.k0 != this.f0) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            a();
            return this.f19883Y != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            a();
            return this.e0 != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            Node node = this.f19883Y;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.Z = node;
            this.e0 = node;
            this.f19883Y = node.Z;
            this.X++;
            return node;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.X;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            Node node = this.e0;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.Z = node;
            this.f19883Y = node;
            this.e0 = node.e0;
            this.X--;
            return node;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.X - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            Preconditions.o("no calls to next() since the last call to remove()", this.Z != null);
            Node node = this.Z;
            if (node != this.f19883Y) {
                this.e0 = node.e0;
                this.X--;
            } else {
                this.f19883Y = node.Z;
            }
            LinkedListMultimap linkedListMultimap = LinkedListMultimap.this;
            LinkedListMultimap.o(linkedListMultimap, node);
            this.Z = null;
            this.f0 = linkedListMultimap.k0;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static void o(LinkedListMultimap linkedListMultimap, Node node) {
        linkedListMultimap.getClass();
        Node node2 = node.e0;
        if (node2 != null) {
            node2.Z = node.Z;
        } else {
            linkedListMultimap.g0 = node.Z;
        }
        Node node3 = node.Z;
        if (node3 != null) {
            node3.e0 = node2;
        } else {
            linkedListMultimap.h0 = node2;
        }
        Node node4 = node.g0;
        Object obj = node.X;
        if (node4 == null && node.f0 == null) {
            KeyList keyList = (KeyList) ((CompactHashMap) linkedListMultimap.i0).remove(obj);
            Objects.requireNonNull(keyList);
            keyList.f19881c = 0;
            linkedListMultimap.k0++;
        } else {
            KeyList keyList2 = (KeyList) ((CompactHashMap) linkedListMultimap.i0).get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f19881c--;
            Node node5 = node.g0;
            if (node5 == null) {
                Node node6 = node.f0;
                Objects.requireNonNull(node6);
                keyList2.f19879a = node6;
            } else {
                node5.f0 = node.f0;
            }
            Node node7 = node.f0;
            if (node7 == null) {
                Node node8 = node.g0;
                Objects.requireNonNull(node8);
                keyList2.f19880b = node8;
            } else {
                node7.g0 = node.g0;
            }
        }
        linkedListMultimap.j0--;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.i0 = new CompactLinkedHashMap(3);
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.j0);
        for (Map.Entry entry : (List) super.d()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        this.g0 = null;
        this.h0 = null;
        ((CompactLinkedHashMap) this.i0).clear();
        this.j0 = 0;
        this.k0++;
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return ((CompactHashMap) this.i0).containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection d() {
        return (List) super.d();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map g() {
        return new Multimaps.AsMap(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return new AnonymousClass1(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean isEmpty() {
        return this.g0 == null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection j() {
        return new AbstractSequentialList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.LinkedListMultimap.1EntriesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i2) {
                return new NodeIterator(i2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.j0;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set k() {
        return new Sets.ImprovedAbstractSet<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1KeySetImpl
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new DistinctKeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                return !LinkedListMultimap.this.a(obj).isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return ((CompactHashMap) LinkedListMultimap.this.i0).size();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset l() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection m() {
        return new AbstractSequentialList<Object>() { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl
            @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
            public final ListIterator listIterator(int i2) {
                final NodeIterator nodeIterator = new NodeIterator(i2);
                return new TransformedListIterator<Map.Entry<Object, Object>, Object>(nodeIterator) { // from class: com.google.common.collect.LinkedListMultimap.1ValuesImpl.1
                    @Override // com.google.common.collect.TransformedIterator
                    public final Object a(Object obj) {
                        return ((Map.Entry) obj).getValue();
                    }

                    @Override // com.google.common.collect.TransformedListIterator, java.util.ListIterator
                    public final void set(Object obj) {
                        NodeIterator nodeIterator2 = nodeIterator;
                        Preconditions.p(nodeIterator2.Z != null);
                        nodeIterator2.Z.f19882Y = obj;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return LinkedListMultimap.this.j0;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator n() {
        throw new AssertionError("should never be called");
    }

    public final Node p(Object obj, Object obj2, Node node) {
        Node node2 = new Node(obj, obj2);
        if (this.g0 == null) {
            this.h0 = node2;
            this.g0 = node2;
            ((CompactHashMap) this.i0).put(obj, new KeyList(node2));
            this.k0++;
        } else if (node == null) {
            Node node3 = this.h0;
            Objects.requireNonNull(node3);
            node3.Z = node2;
            node2.e0 = this.h0;
            this.h0 = node2;
            KeyList keyList = (KeyList) ((CompactHashMap) this.i0).get(obj);
            if (keyList == null) {
                ((CompactHashMap) this.i0).put(obj, new KeyList(node2));
                this.k0++;
            } else {
                keyList.f19881c++;
                Node node4 = keyList.f19880b;
                node4.f0 = node2;
                node2.g0 = node4;
                keyList.f19880b = node2;
            }
        } else {
            KeyList keyList2 = (KeyList) ((CompactHashMap) this.i0).get(obj);
            Objects.requireNonNull(keyList2);
            keyList2.f19881c++;
            node2.e0 = node.e0;
            node2.g0 = node.g0;
            node2.Z = node;
            node2.f0 = node;
            Node node5 = node.g0;
            if (node5 == null) {
                keyList2.f19879a = node2;
            } else {
                node5.f0 = node2;
            }
            Node node6 = node.e0;
            if (node6 == null) {
                this.g0 = node2;
            } else {
                node6.Z = node2;
            }
            node.e0 = node2;
            node.g0 = node2;
        }
        this.j0++;
        return node2;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        p(obj, obj2, null);
        return true;
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.j0;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (List) super.values();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List a(Object obj) {
        List listUnmodifiableList = Collections.unmodifiableList(Lists.a(new ValueForKeyIterator(obj)));
        Iterators.b(new ValueForKeyIterator(obj));
        return listUnmodifiableList;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final List get(Object obj) {
        return new AnonymousClass1(obj);
    }

    public class ValueForKeyIterator implements ListIterator<V> {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f19884Y;
        public Node Z;
        public Node e0;
        public Node f0;

        public ValueForKeyIterator(Object obj) {
            this.X = obj;
            KeyList keyList = (KeyList) ((CompactHashMap) LinkedListMultimap.this.i0).get(obj);
            this.Z = keyList == null ? null : keyList.f19879a;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.f0 = LinkedListMultimap.this.p(this.X, obj, this.Z);
            this.f19884Y++;
            this.e0 = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.Z != null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f0 != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Node node = this.Z;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.e0 = node;
            this.f0 = node;
            this.Z = node.f0;
            this.f19884Y++;
            return node.f19882Y;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f19884Y;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            Node node = this.f0;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.e0 = node;
            this.Z = node;
            this.f0 = node.g0;
            this.f19884Y--;
            return node.f19882Y;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f19884Y - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            Preconditions.o("no calls to next() since the last call to remove()", this.e0 != null);
            Node node = this.e0;
            if (node != this.Z) {
                this.f0 = node.g0;
                this.f19884Y--;
            } else {
                this.Z = node.f0;
            }
            LinkedListMultimap.o(LinkedListMultimap.this, node);
            this.e0 = null;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Preconditions.p(this.e0 != null);
            this.e0.f19882Y = obj;
        }

        public ValueForKeyIterator(Object obj, int i2) {
            KeyList keyList = (KeyList) ((CompactHashMap) LinkedListMultimap.this.i0).get(obj);
            int i3 = keyList == null ? 0 : keyList.f19881c;
            Preconditions.k(i2, i3);
            if (i2 >= i3 / 2) {
                this.f0 = keyList == null ? null : keyList.f19880b;
                this.f19884Y = i3;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    previous();
                    i2 = i4;
                }
            } else {
                this.Z = keyList == null ? null : keyList.f19879a;
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i5;
                }
            }
            this.X = obj;
            this.e0 = null;
        }
    }
}
