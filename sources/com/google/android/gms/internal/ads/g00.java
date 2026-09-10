package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzj f14636i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14628a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14629b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14630c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14631d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14632e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14633f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14634g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14637j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14638k = 0;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14639m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f14640n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f14641o = new HashMap();

    public g00(String str, zzj zzjVar) {
        this.f14635h = str;
        this.f14636i = zzjVar;
    }

    public final void a(zzm zzmVar, long j10) {
        Bundle bundle;
        synchronized (this.f14633f) {
            try {
                zzj zzjVar = this.f14636i;
                long jZzm = zzjVar.zzm();
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f14629b == -1) {
                    if (jCurrentTimeMillis - jZzm > ((Long) zzba.zzc().a(am.L1)).longValue()) {
                        this.f14631d = -1;
                    } else {
                        this.f14631d = zzjVar.zzo();
                    }
                    this.f14629b = j10;
                    this.f14628a = j10;
                } else {
                    this.f14628a = j10;
                }
                if (((Boolean) zzba.zzc().a(am.F4)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.f14630c++;
                    int i10 = this.f14631d + 1;
                    this.f14631d = i10;
                    if (i10 == 0) {
                        this.f14632e = 0L;
                        zzjVar.zzp(jCurrentTimeMillis);
                    } else {
                        this.f14632e = jCurrentTimeMillis - zzjVar.zzq();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (((Boolean) nn.f17865a.o()).booleanValue()) {
            synchronized (this.f14633f) {
                this.f14630c--;
                this.f14631d--;
            }
        }
    }
}
