package com.bytedance.sdk.openadsdk.core.rq.mzz.ud;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.adsdk.ugeno.mml.mml.lnr {
    private String rq;

    public qdl(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd;
        Map<String, String> map = this.mzz;
        if (map != null && map.size() > 0) {
            String str = this.mzz.get("id");
            this.rq = this.mzz.get("state");
            if (TextUtils.isEmpty(str) || (lnrVarUd = (lnrVar = this.ud).ud(lnrVar)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.ud.lnr lnrVarMzz = lnrVarUd.mzz(str);
            if (lnrVarMzz instanceof com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl) {
                ((com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl) lnrVarMzz).qdl(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.rq.mzz.ud.qdl.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(qdl.this.rq, "complete") || ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).qdl == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).qdl.qdl(((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).ud, ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).mo, ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).lnr.ud());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(qdl.this.rq, "start") || ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).qdl == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).qdl.qdl(((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).ud, ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).mo, ((com.bytedance.adsdk.ugeno.mml.mml.lnr) qdl.this).lnr.ud());
                    }
                });
            }
        }
        return false;
    }
}
