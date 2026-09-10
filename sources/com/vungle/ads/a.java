package com.vungle.ads;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ VungleThreadPoolExecutor f42859Y;

    public /* synthetic */ a(VungleThreadPoolExecutor vungleThreadPoolExecutor, int i2) {
        this.X = i2;
        this.f42859Y = vungleThreadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                AnalyticsClient.m3137initOrUpdate$lambda1(this.f42859Y);
                break;
            case 1:
                VungleThreadPoolExecutor.m3212submit$lambda2(this.f42859Y);
                break;
            case 2:
                VungleThreadPoolExecutor.m3210execute$lambda0(this.f42859Y);
                break;
            default:
                VungleThreadPoolExecutor.m3211submit$lambda1(this.f42859Y);
                break;
        }
    }
}
