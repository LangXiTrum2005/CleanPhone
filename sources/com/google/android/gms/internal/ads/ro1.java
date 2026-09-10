package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 extends ek1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf1 f19630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo1 f19631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf1 f19632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xf1 f19633d;

    public ro1(tf1 tf1Var, qo1 qo1Var, sf1 sf1Var, xf1 xf1Var) {
        this.f19630a = tf1Var;
        this.f19631b = qo1Var;
        this.f19632c = sf1Var;
        this.f19633d = xf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f19633d != xf1.f21862n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro1)) {
            return false;
        }
        ro1 ro1Var = (ro1) obj;
        return ro1Var.f19630a == this.f19630a && ro1Var.f19631b == this.f19631b && ro1Var.f19632c == this.f19632c && ro1Var.f19633d == this.f19633d;
    }

    public final int hashCode() {
        return Objects.hash(ro1.class, this.f19630a, this.f19631b, this.f19632c, this.f19633d);
    }

    public final String toString() {
        String str = this.f19633d.f21864b;
        int length = str.length();
        String str2 = this.f19632c.f19966b;
        int length2 = str2.length();
        String str3 = this.f19630a.f20372b;
        int length3 = str3.length();
        String str4 = this.f19631b.f19151a;
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        d5.u.r(sb2, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        d5.u.r(sb2, ", encoding: ", str3, ", curve: ", str4);
        sb2.append(")");
        return sb2.toString();
    }
}
