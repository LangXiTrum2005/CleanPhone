package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicates;
import com.p004ironsource.d9;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {
    public final Optional X;

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$2, reason: invalid class name */
    class AnonymousClass2 extends FluentIterable<Object> {
        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3, reason: invalid class name */
    class AnonymousClass3 extends FluentIterable<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.FluentIterable$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIndexedListIterator<Iterator<Object>> {
            public AnonymousClass1(int i2) {
                super(i2, 0);
            }

            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i2) {
                throw null;
            }
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    public static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return FluentIterable.c((Iterable) obj);
        }
    }

    public FluentIterable() {
        this.X = Optional.d();
    }

    public static FluentIterable c(final Iterable iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<Object>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public final FluentIterable a(Class cls) {
        Iterable iterableD = d();
        iterableD.getClass();
        cls.getClass();
        return c(new Iterables.AnonymousClass4(iterableD, Predicates.g(cls)));
    }

    public final Iterable d() {
        return (Iterable) this.X.j(this);
    }

    public final ImmutableSet e() {
        Iterable iterableD = d();
        int i2 = ImmutableSet.Z;
        if (iterableD instanceof Collection) {
            return ImmutableSet.u((Collection) iterableD);
        }
        Iterator it = iterableD.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.k0;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder(4);
        builder.c(next);
        while (it.hasNext()) {
            builder.c(it.next());
        }
        return builder.k();
    }

    public String toString() {
        Iterator it = d().iterator();
        StringBuilder sb = new StringBuilder(d9.i.d);
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(it.next());
            z2 = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public FluentIterable(Iterable iterable) {
        this.X = Optional.i(iterable);
    }
}
