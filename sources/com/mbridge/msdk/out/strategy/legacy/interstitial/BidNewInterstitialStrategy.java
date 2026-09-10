package com.mbridge.msdk.out.strategy.legacy.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BidNewInterstitialStrategy implements IBidVideoAdStrategy {
    private static final String TAG = "BidNewInterstitialStrategy";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private a controller;
    private NewInterstitialListener listener;
    private int modeType;
    private String placementId;
    private String unitId;
    private int value;
    private int valueType;
    private int isSilent = 2;
    private boolean isSetListenerController = false;
    private boolean isConfigAlertDialogTextController = false;
    private boolean isSetIVRewardEnable = false;

    public BidNewInterstitialStrategy(String str, String str2) {
        initData(str, str2);
    }

    private void checkAndCreateController() {
        a aVar;
        if (this.controller == null) {
            initMBBidRewardVideoHandler(this.placementId, this.unitId);
        }
        if (this.isSetListenerController) {
            a aVar2 = this.controller;
            if (aVar2 != null) {
                aVar2.a(new com.mbridge.msdk.newinterstitial.listener.a(this.listener, this.unitId, true));
            }
            this.isSetListenerController = false;
        }
        if (this.isConfigAlertDialogTextController) {
            a aVar3 = this.controller;
            if (aVar3 != null) {
                aVar3.a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            }
            this.isConfigAlertDialogTextController = false;
        }
        if (!this.isSetIVRewardEnable || (aVar = this.controller) == null) {
            return;
        }
        aVar.a(this.modeType, this.valueType, this.value);
        this.isSetIVRewardEnable = false;
    }

    private void initData(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        this.placementId = str;
        this.unitId = str2;
        checkAndCreateController();
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                a aVar = new a();
                this.controller = aVar;
                aVar.d(true);
                this.controller.e(true);
                this.controller.c(str, str2);
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage(), th2);
        }
    }

    private void setIVRewardEnableToController() {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(this.modeType, this.valueType, this.value);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void clearVideoCache() {
        try {
            a aVar = this.controller;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public String getCreativeIdWithUnitId() {
        a aVar = this.controller;
        return aVar != null ? aVar.j() : "";
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public String getRequestId() {
        a aVar = this.controller;
        return aVar != null ? aVar.m() : "";
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        checkAndCreateController();
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(false, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, true, 1));
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(true, str, d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, true, 2));
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void playVideoMute(int i10) {
        this.isSilent = i10;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.confirmTitle = str;
        this.confirmContent = str2;
        this.confirmText = str3;
        this.cancelText = str4;
        this.isConfigAlertDialogTextController = true;
        MBridgeGlobalCommon.setAlertDialogText(this.unitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.unitId, jSONObject);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setIVRewardEnable(int i10, int i11) {
        this.modeType = i10;
        this.value = i11;
        this.valueType = com.mbridge.msdk.foundation.same.a.K;
        this.isSetIVRewardEnable = true;
        setIVRewardEnableToController();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.listener = newInterstitialListener;
        this.isSetListenerController = true;
        a aVar = this.controller;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.controller.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.unitId, true));
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setRewardVideoListener(g gVar) {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, false, -1);
            eVarA.a("activity_overload", 0);
            this.controller.a((String) null, (String) null, (String) null, eVarA);
        }
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.listener = newInterstitialListener;
        this.isSetListenerController = true;
        a aVar = this.controller;
        if (aVar == null || aVar.u()) {
            return;
        }
        this.controller.a(new com.mbridge.msdk.newinterstitial.listener.a(newInterstitialListener, this.unitId, true));
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setIVRewardEnable(int i10, double d10) {
        this.modeType = i10;
        this.value = (int) (d10 * 100.0d);
        this.valueType = com.mbridge.msdk.foundation.same.a.J;
        this.isSetIVRewardEnable = true;
        setIVRewardEnableToController();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(1, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, false, -1);
            eVarA.a("activity_overload", 1);
            c.n().a(activity);
            this.controller.a((String) null, (String) null, (String) null, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        showFromBid(activity);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        showFromBid(activity);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void clearBitmapCache() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setRewardPlus(boolean z10) {
    }
}
