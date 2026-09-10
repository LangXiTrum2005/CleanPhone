package com.mbridge.msdk.out.strategy.legacy.reward;

import android.app.Activity;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.util.b;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class RewardVideoStrategy implements IVideoAdStrategy {
    private static final String TAG = "TraditionalStrategy";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private a controller;
    private boolean isRewardPlusOpen;
    private g listener;
    private String placementId;
    private String unitId;
    private boolean isSetListenerController = false;
    private int isSilent = 2;
    private boolean isConfigAlertDialogTextController = false;

    public RewardVideoStrategy(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        checkAndCreateController();
    }

    private void checkAndCreateController() {
        if (this.controller == null) {
            initController();
        }
        configController();
    }

    private void configController() {
        if (this.controller == null) {
            return;
        }
        if (this.isSetListenerController) {
            if (b.a()) {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener, this.unitId, false));
            } else {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener));
            }
            this.isSetListenerController = false;
        }
        if (this.isConfigAlertDialogTextController) {
            this.controller.a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextController = false;
        }
        this.controller.f(this.isRewardPlusOpen);
    }

    private void initController() {
        try {
            if (this.controller == null) {
                a aVar = new a();
                this.controller = aVar;
                aVar.d(false);
                this.controller.c(this.placementId, this.unitId);
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void clearBitmapCache() {
        try {
            com.mbridge.msdk.foundation.same.image.b.a(c.n().d()).a();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
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

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        checkAndCreateController();
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(true, d.b().a(0, 94, this.unitId, true, 2));
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
        checkAndCreateController();
        if (this.controller != null) {
            configController();
            this.controller.a(false, d.b().a(0, 94, this.unitId, true, 1));
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

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setIVRewardEnable(int i10, double d10) {
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setRewardPlus(boolean z10) {
        this.isRewardPlusOpen = z10;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.f(z10);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setRewardVideoListener(g gVar) {
        this.listener = gVar;
        this.isSetListenerController = true;
        a aVar = this.controller;
        if (aVar == null || aVar.u()) {
            return;
        }
        if (b.a()) {
            this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar, this.unitId, false));
        } else {
            this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar));
        }
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 0);
            this.controller.a((String) null, (String) null, (String) null, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setIVRewardEnable(int i10, int i11) {
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 1);
            c.n().a(activity);
            this.controller.a((String) null, (String) null, (String) null, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 0);
            this.controller.a((String) null, str, (String) null, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 1);
            c.n().a(activity);
            this.controller.a((String) null, str, (String) null, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 0);
            this.controller.a((String) null, str, str2, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        checkAndCreateController();
        if (this.controller != null) {
            e eVarA = d.b().a(0, 94, this.unitId, false, -1);
            eVarA.a("activity_overload", 1);
            c.n().a(activity);
            this.controller.a((String) null, str, str2, eVarA);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
    }
}
