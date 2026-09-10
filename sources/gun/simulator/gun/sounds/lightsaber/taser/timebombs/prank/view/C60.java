package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.show.ShowOperationState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2909a;
    public final /* synthetic */ ShowOperationState b;
    public final /* synthetic */ UnityAds.UnityAdsShowError c;
    public final /* synthetic */ String d;

    public /* synthetic */ C60(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i) {
        this.f2909a = i;
        this.b = showOperationState;
        this.c = unityAdsShowError;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2909a;
        ShowOperationState showOperationState = this.b;
        String str = this.d;
        UnityAds.UnityAdsShowError unityAdsShowError = this.c;
        switch (i) {
            case 0:
                showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
                break;
            default:
                showOperationState.lambda$onUnityAdsShowFailure$0(unityAdsShowError, str);
                break;
        }
    }
}
