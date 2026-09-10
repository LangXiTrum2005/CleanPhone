package com.google.common.graph;

import com.google.common.collect.Iterators;
import com.google.errorprone.annotations.Immutable;
import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public abstract class EndpointPair<N> implements Iterable<N> {
    public final Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f19997Y;

    public static final class Ordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean a() {
            return true;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object c() {
            return this.X;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            return this.f19997Y;
        }

        public final boolean equals(Object obj) {
            if (obj != this) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair endpointPair = (EndpointPair) obj;
                if (true != endpointPair.a()) {
                    return false;
                }
                if (!this.X.equals(endpointPair.c())) {
                    return false;
                }
                if (!this.f19997Y.equals(endpointPair.d())) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.X, this.f19997Y});
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.X, this.f19997Y);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(this.X);
            sb.append(" -> ");
            return android.support.v4.media.a.q(sb, this.f19997Y, ">");
        }
    }

    public static final class Unordered<N> extends EndpointPair<N> {
        @Override // com.google.common.graph.EndpointPair
        public final boolean a() {
            return false;
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object c() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        @Override // com.google.common.graph.EndpointPair
        public final Object d() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don't.");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair endpointPair = (EndpointPair) obj;
            if (endpointPair.a()) {
                return false;
            }
            Object obj2 = this.X;
            Object obj3 = endpointPair.X;
            boolean zEquals = obj2.equals(obj3);
            Object obj4 = this.f19997Y;
            Object obj5 = endpointPair.f19997Y;
            if (zEquals) {
                return obj4.equals(obj5);
            }
            return obj2.equals(obj5) && obj4.equals(obj3);
        }

        public final int hashCode() {
            return this.f19997Y.hashCode() + this.X.hashCode();
        }

        @Override // com.google.common.graph.EndpointPair, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.g(this.X, this.f19997Y);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(d9.i.d);
            sb.append(this.X);
            sb.append(", ");
            return android.support.v4.media.a.q(sb, this.f19997Y, d9.i.f24752e);
        }
    }

    public EndpointPair(Object obj, Object obj2) {
        obj.getClass();
        this.X = obj;
        obj2.getClass();
        this.f19997Y = obj2;
    }

    public abstract boolean a();

    public abstract Object c();

    public abstract Object d();

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Iterators.g(this.X, this.f19997Y);
    }
}
