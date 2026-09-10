package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {
    public final Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f43249Y;

    public Pair(Object obj, Object obj2) {
        this.X = obj;
        this.f43249Y = obj2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getX() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.a(this.X, pair.X) && Intrinsics.a(this.f43249Y, pair.f43249Y);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getF43249Y() {
        return this.f43249Y;
    }

    public final int hashCode() {
        Object obj = this.X;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f43249Y;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.X + ", " + this.f43249Y + ')';
    }
}
