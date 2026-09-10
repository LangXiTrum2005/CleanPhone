package com.bytedance.sdk.openadsdk.core.rq.mzz.qdl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mml.mo;
import com.bytedance.adsdk.ugeno.ud.lnr;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.adsdk.ugeno.mml.ud.qdl {
    public qdl(lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        lnr lnrVar;
        lnr lnrVarUd;
        Map<String, String> map = this.mo;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.mo.get("id");
        if (TextUtils.isEmpty(str) || (lnrVarUd = (lnrVar = this.lnr).ud(lnrVar)) == null) {
            return;
        }
        lnr lnrVarMzz = lnrVarUd.mzz(str);
        if (lnrVarMzz instanceof com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl) {
            com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl qdlVar = (com.bytedance.sdk.openadsdk.core.rq.ud.qdl.qdl) lnrVarMzz;
            qdlVar.mml();
            qdlVar.qdl(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.rq.mzz.qdl.qdl.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    qdl.this.lnr();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void ud() {
    }
}
