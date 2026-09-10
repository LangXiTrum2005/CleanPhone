package com.p004ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26338c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26339e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f26340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f26341i;
    private long j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f26342l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f26343n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26344p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;

    public o5() {
        this.f26337b = "";
        this.f26338c = "";
        this.d = "";
        this.f26341i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.f26342l = 0L;
        this.m = true;
        this.f26343n = new ArrayList<>();
        this.g = 0;
        this.o = false;
        this.f26344p = false;
        this.q = 1;
    }

    public String a() {
        return this.f26337b;
    }

    public long b() {
        return this.j;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.q;
    }

    public boolean e() {
        return this.m;
    }

    public ArrayList<String> f() {
        return this.f26343n;
    }

    public int g() {
        return this.f26339e;
    }

    public boolean h() {
        return this.f26336a;
    }

    public int i() {
        return this.g;
    }

    public long j() {
        return this.k;
    }

    public long k() {
        return this.f26341i;
    }

    public long l() {
        return this.f26342l;
    }

    public long m() {
        return this.f26340h;
    }

    public boolean n() {
        return this.t;
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.f26344p;
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.r;
    }

    public o5(String str, String str2, String str3, int i2, int i3, long j, long j2, long j3, long j4, long j5, boolean z2, int i4, boolean z3, boolean z4, boolean z5, int i5, boolean z6, boolean z7, boolean z8) {
        this.f26337b = str;
        this.f26338c = str2;
        this.d = str3;
        this.f26339e = i2;
        this.f = i3;
        this.f26340h = j;
        this.f26336a = z5;
        this.f26341i = j2;
        this.j = j3;
        this.k = j4;
        this.f26342l = j5;
        this.m = z2;
        this.g = i4;
        this.f26343n = new ArrayList<>();
        this.o = z3;
        this.f26344p = z4;
        this.q = i5;
        this.r = z6;
        this.s = z7;
        this.t = z8;
    }

    public String a(boolean z2) {
        return z2 ? this.d : this.f26338c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26343n.add(str);
    }
}
