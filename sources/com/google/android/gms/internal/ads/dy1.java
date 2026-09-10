package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g22 f13763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r32 f13765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f13766i;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public dy1(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final dy1 a(r32 r32Var) {
        String message = getMessage();
        String str = uu0.f20901a;
        return new dy1(message, getCause(), this.f13758a, this.f13760c, this.f13761d, this.f13762e, this.f13763f, this.f13764g, r32Var, this.f13759b, this.f13766i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dy1(int i10, Exception exc, int i11, String str, int i12, g22 g22Var, int i13, r32 r32Var, boolean z10) {
        String str2;
        int i14;
        String strJ;
        String str3;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            strJ = "Source error";
        } else if (i10 != 1) {
            strJ = "Unexpected runtime error";
            str2 = str;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(g22Var);
            String str4 = uu0.f20901a;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str3.length() + strValueOf.length() + com.applovin.impl.ca.i(String.valueOf(str).length() + 14, 9, String.valueOf(i12)) + 19);
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            strJ = q4.a.j(sb2, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strJ : strJ.concat(": null"), exc, i11, i10, str2, i14, g22Var, i13, r32Var, SystemClock.elapsedRealtime(), z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy1(String str, Throwable th2, int i10, int i11, String str2, int i12, g22 g22Var, int i13, r32 r32Var, long j10, boolean z10) {
        boolean z11;
        super(str, th2);
        Bundle bundle = Bundle.EMPTY;
        this.f13758a = i10;
        this.f13759b = j10;
        if (!z10) {
            z11 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        ps1.v(z11);
        ps1.v(th2 != null);
        this.f13760c = i11;
        this.f13761d = str2;
        this.f13762e = i12;
        this.f13763f = g22Var;
        this.f13764g = i13;
        this.f13765h = r32Var;
        this.f13766i = z10;
    }
}
