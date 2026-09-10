package com.google.common.graph;

import A.C0880a0;
import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractGraph<Object> {

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name and collision with other inner class name */
        class C02041 extends AbstractSet<EndpointPair<Object>> {
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                if (obj instanceof EndpointPair) {
                    throw null;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.Graph
        public final Set a() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final boolean b() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final boolean c() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set g(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set k(Object obj) {
            throw null;
        }

        @Override // com.google.common.graph.BaseGraph
        public final Set l(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$2, reason: invalid class name */
    class AnonymousClass2 implements Predicate<Object> {
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        if (b() == network.b() && d().equals(network.d())) {
            return ((AbstractMap) Maps.b(a(), new C0880a0(this, 15))).equals(Maps.b(network.a(), new C0880a0(network, 15)));
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractMap) Maps.b(a(), new C0880a0(this, 15))).hashCode();
    }

    public final String toString() {
        return "isDirected: " + b() + ", allowsParallelEdges: " + f() + ", allowsSelfLoops: " + c() + ", nodes: " + d() + ", edges: " + Maps.b(a(), new C0880a0(this, 15));
    }
}
