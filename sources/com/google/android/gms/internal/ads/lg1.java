package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf1 f16987b;

    public lg1(String str, xf1 xf1Var) {
        this.f16986a = str;
        this.f16987b = xf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f16987b != xf1.f21856g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lg1)) {
            return false;
        }
        lg1 lg1Var = (lg1) obj;
        return lg1Var.f16986a.equals(this.f16986a) && lg1Var.f16987b.equals(this.f16987b);
    }

    public final int hashCode() {
        return Objects.hash(lg1.class, this.f16986a, this.f16987b);
    }

    public final String toString() {
        String str = this.f16987b.f21864b;
        String str2 = this.f16986a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        d5.u.r(sb2, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb2.append(")");
        return sb2.toString();
    }
}
