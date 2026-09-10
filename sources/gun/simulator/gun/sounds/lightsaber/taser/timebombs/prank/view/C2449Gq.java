package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2449Gq implements AudienceNetworkAds.InitResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f3141a;

    public C2449Gq(Throwable th) {
        this.f3141a = th;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return DynamicLoaderFactory.createErrorMessage(this.f3141a);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return false;
    }
}
