package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Lists {

    /* JADX INFO: renamed from: com.google.common.collect.Lists$1, reason: invalid class name */
    class AnonymousClass1 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            throw null;
        }
    }

    public static class AbstractListWrapper<E> extends AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i2, Collection collection) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static final class CharSequenceAsList extends AbstractList<Character> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static class Partition<T> extends AbstractList<List<T>> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
    }

    public static class ReverseList<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ int f19885Y = 0;
        public final List X;

        public ReverseList(List list) {
            list.getClass();
            this.X = list;
        }

        public final int a(int i2) {
            int size = this.X.size();
            Preconditions.k(i2, size);
            return size - i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i2, Object obj) {
            this.X.add(a(i2), obj);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            List list = this.X;
            int size = list.size();
            Preconditions.i(i2, size);
            return list.get((size - 1) - i2);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            final ListIterator listIterator = this.X.listIterator(a(i2));
            return new ListIterator<Object>() { // from class: com.google.common.collect.Lists.ReverseList.1
                public boolean X;

                @Override // java.util.ListIterator
                public final void add(Object obj) {
                    ListIterator listIterator2 = listIterator;
                    listIterator2.add(obj);
                    listIterator2.previous();
                    this.X = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.X = true;
                    return listIterator2.previous();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    int iNextIndex = listIterator.nextIndex();
                    int i3 = ReverseList.f19885Y;
                    return ReverseList.this.a(iNextIndex);
                }

                @Override // java.util.ListIterator
                public final Object previous() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.X = true;
                    return listIterator2.next();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(this.X);
                    listIterator.remove();
                    this.X = false;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
                    Preconditions.p(this.X);
                    listIterator.set(obj);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            List list = this.X;
            int size = list.size();
            Preconditions.i(i2, size);
            return list.remove((size - 1) - i2);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i2, int i3) {
            subList(i2, i3).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            List list = this.X;
            int size = list.size();
            Preconditions.i(i2, size);
            return list.set((size - 1) - i2, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            List list = this.X;
            Preconditions.l(i2, i3, list.size());
            List listSubList = list.subList(a(i3), a(i2));
            if (listSubList instanceof ImmutableList) {
                return ((ImmutableList) listSubList).C();
            }
            if (listSubList instanceof ReverseList) {
                return ((ReverseList) listSubList).X;
            }
            return listSubList instanceof RandomAccess ? new RandomAccessReverseList(listSubList) : new ReverseList(listSubList);
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        public final String Z;

        public StringAsImmutableList(String str) {
            this.Z = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: E */
        public final ImmutableList subList(int i2, int i3) {
            String str = this.Z;
            Preconditions.l(i2, i3, str.length());
            String strSubstring = str.substring(i2, i3);
            strSubstring.getClass();
            return new StringAsImmutableList(strSubstring);
        }

        @Override // java.util.List
        public final Object get(int i2) {
            String str = this.Z;
            Preconditions.i(i2, str.length());
            return Character.valueOf(str.charAt(i2));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.Z.indexOf(((Character) obj).charValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.Z.lastIndexOf(((Character) obj).charValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.Z.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final List X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Function f19887Y;

        public TransformingRandomAccessList(List list, Function function) {
            list.getClass();
            this.X = list;
            this.f19887Y = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            return this.f19887Y.apply(this.X.get(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            return new TransformedListIterator<Object, Object>(this.X.listIterator(i2)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingRandomAccessList.this.f19887Y.apply(obj);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i2) {
            return this.f19887Y.apply(this.X.remove(i2));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i2, int i3) {
            this.X.subList(i2, i3).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.X.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        public final List X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Function f19889Y;

        public TransformingSequentialList(List list, Function function) {
            list.getClass();
            this.X = list;
            this.f19889Y = function;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i2) {
            return new TransformedListIterator<Object, Object>(this.X.listIterator(i2)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingSequentialList.this.f19889Y.apply(obj);
                }
            };
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i2, int i3) {
            this.X.subList(i2, i3).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.X.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            if (i2 == 0 || i2 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static ArrayList a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        Iterators.a(arrayList, it);
        return arrayList;
    }

    public static ArrayList b() {
        CollectPreconditions.b(3, "initialArraySize");
        return new ArrayList(3);
    }

    public static AbstractList c(List list, Function function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
