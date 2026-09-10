package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.ads.UnityAdsImplementation;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Gf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3130a;
    public final /* synthetic */ IUnityAdsInitializationListener b;

    public /* synthetic */ Gf0(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i) {
        this.f3130a = i;
        this.b = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3130a;
        IUnityAdsInitializationListener iUnityAdsInitializationListener = this.b;
        switch (i) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(iUnityAdsInitializationListener);
                break;
            default:
                iUnityAdsInitializationListener.onInitializationComplete();
                break;
        }
    }
}
