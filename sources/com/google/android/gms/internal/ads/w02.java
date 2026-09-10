package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z80 f21358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21360g;

    public /* synthetic */ w02(if1 if1Var) {
        this.f21354a = if1Var.f15727a;
        this.f21355b = if1Var.f15728b;
        this.f21356c = if1Var.f15729c;
        this.f21357d = if1Var.f15730d;
        this.f21358e = (z80) if1Var.f15733g;
        this.f21359f = if1Var.f15731e;
        this.f21360g = if1Var.f15732f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w02.class == obj.getClass()) {
            w02 w02Var = (w02) obj;
            if (this.f21354a == w02Var.f21354a && this.f21355b == w02Var.f21355b && this.f21356c == w02Var.f21356c && this.f21357d == w02Var.f21357d && this.f21359f == w02Var.f21359f && this.f21360g == w02Var.f21360g && this.f21358e.equals(w02Var.f21358e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f21354a);
        Integer numValueOf2 = Integer.valueOf(this.f21355b);
        Integer numValueOf3 = Integer.valueOf(this.f21356c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.f21357d), this.f21358e, Integer.valueOf(this.f21359f), Integer.valueOf(this.f21360g), bool, bool);
    }
}
