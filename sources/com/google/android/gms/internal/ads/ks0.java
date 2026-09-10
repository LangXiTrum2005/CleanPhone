package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ks0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16517b;

    public ks0(int i10, int i11) {
        super(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i11).length() + 31), "Player stuck suppressed for ", i11, " ms") : com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i11).length() + 43), "Player stuck playing without ending for ", i11, " ms") : com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i11).length() + 45), "Player stuck playing with no progress for ", i11, " ms") : com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i11).length() + 47), "Player stuck buffering with no progress for ", i11, " ms") : com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i11).length() + 46), "Player stuck buffering and not loading for ", i11, " ms"));
        this.f16516a = i10;
        this.f16517b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ks0.class != obj.getClass()) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        return this.f16516a == ks0Var.f16516a && this.f16517b == ks0Var.f16517b;
    }

    public final int hashCode() {
        return ((this.f16516a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f16517b;
    }
}
