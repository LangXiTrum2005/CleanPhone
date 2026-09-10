package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45448a;

    public u(boolean z10) {
        this.f45448a = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(u.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return t9.e.d(Boolean.valueOf(this.f45448a), Boolean.valueOf(((u) obj).f45448a));
    }

    public final int hashCode() {
        return t9.e.e(Boolean.valueOf(this.f45448a)) + (u.class.hashCode() * 31);
    }

    public final String toString() {
        return "PlatformPendingPurchasesParams(enablePrepaidPlans=" + this.f45448a + ")";
    }
}
