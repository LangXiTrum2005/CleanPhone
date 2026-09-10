package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20137c;

    public t22(String str, boolean z10, boolean z11) {
        this.f20135a = str;
        this.f20136b = z10;
        this.f20137c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != t22.class) {
            return false;
        }
        t22 t22Var = (t22) obj;
        return TextUtils.equals(this.f20135a, t22Var.f20135a) && this.f20136b == t22Var.f20136b && this.f20137c == t22Var.f20137c;
    }

    public final int hashCode() {
        return ((((this.f20135a.hashCode() + 31) * 31) + (true != this.f20136b ? 1237 : 1231)) * 31) + (true != this.f20137c ? 1237 : 1231);
    }
}
