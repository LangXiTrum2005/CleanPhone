package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.smartdigimkt.x.g;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    public static final /* synthetic */ int g0 = 0;
    private static final long serialVersionUID = 1;
    public final transient GeneralRange f0;

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$1, reason: invalid class name */
    class AnonymousClass1 extends Multisets.AbstractEntry<Object> {
        public final /* synthetic */ AvlNode X;

        public AnonymousClass1(AvlNode avlNode) {
            this.X = avlNode;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object d() {
            return this.X.f19978a;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            int i2 = this.X.f19979b;
            if (i2 != 0) {
                return i2;
            }
            TreeMultiset.this.getClass();
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<Multiset.Entry<Object>> {
        public AvlNode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Multiset.Entry f19975Y;

        public AnonymousClass2() {
            TreeMultiset.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.X;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.f0.c(avlNode.f19978a)) {
                return true;
            }
            this.X = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AvlNode avlNode = this.X;
            Objects.requireNonNull(avlNode);
            int i2 = TreeMultiset.g0;
            TreeMultiset treeMultiset = TreeMultiset.this;
            treeMultiset.getClass();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(avlNode);
            this.f19975Y = anonymousClass1;
            Objects.requireNonNull(this.X.d);
            AvlNode avlNode2 = this.X.d;
            Objects.requireNonNull(avlNode2);
            this.X = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.o("no calls to next() since the last call to remove()", this.f19975Y != null);
            TreeMultiset.this.Q0(((AnonymousClass1) this.f19975Y).X.f19978a);
            this.f19975Y = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$3, reason: invalid class name */
    class AnonymousClass3 implements Iterator<Multiset.Entry<Object>> {
        public AvlNode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Multiset.Entry f19976Y;

        public AnonymousClass3() {
            TreeMultiset.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            AvlNode avlNode = this.X;
            if (avlNode == null) {
                return false;
            }
            if (!TreeMultiset.this.f0.d(avlNode.f19978a)) {
                return true;
            }
            this.X = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Multiset.Entry<Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.X);
            AvlNode avlNode = this.X;
            int i2 = TreeMultiset.g0;
            TreeMultiset treeMultiset = TreeMultiset.this;
            treeMultiset.getClass();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(avlNode);
            this.f19976Y = anonymousClass1;
            Objects.requireNonNull(this.X.f19980c);
            AvlNode avlNode2 = this.X.f19980c;
            Objects.requireNonNull(avlNode2);
            this.X = avlNode2;
            return anonymousClass1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.o("no calls to next() since the last call to remove()", this.f19976Y != null);
            TreeMultiset.this.Q0(((AnonymousClass1) this.f19976Y).X.f19978a);
            this.f19976Y = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19977a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f19977a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19977a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Aggregate {
        /* JADX INFO: Fake field, exist only in values array */
        EF2 { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF7 { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        }
    }

    public static final class AvlNode<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f19978a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19979b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AvlNode f19980c;
        public AvlNode d;

        public final String toString() {
            return new Multisets.ImmutableEntry(this.f19978a, this.f19979b).toString();
        }
    }

    public static final class Reference<T> {
    }

    public TreeMultiset(GeneralRange generalRange) {
        super(generalRange.X);
        this.f0 = generalRange;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        Serialization.a(AbstractSortedMultiset.class, "comparator").a(this, comparator);
        Serialization.FieldSetter fieldSetterA = Serialization.a(TreeMultiset.class, "range");
        BoundType boundType = BoundType.X;
        fieldSetterA.a(this, new GeneralRange(comparator, false, null, boundType, false, null, boundType));
        Serialization.a(TreeMultiset.class, "rootReference").a(this, new Reference());
        AvlNode avlNode = new AvlNode();
        Serialization.a(TreeMultiset.class, g.f39716B).a(this, avlNode);
        avlNode.d = avlNode;
        avlNode.f19980c = avlNode;
        Serialization.d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.k().comparator());
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int Q0(Object obj) {
        CollectPreconditions.b(0, "count");
        if (this.f0.a(obj)) {
            throw null;
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i2, Object obj) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 == 0) {
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        Preconditions.f(this.f0.a(obj));
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange generalRange = this.f0;
        if (!generalRange.f19820Y && !generalRange.f0) {
            throw null;
        }
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.Z;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int h() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        new AnonymousClass2();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator l() {
        new AnonymousClass2();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int m(int i2, Object obj) {
        CollectPreconditions.b(i2, "occurrences");
        if (i2 != 0) {
            throw null;
        }
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public final SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((TreeMultiset) z0(obj, boundType)).t0(obj2, boundType2);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    public final Iterator o() {
        new AnonymousClass3();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean r(int i2, Object obj) {
        CollectPreconditions.b(0, "newCount");
        CollectPreconditions.b(i2, "oldCount");
        Preconditions.f(this.f0.a(obj));
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f0.b(new GeneralRange(this.Z, false, null, BoundType.X, true, obj, boundType)));
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset z0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.f0.b(new GeneralRange(this.Z, true, obj, boundType, false, null, BoundType.X)));
    }
}
