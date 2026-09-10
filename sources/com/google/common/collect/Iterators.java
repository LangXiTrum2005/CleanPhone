package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$10, reason: invalid class name */
    class AnonymousClass10 implements Enumeration<Object> {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            throw null;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$4, reason: invalid class name */
    class AnonymousClass4 extends UnmodifiableIterator<List<Object>> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$6, reason: invalid class name */
    class AnonymousClass6 extends TransformedIterator<Object, Object> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Function f19868Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Iterator it, Function function) {
            super(it);
            this.f19868Y = function;
        }

        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return this.f19868Y.apply(obj);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$7, reason: invalid class name */
    class AnonymousClass7 implements Iterator<Object> {
        public int X;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.X++;
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$8, reason: invalid class name */
    class AnonymousClass8 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        public final String toString() {
            return "Iterators.consumingIterator(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterators$9, reason: invalid class name */
    class AnonymousClass9 extends UnmodifiableIterator<Object> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        public static final UnmodifiableListIterator e0 = new ArrayItr(new Object[0]);
        public final Object[] Z;

        public ArrayItr(Object[] objArr) {
            super(objArr.length, 0);
            this.Z = objArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public final Object a(int i2) {
            return this.Z[i2];
        }
    }

    public static class ConcatenatedIterator<T> implements Iterator<T> {
        public Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Iterator f19869Y;
        public Iterator Z;
        public ArrayDeque e0;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                Iterator it2 = this.f19869Y;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator it3 = this.Z;
                    if (it3 != null && it3.hasNext()) {
                        it = this.Z;
                        break;
                    }
                    ArrayDeque arrayDeque = this.e0;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        it = null;
                        break;
                    }
                    this.Z = (Iterator) this.e0.removeFirst();
                }
                this.Z = it;
                if (it == null) {
                    return false;
                }
                Iterator it4 = (Iterator) it.next();
                this.f19869Y = it4;
                if (it4 instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it4;
                    this.f19869Y = concatenatedIterator.f19869Y;
                    if (this.e0 == null) {
                        this.e0 = new ArrayDeque();
                    }
                    this.e0.addFirst(this.Z);
                    if (concatenatedIterator.e0 != null) {
                        while (!concatenatedIterator.e0.isEmpty()) {
                            this.e0.addFirst((Iterator) concatenatedIterator.e0.removeLast());
                        }
                    }
                    this.Z = concatenatedIterator.Z;
                }
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f19869Y;
            this.X = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator it = this.X;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.X = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyModifiableIterator implements Iterator<Object> {
        public static final EmptyModifiableIterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ EmptyModifiableIterator[] f19870Y;

        static {
            EmptyModifiableIterator emptyModifiableIterator = new EmptyModifiableIterator("INSTANCE", 0);
            X = emptyModifiableIterator;
            f19870Y = new EmptyModifiableIterator[]{emptyModifiableIterator};
        }

        public static EmptyModifiableIterator valueOf(String str) {
            return (EmptyModifiableIterator) Enum.valueOf(EmptyModifiableIterator.class, str);
        }

        public static EmptyModifiableIterator[] values() {
            return (EmptyModifiableIterator[]) f19870Y.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(false);
        }
    }

    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }
    }

    public static class PeekingImpl<E> implements PeekingIterator<E> {
        public final Iterator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f19871Y;
        public Object Z;

        public PeekingImpl(Iterator it) {
            it.getClass();
            this.X = it;
        }

        public final Object a() {
            if (!this.f19871Y) {
                this.Z = this.X.next();
                this.f19871Y = true;
            }
            return this.Z;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19871Y || this.X.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f19871Y) {
                return this.X.next();
            }
            Object obj = this.Z;
            this.f19871Y = false;
            this.Z = null;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.o("Can't remove after you've peeked at next", !this.f19871Y);
            this.X.remove();
        }
    }

    public static final class SingletonIterator<T> extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Object f19872Y = new Object();
        public Object X;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X != f19872Y;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Object obj = this.X;
            Object obj2 = f19872Y;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.X = obj2;
            return obj;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void b(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Iterator c(Iterator it, Iterator it2) {
        final Iterator[] itArr = {it, it2};
        UnmodifiableIterator<Iterator<?>> unmodifiableIterator = new UnmodifiableIterator<Iterator<?>>() { // from class: com.google.common.collect.Iterators.3
            public int X = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.X < itArr.length;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.X;
                Iterator[] itArr2 = itArr;
                Iterator it3 = itArr2[i2];
                Objects.requireNonNull(it3);
                int i3 = this.X;
                itArr2[i3] = null;
                this.X = i3 + 1;
                return it3;
            }
        };
        ConcatenatedIterator concatenatedIterator = new ConcatenatedIterator();
        concatenatedIterator.f19869Y = ArrayItr.e0;
        concatenatedIterator.Z = unmodifiableIterator;
        return concatenatedIterator;
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static UnmodifiableIterator e(final Iterator it, final Predicate predicate) {
        it.getClass();
        predicate.getClass();
        return new AbstractIterator<Object>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                Object next;
                do {
                    Iterator it2 = it;
                    if (!it2.hasNext()) {
                        this.X = AbstractIterator.State.Z;
                        return null;
                    }
                    next = it2.next();
                } while (!predicate.apply(next));
                return next;
            }
        };
    }

    public static Object f(Iterator it, Predicate predicate) {
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return null;
    }

    public static UnmodifiableIterator g(Object... objArr) {
        if (objArr.length != 0) {
            return new ArrayItr(objArr);
        }
        Preconditions.k(0, objArr.length);
        return ArrayItr.e0;
    }

    public static Object h(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    public static PeekingIterator i(Iterator it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static Object j(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean k(Collection collection, Iterator it) {
        collection.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static int l(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.e(j);
    }

    public static Iterator m(Iterator it, Function function) {
        function.getClass();
        return new AnonymousClass6(it, function);
    }

    public static UnmodifiableIterator n(final Iterator it) {
        it.getClass();
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return it.next();
            }
        };
    }
}
