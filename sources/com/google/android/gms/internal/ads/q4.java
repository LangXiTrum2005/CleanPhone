package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18922f;

    public q4(int i10, int i11, String str, String str2, String str3, boolean z10) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        ps1.v(z11);
        this.f18917a = i10;
        this.f18918b = str;
        this.f18919c = str2;
        this.f18920d = str3;
        this.f18921e = z10;
        this.f18922f = i11;
    }

    @Override // com.google.android.gms.internal.ads.v7
    public final void a(o6 o6Var) {
        String str = this.f18919c;
        if (str != null) {
            o6Var.f18173x = str;
        }
        String str2 = this.f18918b;
        if (str2 != null) {
            o6Var.f18172w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4.class == obj.getClass()) {
            q4 q4Var = (q4) obj;
            if (this.f18917a == q4Var.f18917a && Objects.equals(this.f18918b, q4Var.f18918b) && Objects.equals(this.f18919c, q4Var.f18919c) && Objects.equals(this.f18920d, q4Var.f18920d) && this.f18921e == q4Var.f18921e && this.f18922f == q4Var.f18922f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18918b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f18919c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = ((this.f18917a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        String str3 = this.f18920d;
        return (((((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f18921e ? 1 : 0)) * 31) + this.f18922f;
    }

    public final String toString() {
        String str = this.f18919c;
        int length = String.valueOf(str).length();
        String str2 = this.f18918b;
        int length2 = String.valueOf(str2).length();
        int i10 = this.f18917a;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f18922f;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length, 28, length2, 11, length3) + 19 + String.valueOf(i11).length());
        d5.u.r(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return l1.d.j(sb2, i10, "\", bitrate=", i11, ", metadataInterval=");
    }
}
