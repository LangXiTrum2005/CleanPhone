package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3733s2 {
    private boolean a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private boolean m;
    private ArrayList<String> n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;

    public C3733s2() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = true;
        this.n = new ArrayList<>();
        this.g = 0;
        this.o = false;
        this.p = false;
        this.q = 1;
    }

    public String a() {
        return this.b;
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
        return this.n;
    }

    public int g() {
        return this.e;
    }

    public boolean h() {
        return this.a;
    }

    public int i() {
        return this.g;
    }

    public long j() {
        return this.k;
    }

    public long k() {
        return this.i;
    }

    public long l() {
        return this.l;
    }

    public long m() {
        return this.h;
    }

    public boolean n() {
        return this.t;
    }

    public boolean o() {
        return this.o;
    }

    public boolean p() {
        return this.p;
    }

    public boolean q() {
        return this.s;
    }

    public boolean r() {
        return this.r;
    }

    public String a(boolean z) {
        return z ? this.d : this.c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.n.add(str);
    }

    public C3733s2(String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.h = j;
        this.a = z4;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = j5;
        this.m = z;
        this.g = i3;
        this.n = new ArrayList<>();
        this.o = z2;
        this.p = z3;
        this.q = i4;
        this.r = z5;
        this.s = z6;
        this.t = z7;
    }
}
