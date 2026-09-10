package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f20 f22461e;

    public z10(f20 f20Var, String str, String str2, int i10, int i11) {
        this.f22457a = str;
        this.f22458b = str2;
        this.f22459c = i10;
        this.f22460d = i11;
        this.f22461e = f20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapN = com.applovin.impl.ca.n(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapN.put("src", this.f22457a);
        mapN.put("cachedSrc", this.f22458b);
        mapN.put("bytesLoaded", Integer.toString(this.f22459c));
        mapN.put("totalBytes", Integer.toString(this.f22460d));
        mapN.put("cacheReady", "0");
        this.f22461e.r(mapN);
    }
}
