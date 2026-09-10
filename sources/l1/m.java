package l1;

import com.google.android.gms.internal.ads.t02;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t02 f44797b = new t02(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44799d;

    public m(Object obj) {
        this.f44796a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f44796a.equals(((m) obj).f44796a);
    }

    public final int hashCode() {
        return this.f44796a.hashCode();
    }
}
