package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vz1 f21326b = new vz1(new z61());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia1 f21327a;

    public vz1(z61 z61Var) {
        this.f21327a = (ia1) z61Var.f22523a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vz1) && this.f21327a.equals(((vz1) obj).f21327a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f21327a, null, null, bool, bool, bool, bool, bool);
    }
}
