package m1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45781c;

    public f(long j10, long j11, long j12) {
        this.f45779a = j10;
        this.f45780b = j11;
        this.f45781c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f45779a == fVar.f45779a && this.f45780b == fVar.f45780b && this.f45781c == fVar.f45781c;
    }

    public final int hashCode() {
        return com.bumptech.glide.d.A(this.f45781c) + ((com.bumptech.glide.d.A(this.f45780b) + ((com.bumptech.glide.d.A(this.f45779a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f45779a + ", modification time=" + this.f45780b + ", timescale=" + this.f45781c;
    }
}
