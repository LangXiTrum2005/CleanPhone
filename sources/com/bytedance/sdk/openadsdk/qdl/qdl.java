package com.bytedance.sdk.openadsdk.qdl;

import android.text.TextUtils;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.wd;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.yt.lnr;
import com.bytedance.sdk.openadsdk.yt.mml;
import com.vungle.ads.internal.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static boolean qdl(PAGLoadListener pAGLoadListener) {
        if (wd.qdl()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void qdl(final jpc jpcVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                if (!rdp.mzz()) {
                    PAGLoadListener pAGLoadListener2 = pAGLoadListener;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!tvp.ud().fs()) {
                    lnr.qdl(new mml() { // from class: com.bytedance.sdk.openadsdk.qdl.qdl.1.1
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVarI = Z.i(Constants.LOAD_AD);
                            qdlVarI.lnr(adSlot.getCodeId());
                            qdlVarI.mml(gy.lnr(adSlot.getDurationSlotType()));
                            qdlVarI.qdl(BuildConfig.VERSION_NAME);
                            qdlVarI.wd(gy.qdl(adSlot).toString());
                            return qdlVarI;
                        }
                    });
                    fco.mml(jpcVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = pAGLoadListener;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, com.bytedance.sdk.openadsdk.core.jpc.qdl(10004));
                    }
                }
            }
        };
        if (rdp.mzz()) {
            runnable.run();
        } else {
            rdp.ud().post(runnable);
        }
    }

    public static void qdl(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!rdp.mzz() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean qdl(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
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
