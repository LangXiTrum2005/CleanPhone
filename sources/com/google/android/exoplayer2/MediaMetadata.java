package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaMetadata implements Bundleable {
    public static final MediaMetadata J0 = new MediaMetadata(new Builder());
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public static final String Z0;
    public static final String a1;
    public static final String b1;
    public static final String c1;
    public static final String d1;
    public static final String e1;
    public static final String f1;
    public static final String g1;
    public static final String h1;
    public static final String i1;
    public static final String j1;
    public static final String k1;
    public static final String l1;
    public static final String m1;
    public static final String n1;
    public static final String o1;
    public static final String p1;
    public static final String q1;
    public static final d r1;
    public final CharSequence A0;
    public final CharSequence B0;
    public final Integer C0;
    public final Integer D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final CharSequence G0;
    public final Integer H0;
    public final Bundle I0;
    public final CharSequence X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CharSequence f17120Y;
    public final CharSequence Z;
    public final CharSequence e0;
    public final CharSequence f0;
    public final CharSequence g0;
    public final CharSequence h0;
    public final Rating i0;
    public final Rating j0;
    public final byte[] k0;
    public final Integer l0;
    public final Uri m0;
    public final Integer n0;
    public final Integer o0;
    public final Integer p0;
    public final Boolean q0;
    public final Boolean r0;
    public final Integer s0;
    public final Integer t0;
    public final Integer u0;
    public final Integer v0;
    public final Integer w0;
    public final Integer x0;
    public final Integer y0;
    public final CharSequence z0;

    public static final class Builder {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public Integer f17121A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public Integer f17122B;
        public CharSequence C;
        public CharSequence D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public CharSequence f17123E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public Integer f17124F;
        public Bundle G;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f17125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f17126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f17127c;
        public CharSequence d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f17128e;
        public CharSequence f;
        public CharSequence g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Rating f17129h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rating f17130i;
        public byte[] j;
        public Integer k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Uri f17131l;
        public Integer m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Integer f17132n;
        public Integer o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f17133p;
        public Boolean q;
        public Integer r;
        public Integer s;
        public Integer t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Integer f17134u;
        public Integer v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Integer f17135w;
        public CharSequence x;
        public CharSequence y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public CharSequence f17136z;

        public final void a(int i2, byte[] bArr) {
            if (this.j != null) {
                Integer numValueOf = Integer.valueOf(i2);
                int i3 = Util.f18979a;
                if (!numValueOf.equals(3) && Util.a(this.k, 3)) {
                    return;
                }
            }
            this.j = (byte[]) bArr.clone();
            this.k = Integer.valueOf(i2);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    static {
        int i2 = Util.f18979a;
        K0 = Integer.toString(0, 36);
        L0 = Integer.toString(1, 36);
        M0 = Integer.toString(2, 36);
        N0 = Integer.toString(3, 36);
        O0 = Integer.toString(4, 36);
        P0 = Integer.toString(5, 36);
        Q0 = Integer.toString(6, 36);
        R0 = Integer.toString(8, 36);
        S0 = Integer.toString(9, 36);
        T0 = Integer.toString(10, 36);
        U0 = Integer.toString(11, 36);
        V0 = Integer.toString(12, 36);
        W0 = Integer.toString(13, 36);
        X0 = Integer.toString(14, 36);
        Y0 = Integer.toString(15, 36);
        Z0 = Integer.toString(16, 36);
        a1 = Integer.toString(17, 36);
        b1 = Integer.toString(18, 36);
        c1 = Integer.toString(19, 36);
        d1 = Integer.toString(20, 36);
        e1 = Integer.toString(21, 36);
        f1 = Integer.toString(22, 36);
        g1 = Integer.toString(23, 36);
        h1 = Integer.toString(24, 36);
        i1 = Integer.toString(25, 36);
        j1 = Integer.toString(26, 36);
        k1 = Integer.toString(27, 36);
        l1 = Integer.toString(28, 36);
        m1 = Integer.toString(29, 36);
        n1 = Integer.toString(30, 36);
        o1 = Integer.toString(31, 36);
        p1 = Integer.toString(32, 36);
        q1 = Integer.toString(1000, 36);
        r1 = new d(9);
    }

    public MediaMetadata(Builder builder) {
        Boolean boolValueOf = builder.f17133p;
        Integer numValueOf = builder.o;
        Integer numValueOf2 = builder.f17124F;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i2 = 0;
                            break;
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                    i4 = i2;
                }
                numValueOf = Integer.valueOf(i4);
            }
        } else if (numValueOf != null) {
            boolean z2 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z2);
            if (z2 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i3 = 21;
                        break;
                    case 3:
                        i3 = 22;
                        break;
                    case 4:
                        i3 = 23;
                        break;
                    case 5:
                        i3 = 24;
                        break;
                    case 6:
                        i3 = 25;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i3);
            }
        }
        this.X = builder.f17125a;
        this.f17120Y = builder.f17126b;
        this.Z = builder.f17127c;
        this.e0 = builder.d;
        this.f0 = builder.f17128e;
        this.g0 = builder.f;
        this.h0 = builder.g;
        this.i0 = builder.f17129h;
        this.j0 = builder.f17130i;
        this.k0 = builder.j;
        this.l0 = builder.k;
        this.m0 = builder.f17131l;
        this.n0 = builder.m;
        this.o0 = builder.f17132n;
        this.p0 = numValueOf;
        this.q0 = boolValueOf;
        this.r0 = builder.q;
        Integer num = builder.r;
        this.s0 = num;
        this.t0 = num;
        this.u0 = builder.s;
        this.v0 = builder.t;
        this.w0 = builder.f17134u;
        this.x0 = builder.v;
        this.y0 = builder.f17135w;
        this.z0 = builder.x;
        this.A0 = builder.y;
        this.B0 = builder.f17136z;
        this.C0 = builder.f17121A;
        this.D0 = builder.f17122B;
        this.E0 = builder.C;
        this.F0 = builder.D;
        this.G0 = builder.f17123E;
        this.H0 = numValueOf2;
        this.I0 = builder.G;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f17125a = this.X;
        builder.f17126b = this.f17120Y;
        builder.f17127c = this.Z;
        builder.d = this.e0;
        builder.f17128e = this.f0;
        builder.f = this.g0;
        builder.g = this.h0;
        builder.f17129h = this.i0;
        builder.f17130i = this.j0;
        builder.j = this.k0;
        builder.k = this.l0;
        builder.f17131l = this.m0;
        builder.m = this.n0;
        builder.f17132n = this.o0;
        builder.o = this.p0;
        builder.f17133p = this.q0;
        builder.q = this.r0;
        builder.r = this.t0;
        builder.s = this.u0;
        builder.t = this.v0;
        builder.f17134u = this.w0;
        builder.v = this.x0;
        builder.f17135w = this.y0;
        builder.x = this.z0;
        builder.y = this.A0;
        builder.f17136z = this.B0;
        builder.f17121A = this.C0;
        builder.f17122B = this.D0;
        builder.C = this.E0;
        builder.D = this.F0;
        builder.f17123E = this.G0;
        builder.f17124F = this.H0;
        builder.G = this.I0;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaMetadata.class == obj.getClass()) {
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            if (Util.a(this.X, mediaMetadata.X) && Util.a(this.f17120Y, mediaMetadata.f17120Y) && Util.a(this.Z, mediaMetadata.Z) && Util.a(this.e0, mediaMetadata.e0) && Util.a(this.f0, mediaMetadata.f0) && Util.a(this.g0, mediaMetadata.g0) && Util.a(this.h0, mediaMetadata.h0) && Util.a(this.i0, mediaMetadata.i0) && Util.a(this.j0, mediaMetadata.j0) && Arrays.equals(this.k0, mediaMetadata.k0) && Util.a(this.l0, mediaMetadata.l0) && Util.a(this.m0, mediaMetadata.m0) && Util.a(this.n0, mediaMetadata.n0) && Util.a(this.o0, mediaMetadata.o0) && Util.a(this.p0, mediaMetadata.p0) && Util.a(this.q0, mediaMetadata.q0) && Util.a(this.r0, mediaMetadata.r0) && Util.a(this.t0, mediaMetadata.t0) && Util.a(this.u0, mediaMetadata.u0) && Util.a(this.v0, mediaMetadata.v0) && Util.a(this.w0, mediaMetadata.w0) && Util.a(this.x0, mediaMetadata.x0) && Util.a(this.y0, mediaMetadata.y0) && Util.a(this.z0, mediaMetadata.z0) && Util.a(this.A0, mediaMetadata.A0) && Util.a(this.B0, mediaMetadata.B0) && Util.a(this.C0, mediaMetadata.C0) && Util.a(this.D0, mediaMetadata.D0) && Util.a(this.E0, mediaMetadata.E0) && Util.a(this.F0, mediaMetadata.F0) && Util.a(this.G0, mediaMetadata.G0) && Util.a(this.H0, mediaMetadata.H0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.f17120Y, this.Z, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, Integer.valueOf(Arrays.hashCode(this.k0)), this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0});
    }
}
