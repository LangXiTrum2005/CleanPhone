package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class E9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f26000n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<I9> f26001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J1 f26002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0561s2 f26007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26011k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private I9 f26012m;

    public E9() {
        this.f26001a = new ArrayList<>();
        this.f26002b = new J1();
        this.f26007g = new C0561s2();
    }

    public void a(I9 i10) {
        if (i10 != null) {
            this.f26001a.add(i10);
            if (this.f26012m == null) {
                this.f26012m = i10;
            } else if (i10.a(0)) {
                this.f26012m = i10;
            }
        }
    }

    public int b() {
        return this.f26006f;
    }

    public int c() {
        return this.f26003c;
    }

    public int d() {
        return this.f26005e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f26005e);
    }

    public boolean f() {
        return this.f26004d;
    }

    public C0561s2 g() {
        return this.f26007g;
    }

    public long h() {
        return this.f26009i;
    }

    public J1 i() {
        return this.f26002b;
    }

    public boolean j() {
        return this.f26008h;
    }

    public boolean k() {
        return this.f26010j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.f26011k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InterstitialConfigurations{parallelLoad=");
        sb2.append(this.f26003c);
        sb2.append(", bidderExclusive=");
        return defpackage.e.t(sb2, this.f26004d, '}');
    }

    public E9(int i10, boolean z10, int i11, J1 j10, C0561s2 c0561s2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14) {
        this.f26001a = new ArrayList<>();
        this.f26003c = i10;
        this.f26004d = z10;
        this.f26005e = i11;
        this.f26002b = j10;
        this.f26007g = c0561s2;
        this.f26010j = z12;
        this.f26011k = z13;
        this.f26006f = i12;
        this.f26008h = z11;
        this.f26009i = j11;
        this.l = z14;
    }

    public I9 a(String str) {
        for (I9 i10 : this.f26001a) {
            if (i10.c().equals(str)) {
                return i10;
            }
        }
        return null;
    }

    public I9 a() {
        for (I9 i10 : this.f26001a) {
            if (i10.d()) {
                return i10;
            }
        }
        return this.f26012m;
    }
}
