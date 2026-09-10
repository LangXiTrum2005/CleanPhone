package y1;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54182c;

    public r(String str, boolean z10, boolean z11) {
        this.f54180a = str;
        this.f54181b = z10;
        this.f54182c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == r.class) {
            r rVar = (r) obj;
            if (TextUtils.equals(this.f54180a, rVar.f54180a) && this.f54181b == rVar.f54181b && this.f54182c == rVar.f54182c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((d5.u.e(31, 31, this.f54180a) + (this.f54181b ? 1231 : 1237)) * 31) + (this.f54182c ? 1231 : 1237);
    }
}
