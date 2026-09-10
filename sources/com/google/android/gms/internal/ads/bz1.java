package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12946c;

    public /* synthetic */ bz1(az1 az1Var) {
        this.f12944a = az1Var.f12554a;
        this.f12945b = az1Var.f12555b;
        this.f12946c = az1Var.f12556c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz1)) {
            return false;
        }
        bz1 bz1Var = (bz1) obj;
        return this.f12944a == bz1Var.f12944a && this.f12945b == bz1Var.f12945b && this.f12946c == bz1Var.f12946c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12944a), Float.valueOf(this.f12945b), Long.valueOf(this.f12946c));
    }
}
