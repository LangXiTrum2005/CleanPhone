package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f24049b;

    public uf(dd ddVar, z0 z0Var) {
        this.f24048a = ddVar;
        if (z0Var == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.f24049b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return this.f24048a.equals(ufVar.f24048a) && this.f24049b.equals(ufVar.f24049b);
    }

    public final int hashCode() {
        return this.f24049b.hashCode() ^ ((this.f24048a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.f24048a.toString();
        int length = string.length();
        String string2 = this.f24049b.toString();
        StringBuilder sb2 = new StringBuilder(length + 53 + string2.length() + 1);
        d5.u.r(sb2, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb2.append("}");
        return sb2.toString();
    }
}
