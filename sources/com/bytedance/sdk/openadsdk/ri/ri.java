package com.bytedance.sdk.openadsdk.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.mj.lr.ik;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.qt.lr;
import com.bytedance.sdk.openadsdk.core.settings.xha;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.nr.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.saneness;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static boolean ri(PAGLoadListener pAGLoadListener) {
        if (xha.ri()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void ri(final ik ikVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (!vr.fi()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!lr.ri().sf() || !qt.lr().sf()) {
                    com.bytedance.sdk.openadsdk.nr.ik.ri(new ka() { // from class: com.bytedance.sdk.openadsdk.ri.ri.1.1
                        @Override // com.bytedance.sdk.openadsdk.nr.ka
                        public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                            com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                            riVar.lr(saneness.LOAD_AD);
                            riVar.ik(adSlot.getCodeId());
                            riVar.ka(ig.ik(adSlot.getDurationSlotType()));
                            riVar.ri(BuildConfig.VERSION_NAME);
                            riVar.xha(ig.ri(adSlot).toString());
                            return riVar;
                        }
                    });
                    dzy.ik(ikVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, jbs.ri(10004));
                    }
                }
            }
        };
        if (vr.fi()) {
            runnable.run();
        } else {
            vr.lr().post(runnable);
        }
    }

    public static void ri(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!vr.fi() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
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

    public static boolean ri(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
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
