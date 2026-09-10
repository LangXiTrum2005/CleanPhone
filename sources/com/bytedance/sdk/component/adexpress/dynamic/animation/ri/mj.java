package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ka {
    public mj(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "rippleValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.lr.qt() * 1000.0d));
        ((ViewGroup) this.ik.getParent()).setClipChildren(false);
        ((ViewGroup) this.ik.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.ik.getParent().getParent().getParent()).setClipChildren(false);
        this.ik.setTag(2097610712, this.lr.mj());
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        return arrayList;
    }
}
