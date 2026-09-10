package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.su;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class mj extends PAGInterstitialAd {
    private final String ik = su.ri();
    private final aw ka;
    private com.bytedance.sdk.openadsdk.ri.ik.lr lr;
    private final com.bytedance.sdk.openadsdk.core.model.ri ri;

    public mj(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ri = riVar;
        this.ka = new aw(context, riVar, "fullscreen_interstitial_ad", new aw.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.mj.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public Intent ri(Context context2, wjv wjvVar, Activity activity) {
                if (wjvVar.zyn()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return wjvVar.di() ? new Intent(context2, (Class<?>) TTFullScreenExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTFullScreenVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(Intent intent, Activity activity, wjv wjvVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(intent, activity, mj.this.ka.ik(), mj.this.ri, mj.this.ik);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(boolean z) {
                if (mj.this.lr == null) {
                    return;
                }
                if (z) {
                    dw.ri().ri(mj.this.ik, mj.this.lr);
                } else {
                    dw.ri().ri(mj.this.lr);
                }
                mj.this.lr = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(wjv wjvVar) {
                lr.ri(wjvVar, mj.this.ka.ik(), false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.ka.ri(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.ka.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.ka.ri(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.lr = new com.bytedance.sdk.openadsdk.component.ik.ri(pAGInterstitialAdInteractionCallback, this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.lr = new com.bytedance.sdk.openadsdk.component.ik.ri(pAGInterstitialAdInteractionListener, this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        this.ka.ri(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.ka.ri(d);
    }

    public void ri() {
        this.ka.ri();
    }
}
