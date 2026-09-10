package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15150b;

    public h5(float f10, int i10) {
        this.f15149a = f10;
        this.f15150b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h5.class == obj.getClass()) {
            h5 h5Var = (h5) obj;
            if (this.f15149a == h5Var.f15149a && this.f15150b == h5Var.f15150b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f15149a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f15150b;
    }

    public final String toString() {
        float f10 = this.f15149a;
        int length = String.valueOf(f10).length();
        int i10 = this.f15150b;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }
}
