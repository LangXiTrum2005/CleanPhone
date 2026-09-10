package kj;

import cc.a2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f44660c;

    public b(c cVar, a aVar, List list) {
        this.f44658a = cVar;
        this.f44659b = aVar;
        this.f44660c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(b.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        return a2.g(this.f44658a, bVar.f44658a) && a2.g(this.f44659b, bVar.f44659b) && a2.g(this.f44660c, bVar.f44660c);
    }

    public final int hashCode() {
        return a2.i(this.f44660c) + ((a2.i(this.f44659b) + ((a2.i(this.f44658a) + (b.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CacheRetrievalResult(type=" + this.f44658a + ", error=" + this.f44659b + ", paths=" + this.f44660c + ")";
    }
}
