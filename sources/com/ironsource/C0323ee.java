package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0323ee {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f28532o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<C0358gd> f28533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J1 f28534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f28540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28543k;
    private C0358gd l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0561s2 f28544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28545n;

    public C0323ee() {
        this.f28533a = new ArrayList<>();
        this.f28534b = new J1();
    }

    public void a(C0358gd c0358gd) {
        if (c0358gd != null) {
            this.f28533a.add(c0358gd);
            if (this.l == null) {
                this.l = c0358gd;
            } else if (c0358gd.a(0)) {
                this.l = c0358gd;
            }
        }
    }

    public int b() {
        return this.f28539g;
    }

    public int c() {
        return this.f28538f;
    }

    public boolean d() {
        return this.f28545n;
    }

    public ArrayList<C0358gd> e() {
        return this.f28533a;
    }

    public boolean f() {
        return this.f28541i;
    }

    public int g() {
        return this.f28535c;
    }

    public int h() {
        return this.f28537e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f28537e);
    }

    public boolean j() {
        return this.f28536d;
    }

    public C0561s2 k() {
        return this.f28544m;
    }

    public long l() {
        return this.f28540h;
    }

    public J1 m() {
        return this.f28534b;
    }

    public boolean n() {
        return this.f28543k;
    }

    public boolean o() {
        return this.f28542j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardedVideoConfigurations{parallelLoad=");
        sb2.append(this.f28535c);
        sb2.append(", bidderExclusive=");
        return defpackage.e.t(sb2, this.f28536d, '}');
    }

    public C0323ee(int i10, boolean z10, int i11, int i12, J1 j10, C0561s2 c0561s2, int i13, boolean z11, long j11, boolean z12, boolean z13, boolean z14) {
        this.f28533a = new ArrayList<>();
        this.f28535c = i10;
        this.f28536d = z10;
        this.f28537e = i11;
        this.f28534b = j10;
        this.f28538f = i12;
        this.f28544m = c0561s2;
        this.f28539g = i13;
        this.f28545n = z11;
        this.f28540h = j11;
        this.f28541i = z12;
        this.f28542j = z13;
        this.f28543k = z14;
    }

    public C0358gd a(String str) {
        for (C0358gd c0358gd : this.f28533a) {
            if (c0358gd.c().equals(str)) {
                return c0358gd;
            }
        }
        return null;
    }

    public C0358gd a() {
        for (C0358gd c0358gd : this.f28533a) {
            if (c0358gd.d()) {
                return c0358gd;
            }
        }
        return this.l;
    }
}
