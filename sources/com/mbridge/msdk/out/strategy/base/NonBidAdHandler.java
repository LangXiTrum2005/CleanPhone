package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class NonBidAdHandler extends BaseAdHandler {
    protected IVideoAdStrategy componentAdStrategy;
    protected IVideoAdStrategy legacyVideoAdStrategy;

    public NonBidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void clearVideoCache() {
        if (a.c().d()) {
            this.componentAdStrategy.clearVideoCache();
        } else {
            this.legacyVideoAdStrategy.clearVideoCache();
        }
    }

    public String getCreativeIdWithUnitId() {
        return a.c().d() ? this.componentAdStrategy.getCreativeIdWithUnitId() : this.legacyVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getRequestId() {
        return a.c().d() ? this.componentAdStrategy.getRequestId() : this.legacyVideoAdStrategy.getRequestId();
    }

    public boolean isReady() {
        return a.c().d() ? this.componentAdStrategy.isReady() : this.legacyVideoAdStrategy.isReady();
    }

    public void load() {
        if (a.c().d()) {
            this.componentAdStrategy.load();
        } else {
            this.legacyVideoAdStrategy.load();
        }
    }

    public void loadFormSelfFilling() {
        if (a.c().d()) {
            this.componentAdStrategy.loadFormSelfFilling();
        } else {
            this.legacyVideoAdStrategy.loadFormSelfFilling();
        }
    }

    public void playVideoMute(int i10) {
        this.componentAdStrategy.playVideoMute(i10);
        this.legacyVideoAdStrategy.playVideoMute(i10);
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.componentAdStrategy.setAlertDialogText(str, str2, str3, str4);
        this.legacyVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        this.componentAdStrategy.setExtraInfo(jSONObject);
        this.legacyVideoAdStrategy.setExtraInfo(jSONObject);
    }

    public void setIVRewardEnable(int i10, int i11) {
        this.componentAdStrategy.setIVRewardEnable(i10, i11);
        this.legacyVideoAdStrategy.setIVRewardEnable(i10, i11);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.componentAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        this.legacyVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
    }

    public void setRewardPlus(boolean z10) {
        this.componentAdStrategy.setRewardPlus(z10);
        this.legacyVideoAdStrategy.setRewardPlus(z10);
    }

    public void setRewardVideoListener(g gVar) {
        this.componentAdStrategy.setRewardVideoListener(gVar);
        this.legacyVideoAdStrategy.setRewardVideoListener(gVar);
    }

    public void show() {
        if (a.c().d()) {
            this.componentAdStrategy.show();
        } else {
            this.legacyVideoAdStrategy.show();
        }
    }

    public NonBidAdHandler(String str, String str2) {
        super(str, str2);
    }

    public void setIVRewardEnable(int i10, double d10) {
        this.componentAdStrategy.setIVRewardEnable(i10, d10);
        this.legacyVideoAdStrategy.setIVRewardEnable(i10, d10);
    }

    public void show(Activity activity) {
        if (a.c().d()) {
            this.componentAdStrategy.show(activity);
        } else {
            this.legacyVideoAdStrategy.show(activity);
        }
    }

    public void show(String str) {
        if (a.c().d()) {
            this.componentAdStrategy.show(str);
        } else {
            this.legacyVideoAdStrategy.show(str);
        }
    }

    public void show(String str, String str2) {
        if (a.c().d()) {
            this.componentAdStrategy.show(str, str2);
        } else {
            this.legacyVideoAdStrategy.show(str, str2);
        }
    }

    public void show(Activity activity, String str) {
        if (a.c().d()) {
            this.componentAdStrategy.show(activity, str);
        } else {
            this.legacyVideoAdStrategy.show(activity, str);
        }
    }

    public void show(Activity activity, String str, String str2) {
        if (a.c().d()) {
            this.componentAdStrategy.show(activity, str, str2);
        } else {
            this.legacyVideoAdStrategy.show(activity, str, str2);
        }
    }
}
