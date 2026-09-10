package f2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40311e;

    public c0(Object obj) {
        this(obj, -1L);
    }

    public final c0 a(Object obj) {
        if (this.f40307a.equals(obj)) {
            return this;
        }
        return new c0(obj, this.f40308b, this.f40309c, this.f40310d, this.f40311e);
    }

    public final boolean b() {
        return this.f40308b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f40307a.equals(c0Var.f40307a) && this.f40308b == c0Var.f40308b && this.f40309c == c0Var.f40309c && this.f40310d == c0Var.f40310d && this.f40311e == c0Var.f40311e;
    }

    public final int hashCode() {
        return ((((((((this.f40307a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40308b) * 31) + this.f40309c) * 31) + ((int) this.f40310d)) * 31) + this.f40311e;
    }

    public c0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public c0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public c0(Object obj, int i10, int i11, long j10, int i12) {
        this.f40307a = obj;
        this.f40308b = i10;
        this.f40309c = i11;
        this.f40310d = j10;
        this.f40311e = i12;
    }
}
