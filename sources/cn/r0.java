package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6759a;

    public r0(boolean z10) {
        this.f6759a = z10;
    }

    @Override // cn.b1
    public final t1 b() {
        return null;
    }

    @Override // cn.b1
    public final boolean isActive() {
        return this.f6759a;
    }

    public final String toString() {
        return wi.d.k(new StringBuilder("Empty{"), this.f6759a ? "Active" : "New", '}');
    }
}
