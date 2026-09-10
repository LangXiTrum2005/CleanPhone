package com.bytedance.sdk.openadsdk.core.co.fi.ri;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ka.di;
import com.bytedance.adsdk.ugeno.lr.ik;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.ka.lr.ri {
    public ri(ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        ik ikVar;
        ik ikVarLr;
        Map<String, String> map = this.di;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.di.get("id");
        if (TextUtils.isEmpty(str) || (ikVarLr = (ikVar = this.ik).lr(ikVar)) == null) {
            return;
        }
        ik ikVarFi = ikVarLr.fi(str);
        if (ikVarFi instanceof com.bytedance.sdk.openadsdk.core.co.lr.lr.ri) {
            com.bytedance.sdk.openadsdk.core.co.lr.lr.ri riVar = (com.bytedance.sdk.openadsdk.core.co.lr.lr.ri) ikVarFi;
            riVar.ka();
            riVar.ri(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.co.fi.ri.ri.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ri.this.ik();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void lr() {
    }
}
