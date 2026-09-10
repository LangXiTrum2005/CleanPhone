package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BidAdHandler extends BaseAdHandler {
    protected IBidVideoAdStrategy componentBidVideoAdStrategy;
    protected IBidVideoAdStrategy legacyBidVideoAdStrategy;

    public BidAdHandler(String str, String str2) {
        super(str, str2);
    }

    public void clearVideoCache() {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.clearVideoCache();
        } else {
            this.legacyBidVideoAdStrategy.clearVideoCache();
        }
    }

    public String getCreativeIdWithUnitId() {
        return a.c().d() ? this.componentBidVideoAdStrategy.getCreativeIdWithUnitId() : this.legacyBidVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getRequestId() {
        return a.c().d() ? this.componentBidVideoAdStrategy.getRequestId() : this.legacyBidVideoAdStrategy.getRequestId();
    }

    public boolean isBidReady() {
        return a.c().d() ? this.componentBidVideoAdStrategy.isBidReady() : this.legacyBidVideoAdStrategy.isBidReady();
    }

    public void loadFromBid(String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.loadFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.loadFromBid(str);
        }
    }

    public void playVideoMute(int i10) {
        this.componentBidVideoAdStrategy.playVideoMute(i10);
        this.legacyBidVideoAdStrategy.playVideoMute(i10);
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.componentBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        this.legacyBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        this.componentBidVideoAdStrategy.setExtraInfo(jSONObject);
        this.legacyBidVideoAdStrategy.setExtraInfo(jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.componentBidVideoAdStrategy.setIVRewardEnable(i10, i11);
        this.legacyBidVideoAdStrategy.setIVRewardEnable(i10, i11);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.componentBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        this.legacyBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
    }

    public void setRewardPlus(boolean z10) {
        this.componentBidVideoAdStrategy.setRewardPlus(z10);
        this.legacyBidVideoAdStrategy.setRewardPlus(z10);
    }

    public void setRewardVideoListener(g gVar) {
        this.componentBidVideoAdStrategy.setRewardVideoListener(gVar);
        this.legacyBidVideoAdStrategy.setRewardVideoListener(gVar);
    }

    public void showFromBid() {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid();
        } else {
            this.legacyBidVideoAdStrategy.showFromBid();
        }
    }

    public BidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.componentBidVideoAdStrategy.setIVRewardEnable(i10, d10);
        this.legacyBidVideoAdStrategy.setIVRewardEnable(i10, d10);
    }

    public void showFromBid(Activity activity) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity);
        }
    }

    public void showFromBid(String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str);
        }
    }

    public void showFromBid(String str, String str2) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str, str2);
        }
    }

    public void showFromBid(Activity activity, String str) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str);
        }
    }

    public void showFromBid(Activity activity, String str, String str2) {
        if (a.c().d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str, str2);
        }
    }
}
