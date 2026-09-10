package zl;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55038b;

    public f(Object obj, int i10) {
        this.f55037a = obj;
        this.f55038b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f55037a == fVar.f55037a && this.f55038b == fVar.f55038b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f55037a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f55038b;
    }
}
