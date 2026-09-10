package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5 f21032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5 f21033c;

    public v5(float f10, u5 u5Var, u5 u5Var2) {
        this.f21031a = f10;
        this.f21032b = u5Var;
        this.f21033c = u5Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return Float.compare(this.f21031a, v5Var.f21031a) == 0 && Objects.equals(this.f21032b, v5Var.f21032b) && Objects.equals(this.f21033c, v5Var.f21033c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f21031a) * 31;
        u5 u5Var = this.f21032b;
        int iHashCode2 = (iHashCode + (u5Var != null ? u5Var.hashCode() : 0)) * 31;
        u5 u5Var2 = this.f21033c;
        return iHashCode2 + (u5Var2 != null ? u5Var2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21032b);
        String strValueOf2 = String.valueOf(this.f21033c);
        float f10 = this.f21031a;
        int length = String.valueOf(f10).length();
        StringBuilder sb2 = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb2.append("ReplayGain Xing/Info: peak=");
        sb2.append(f10);
        sb2.append(", field 1=");
        sb2.append(strValueOf);
        return defpackage.e.q(", field 2=", strValueOf2, sb2);
    }
}
