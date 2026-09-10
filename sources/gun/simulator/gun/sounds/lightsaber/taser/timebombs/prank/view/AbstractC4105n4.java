package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.TrustedBiddingData;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC4105n4 {
    public static /* bridge */ /* synthetic */ Class D() {
        return CustomAudienceManager.class;
    }

    public static /* bridge */ /* synthetic */ AppSetId c(Object obj) {
        return (AppSetId) obj;
    }

    public static /* bridge */ /* synthetic */ AppSetIdManager d(Object obj) {
        return (AppSetIdManager) obj;
    }

    public static /* synthetic */ TrustedBiddingData.Builder q() {
        return new TrustedBiddingData.Builder();
    }

    public static /* bridge */ /* synthetic */ Class u() {
        return AppSetIdManager.class;
    }
}
