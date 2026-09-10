package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0561s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f30191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f30200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f30201k;
    private long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f30203n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30205p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f30206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f30207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f30208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f30209t;

    public C0561s2() {
        this.f30192b = "";
        this.f30193c = "";
        this.f30194d = "";
        this.f30199i = 0L;
        this.f30200j = 0L;
        this.f30201k = 0L;
        this.l = 0L;
        this.f30202m = true;
        this.f30203n = new ArrayList<>();
        this.f30197g = 0;
        this.f30204o = false;
        this.f30205p = false;
        this.f30206q = 1;
    }

    public String a() {
        return this.f30192b;
    }

    public long b() {
        return this.f30200j;
    }

    public int c() {
        return this.f30196f;
    }

    public int d() {
        return this.f30206q;
    }

    public boolean e() {
        return this.f30202m;
    }

    public ArrayList<String> f() {
        return this.f30203n;
    }

    public int g() {
        return this.f30195e;
    }

    public boolean h() {
        return this.f30191a;
    }

    public int i() {
        return this.f30197g;
    }

    public long j() {
        return this.f30201k;
    }

    public long k() {
        return this.f30199i;
    }

    public long l() {
        return this.l;
    }

    public long m() {
        return this.f30198h;
    }

    public boolean n() {
        return this.f30209t;
    }

    public boolean o() {
        return this.f30204o;
    }

    public boolean p() {
        return this.f30205p;
    }

    public boolean q() {
        return this.f30208s;
    }

    public boolean r() {
        return this.f30207r;
    }

    public String a(boolean z10) {
        return z10 ? this.f30194d : this.f30193c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30203n.add(str);
    }

    public C0561s2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f30192b = str;
        this.f30193c = str2;
        this.f30194d = str3;
        this.f30195e = i10;
        this.f30196f = i11;
        this.f30198h = j10;
        this.f30191a = z13;
        this.f30199i = j11;
        this.f30200j = j12;
        this.f30201k = j13;
        this.l = j14;
        this.f30202m = z10;
        this.f30197g = i12;
        this.f30203n = new ArrayList<>();
        this.f30204o = z11;
        this.f30205p = z12;
        this.f30206q = i13;
        this.f30207r = z14;
        this.f30208s = z15;
        this.f30209t = z16;
    }
}
