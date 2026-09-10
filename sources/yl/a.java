package yl;

import an.p;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f54499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f54500b;

    static {
        c.j(h.f54522f);
    }

    public a(c packageName, f fVar) {
        n.f(packageName, "packageName");
        this.f54499a = packageName;
        this.f54500b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f54499a, aVar.f54499a) && this.f54500b.equals(aVar.f54500b);
    }

    public final int hashCode() {
        return (this.f54500b.hashCode() + (this.f54499a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = p.m0(this.f54499a.b(), '.', '/') + "/" + this.f54500b;
        n.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
