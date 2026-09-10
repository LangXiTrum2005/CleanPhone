package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f18064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18065h;

    public o0(int i10) {
        switch (i10) {
            case 1:
                this.f18064g = new boolean[15];
                break;
            default:
                this.f18064g = new boolean[15];
                break;
        }
    }

    public boolean a() {
        return this.f18061d > 15 && this.f18065h == 0;
    }

    public void b(long j10) {
        long j11 = this.f18061d;
        if (j11 == 0) {
            this.f18058a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f18058a;
            this.f18059b = j12;
            this.f18063f = j12;
            this.f18062e = 1L;
        } else {
            long j13 = j10 - this.f18060c;
            int i10 = (int) (j11 % 15);
            long jAbs = Math.abs(j13 - this.f18059b);
            boolean[] zArr = this.f18064g;
            if (jAbs <= 1000000) {
                this.f18062e++;
                this.f18063f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f18065h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f18065h++;
            }
        }
        this.f18061d++;
        this.f18060c = j10;
    }

    public void c() {
        this.f18061d = 0L;
        this.f18062e = 0L;
        this.f18063f = 0L;
        this.f18065h = 0;
        Arrays.fill(this.f18064g, false);
    }

    public void d() {
        this.f18061d = 0L;
        this.f18062e = 0L;
        this.f18063f = 0L;
        this.f18065h = 0;
        Arrays.fill(this.f18064g, false);
    }

    public boolean e() {
        return this.f18061d > 15 && this.f18065h == 0;
    }

    public void f(long j10) {
        long j11 = this.f18061d;
        if (j11 == 0) {
            this.f18058a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f18058a;
            this.f18059b = j12;
            this.f18063f = j12;
            this.f18062e = 1L;
        } else {
            long j13 = j10 - this.f18060c;
            long jAbs = Math.abs(j13 - this.f18059b);
            int i10 = (int) (j11 % 15);
            boolean[] zArr = this.f18064g;
            if (jAbs <= 1000000) {
                this.f18062e++;
                this.f18063f += j13;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f18065h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f18065h++;
            }
        }
        this.f18061d++;
        this.f18060c = j10;
    }
}
