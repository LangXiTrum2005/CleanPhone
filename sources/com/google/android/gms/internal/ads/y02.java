package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g22 f22063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc1 f22064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ci f22065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r32 f22066d;

    public /* synthetic */ y02(hz hzVar) {
        this.f22063a = (g22) hzVar.f15433b;
        this.f22064b = (dc1) hzVar.f15434c;
        this.f22065c = (ci) hzVar.f15435d;
        this.f22066d = (r32) hzVar.f15436e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y02)) {
            return false;
        }
        y02 y02Var = (y02) obj;
        return this.f22063a.equals(y02Var.f22063a) && Objects.equals(this.f22064b, y02Var.f22064b) && this.f22065c.equals(y02Var.f22065c) && Objects.equals(this.f22066d, y02Var.f22066d);
    }

    public final int hashCode() {
        int iHashCode = this.f22063a.hashCode() * 961;
        dc1 dc1Var = this.f22064b;
        int iHashCode2 = this.f22065c.hashCode() + ((iHashCode + (dc1Var == null ? 0 : dc1Var.hashCode())) * 31);
        r32 r32Var = this.f22066d;
        return (iHashCode2 * 31) + (r32Var != null ? r32Var.hashCode() : 0);
    }
}
