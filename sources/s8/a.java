package s8;

import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50211b;

    public a(int i10, long j10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f50210a = i10;
        this.f50211b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.b(this.f50210a, aVar.f50210a) && this.f50211b == aVar.f50211b;
    }

    public final int hashCode() {
        int iC = (i.c(this.f50210a) ^ 1000003) * 1000003;
        long j10 = this.f50211b;
        return ((int) ((j10 >>> 32) ^ j10)) ^ iC;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f50210a;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return defpackage.e.r(sb2, this.f50211b, "}");
    }
}
