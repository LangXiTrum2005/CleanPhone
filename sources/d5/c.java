package d5;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f38684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38685b;

    public c(boolean z10, Uri uri) {
        this.f38684a = uri;
        this.f38685b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f38685b == cVar.f38685b && this.f38684a.equals(cVar.f38684a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38684a.hashCode() * 31) + (this.f38685b ? 1 : 0);
    }
}
