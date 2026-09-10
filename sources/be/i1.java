package be;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 {
    public static final y0 A;
    public static final i B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f5623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f5624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c1 f5625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f5626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a1 f5627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a1 f5628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a1 f5629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y0 f5630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y0 f5631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y0 f5632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g0 f5633k;
    public static final a1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l0 f5634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m0 f5635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n0 f5636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y0 f5637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y0 f5638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y0 f5639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y0 f5640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y0 f5641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y0 f5642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y0 f5643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y0 f5644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f5645x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y0 f5646y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final m f5647z;

    static {
        int i10 = 0;
        f5623a = new y0(Class.class, new p0().a(), i10);
        f5624b = new y0(BitSet.class, new z0().a(), i10);
        b1 b1Var = new b1();
        f5625c = new c1();
        f5626d = new a1(Boolean.TYPE, Boolean.class, b1Var);
        f5627e = new a1(Byte.TYPE, Byte.class, new d1());
        f5628f = new a1(Short.TYPE, Short.class, new e1());
        f5629g = new a1(Integer.TYPE, Integer.class, new f1());
        int i11 = 0;
        f5630h = new y0(AtomicInteger.class, new g1().a(), i11);
        f5631i = new y0(AtomicBoolean.class, new h1().a(), i11);
        f5632j = new y0(AtomicIntegerArray.class, new f0().a(), i11);
        f5633k = new g0();
        new h0();
        new i0();
        l = new a1(Character.TYPE, Character.class, new j0());
        k0 k0Var = new k0();
        f5634m = new l0();
        f5635n = new m0();
        f5636o = new n0();
        int i12 = 0;
        f5637p = new y0(String.class, k0Var, i12);
        f5638q = new y0(StringBuilder.class, new o0(), i12);
        f5639r = new y0(StringBuffer.class, new q0(), i12);
        f5640s = new y0(URL.class, new r0(), i12);
        f5641t = new y0(URI.class, new s0(), i12);
        f5642u = new y0(InetAddress.class, new t0(), 1);
        int i13 = 0;
        f5643v = new y0(UUID.class, new u0(), i13);
        f5644w = new y0(Currency.class, new v0().a(), i13);
        f5645x = new s(new w0(), 2);
        f5646y = new y0(Locale.class, new x0(), 0);
        m mVar = m.f5656a;
        f5647z = mVar;
        A = new y0(com.google.gson.g.class, mVar, 1);
        B = j.f5648d;
    }
}
