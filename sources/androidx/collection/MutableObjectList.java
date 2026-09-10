package androidx.collection;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableObjectList<E> extends ObjectList<E> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f3751Y;

        public MutableObjectListIterator(List list, int i2) {
            this.X = list;
            this.f3751Y = i2 - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i2 = this.f3751Y + 1;
            this.f3751Y = i2;
            this.X.add(i2, obj);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f3751Y < this.X.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3751Y >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i2 = this.f3751Y + 1;
            this.f3751Y = i2;
            return this.X.get(i2);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3751Y + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final Object previous() {
            int i2 = this.f3751Y;
            this.f3751Y = i2 - 1;
            return this.X.get(i2);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3751Y;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.X.remove(this.f3751Y);
            this.f3751Y--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.X.set(this.f3751Y, obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            throw null;
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection elements) {
            Intrinsics.f(elements, "elements");
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            throw null;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            throw null;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            throw null;
        }

        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            ObjectListKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.List
        public final void add(int i2, Object obj) {
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            throw null;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List
        public final Object remove(int i2) {
            ObjectListKt.a(i2, this);
            throw null;
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.f(array, "array");
            return CollectionToArray.b(this, array);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubList<T> implements List<T>, KMutableList {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f3752Y;
        public int Z;

        public SubList(int i2, int i3, List list) {
            this.X = list;
            this.f3752Y = i2;
            this.Z = i3;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i2 = this.Z;
            this.Z = i2 + 1;
            this.X.add(i2, obj);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i2, Collection elements) {
            Intrinsics.f(elements, "elements");
            this.X.addAll(i2 + this.f3752Y, elements);
            this.Z = elements.size() + this.Z;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i2 = this.Z - 1;
            int i3 = this.f3752Y;
            if (i3 <= i2) {
                while (true) {
                    this.X.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.Z = i3;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i2 = this.Z;
            for (int i3 = this.f3752Y; i3 < i2; i3++) {
                if (Intrinsics.a(this.X.get(i3), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object get(int i2) {
            ObjectListKt.a(i2, this);
            return this.X.get(i2 + this.f3752Y);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i2 = this.Z;
            int i3 = this.f3752Y;
            for (int i4 = i3; i4 < i2; i4++) {
                if (Intrinsics.a(this.X.get(i4), obj)) {
                    return i4 - i3;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.Z == this.f3752Y;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i2 = this.Z - 1;
            int i3 = this.f3752Y;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.a(this.X.get(i2), obj)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - i3;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i2 = this.Z;
            for (int i3 = this.f3752Y; i3 < i2; i3++) {
                ?? r2 = this.X;
                if (Intrinsics.a(r2.get(i3), obj)) {
                    r2.remove(i3);
                    this.Z--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            int i2 = this.Z;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.Z;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            int i2 = this.Z;
            int i3 = i2 - 1;
            int i4 = this.f3752Y;
            if (i4 <= i3) {
                while (true) {
                    ?? r3 = this.X;
                    if (!elements.contains(r3.get(i3))) {
                        r3.remove(i3);
                        this.Z--;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.Z;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object set(int i2, Object obj) {
            ObjectListKt.a(i2, this);
            return this.X.set(i2 + this.f3752Y, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.Z - this.f3752Y;
        }

        @Override // java.util.List
        public final List subList(int i2, int i3) {
            ObjectListKt.b(i2, i3, this);
            return new SubList(i2, i3, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i2, Object obj) {
            this.X.add(i2 + this.f3752Y, obj);
            this.Z++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i2) {
            return new MutableObjectListIterator(this, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.f(array, "array");
            return CollectionToArray.b(this, array);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.f(elements, "elements");
            this.X.addAll(this.Z, elements);
            this.Z = elements.size() + this.Z;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object remove(int i2) {
            ObjectListKt.a(i2, this);
            Object objRemove = this.X.remove(i2 + this.f3752Y);
            this.Z--;
            return objRemove;
        }
    }
}
