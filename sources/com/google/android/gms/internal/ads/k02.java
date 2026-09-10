package com.google.android.gms.internal.ads;

import android.os.Build;
import com.ironsource.X3;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k02 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k02 f16241d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia1 f16244c;

    static {
        k02 k02Var;
        if (Build.VERSION.SDK_INT >= 33) {
            ha1 ha1Var = new ha1(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                ha1Var.f(Integer.valueOf(uu0.e(i10)));
            }
            k02Var = new k02(2, ha1Var.h());
        } else {
            k02Var = new k02(2, 10);
        }
        f16241d = k02Var;
    }

    public k02(int i10, int i11) {
        this.f16242a = i10;
        this.f16243b = i11;
        this.f16244c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return this.f16242a == k02Var.f16242a && this.f16243b == k02Var.f16243b && Objects.equals(this.f16244c, k02Var.f16244c);
    }

    public final int hashCode() {
        ia1 ia1Var = this.f16244c;
        return (((this.f16242a * 31) + this.f16243b) * 31) + (ia1Var == null ? 0 : ia1Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f16244c);
        int i10 = this.f16242a;
        int length = String.valueOf(i10).length();
        int i11 = this.f16243b;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 38, String.valueOf(i11).length(), 15, strValueOf.length()) + 1);
        l1.d.p(sb2, "AudioProfile[format=", i10, ", maxChannelCount=", i11);
        return q4.a.j(sb2, ", channelMasks=", strValueOf, X3.j.f27836e);
    }

    public k02(int i10, Set set) {
        this.f16242a = i10;
        ia1 ia1VarV = ia1.v(set);
        this.f16244c = ia1VarV;
        mb1 mb1VarH = ia1VarV.h();
        int iMax = 0;
        while (mb1VarH.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) mb1VarH.next()).intValue()));
        }
        this.f16243b = iMax;
    }
}
