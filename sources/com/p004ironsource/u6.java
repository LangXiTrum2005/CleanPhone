package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class u6 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f27367p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g4 f27368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27370c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<h7> f27371e;
    private h7 f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o5 f27373i;
    private boolean j;
    private long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27374l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27375n;
    private long o;

    public u6() {
        this.f27368a = new g4();
        this.f27371e = new ArrayList<>();
    }

    public int a() {
        return this.f27369b;
    }

    public long b() {
        return this.f27370c;
    }

    public boolean c() {
        return this.d;
    }

    public o5 d() {
        return this.f27373i;
    }

    public long e() {
        return this.k;
    }

    public int f() {
        return this.f27372h;
    }

    public g4 g() {
        return this.f27368a;
    }

    public int h() {
        return this.g;
    }

    public h7 i() {
        for (h7 h7Var : this.f27371e) {
            if (h7Var.getIsDefault()) {
                return h7Var;
            }
        }
        h7 h7Var2 = this.f;
        return h7Var2 != null ? h7Var2 : new lb();
    }

    public long j() {
        return this.o;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.f27374l;
    }

    public boolean m() {
        return this.f27375n;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BannerConfigurations{parallelLoad=");
        sb.append(this.f27369b);
        sb.append(", bidderExclusive=");
        return a.r(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }

    public u6(int i2, long j, boolean z2, g4 g4Var, int i3, o5 o5Var, int i4, boolean z3, long j2, boolean z4, boolean z5, boolean z6, long j3) {
        this.f27371e = new ArrayList<>();
        this.f27369b = i2;
        this.f27370c = j;
        this.d = z2;
        this.f27368a = g4Var;
        this.g = i3;
        this.f27372h = i4;
        this.f27373i = o5Var;
        this.j = z3;
        this.k = j2;
        this.f27374l = z4;
        this.m = z5;
        this.f27375n = z6;
        this.o = j3;
    }

    public h7 a(String str) {
        for (h7 h7Var : this.f27371e) {
            if (h7Var.getPlacementName().equals(str)) {
                return h7Var;
            }
        }
        return null;
    }

    public void a(h7 h7Var) {
        if (h7Var != null) {
            this.f27371e.add(h7Var);
            if (this.f == null || h7Var.isPlacementId(0)) {
                this.f = h7Var;
            }
        }
    }
}
