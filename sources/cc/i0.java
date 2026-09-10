package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6116b;

    public i0(String str, List list) {
        this.f6115a = list;
        this.f6116b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            i0 i0Var = (i0) ((x1) obj);
            String str2 = i0Var.f6116b;
            if (this.f6115a.equals(i0Var.f6115a) && ((str = this.f6116b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6115a.hashCode() ^ 1000003) * 1000003;
        String str = this.f6116b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f6115a);
        sb2.append(", orgId=");
        return defpackage.e.q(this.f6116b, "}", sb2);
    }
}
