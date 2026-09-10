package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends ka {
    public vr(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        float f;
        float fRi = com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.lr.di());
        float fRi2 = com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), this.lr.xha());
        boolean zEquals = "reverse".equals(this.lr.slm());
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zEquals) {
            f = fRi2;
            fRi2 = 0.0f;
            f2 = fRi;
            fRi = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.ka.lr.ri(this.ik.getContext())) {
            fRi = -fRi;
            f2 = -f2;
        }
        this.ik.setTranslationX(fRi);
        this.ik.setTranslationY(fRi2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "translationX", fRi, f2).setDuration((int) (this.lr.qt() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.ik, "translationY", fRi2, f).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        arrayList.add(ri(duration2));
        return arrayList;
    }
}
