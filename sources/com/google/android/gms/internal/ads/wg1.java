package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf1 f21512a;

    public wg1(xf1 xf1Var) {
        this.f21512a = xf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f21512a != xf1.f21859j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wg1) && ((wg1) obj).f21512a == this.f21512a;
    }

    public final int hashCode() {
        return Objects.hash(wg1.class, this.f21512a);
    }

    public final String toString() {
        String str = this.f21512a.f21864b;
        return q4.a.j(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
