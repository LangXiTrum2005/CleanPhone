package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 extends ek1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1 f21561a;

    public wo1(vo1 vo1Var) {
        this.f21561a = vo1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f21561a != vo1.f21225e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wo1) && ((wo1) obj).f21561a == this.f21561a;
    }

    public final int hashCode() {
        return Objects.hash(wo1.class, this.f21561a);
    }

    public final String toString() {
        String str = this.f21561a.f21226a;
        return q4.a.j(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
