package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f38179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeContainerView f38180b;

    public o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f38179a = activity;
        this.f38180b = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void a(String str) {
        super.a(str);
        try {
            if (this.f38179a == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals(X3.i.C)) {
                this.f38179a.setRequestedOrientation(0);
            } else if (str.equals(X3.i.D)) {
                this.f38179a.setRequestedOrientation(1);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public String b() {
        if (this.f38180b == null) {
            super.b();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f38180b.getCampaign());
                String unitID = this.f38180b.getUnitID();
                com.mbridge.msdk.videocommon.setting.c cVarB = b(unitID);
                JSONObject jSONObject = new JSONObject();
                if (cVarB != null) {
                    jSONObject = cVarB.H();
                }
                q0.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f38180b.getCampaign());
                return a(arrayList, unitID, "MAL_17.1.61,3.0.1", jSONObject);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return super.b();
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f38179a == null || TextUtils.isEmpty(str) || (mBridgeContainerView = this.f38180b) == null) {
                return;
            }
            mBridgeContainerView.handlerPlayableException(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        super.notifyCloseBtn(i10);
        MBridgeContainerView mBridgeContainerView = this.f38180b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        super.toggleCloseBtn(i10);
        MBridgeContainerView mBridgeContainerView = this.f38180b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.triggerCloseBtn(str);
        try {
            if (this.f38179a == null || TextUtils.isEmpty(str) || !str.equals("click") || (mBridgeContainerView = this.f38180b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            Object camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", camplistToJson);
            a(jSONObject2);
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (com.mbridge.msdk.setting.i.b() != null) {
                String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
                if (!TextUtils.isEmpty(strG)) {
                    JSONObject jSONObject3 = new JSONObject(strG);
                    a(jSONObject3, str);
                    String strE = com.mbridge.msdk.setting.i.b().e(str);
                    if (!TextUtils.isEmpty(strE)) {
                        jSONObject3.put("ivreward", new JSONObject(strE));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        if (com.mbridge.msdk.videocommon.setting.b.b() == null) {
            return null;
        }
        return com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), str);
    }

    private void a(JSONObject jSONObject, String str) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = y0.a(contextD, "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = y0.a(contextD, "MBridge_ConfirmContent" + str, "").toString();
            String string3 = y0.a(contextD, "MBridge_CancelText" + str, "").toString();
            String string4 = y0.a(contextD, "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
