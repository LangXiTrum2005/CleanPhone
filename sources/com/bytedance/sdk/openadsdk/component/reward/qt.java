package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.su;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class qt extends PAGRewardedAd {
    private final aw fi;
    private com.bytedance.sdk.openadsdk.ri.fi.ri ik;
    private final String ka = su.ri();
    private final AdSlot lr;
    private final com.bytedance.sdk.openadsdk.core.model.ri ri;

    public qt(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, AdSlot adSlot) {
        this.ri = riVar;
        this.lr = adSlot;
        this.fi = new aw(context, riVar, "rewarded_video", new aw.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.qt.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public Intent ri(Context context2, wjv wjvVar, Activity activity) {
                if (wjvVar.zyn()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return wjvVar.di() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(Intent intent, Activity activity, wjv wjvVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.ri.lr.ri(intent, activity, qt.this.fi.ik(), qt.this.ri, qt.this.ka);
                intent.putExtra("media_extra", qt.this.lr.getMediaExtra());
                intent.putExtra("user_id", qt.this.lr.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(boolean z) {
                if (qt.this.ik == null) {
                    return;
                }
                if (z) {
                    dw.ri().ri(qt.this.ka, qt.this.ik);
                } else {
                    dw.ri().ri(qt.this.ik);
                }
                qt.this.ik = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.aw.ri
            public void ri(wjv wjvVar) {
                lr.ri(wjvVar, qt.this.fi.ik(), true);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.fi.ri(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.fi.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.fi.ri(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.ik = new sf(pAGRewardedAdInteractionCallback, this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.ik = new sf(pAGRewardedAdInteractionListener, this.ri);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        this.fi.ri(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.fi.ri(d);
    }

    public void ri() {
        this.fi.ri();
    }
}
