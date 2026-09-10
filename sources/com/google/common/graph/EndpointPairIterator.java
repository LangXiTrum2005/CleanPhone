package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class EndpointPairIterator<N> extends AbstractIterator<EndpointPair<N>> {
    public final BaseGraph Z;
    public final Iterator e0;
    public Object f0 = null;
    public Iterator g0 = ImmutableSet.y().iterator();

    public static final class Directed<N> extends EndpointPairIterator<N> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            while (!this.g0.hasNext()) {
                if (!c()) {
                    b();
                    return null;
                }
            }
            Object obj = this.f0;
            Objects.requireNonNull(obj);
            return new EndpointPair.Ordered(obj, this.g0.next());
        }
    }

    public static final class Undirected<N> extends EndpointPairIterator<N> {
        public HashSet h0;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            do {
                Objects.requireNonNull(this.h0);
                while (this.g0.hasNext()) {
                    Object next = this.g0.next();
                    if (!this.h0.contains(next)) {
                        Object obj = this.f0;
                        Objects.requireNonNull(obj);
                        return new EndpointPair.Unordered(next, obj);
                    }
                }
                this.h0.add(this.f0);
            } while (c());
            this.h0 = null;
            b();
            return null;
        }
    }

    public EndpointPairIterator(BaseGraph baseGraph) {
        this.Z = baseGraph;
        this.e0 = baseGraph.d().iterator();
    }

    public final boolean c() {
        Preconditions.p(!this.g0.hasNext());
        Iterator it = this.e0;
        if (!it.hasNext()) {
            return false;
        }
        Object next = it.next();
        this.f0 = next;
        this.g0 = this.Z.k(next).iterator();
        return true;
    }
}
