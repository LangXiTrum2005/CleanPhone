package w2;

import com.bumptech.glide.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52927a;

    public c(long j10) {
        this.f52927a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f52927a == ((c) obj).f52927a;
    }

    public final int hashCode() {
        return d.A(this.f52927a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.f52927a;
    }
}
