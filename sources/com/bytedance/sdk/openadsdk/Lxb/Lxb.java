package com.bytedance.sdk.openadsdk.Lxb;

import android.text.TextUtils;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.VVE.ZU;
import com.bytedance.sdk.openadsdk.VVE.lk;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.settings.sLN;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static boolean Lxb(PAGLoadListener pAGLoadListener) {
        if (sLN.Lxb()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    public static void Lxb(final OY oy, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                if (STP.JXs()) {
                    lk.Lxb(new ZU() { // from class: com.bytedance.sdk.openadsdk.Lxb.Lxb.1.1
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            com.bytedance.sdk.openadsdk.VVE.LD.Lxb lxbL = AbstractC3950lJ.l("load_ad");
                            lxbL.lk(adSlot.getCodeId());
                            lxbL.ZU(nJ.lk(adSlot.getDurationSlotType()));
                            lxbL.Lxb(BuildConfig.VERSION_NAME);
                            lxbL.ebl(nJ.Lxb(adSlot).toString());
                            return lxbL;
                        }
                    });
                    hg.ZU(oy);
                    return;
                }
                com.bytedance.sdk.component.utils.sLN.Lxb("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                if (pAGLoadListener2 != null) {
                    pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                }
            }
        };
        if (STP.JXs()) {
            runnable.run();
        } else {
            STP.LD().post(runnable);
        }
    }

    public static void Lxb(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!STP.JXs() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean Lxb(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
