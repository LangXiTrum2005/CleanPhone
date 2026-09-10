package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tg1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf1 f20380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20381b;

    public tg1(tf1 tf1Var, int i10) {
        this.f20380a = tf1Var;
        this.f20381b = i10;
    }

    public static tg1 b(tf1 tf1Var, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new tg1(tf1Var, i10);
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f20380a != tf1.f20369j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tg1)) {
            return false;
        }
        tg1 tg1Var = (tg1) obj;
        return tg1Var.f20380a == this.f20380a && tg1Var.f20381b == this.f20381b;
    }

    public final int hashCode() {
        return Objects.hash(tg1.class, this.f20380a, Integer.valueOf(this.f20381b));
    }

    public final String toString() {
        String str = this.f20380a.f20372b;
        int length = str.length();
        int i10 = this.f20381b;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(str);
        sb2.append("salt_size_bytes: ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }
}
