package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.zza;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements ta0, zza, mb0, na0, da0, wb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9.a f22192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00 f22193b;

    public y80(p9.a aVar, b00 b00Var) {
        this.f22192a = aVar;
        this.f22193b = b00Var;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            try {
                if (b00Var.f12584k != -1) {
                    LinkedList linkedList = b00Var.f12576c;
                    if (!linkedList.isEmpty()) {
                        a00 a00Var = (a00) linkedList.getLast();
                        if (a00Var.f11794b == -1) {
                            ((p9.b) a00Var.f11795c.f12574a).getClass();
                            a00Var.f11794b = SystemClock.elapsedRealtime();
                            b00Var.f12575b.a(b00Var);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void e(tk tkVar) {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            h00 h00Var = b00Var.f12575b;
            synchronized (h00Var.f15012a) {
                h00Var.f15015d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            try {
                if (b00Var.f12584k != -1 && b00Var.f12580g == -1) {
                    ((p9.b) b00Var.f12574a).getClass();
                    b00Var.f12580g = SystemClock.elapsedRealtime();
                    b00Var.f12575b.a(b00Var);
                }
                h00 h00Var = b00Var.f12575b;
                synchronized (h00Var.f15012a) {
                    g00 g00Var = h00Var.f15015d;
                    synchronized (g00Var.f14633f) {
                        g00Var.f14638k++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            if (b00Var.f12584k != -1) {
                a00 a00Var = new a00(b00Var);
                ((p9.b) a00Var.f11795c.f12574a).getClass();
                a00Var.f11793a = SystemClock.elapsedRealtime();
                b00Var.f12576c.add(a00Var);
                b00Var.f12582i++;
                h00 h00Var = b00Var.f12575b;
                synchronized (h00Var.f15012a) {
                    g00 g00Var = h00Var.f15015d;
                    synchronized (g00Var.f14633f) {
                        g00Var.f14637j++;
                    }
                }
                h00Var.a(b00Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void u0(tk tkVar) {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            h00 h00Var = b00Var.f12575b;
            synchronized (h00Var.f15012a) {
                h00Var.f15015d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        p9.a aVar = this.f22192a;
        b00 b00Var = this.f22193b;
        ((p9.b) aVar).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (b00Var.f12577d) {
            try {
                b00Var.f12584k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    b00Var.f12575b.a(b00Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        b00 b00Var = this.f22193b;
        synchronized (b00Var.f12577d) {
            try {
                if (b00Var.f12584k != -1) {
                    ((p9.b) b00Var.f12574a).getClass();
                    b00Var.f12581h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void Y(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void b0(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
    }

    @Override // com.google.android.gms.internal.ads.wb0
    public final void v0(tk tkVar) {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
    }
}
