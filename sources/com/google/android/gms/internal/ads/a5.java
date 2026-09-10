package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f11850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f11851f;

    public a5(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        super("MLLT");
        this.f11847b = i10;
        this.f11848c = i11;
        this.f11849d = i12;
        this.f11850e = iArr;
        this.f11851f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a5.class == obj.getClass()) {
            a5 a5Var = (a5) obj;
            if (this.f11847b == a5Var.f11847b && this.f11848c == a5Var.f11848c && this.f11849d == a5Var.f11849d && Arrays.equals(this.f11850e, a5Var.f11850e) && Arrays.equals(this.f11851f, a5Var.f11851f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11851f) + ((Arrays.hashCode(this.f11850e) + ((((((this.f11847b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f11848c) * 31) + this.f11849d) * 31)) * 31);
    }
}
