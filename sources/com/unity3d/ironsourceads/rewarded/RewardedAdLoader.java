package com.unity3d.ironsourceads.rewarded;

import com.ironsource.Bb;
import com.ironsource.C0269be;
import com.ironsource.C0410jc;
import com.ironsource.Eb;
import com.ironsource.R7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import lh.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class RewardedAdLoader {
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Executor f38483a = R7.f27125a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Bb loadTask) {
        n.f(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(RewardedAdRequest adRequest, RewardedAdLoaderListener listener) {
        n.f(adRequest, "adRequest");
        n.f(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f38483a, new C0269be(adRequest, listener, C0410jc.f28993e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, Eb loadTaskProvider) {
        n.f(executor, "executor");
        n.f(loadTaskProvider, "loadTaskProvider");
        executor.execute(new a(loadTaskProvider.a(), 2));
    }
}
