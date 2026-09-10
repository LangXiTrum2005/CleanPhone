package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p02 f18420d = new f6().c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18423c;

    public /* synthetic */ p02(f6 f6Var) {
        this.f18421a = f6Var.f14258a;
        this.f18422b = f6Var.f14259b;
        this.f18423c = f6Var.f14260c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p02.class != obj.getClass()) {
            return false;
        }
        p02 p02Var = (p02) obj;
        return this.f18421a == p02Var.f18421a && this.f18422b == p02Var.f18422b && this.f18423c == p02Var.f18423c;
    }

    public final int hashCode() {
        int i10 = (this.f18421a ? 1 : 0) << 2;
        boolean z10 = this.f18422b;
        return (z10 ? 1 : 0) + (z10 ? 1 : 0) + i10 + (this.f18423c ? 1 : 0);
    }
}
