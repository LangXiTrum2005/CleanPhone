package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class exu extends mml {
    public exu(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        View view = this.lnr;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rq)) {
            View view2 = (View) this.lnr.getParent();
            this.lnr = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.lnr.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
