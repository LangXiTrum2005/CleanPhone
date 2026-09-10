package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21307b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p9.a f21311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uo0 f21312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21313h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21309d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21310e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Random f21314i = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21308c = 0;

    public vx0(long j10, long j11, p9.a aVar, uo0 uo0Var) {
        this.f21306a = j10;
        this.f21307b = j11;
        this.f21312g = uo0Var;
        this.f21311f = aVar;
        a();
    }

    public final synchronized void a() {
        this.f21313h = this.f21306a;
        this.f21308c = 0L;
        this.f21310e = 0L;
    }

    public final synchronized long b() {
        long j10;
        long j11;
        double d10 = this.f21313h;
        double d11 = 0.2d * d10;
        j10 = (long) (d10 + d11);
        j11 = (long) (d10 - d11);
        return j11 + ((long) (this.f21314i.nextDouble() * ((j10 - j11) + 1)));
    }

    public final synchronized void c() {
        long jB = b();
        ((p9.b) this.f21311f).getClass();
        this.f21310e = System.currentTimeMillis() + jB;
        double d10 = this.f21313h;
        long j10 = this.f21307b;
        this.f21313h = Math.min((long) (d10 + d10), j10);
        this.f21308c++;
        if (((Boolean) zzba.zzc().a(am.M)).booleanValue()) {
            this.f21312g.p(System.currentTimeMillis(), this.f21308c, this.f21313h, this.f21309d, j10);
        }
    }

    public final synchronized boolean d() {
        ul ulVar = am.N;
        if (((Integer) zzba.zzc().a(ulVar)).intValue() < 0) {
            return false;
        }
        return this.f21308c > Math.max(this.f21309d, (long) ((Integer) zzba.zzc().a(ulVar)).intValue()) && this.f21313h >= this.f21307b;
    }
}
