package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class og1 extends mf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf1 f18267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af1 f18269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mf1 f18270d;

    public og1(sf1 sf1Var, String str, af1 af1Var, mf1 mf1Var) {
        this.f18267a = sf1Var;
        this.f18268b = str;
        this.f18269c = af1Var;
        this.f18270d = mf1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final boolean a() {
        return this.f18267a != sf1.l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof og1)) {
            return false;
        }
        og1 og1Var = (og1) obj;
        return og1Var.f18269c.equals(this.f18269c) && og1Var.f18270d.equals(this.f18270d) && og1Var.f18268b.equals(this.f18268b) && og1Var.f18267a.equals(this.f18267a);
    }

    public final int hashCode() {
        return Objects.hash(og1.class, this.f18268b, this.f18269c, this.f18270d, this.f18267a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18269c);
        String strValueOf2 = String.valueOf(this.f18270d);
        String strValueOf3 = String.valueOf(this.f18267a);
        String str = this.f18268b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        d5.u.r(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        d5.u.r(sb2, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }
}
