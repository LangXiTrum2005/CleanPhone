package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f12608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f12610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h20 f12613j;

    public b20(h20 h20Var, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.f12604a = str;
        this.f12605b = str2;
        this.f12606c = i10;
        this.f12607d = i11;
        this.f12608e = j10;
        this.f12609f = j11;
        this.f12610g = z10;
        this.f12611h = i12;
        this.f12612i = i13;
        this.f12613j = h20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapN = com.applovin.impl.ca.n(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapN.put("src", this.f12604a);
        mapN.put("cachedSrc", this.f12605b);
        mapN.put("bytesLoaded", Integer.toString(this.f12606c));
        mapN.put("totalBytes", Integer.toString(this.f12607d));
        mapN.put("bufferedDuration", Long.toString(this.f12608e));
        mapN.put("totalDuration", Long.toString(this.f12609f));
        mapN.put("cacheReady", true != this.f12610g ? "0" : "1");
        mapN.put("playerCount", Integer.toString(this.f12611h));
        mapN.put("playerPreparedCount", Integer.toString(this.f12612i));
        this.f12613j.r(mapN);
    }
}
