package com.p004ironsource.mediationsdk.sdk;

import android.content.Context;
import com.p004ironsource.kn;
import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.ri;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface IronSourceInterface extends kn, ri {
    void clearRewardedVideoServerParameters();

    String getAdvertiserId(Context context);

    InterstitialPlacement getInterstitialPlacementInfo(String str);

    Placement getRewardedVideoPlacementInfo(String str);

    void removeInterstitialListener();

    void removeRewardedVideoListener();

    void setAdaptersDebug(boolean z2);

    boolean setDynamicUserId(String str);

    void setMediationType(String str);

    void setRewardedVideoServerParameters(Map<String, String> map);

    void shouldTrackNetworkState(Context context, boolean z2);
}
