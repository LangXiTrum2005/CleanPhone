package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NXR extends ZU {
    public NXR(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        View view = this.lk;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JVA)) {
            View view2 = (View) this.lk.getParent();
            this.lk = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.lk.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
