package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf1 f15282a;

    public hg1(tf1 tf1Var) {
        this.f15282a = tf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f15282a != tf1.f20367h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hg1) && ((hg1) obj).f15282a == this.f15282a;
    }

    public final int hashCode() {
        return Objects.hash(hg1.class, this.f15282a);
    }

    public final String toString() {
        String str = this.f15282a.f20372b;
        return q4.a.j(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
