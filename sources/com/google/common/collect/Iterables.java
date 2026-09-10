package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Iterables {

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$1, reason: invalid class name */
    class AnonymousClass1 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$2, reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$3, reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<List<Object>> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$4, reason: invalid class name */
    class AnonymousClass4 extends FluentIterable<Object> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Iterable f19863Y;
        public final /* synthetic */ Predicate Z;

        public AnonymousClass4(Iterable iterable, Predicate predicate) {
            this.f19863Y = iterable;
            this.Z = predicate;
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.e(this.f19863Y.iterator(), this.Z);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$7, reason: invalid class name */
    class AnonymousClass7 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$8, reason: invalid class name */
    class AnonymousClass8 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            return "Iterables.consumingIterable(...)";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Iterables$9, reason: invalid class name */
    class AnonymousClass9 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            Iterables.h(null, new Function() { // from class: com.google.common.collect.e
                public final /* synthetic */ int X = 0;

                @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    switch (this.X) {
                        case 0:
                            return ((Iterable) obj).iterator();
                        default:
                            return ((Map) obj).keySet().iterator();
                    }
                }
            });
            throw null;
        }
    }

    public static final class UnmodifiableIterable<T> extends FluentIterable<T> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.FluentIterable
        public final String toString() {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    public static boolean a(Iterable iterable, Predicate predicate) {
        Iterator it = iterable.iterator();
        Preconditions.j(predicate, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                if (i2 != -1) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return true;
        }
        return false;
    }

    public static Iterable b(Iterable iterable, Predicate predicate) {
        iterable.getClass();
        return new AnonymousClass4(iterable, predicate);
    }

    public static Object c(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return androidx.media3.extractor.text.ttml.a.h(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object d(Collection collection) {
        Iterator it = collection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object e(Iterable iterable, Predicate predicate) {
        predicate.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static boolean f(Iterable iterable, Predicate predicate) {
        boolean z2 = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }
        List list = (List) iterable;
        predicate.getClass();
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!predicate.apply(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        g(list, predicate, i3, i2);
                    } catch (UnsupportedOperationException unused2) {
                        g(list, predicate, i3, i2);
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    public static void g(List list, Predicate predicate, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public static Iterable h(Collection collection, Function function) {
        collection.getClass();
        return new FluentIterable<Object>(collection, function) { // from class: com.google.common.collect.Iterables.5

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ Collection f19864Y;
            public final /* synthetic */ Function Z;

            {
                this.f19864Y = collection;
                this.Z = function;
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new Iterators.AnonymousClass6(this.f19864Y.iterator(), this.Z);
            }
        };
    }
}
