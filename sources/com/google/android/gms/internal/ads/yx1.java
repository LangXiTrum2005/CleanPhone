package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g22 f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g22 f22397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22399e;

    public yx1(String str, g22 g22Var, g22 g22Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = false;
            if (i11 == 0) {
                i11 = 0;
                z10 = true;
            }
        } else {
            z10 = true;
        }
        ps1.v(z10);
        ps1.v(true ^ TextUtils.isEmpty(str));
        this.f22395a = str;
        this.f22396b = g22Var;
        g22Var2.getClass();
        this.f22397c = g22Var2;
        this.f22398d = i10;
        this.f22399e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yx1.class == obj.getClass()) {
            yx1 yx1Var = (yx1) obj;
            if (this.f22398d == yx1Var.f22398d && this.f22399e == yx1Var.f22399e && this.f22395a.equals(yx1Var.f22395a) && this.f22396b.equals(yx1Var.f22396b) && this.f22397c.equals(yx1Var.f22397c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22397c.hashCode() + ((this.f22396b.hashCode() + ((this.f22395a.hashCode() + ((((this.f22398d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f22399e) * 31)) * 31)) * 31);
    }
}
