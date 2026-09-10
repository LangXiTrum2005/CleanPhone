package jm;

import kotlin.jvm.internal.n;
import pm.c0;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk.e f43990a;

    public c(zk.e eVar) {
        this.f43990a = eVar;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return n.a(this.f43990a, cVar != null ? cVar.f43990a : null);
    }

    @Override // jm.d
    public final y getType() {
        c0 c0VarG = this.f43990a.g();
        n.e(c0VarG, "classDescriptor.defaultType");
        return c0VarG;
    }

    public final int hashCode() {
        return this.f43990a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        c0 c0VarG = this.f43990a.g();
        n.e(c0VarG, "classDescriptor.defaultType");
        sb2.append(c0VarG);
        sb2.append('}');
        return sb2.toString();
    }
}
