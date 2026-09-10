package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19994a = null;

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1, reason: invalid class name */
    class AnonymousClass1 extends AbstractSet<Object> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1$1, reason: invalid class name and collision with other inner class name */
        class C02051 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
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

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractSet<Object> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$2, reason: invalid class name and collision with other inner class name */
        class C02062 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
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

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3, reason: invalid class name */
    class AnonymousClass3 extends AbstractSet<Object> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
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

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$4, reason: invalid class name */
    class AnonymousClass4 extends AbstractIterator<EndpointPair<Object>> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19995a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f19995a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19995a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class NodeConnection<N> {

        public static final class Pred<N> extends NodeConnection<N> {
            public final boolean equals(Object obj) {
                if (!(obj instanceof Pred)) {
                    return false;
                }
                ((Pred) obj).getClass();
                throw null;
            }

            public final int hashCode() {
                Pred.class.hashCode();
                throw null;
            }
        }

        public static final class Succ<N> extends NodeConnection<N> {
            public final boolean equals(Object obj) {
                if (!(obj instanceof Succ)) {
                    return false;
                }
                ((Succ) obj).getClass();
                throw null;
            }

            public final int hashCode() {
                Succ.class.hashCode();
                throw null;
            }
        }
    }

    public static final class PredAndSucc {
    }
}
