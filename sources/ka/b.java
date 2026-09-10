package ka;

import android.app.PendingIntent;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f44533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44534b;

    public b(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f44533a = pendingIntent;
        this.f44534b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.f44533a.equals(bVar.f44533a) && this.f44534b == bVar.f44534b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f44534b ? 1237 : 1231) ^ ((this.f44533a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbK = u.k("ReviewInfo{pendingIntent=", this.f44533a.toString(), ", isNoOp=");
        sbK.append(this.f44534b);
        sbK.append("}");
        return sbK.toString();
    }
}
