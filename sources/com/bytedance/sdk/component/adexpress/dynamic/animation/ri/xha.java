package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ka {
    public xha(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        this.ik.setTag(2097610709, Integer.valueOf(this.lr.ik()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "marqueeValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        return arrayList;
    }
}
