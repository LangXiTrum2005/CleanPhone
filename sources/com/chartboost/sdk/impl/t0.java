package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f15164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f15165b;

    public t0(double d, double d2) {
        this.f15164a = d;
        this.f15165b = d2;
    }

    public final double a() {
        return this.f15165b;
    }

    public final double b() {
        return this.f15164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Double.compare(this.f15164a, t0Var.f15164a) == 0 && Double.compare(this.f15165b, t0Var.f15165b) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f15165b) + (Double.hashCode(this.f15164a) * 31);
    }

    public String toString() {
        return "DoubleSize(width=" + this.f15164a + ", height=" + this.f15165b + ")";
    }
}
