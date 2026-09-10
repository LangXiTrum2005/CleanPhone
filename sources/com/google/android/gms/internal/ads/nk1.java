package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17860a;

    public nk1(int i10) {
        this.f17860a = i10;
    }

    public static nk1 b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new nk1(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nk1) && ((nk1) obj).f17860a == this.f17860a;
    }

    public final int hashCode() {
        return Objects.hash(nk1.class, Integer.valueOf(this.f17860a));
    }

    public final String toString() {
        int i10 = this.f17860a;
        return com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 34), "AesCmac PRF Parameters (", i10, "-byte key)");
    }
}
