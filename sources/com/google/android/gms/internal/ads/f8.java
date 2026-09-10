package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f14308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14315j;

    public f8(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f14306a = str;
        this.f14307b = i10;
        this.f14308c = num;
        this.f14309d = num2;
        this.f14310e = f10;
        this.f14311f = z10;
        this.f14312g = z11;
        this.f14313h = z12;
        this.f14314i = z13;
        this.f14315j = i11;
    }

    public static Integer a(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            ps1.v(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(gc1.a(((j10 >> 24) & 255) ^ 255), gc1.a(j10 & 255), gc1.a((j10 >> 8) & 255), gc1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            v71.B("SsaStyle", q4.a.j(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e10);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            v71.B("SsaStyle", q4.a.j(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e10);
            return false;
        }
    }
}
