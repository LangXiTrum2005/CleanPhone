package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f18482h;

    public p4(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f18475a = i10;
        this.f18476b = str;
        this.f18477c = str2;
        this.f18478d = i11;
        this.f18479e = i12;
        this.f18480f = i13;
        this.f18481g = i14;
        this.f18482h = bArr;
    }

    public static p4 b(np0 np0Var) {
        int iB = np0Var.b();
        String strG = na.g(np0Var.k(np0Var.b(), StandardCharsets.US_ASCII));
        String strK = np0Var.k(np0Var.b(), StandardCharsets.UTF_8);
        int iB2 = np0Var.b();
        int iB3 = np0Var.b();
        int iB4 = np0Var.b();
        int iB5 = np0Var.b();
        int iB6 = np0Var.b();
        byte[] bArr = new byte[iB6];
        np0Var.H(bArr, 0, iB6);
        return new p4(iB, strG, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.v7
    public final void a(o6 o6Var) {
        o6Var.b(this.f18475a, this.f18482h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4.class == obj.getClass()) {
            p4 p4Var = (p4) obj;
            if (this.f18475a == p4Var.f18475a && this.f18476b.equals(p4Var.f18476b) && this.f18477c.equals(p4Var.f18477c) && this.f18478d == p4Var.f18478d && this.f18479e == p4Var.f18479e && this.f18480f == p4Var.f18480f && this.f18481g == p4Var.f18481g && Arrays.equals(this.f18482h, p4Var.f18482h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18482h) + ((((((((((this.f18477c.hashCode() + ((this.f18476b.hashCode() + ((this.f18475a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31) + this.f18478d) * 31) + this.f18479e) * 31) + this.f18480f) * 31) + this.f18481g) * 31);
    }

    public final String toString() {
        String str = this.f18476b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f18477c;
        return d5.u.h(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
