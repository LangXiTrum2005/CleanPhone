package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n11 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17615b;

    public n11(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        ps1.C("Invalid latitude or longitude", z10);
        this.f17614a = f10;
        this.f17615b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n11.class == obj.getClass()) {
            n11 n11Var = (n11) obj;
            if (this.f17614a == n11Var.f17614a && this.f17615b == n11Var.f17615b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17615b) + ((Float.hashCode(this.f17614a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        float f10 = this.f17614a;
        int length = String.valueOf(f10).length();
        float f11 = this.f17615b;
        StringBuilder sb2 = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb2.append("xyz: latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        return sb2.toString();
    }
}
