package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout;
import com.unity3d.services.ads.operation.load.LoadOperationState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class GI implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3115a;
    public final /* synthetic */ LoadOperationState b;

    public /* synthetic */ GI(LoadOperationState loadOperationState, int i) {
        this.f3115a = i;
        this.b = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3115a;
        LoadOperationState loadOperationState = this.b;
        switch (i) {
            case 0:
                LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(loadOperationState);
                break;
            default:
                loadOperationState.lambda$onUnityAdsAdLoaded$1();
                break;
        }
    }
}
