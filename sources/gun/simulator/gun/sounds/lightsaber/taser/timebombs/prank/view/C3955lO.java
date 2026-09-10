package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3955lO implements InterfaceC2538Kb {
    public static final C3955lO I = new C3955lO(new C3867kO());
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final Nd0 q0;
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Integer G;
    public final Bundle H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f4644a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final AbstractC4843vX h;
    public final AbstractC4843vX i;
    public final byte[] j;
    public final Integer k;
    public final Uri l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Boolean p;
    public final Boolean q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        int i = Ug0.f3833a;
        J = Integer.toString(0, 36);
        K = Integer.toString(1, 36);
        L = Integer.toString(2, 36);
        M = Integer.toString(3, 36);
        N = Integer.toString(4, 36);
        O = Integer.toString(5, 36);
        P = Integer.toString(6, 36);
        Q = Integer.toString(8, 36);
        R = Integer.toString(9, 36);
        S = Integer.toString(10, 36);
        T = Integer.toString(11, 36);
        U = Integer.toString(12, 36);
        V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        X = Integer.toString(15, 36);
        Y = Integer.toString(16, 36);
        Z = Integer.toString(17, 36);
        a0 = Integer.toString(18, 36);
        b0 = Integer.toString(19, 36);
        c0 = Integer.toString(20, 36);
        d0 = Integer.toString(21, 36);
        e0 = Integer.toString(22, 36);
        f0 = Integer.toString(23, 36);
        g0 = Integer.toString(24, 36);
        h0 = Integer.toString(25, 36);
        i0 = Integer.toString(26, 36);
        j0 = Integer.toString(27, 36);
        k0 = Integer.toString(28, 36);
        l0 = Integer.toString(29, 36);
        m0 = Integer.toString(30, 36);
        n0 = Integer.toString(31, 36);
        o0 = Integer.toString(32, 36);
        p0 = Integer.toString(1000, 36);
        q0 = new Nd0(29);
    }

    public C3955lO(C3867kO c3867kO) {
        Boolean boolValueOf = c3867kO.p;
        Integer numValueOf = c3867kO.o;
        Integer numValueOf2 = c3867kO.F;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
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
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f4644a = c3867kO.f4596a;
        this.b = c3867kO.b;
        this.c = c3867kO.c;
        this.d = c3867kO.d;
        this.e = c3867kO.e;
        this.f = c3867kO.f;
        this.g = c3867kO.g;
        this.h = c3867kO.h;
        this.i = c3867kO.i;
        this.j = c3867kO.j;
        this.k = c3867kO.k;
        this.l = c3867kO.l;
        this.m = c3867kO.m;
        this.n = c3867kO.n;
        this.o = numValueOf;
        this.p = boolValueOf;
        this.q = c3867kO.q;
        Integer num = c3867kO.r;
        this.r = num;
        this.s = num;
        this.t = c3867kO.s;
        this.u = c3867kO.t;
        this.v = c3867kO.u;
        this.w = c3867kO.v;
        this.x = c3867kO.w;
        this.y = c3867kO.x;
        this.z = c3867kO.y;
        this.A = c3867kO.z;
        this.B = c3867kO.A;
        this.C = c3867kO.B;
        this.D = c3867kO.C;
        this.E = c3867kO.D;
        this.F = c3867kO.E;
        this.G = numValueOf2;
        this.H = c3867kO.G;
    }

    public final C3867kO a() {
        C3867kO c3867kO = new C3867kO();
        c3867kO.f4596a = this.f4644a;
        c3867kO.b = this.b;
        c3867kO.c = this.c;
        c3867kO.d = this.d;
        c3867kO.e = this.e;
        c3867kO.f = this.f;
        c3867kO.g = this.g;
        c3867kO.h = this.h;
        c3867kO.i = this.i;
        c3867kO.j = this.j;
        c3867kO.k = this.k;
        c3867kO.l = this.l;
        c3867kO.m = this.m;
        c3867kO.n = this.n;
        c3867kO.o = this.o;
        c3867kO.p = this.p;
        c3867kO.q = this.q;
        c3867kO.r = this.s;
        c3867kO.s = this.t;
        c3867kO.t = this.u;
        c3867kO.u = this.v;
        c3867kO.v = this.w;
        c3867kO.w = this.x;
        c3867kO.x = this.y;
        c3867kO.y = this.z;
        c3867kO.z = this.A;
        c3867kO.A = this.B;
        c3867kO.B = this.C;
        c3867kO.C = this.D;
        c3867kO.D = this.E;
        c3867kO.E = this.F;
        c3867kO.F = this.G;
        c3867kO.G = this.H;
        return c3867kO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3955lO.class != obj.getClass()) {
            return false;
        }
        C3955lO c3955lO = (C3955lO) obj;
        return Ug0.a(this.f4644a, c3955lO.f4644a) && Ug0.a(this.b, c3955lO.b) && Ug0.a(this.c, c3955lO.c) && Ug0.a(this.d, c3955lO.d) && Ug0.a(this.e, c3955lO.e) && Ug0.a(this.f, c3955lO.f) && Ug0.a(this.g, c3955lO.g) && Ug0.a(this.h, c3955lO.h) && Ug0.a(this.i, c3955lO.i) && Arrays.equals(this.j, c3955lO.j) && Ug0.a(this.k, c3955lO.k) && Ug0.a(this.l, c3955lO.l) && Ug0.a(this.m, c3955lO.m) && Ug0.a(this.n, c3955lO.n) && Ug0.a(this.o, c3955lO.o) && Ug0.a(this.p, c3955lO.p) && Ug0.a(this.q, c3955lO.q) && Ug0.a(this.s, c3955lO.s) && Ug0.a(this.t, c3955lO.t) && Ug0.a(this.u, c3955lO.u) && Ug0.a(this.v, c3955lO.v) && Ug0.a(this.w, c3955lO.w) && Ug0.a(this.x, c3955lO.x) && Ug0.a(this.y, c3955lO.y) && Ug0.a(this.z, c3955lO.z) && Ug0.a(this.A, c3955lO.A) && Ug0.a(this.B, c3955lO.B) && Ug0.a(this.C, c3955lO.C) && Ug0.a(this.D, c3955lO.D) && Ug0.a(this.E, c3955lO.E) && Ug0.a(this.F, c3955lO.F) && Ug0.a(this.G, c3955lO.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4644a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(Arrays.hashCode(this.j)), this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f4644a;
        if (charSequence != null) {
            bundle.putCharSequence(J, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(K, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(L, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(M, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(N, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(O, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(P, charSequence7);
        }
        byte[] bArr = this.j;
        if (bArr != null) {
            bundle.putByteArray(S, bArr);
        }
        Uri uri = this.l;
        if (uri != null) {
            bundle.putParcelable(T, uri);
        }
        CharSequence charSequence8 = this.y;
        if (charSequence8 != null) {
            bundle.putCharSequence(e0, charSequence8);
        }
        CharSequence charSequence9 = this.z;
        if (charSequence9 != null) {
            bundle.putCharSequence(f0, charSequence9);
        }
        CharSequence charSequence10 = this.A;
        if (charSequence10 != null) {
            bundle.putCharSequence(g0, charSequence10);
        }
        CharSequence charSequence11 = this.D;
        if (charSequence11 != null) {
            bundle.putCharSequence(j0, charSequence11);
        }
        CharSequence charSequence12 = this.E;
        if (charSequence12 != null) {
            bundle.putCharSequence(k0, charSequence12);
        }
        CharSequence charSequence13 = this.F;
        if (charSequence13 != null) {
            bundle.putCharSequence(m0, charSequence13);
        }
        AbstractC4843vX abstractC4843vX = this.h;
        if (abstractC4843vX != null) {
            bundle.putBundle(Q, abstractC4843vX.toBundle());
        }
        AbstractC4843vX abstractC4843vX2 = this.i;
        if (abstractC4843vX2 != null) {
            bundle.putBundle(R, abstractC4843vX2.toBundle());
        }
        Integer num = this.m;
        if (num != null) {
            bundle.putInt(U, num.intValue());
        }
        Integer num2 = this.n;
        if (num2 != null) {
            bundle.putInt(V, num2.intValue());
        }
        Integer num3 = this.o;
        if (num3 != null) {
            bundle.putInt(W, num3.intValue());
        }
        Boolean bool = this.p;
        if (bool != null) {
            bundle.putBoolean(o0, bool.booleanValue());
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            bundle.putBoolean(X, bool2.booleanValue());
        }
        Integer num4 = this.s;
        if (num4 != null) {
            bundle.putInt(Y, num4.intValue());
        }
        Integer num5 = this.t;
        if (num5 != null) {
            bundle.putInt(Z, num5.intValue());
        }
        Integer num6 = this.u;
        if (num6 != null) {
            bundle.putInt(a0, num6.intValue());
        }
        Integer num7 = this.v;
        if (num7 != null) {
            bundle.putInt(b0, num7.intValue());
        }
        Integer num8 = this.w;
        if (num8 != null) {
            bundle.putInt(c0, num8.intValue());
        }
        Integer num9 = this.x;
        if (num9 != null) {
            bundle.putInt(d0, num9.intValue());
        }
        Integer num10 = this.B;
        if (num10 != null) {
            bundle.putInt(h0, num10.intValue());
        }
        Integer num11 = this.C;
        if (num11 != null) {
            bundle.putInt(i0, num11.intValue());
        }
        Integer num12 = this.k;
        if (num12 != null) {
            bundle.putInt(l0, num12.intValue());
        }
        Integer num13 = this.G;
        if (num13 != null) {
            bundle.putInt(n0, num13.intValue());
        }
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putBundle(p0, bundle2);
        }
        return bundle;
    }
}
