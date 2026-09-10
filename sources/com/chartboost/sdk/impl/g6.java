package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13985b;

    public g6(int i2, int i3) {
        this.f13984a = i2;
        this.f13985b = i3;
    }

    public final int a() {
        return this.f13985b;
    }

    public final int b() {
        return this.f13984a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return this.f13984a == g6Var.f13984a && this.f13985b == g6Var.f13985b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13985b) + (Integer.hashCode(this.f13984a) * 31);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.e(this.f13984a, this.f13985b, "DisplaySize(width=", ", height=", ")");
    }
}
