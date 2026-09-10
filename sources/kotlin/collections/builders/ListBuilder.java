package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\u000b\f\rJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    public static final ListBuilder e0;
    public Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f43279Y;
    public boolean Z;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001\u000bJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        public Object[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f43280Y;
        public int Z;
        public final BuilderSubList e0;
        public final ListBuilder f0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
            public final BuilderSubList X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public int f43281Y;
            public int Z = -1;
            public int e0;

            public Itr(BuilderSubList builderSubList, int i2) {
                this.X = builderSubList;
                this.f43281Y = i2;
                this.e0 = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) this.X.f0).modCount != this.e0) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                a();
                int i2 = this.f43281Y;
                this.f43281Y = i2 + 1;
                BuilderSubList builderSubList = this.X;
                builderSubList.add(i2, obj);
                this.Z = -1;
                this.e0 = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f43281Y < this.X.Z;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f43281Y > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                a();
                int i2 = this.f43281Y;
                BuilderSubList builderSubList = this.X;
                if (i2 >= builderSubList.Z) {
                    throw new NoSuchElementException();
                }
                this.f43281Y = i2 + 1;
                this.Z = i2;
                return builderSubList.X[builderSubList.f43280Y + i2];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f43281Y;
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                a();
                int i2 = this.f43281Y;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f43281Y = i3;
                this.Z = i3;
                BuilderSubList builderSubList = this.X;
                return builderSubList.X[builderSubList.f43280Y + i3];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f43281Y - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i2 = this.Z;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                BuilderSubList builderSubList = this.X;
                builderSubList.e(i2);
                this.f43281Y = this.Z;
                this.Z = -1;
                this.e0 = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                a();
                int i2 = this.Z;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.X.set(i2, obj);
            }
        }

        public BuilderSubList(Object[] backing, int i2, int i3, BuilderSubList builderSubList, ListBuilder root) {
            Intrinsics.f(backing, "backing");
            Intrinsics.f(root, "root");
            this.X = backing;
            this.f43280Y = i2;
            this.Z = i3;
            this.e0 = builderSubList;
            this.f0 = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.f0.Z) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            l();
            i();
            h(this.f43280Y + this.Z, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            l();
            i();
            int size = elements.size();
            g(this.f43280Y + this.Z, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            l();
            i();
            t(this.f43280Y, this.Z);
        }

        @Override // kotlin.collections.AbstractMutableList
        /* JADX INFO: renamed from: d */
        public final int getZ() {
            i();
            return this.Z;
        }

        @Override // kotlin.collections.AbstractMutableList
        public final Object e(int i2) {
            l();
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.b(i2, i3);
            return o(this.f43280Y + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            i();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return ListBuilderKt.a(this.X, this.f43280Y, this.Z, (List) obj);
            }
            return false;
        }

        public final void g(int i2, Collection collection, int i3) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.f0;
            BuilderSubList builderSubList = this.e0;
            if (builderSubList != null) {
                builderSubList.g(i2, collection, i3);
            } else {
                ListBuilder listBuilder2 = ListBuilder.e0;
                listBuilder.g(i2, collection, i3);
            }
            this.X = listBuilder.X;
            this.Z += i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.b(i2, i3);
            return this.X[this.f43280Y + i2];
        }

        public final void h(int i2, Object obj) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.f0;
            BuilderSubList builderSubList = this.e0;
            if (builderSubList != null) {
                builderSubList.h(i2, obj);
            } else {
                ListBuilder listBuilder2 = ListBuilder.e0;
                listBuilder.h(i2, obj);
            }
            this.X = listBuilder.X;
            this.Z++;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            i();
            Object[] objArr = this.X;
            int i2 = this.Z;
            int iHashCode = 1;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[this.f43280Y + i3];
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i() {
            if (((AbstractList) this.f0).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            i();
            for (int i2 = 0; i2 < this.Z; i2++) {
                if (Intrinsics.a(this.X[this.f43280Y + i2], obj)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            i();
            return this.Z == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        public final void l() {
            if (this.f0.Z) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            i();
            for (int i2 = this.Z - 1; i2 >= 0; i2--) {
                if (Intrinsics.a(this.X[this.f43280Y + i2], obj)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        public final Object o(int i2) {
            Object objO;
            ((AbstractList) this).modCount++;
            BuilderSubList builderSubList = this.e0;
            if (builderSubList != null) {
                objO = builderSubList.o(i2);
            } else {
                ListBuilder listBuilder = ListBuilder.e0;
                objO = this.f0.o(i2);
            }
            this.Z--;
            return objO;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            l();
            i();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                e(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            l();
            i();
            return u(this.f43280Y, this.Z, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            l();
            i();
            return u(this.f43280Y, this.Z, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            l();
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.b(i2, i3);
            Object[] objArr = this.X;
            int i4 = this.f43280Y + i2;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i4 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.d(i2, i3, i4);
            return new BuilderSubList(this.X, this.f43280Y + i2, i3 - i2, this, this.f0);
        }

        public final void t(int i2, int i3) {
            if (i3 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList builderSubList = this.e0;
            if (builderSubList != null) {
                builderSubList.t(i2, i3);
            } else {
                ListBuilder listBuilder = ListBuilder.e0;
                this.f0.t(i2, i3);
            }
            this.Z -= i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] array) {
            Intrinsics.f(array, "array");
            i();
            int length = array.length;
            int i2 = this.Z;
            int i3 = this.f43280Y;
            if (length < i2) {
                Object[] objArrCopyOfRange = Arrays.copyOfRange(this.X, i3, i2 + i3, array.getClass());
                Intrinsics.e(objArrCopyOfRange, "copyOfRange(...)");
                return objArrCopyOfRange;
            }
            ArraysKt.o(this.X, 0, array, i3, i2 + i3);
            int i4 = this.Z;
            if (i4 < array.length) {
                array[i4] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            i();
            return ListBuilderKt.b(this.X, this.f43280Y, this.Z, this);
        }

        public final int u(int i2, int i3, Collection collection, boolean z2) {
            int iU;
            BuilderSubList builderSubList = this.e0;
            if (builderSubList != null) {
                iU = builderSubList.u(i2, i3, collection, z2);
            } else {
                ListBuilder listBuilder = ListBuilder.e0;
                iU = this.f0.u(i2, i3, collection, z2);
            }
            if (iU > 0) {
                ((AbstractList) this).modCount++;
            }
            this.Z -= iU;
            return iU;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.c(i2, i3);
            return new Itr(this, i2);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            l();
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.c(i2, i3);
            h(this.f43280Y + i2, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i2, Collection elements) {
            Intrinsics.f(elements, "elements");
            l();
            i();
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int i3 = this.Z;
            companion.getClass();
            kotlin.collections.AbstractList.Companion.c(i2, i3);
            int size = elements.size();
            g(this.f43280Y + i2, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            i();
            Object[] objArr = this.X;
            int i2 = this.Z;
            int i3 = this.f43280Y;
            return ArraysKt.r(objArr, i3, i2 + i3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        public final ListBuilder X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f43282Y;
        public int Z = -1;
        public int e0;

        public Itr(ListBuilder listBuilder, int i2) {
            this.X = listBuilder;
            this.f43282Y = i2;
            this.e0 = ((AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((AbstractList) this.X).modCount != this.e0) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            a();
            int i2 = this.f43282Y;
            this.f43282Y = i2 + 1;
            ListBuilder listBuilder = this.X;
            listBuilder.add(i2, obj);
            this.Z = -1;
            this.e0 = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f43282Y < this.X.f43279Y;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f43282Y > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            int i2 = this.f43282Y;
            ListBuilder listBuilder = this.X;
            if (i2 >= listBuilder.f43279Y) {
                throw new NoSuchElementException();
            }
            this.f43282Y = i2 + 1;
            this.Z = i2;
            return listBuilder.X[i2];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f43282Y;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            int i2 = this.f43282Y;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.f43282Y = i3;
            this.Z = i3;
            return this.X.X[i3];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f43282Y - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i2 = this.Z;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            ListBuilder listBuilder = this.X;
            listBuilder.e(i2);
            this.f43282Y = this.Z;
            this.Z = -1;
            this.e0 = ((AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            a();
            int i2 = this.Z;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.X.set(i2, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.Z = true;
        e0 = listBuilder;
    }

    public ListBuilder(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.X = new Object[i2];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.Z) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i2 = this.f43279Y;
        ((AbstractList) this).modCount++;
        l(i2, 1);
        this.X[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        i();
        int size = elements.size();
        g(this.f43279Y, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        t(0, this.f43279Y);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getZ() {
        return this.f43279Y;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object e(int i2) {
        i();
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.b(i2, i3);
        return o(i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ListBuilderKt.a(this.X, 0, this.f43279Y, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        l(i2, i3);
        Iterator<E> it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.X[i2 + i4] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.b(i2, i3);
        return this.X[i2];
    }

    public final void h(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        l(i2, 1);
        this.X[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.X;
        int i2 = this.f43279Y;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.Z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f43279Y; i2++) {
            if (Intrinsics.a(this.X[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f43279Y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void l(int i2, int i3) {
        int i4 = this.f43279Y + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.X;
        if (i4 > objArr.length) {
            kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
            int length = objArr.length;
            companion.getClass();
            int iE = kotlin.collections.AbstractList.Companion.e(length, i4);
            Object[] objArr2 = this.X;
            Intrinsics.f(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            Intrinsics.e(objArrCopyOf, "copyOf(...)");
            this.X = objArrCopyOf;
        }
        Object[] objArr3 = this.X;
        ArraysKt.o(objArr3, i2 + i3, objArr3, i2, this.f43279Y);
        this.f43279Y += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f43279Y - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.X[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object o(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.X;
        Object obj = objArr[i2];
        ArraysKt.o(objArr, i2, objArr, i2 + 1, this.f43279Y);
        Object[] objArr2 = this.X;
        int i3 = this.f43279Y - 1;
        Intrinsics.f(objArr2, "<this>");
        objArr2[i3] = null;
        this.f43279Y--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        i();
        return u(0, this.f43279Y, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.f(elements, "elements");
        i();
        return u(0, this.f43279Y, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        i();
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.b(i2, i3);
        Object[] objArr = this.X;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i4 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.d(i2, i3, i4);
        return new BuilderSubList(this.X, i2, i3 - i2, null, this);
    }

    public final void t(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.X;
        ArraysKt.o(objArr, i2, objArr, i2 + i3, this.f43279Y);
        Object[] objArr2 = this.X;
        int i4 = this.f43279Y;
        ListBuilderKt.c(objArr2, i4 - i3, i4);
        this.f43279Y -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.f(array, "array");
        int length = array.length;
        int i2 = this.f43279Y;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.X, 0, i2, array.getClass());
            Intrinsics.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        ArraysKt.o(this.X, 0, array, 0, i2);
        int i3 = this.f43279Y;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ListBuilderKt.b(this.X, 0, this.f43279Y, this);
    }

    public final int u(int i2, int i3, Collection collection, boolean z2) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.X[i6]) == z2) {
                Object[] objArr = this.X;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.X;
        ArraysKt.o(objArr2, i2 + i5, objArr2, i3 + i2, this.f43279Y);
        Object[] objArr3 = this.X;
        int i8 = this.f43279Y;
        ListBuilderKt.c(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f43279Y -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.c(i2, i3);
        return new Itr(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.f(elements, "elements");
        i();
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.c(i2, i3);
        int size = elements.size();
        g(i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        i();
        kotlin.collections.AbstractList.Companion companion = kotlin.collections.AbstractList.INSTANCE;
        int i3 = this.f43279Y;
        companion.getClass();
        kotlin.collections.AbstractList.Companion.c(i2, i3);
        ((AbstractList) this).modCount++;
        l(i2, 1);
        this.X[i2] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ArraysKt.r(this.X, 0, this.f43279Y);
    }
}
