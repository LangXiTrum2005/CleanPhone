package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends mu1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p9.a f16036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yh0 f16037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ScheduledFuture f16043k;
    public ScheduledFuture l;

    public jb0(ScheduledExecutorService scheduledExecutorService, p9.a aVar, yh0 yh0Var) {
        super(Collections.EMPTY_SET);
        this.f16038f = -1L;
        this.f16039g = -1L;
        this.f16040h = -1L;
        this.f16041i = -1L;
        this.f16042j = false;
        this.f16035c = scheduledExecutorService;
        this.f16036d = aVar;
        this.f16037e = yh0Var;
    }

    public final synchronized void X0(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
        sb2.append("In scheduleRefresh: ");
        sb2.append(i10);
        zze.zza(sb2.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f16042j) {
                long j10 = this.f16040h;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f16040h = millis;
                return;
            }
            ((p9.b) this.f16036d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) zzba.zzc().a(am.Ve)).booleanValue()) {
                long j11 = this.f16038f;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    Z0(millis);
                    if (((Boolean) zzba.zzc().a(am.tf)).booleanValue()) {
                        lj1 lj1VarA = this.f16037e.a();
                        lj1VarA.l("action", "rtnc");
                        lj1VarA.r();
                    }
                }
            } else {
                long j12 = this.f16038f;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    Z0(millis);
                }
            }
        }
    }

    public final synchronized void Y0(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 28);
        sb2.append("In scheduleShowRefreshedAd: ");
        sb2.append(i10);
        zze.zza(sb2.toString());
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.f16042j) {
                long j10 = this.f16041i;
                if (j10 <= 0 || millis >= j10) {
                    millis = j10;
                }
                this.f16041i = millis;
                return;
            }
            ((p9.b) this.f16036d).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) zzba.zzc().a(am.Ve)).booleanValue()) {
                if (jElapsedRealtime == this.f16039g) {
                    zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j11 = this.f16039g;
                if (jElapsedRealtime >= j11 || j11 - jElapsedRealtime > millis) {
                    a1(millis);
                }
            } else {
                long j12 = this.f16039g;
                if (jElapsedRealtime > j12 || j12 - jElapsedRealtime > millis) {
                    a1(millis);
                }
            }
        }
    }

    public final synchronized void Z0(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.f16043k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f16043k.cancel(false);
            }
            ((p9.b) this.f16036d).getClass();
            this.f16038f = SystemClock.elapsedRealtime() + j10;
            this.f16043k = this.f16035c.schedule(new hb0(this, 0), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a1(long j10) {
        try {
            ScheduledFuture scheduledFuture = this.l;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.l.cancel(false);
            }
            ((p9.b) this.f16036d).getClass();
            this.f16039g = SystemClock.elapsedRealtime() + j10;
            this.l = this.f16035c.schedule(new hb0(this, 1), j10, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        this.f16042j = false;
        Z0(0L);
    }
}
