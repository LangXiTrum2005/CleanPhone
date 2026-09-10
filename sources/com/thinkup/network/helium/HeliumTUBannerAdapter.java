package com.thinkup.network.helium;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.ad.HeliumBannerAdListener;
import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HeliumTUBannerAdapter extends CustomBannerAdapter {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42574n;
    HeliumBannerAd o;

    /* JADX INFO: renamed from: com.thinkup.network.helium.HeliumTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements HeliumBannerAdListener {
        public AnonymousClass2() {
        }

        @Override // com.chartboost.heliumsdk.ad.HeliumBannerAdListener
        public final void onAdCached(String str, String str2, Map<String, String> map, ChartboostMediationAdException chartboostMediationAdException) {
            double d;
            if (chartboostMediationAdException != null) {
                if (chartboostMediationAdException.getChartboostMediationError() != null) {
                    HeliumTUBannerAdapter.this.notifyATLoadFail(chartboostMediationAdException.getChartboostMediationError().toString(), chartboostMediationAdException.getMessage());
                    return;
                } else {
                    HeliumTUBannerAdapter.this.notifyATLoadFail("", chartboostMediationAdException.getMessage());
                    return;
                }
            }
            if (!HeliumTUBannerAdapter.this.f42574n) {
                if (((TUBaseAdInternalAdapter) HeliumTUBannerAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) HeliumTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            try {
                d = Double.parseDouble(map.get("price"));
            } catch (Throwable unused) {
                d = 0.0d;
            }
            String str3 = map.get(Bids.AUCTION_ID_KEY);
            if (TextUtils.isEmpty(str3) || d == 0.0d) {
                HeliumTUBannerAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail("auction-id is empty."), null);
            } else {
                HeliumTUBannerAdapter.this.mBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(d, str3, null), null);
            }
        }

        @Override // com.chartboost.heliumsdk.ad.HeliumBannerAdListener
        public final void onAdClicked(String str) {
            CustomBannerEventListener customBannerEventListener = HeliumTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.chartboost.heliumsdk.ad.HeliumBannerAdListener
        public final void onAdImpressionRecorded(String str) {
            CustomBannerEventListener customBannerEventListener = HeliumTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        HeliumBannerAd heliumBannerAd = this.o;
        if (heliumBannerAd != null) {
            heliumBannerAd.destroy();
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return HeliumTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return HeliumTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.m = TUInitMediation.getStringFromMap(map, "placement_name");
        HeliumTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.helium.HeliumTUBannerAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                HeliumTUBannerAdapter.this.notifyATLoadFail("", str);
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                HeliumTUBannerAdapter.o(HeliumTUBannerAdapter.this, context, map);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        this.f42574n = true;
        loadCustomNetworkAd(context, map, map2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    private void o(Context context, Map<String, Object> map) {
        byte b2;
        HeliumBannerAd.HeliumBannerSize heliumBannerSize;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
        int iHashCode = stringFromMap.hashCode();
        if (iHashCode != -559799608) {
            if (iHashCode != 1507809730) {
                if (iHashCode == 1622564786 && stringFromMap.equals("728x90")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (stringFromMap.equals("320x50")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (stringFromMap.equals("300x250")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            heliumBannerSize = b2 != 1 ? HeliumBannerAd.HeliumBannerSize.STANDARD : HeliumBannerAd.HeliumBannerSize.LEADERBOARD;
        } else {
            heliumBannerSize = HeliumBannerAd.HeliumBannerSize.MEDIUM;
        }
        HeliumBannerAd heliumBannerAd = new HeliumBannerAd(context, this.m, heliumBannerSize, new AnonymousClass2());
        this.o = heliumBannerAd;
        heliumBannerAd.load();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static /* synthetic */ void o(HeliumTUBannerAdapter heliumTUBannerAdapter, Context context, Map map) {
        byte b2;
        HeliumBannerAd.HeliumBannerSize heliumBannerSize;
        String stringFromMap = TUInitMediation.getStringFromMap(map, "size");
        int iHashCode = stringFromMap.hashCode();
        if (iHashCode != -559799608) {
            if (iHashCode != 1507809730) {
                if (iHashCode == 1622564786 && stringFromMap.equals("728x90")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (stringFromMap.equals("320x50")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (stringFromMap.equals("300x250")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            heliumBannerSize = HeliumBannerAd.HeliumBannerSize.MEDIUM;
        } else if (b2 != 1) {
            heliumBannerSize = HeliumBannerAd.HeliumBannerSize.STANDARD;
        } else {
            heliumBannerSize = HeliumBannerAd.HeliumBannerSize.LEADERBOARD;
        }
        HeliumBannerAd heliumBannerAd = new HeliumBannerAd(context, heliumTUBannerAdapter.m, heliumBannerSize, heliumTUBannerAdapter.new AnonymousClass2());
        heliumTUBannerAdapter.o = heliumBannerAd;
        heliumBannerAd.load();
    }
}
