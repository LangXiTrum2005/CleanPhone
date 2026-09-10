package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.p004ironsource.sv;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "", "onAdCached", "", "placementName", "", "loadId", "winningBidInfo", "", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationAdException;", sv.f, sv.g, "onAdImpressionRecorded", sv.f27218i, "onAdShown", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HeliumFullscreenAdListener {
    void onAdCached(String placementName, String loadId, Map<String, String> winningBidInfo, ChartboostMediationAdException error);

    void onAdClicked(String placementName);

    void onAdClosed(String placementName, ChartboostMediationAdException error);

    void onAdImpressionRecorded(String placementName);

    void onAdRewarded(String placementName);

    void onAdShown(String placementName, ChartboostMediationAdException error);
}
