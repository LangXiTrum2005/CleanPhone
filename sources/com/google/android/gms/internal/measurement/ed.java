package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rc f23423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.n3 f23424b;

    public ed(rc rcVar, com.google.android.gms.internal.ads.n3 n3Var) {
        this.f23423a = rcVar;
        this.f23424b = n3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ed) {
            ed edVar = (ed) obj;
            rc rcVar = edVar.f23423a;
            rc rcVar2 = this.f23423a;
            if (rcVar2 != null ? rcVar2.equals(rcVar) : rcVar == null) {
                if (this.f23424b.equals(edVar.f23424b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rc rcVar = this.f23423a;
        return this.f23424b.hashCode() ^ (((rcVar == null ? 0 : rcVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23423a);
        String string = this.f23424b.toString();
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        d5.u.r(sb2, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb2.append("}");
        return sb2.toString();
    }
}
