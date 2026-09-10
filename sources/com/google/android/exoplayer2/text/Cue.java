package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Cue implements Bundleable {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final f K0;
    public static final Cue s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final CharSequence X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Layout.Alignment f18453Y;
    public final Layout.Alignment Z;
    public final Bitmap e0;
    public final float f0;
    public final int g0;
    public final int h0;
    public final float i0;
    public final int j0;
    public final float k0;
    public final float l0;
    public final boolean m0;
    public final int n0;
    public final int o0;
    public final float p0;
    public final int q0;
    public final float r0;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f18454a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f18455b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Layout.Alignment f18456c = null;
        public Layout.Alignment d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f18457e = -3.4028235E38f;
        public int f = Integer.MIN_VALUE;
        public int g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f18458h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18459i = Integer.MIN_VALUE;
        public int j = Integer.MIN_VALUE;
        public float k = -3.4028235E38f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f18460l = -3.4028235E38f;
        public float m = -3.4028235E38f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f18461n = false;
        public int o = -16777216;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f18462p = Integer.MIN_VALUE;
        public float q;

        public final Cue a() {
            return new Cue(this.f18454a, this.f18456c, this.d, this.f18455b, this.f18457e, this.f, this.g, this.f18458h, this.f18459i, this.j, this.k, this.f18460l, this.m, this.f18461n, this.o, this.f18462p, this.q);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        Builder builder = new Builder();
        builder.f18454a = "";
        s0 = builder.a();
        int i2 = Util.f18979a;
        t0 = Integer.toString(0, 36);
        u0 = Integer.toString(1, 36);
        v0 = Integer.toString(2, 36);
        w0 = Integer.toString(3, 36);
        x0 = Integer.toString(4, 36);
        y0 = Integer.toString(5, 36);
        z0 = Integer.toString(6, 36);
        A0 = Integer.toString(7, 36);
        B0 = Integer.toString(8, 36);
        C0 = Integer.toString(9, 36);
        D0 = Integer.toString(10, 36);
        E0 = Integer.toString(11, 36);
        F0 = Integer.toString(12, 36);
        G0 = Integer.toString(13, 36);
        H0 = Integer.toString(14, 36);
        I0 = Integer.toString(15, 36);
        J0 = Integer.toString(16, 36);
        K0 = new f(24);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i2, int i3, float f2, int i4, int i5, float f3, float f4, float f5, boolean z2, int i6, int i7, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            Assertions.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.X = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.X = charSequence.toString();
        } else {
            this.X = null;
        }
        this.f18453Y = alignment;
        this.Z = alignment2;
        this.e0 = bitmap;
        this.f0 = f;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = f2;
        this.j0 = i4;
        this.k0 = f4;
        this.l0 = f5;
        this.m0 = z2;
        this.n0 = i6;
        this.o0 = i5;
        this.p0 = f3;
        this.q0 = i7;
        this.r0 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (!TextUtils.equals(this.X, cue.X) || this.f18453Y != cue.f18453Y || this.Z != cue.Z) {
            return false;
        }
        Bitmap bitmap = cue.e0;
        Bitmap bitmap2 = this.e0;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f0 == cue.f0 && this.g0 == cue.g0 && this.h0 == cue.h0 && this.i0 == cue.i0 && this.j0 == cue.j0 && this.k0 == cue.k0 && this.l0 == cue.l0 && this.m0 == cue.m0 && this.n0 == cue.n0 && this.o0 == cue.o0 && this.p0 == cue.p0 && this.q0 == cue.q0 && this.r0 == cue.r0;
    }

    public final int hashCode() {
        Float fValueOf = Float.valueOf(this.f0);
        Integer numValueOf = Integer.valueOf(this.g0);
        Integer numValueOf2 = Integer.valueOf(this.h0);
        Float fValueOf2 = Float.valueOf(this.i0);
        Integer numValueOf3 = Integer.valueOf(this.j0);
        Float fValueOf3 = Float.valueOf(this.k0);
        Float fValueOf4 = Float.valueOf(this.l0);
        Boolean boolValueOf = Boolean.valueOf(this.m0);
        Integer numValueOf4 = Integer.valueOf(this.n0);
        Integer numValueOf5 = Integer.valueOf(this.o0);
        Float fValueOf5 = Float.valueOf(this.p0);
        Integer numValueOf6 = Integer.valueOf(this.q0);
        Float fValueOf6 = Float.valueOf(this.r0);
        return Arrays.hashCode(new Object[]{this.X, this.f18453Y, this.Z, this.e0, fValueOf, numValueOf, numValueOf2, fValueOf2, numValueOf3, fValueOf3, fValueOf4, boolValueOf, numValueOf4, numValueOf5, fValueOf5, numValueOf6, fValueOf6});
    }
}
