package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;

/* JADX INFO: loaded from: classes6.dex */
public final class q6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager$DiskCachedAd f41388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r6 f41389b;

    public q6(r6 r6Var, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd) {
        this.f41389b = r6Var;
        this.f41388a = diskAdCacheManager$DiskCachedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = this.f41388a;
            if (diskAdCacheManager$DiskCachedAd == null) {
                r6 r6Var = this.f41389b;
                a0.a(r6Var.f41426a, r6Var.f41428c, null, true);
                return;
            }
            if (diskAdCacheManager$DiskCachedAd.a() != null && this.f41388a.a().isReady()) {
                if (this.f41388a.a().hasAdCacheTtlPassed()) {
                    r6 r6Var2 = this.f41389b;
                    a0.a(r6Var2.f41426a, r6Var2.f41428c, null, true);
                    return;
                } else {
                    r6 r6Var3 = this.f41389b;
                    t6.a(r6Var3.f41426a, this.f41388a, r6Var3.d, r6Var3.f41428c);
                    return;
                }
            }
            r6 r6Var4 = this.f41389b;
            a0.a(r6Var4.f41426a, r6Var4.f41428c, null, true);
        } catch (Throwable th) {
            g9.a(th);
            r6 r6Var5 = this.f41389b;
            a0.a(r6Var5.f41426a, r6Var5.f41428c, null, true);
        }
    }
}
