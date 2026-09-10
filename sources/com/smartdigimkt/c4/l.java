package com.smartdigimkt.c4;

import com.smartdigimkt.p4.s;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f34283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f34284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34285c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34286e;
    public int f;
    public long[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f34287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f34288i;
    public int[] j;
    public long[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f34289l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f34290n;
    public k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34291p;
    public s q;
    public boolean r;
    public long s;

    public void a() {
        this.f34286e = 0;
        this.s = 0L;
        this.m = false;
        this.r = false;
        this.o = null;
    }

    public void b(int i2) {
        s sVar = this.q;
        if (sVar == null || sVar.d() < i2) {
            this.q = new s(i2);
        }
        this.f34291p = i2;
        this.m = true;
        this.r = true;
    }

    public void a(int i2, int i3) {
        this.f34286e = i2;
        this.f = i3;
        int[] iArr = this.f34287h;
        if (iArr == null || iArr.length < i2) {
            this.g = new long[i2];
            this.f34287h = new int[i2];
        }
        int[] iArr2 = this.f34288i;
        if (iArr2 == null || iArr2.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.f34288i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.f34289l = new boolean[i4];
            this.f34290n = new boolean[i4];
        }
    }

    public void a(com.smartdigimkt.b4.f fVar) throws InterruptedException, IOException {
        fVar.c(this.q.f37616a, 0, this.f34291p);
        this.q.e(0);
        this.r = false;
    }

    public void a(s sVar) {
        sVar.a(this.q.f37616a, 0, this.f34291p);
        this.q.e(0);
        this.r = false;
    }

    public long a(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }
}
