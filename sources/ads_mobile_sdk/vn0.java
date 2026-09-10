package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vn0 extends nn0 {
    public final int c;
    public final String d;
    public final String e;

    public vn0(int i, String str, String str2) {
        super(k41.NETWORK_ERROR, 0);
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn0)) {
            return false;
        }
        vn0 vn0Var = (vn0) obj;
        return this.c == vn0Var.c && Intrinsics.wireman(this.d, vn0Var.d) && Intrinsics.wireman(this.e, vn0Var.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "WebError(errorCode=" + this.c + ", description=" + this.d + ", failingUrl=" + this.e + ")";
    }
}
