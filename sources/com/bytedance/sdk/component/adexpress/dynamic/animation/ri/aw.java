package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class aw extends ka {
    public aw(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        View view = this.ik;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf)) {
            View view2 = (View) this.ik.getParent();
            this.ik = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.ik.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "stretchValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        return arrayList;
    }
}
