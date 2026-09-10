package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f16787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f16790t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f16791u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f16792v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f16793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f16794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f16795y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f16796z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f16797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f16798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f16799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f16800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f16806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f16807k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f16808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f16809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f16810o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16811p;

    static {
        Layout.Alignment alignment = null;
        float f10 = -3.4028235E38f;
        int i10 = Integer.MIN_VALUE;
        new l80("", alignment, alignment, null, f10, i10, i10, f10, i10, i10, f10, f10, f10, i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        String str = uu0.f20901a;
        f16787q = Integer.toString(0, 36);
        f16788r = Integer.toString(17, 36);
        f16789s = Integer.toString(1, 36);
        f16790t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f16791u = Integer.toString(18, 36);
        f16792v = Integer.toString(4, 36);
        f16793w = Integer.toString(5, 36);
        f16794x = Integer.toString(6, 36);
        f16795y = Integer.toString(7, 36);
        f16796z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    public /* synthetic */ l80(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, int i14, float f15, int i15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            ps1.v(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f16797a = SpannedString.valueOf(charSequence);
        } else {
            this.f16797a = charSequence != null ? charSequence.toString() : null;
        }
        this.f16798b = alignment;
        this.f16799c = alignment2;
        this.f16800d = bitmap;
        this.f16801e = f10;
        this.f16802f = i10;
        this.f16803g = i11;
        this.f16804h = f11;
        this.f16805i = i12;
        this.f16806j = f13;
        this.f16807k = f14;
        this.l = i13;
        this.f16808m = f12;
        this.f16809n = i14;
        this.f16810o = f15;
        this.f16811p = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l80.class != obj.getClass()) {
            return false;
        }
        l80 l80Var = (l80) obj;
        Bitmap bitmap = l80Var.f16800d;
        if (!TextUtils.equals(this.f16797a, l80Var.f16797a) || this.f16798b != l80Var.f16798b || this.f16799c != l80Var.f16799c) {
            return false;
        }
        Bitmap bitmap2 = this.f16800d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f16801e == l80Var.f16801e && this.f16802f == l80Var.f16802f && this.f16803g == l80Var.f16803g && this.f16804h == l80Var.f16804h && this.f16805i == l80Var.f16805i && this.f16806j == l80Var.f16806j && this.f16807k == l80Var.f16807k && this.l == l80Var.l && this.f16808m == l80Var.f16808m && this.f16809n == l80Var.f16809n && this.f16810o == l80Var.f16810o && this.f16811p == l80Var.f16811p;
    }

    public final int hashCode() {
        return Objects.hash(this.f16797a, this.f16798b, this.f16799c, this.f16800d, Float.valueOf(this.f16801e), Integer.valueOf(this.f16802f), Integer.valueOf(this.f16803g), Float.valueOf(this.f16804h), Integer.valueOf(this.f16805i), Float.valueOf(this.f16806j), Float.valueOf(this.f16807k), Boolean.FALSE, -16777216, Integer.valueOf(this.l), Float.valueOf(this.f16808m), Integer.valueOf(this.f16809n), Float.valueOf(this.f16810o), Integer.valueOf(this.f16811p));
    }
}
