package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class U2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f27264p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J1 f27265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<C0312e3> f27269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0312e3 f27270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0561s2 f27273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f27275k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f27278o;

    public U2() {
        this.f27265a = new J1();
        this.f27269e = new ArrayList<>();
    }

    public int a() {
        return this.f27266b;
    }

    public long b() {
        return this.f27267c;
    }

    public boolean c() {
        return this.f27268d;
    }

    public C0561s2 d() {
        return this.f27273i;
    }

    public long e() {
        return this.f27275k;
    }

    public int f() {
        return this.f27272h;
    }

    public J1 g() {
        return this.f27265a;
    }

    public int h() {
        return this.f27271g;
    }

    public C0312e3 i() {
        for (C0312e3 c0312e3 : this.f27269e) {
            if (c0312e3.d()) {
                return c0312e3;
            }
        }
        C0312e3 c0312e4 = this.f27270f;
        return c0312e4 != null ? c0312e4 : new C0403j5();
    }

    public long j() {
        return this.f27278o;
    }

    public boolean k() {
        return this.f27274j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.f27277n;
    }

    public boolean n() {
        return this.f27276m;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb2.append(this.f27266b);
        sb2.append(", bidderExclusive=");
        return defpackage.e.t(sb2, this.f27268d, '}');
    }

    public void a(C0312e3 c0312e3) {
        if (c0312e3 != null) {
            this.f27269e.add(c0312e3);
            if (this.f27270f == null) {
                this.f27270f = c0312e3;
            } else if (c0312e3.a(0)) {
                this.f27270f = c0312e3;
            }
        }
    }

    public U2(int i10, long j10, boolean z10, J1 j11, int i11, C0561s2 c0561s2, int i12, boolean z11, long j12, boolean z12, boolean z13, boolean z14, long j13) {
        this.f27269e = new ArrayList<>();
        this.f27266b = i10;
        this.f27267c = j10;
        this.f27268d = z10;
        this.f27265a = j11;
        this.f27271g = i11;
        this.f27272h = i12;
        this.f27273i = c0561s2;
        this.f27274j = z11;
        this.f27275k = j12;
        this.l = z12;
        this.f27276m = z13;
        this.f27277n = z14;
        this.f27278o = j13;
    }

    public C0312e3 a(String str) {
        for (C0312e3 c0312e3 : this.f27269e) {
            if (c0312e3.c().equals(str)) {
                return c0312e3;
            }
        }
        return null;
    }
}
