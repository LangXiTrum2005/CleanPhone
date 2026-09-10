package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartSet<T> extends AbstractSet<T> {
    public static final /* synthetic */ int Z = 0;
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44649Y;

    public static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {
        public final Iterator X;

        public ArrayIterator(Object[] array) {
            Intrinsics.f(array, "array");
            this.X = ArrayIteratorKt.a(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.X.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Companion {
    }

    public static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f44650Y = true;

        public SingletonIterator(Object obj) {
            this.X = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f44650Y;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f44650Y) {
                throw new NoSuchElementException();
            }
            this.f44650Y = false;
            return this.X;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i2 = this.f44649Y;
        if (i2 == 0) {
            this.X = obj;
        } else if (i2 == 1) {
            if (Intrinsics.a(this.X, obj)) {
                return false;
            }
            this.X = new Object[]{this.X, obj};
        } else if (i2 < 5) {
            Object obj3 = this.X;
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (ArraysKt.k(objArr, obj)) {
                return false;
            }
            int i3 = this.f44649Y;
            if (i3 == 4) {
                LinkedHashSet linkedHashSetC = SetsKt.c(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetC.add(obj);
                obj2 = linkedHashSetC;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i3 + 1);
                Intrinsics.e(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.X = obj2;
        } else {
            Object obj4 = this.X;
            Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.c(obj4).add(obj)) {
                return false;
            }
        }
        this.f44649Y++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.X = null;
        this.f44649Y = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i2 = this.f44649Y;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            return Intrinsics.a(this.X, obj);
        }
        if (i2 < 5) {
            Object obj2 = this.X;
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt.k((Object[]) obj2, obj);
        }
        Object obj3 = this.X;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i2 = this.f44649Y;
        if (i2 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i2 == 1) {
            return new SingletonIterator(this.X);
        }
        if (i2 < 5) {
            Object obj = this.X;
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new ArrayIterator((Object[]) obj);
        }
        Object obj2 = this.X;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44649Y;
    }
}
