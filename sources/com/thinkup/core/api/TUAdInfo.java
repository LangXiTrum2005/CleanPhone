package com.thinkup.core.api;

import com.thinkup.core.basead.adx.api.ITUAdxHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUAdInfo {
    public abstract int getABTestId();

    public abstract String getAdNetworkType();

    public abstract int getAdSourceAdType();

    public abstract String getAdSourceCustomExt();

    public abstract String getAdsourceId();

    public abstract int getAdsourceIndex();

    public abstract ITUAdxHandler getAdxHandler();

    public abstract double getBidFloor();

    public abstract int getBidType();

    public abstract String getChannel();

    public abstract String getCountry();

    public abstract String getCurrency();

    public abstract TUCustomContentResult getCustomContentResult();

    public abstract String getCustomRule();

    public abstract int getDismissType();

    public abstract double getEcpm();

    public abstract double getEcpm(TUAdConst.CURRENCY currency);

    public abstract int getEcpmLevel();

    public abstract String getEcpmPrecision();

    @Deprecated
    public abstract double getEcpmWithCurrency(TUAdConst.CURRENCY currency);

    public abstract String getEncEcpmInfo();

    public abstract Map<String, Object> getExtInfoMap();

    public abstract String getFormat();

    public abstract Map<String, Object> getLocalExtra();

    public abstract int getNetworkFirmId();

    public abstract String getNetworkName();

    public abstract String getNetworkPlacementId();

    public abstract String getPlacementId();

    public abstract int getPlacementType();

    public abstract Double getPublisherRevenue();

    public abstract Double getPublisherRevenue(TUAdConst.CURRENCY currency);

    public abstract String getRequestId();

    public abstract String getRewardUserCustomData();

    public abstract String getRmbEncEcpmInfo();

    public abstract String getScenarioId();

    public abstract String getScenarioRewardName();

    public abstract int getScenarioRewardNumber();

    public abstract int getSecretId();

    public abstract int getSegmentId();

    public abstract String getSharedPlacementId();

    public abstract String getShowCustomExt();

    public abstract String getShowId();

    public abstract String getSubChannel();

    @Deprecated
    public abstract String getTopOnAdFormat();

    @Deprecated
    public abstract String getTopOnPlacementId();

    public abstract String getTpBidId();

    public abstract Map<String, String> getUrlTagParams();

    public abstract String getWaterfallId();

    public abstract int isHeaderBiddingAdsource();
}
