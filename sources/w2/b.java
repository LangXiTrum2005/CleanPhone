package w2;

import com.bumptech.glide.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f52926e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f52922a = j10;
        this.f52923b = j11;
        this.f52924c = j12;
        this.f52925d = j13;
        this.f52926e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f52922a == bVar.f52922a && this.f52923b == bVar.f52923b && this.f52924c == bVar.f52924c && this.f52925d == bVar.f52925d && this.f52926e == bVar.f52926e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return d.A(this.f52926e) + ((d.A(this.f52925d) + ((d.A(this.f52924c) + ((d.A(this.f52923b) + ((d.A(this.f52922a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f52922a + ", photoSize=" + this.f52923b + ", photoPresentationTimestampUs=" + this.f52924c + ", videoStartPosition=" + this.f52925d + ", videoSize=" + this.f52926e;
    }
}
