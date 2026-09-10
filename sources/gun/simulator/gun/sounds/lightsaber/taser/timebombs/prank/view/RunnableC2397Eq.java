package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2397Eq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3042a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MultithreadedBundleWrapper c;
    public final /* synthetic */ AudienceNetworkAds.InitListener d;

    public RunnableC2397Eq(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z) {
        this.f3042a = context;
        this.b = z;
        this.c = multithreadedBundleWrapper;
        this.d = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f3042a);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoaderDoMakeLoader = null;
            th = null;
            for (int i = 0; i < 3; i++) {
                try {
                    dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.f3042a, false);
                    break;
                } catch (Throwable th2) {
                    if (i == 2) {
                        try {
                            if (!this.b) {
                                DexLoadErrorReporter.reportDexLoadingIssue(this.f3042a, DynamicLoaderFactory.createErrorMessage(th2), 0.1d);
                                DynamicLoaderFactory.setFallbackMode(true);
                            }
                            th = th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } else {
                        SystemClock.sleep(200L);
                    }
                }
            }
            dynamicLoader = dynamicLoaderDoMakeLoader;
        }
        DynamicLoaderFactory.doCallInitialize(this.f3042a, dynamicLoader, th, this.b, this.c, this.d);
        DynamicLoaderFactory.sInitializing.set(false);
    }
}
