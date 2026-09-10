package r8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.c f49498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f49499b;

    public l(o8.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f49498a = cVar;
        this.f49499b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f49498a.equals(lVar.f49498a)) {
            return Arrays.equals(this.f49499b, lVar.f49499b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49499b) ^ ((this.f49498a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f49498a + ", bytes=[...]}";
    }
}
