package com.bytedance.sdk.openadsdk.core.co.fi.lr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.ka.ka.ik {
    private String sf;

    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        com.bytedance.adsdk.ugeno.lr.ik ikVar;
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr;
        Map<String, String> map = this.fi;
        if (map != null && map.size() > 0) {
            String str = this.fi.get("id");
            this.sf = this.fi.get("state");
            if (TextUtils.isEmpty(str) || (ikVarLr = (ikVar = this.lr).lr(ikVar)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.lr.ik ikVarFi = ikVarLr.fi(str);
            if (ikVarFi instanceof com.bytedance.sdk.openadsdk.core.co.lr.lr.ri) {
                ((com.bytedance.sdk.openadsdk.core.co.lr.lr.ri) ikVarFi).ri(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.co.fi.lr.lr.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(lr.this.sf, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ri == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ri.ri(((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).lr, ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).di, ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ik.lr());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(lr.this.sf, "start") || ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ri == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ri.ri(((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).lr, ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).di, ((com.bytedance.adsdk.ugeno.ka.ka.ik) lr.this).ik.lr());
                    }
                });
            }
        }
        return false;
    }
}
