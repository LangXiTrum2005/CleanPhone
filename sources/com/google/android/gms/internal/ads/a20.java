package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f11811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e20 f11814k;

    public a20(e20 e20Var, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.f11804a = str;
        this.f11805b = str2;
        this.f11806c = j10;
        this.f11807d = j11;
        this.f11808e = j12;
        this.f11809f = j13;
        this.f11810g = j14;
        this.f11811h = z10;
        this.f11812i = i10;
        this.f11813j = i11;
        this.f11814k = e20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapN = com.applovin.impl.ca.n(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapN.put("src", this.f11804a);
        mapN.put("cachedSrc", this.f11805b);
        mapN.put("bufferedDuration", Long.toString(this.f11806c));
        mapN.put("totalDuration", Long.toString(this.f11807d));
        if (((Boolean) zzba.zzc().a(am.G2)).booleanValue()) {
            mapN.put("qoeLoadedBytes", Long.toString(this.f11808e));
            mapN.put("qoeCachedBytes", Long.toString(this.f11809f));
            mapN.put("totalBytes", Long.toString(this.f11810g));
            ((p9.b) zzt.zzk()).getClass();
            mapN.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        mapN.put("cacheReady", true != this.f11811h ? "0" : "1");
        mapN.put("playerCount", Integer.toString(this.f11812i));
        mapN.put("playerPreparedCount", Integer.toString(this.f11813j));
        this.f11814k.r(mapN);
    }
}
