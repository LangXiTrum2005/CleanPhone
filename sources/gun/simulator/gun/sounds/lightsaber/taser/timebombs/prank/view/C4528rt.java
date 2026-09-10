package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4528rt implements AudienceNetworkAds.InitListener {
    public static C4528rt d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4952a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f4952a = false;
        this.b = initResult.isSuccess();
        ArrayList<C4616st> arrayList = this.c;
        for (C4616st c4616st : arrayList) {
            if (initResult.isSuccess()) {
                c4616st.f5003a.onInitializationSucceeded();
            } else {
                c4616st.f5003a.onInitializationFailed(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook").getMessage());
            }
        }
        arrayList.clear();
    }
}
