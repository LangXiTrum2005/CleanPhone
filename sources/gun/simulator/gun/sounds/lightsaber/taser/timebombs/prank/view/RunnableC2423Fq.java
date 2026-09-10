package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2423Fq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f3090a;
    public final /* synthetic */ Throwable b;

    public RunnableC2423Fq(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.f3090a = initListener;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3090a.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.b));
    }
}
