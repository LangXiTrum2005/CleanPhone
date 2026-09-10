package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vu1 f15109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rw1 f15110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f15111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15112e = new AtomicBoolean(false);

    public h40(ScheduledExecutorService scheduledExecutorService) {
        this.f15111d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strC = a.a.x("GET_VARIATIONS_HEADER") ? r4.g.c() : null;
            if (strC != null && !strC.isEmpty()) {
                this.f15108a = strC;
                byte[] bArrDecode = Base64.decode(strC, 10);
                this.f15109b = vu1.z(bArrDecode, ks1.a());
                if (((Boolean) zzba.zzc().a(am.f12286oa)).booleanValue()) {
                    this.f15110c = rw1.z(bArrDecode, ks1.a());
                }
                if (((Boolean) zzba.zzc().a(am.f12257ma)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(am.f12243la)).booleanValue()) {
                        this.f15111d.schedule(new d(this, 27), ((Integer) zzba.zzc().a(am.f12271na)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (et1 | IllegalArgumentException e10) {
            zzt.zzh().e("ChromeVariations", e10);
        }
    }
}
