package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends ZU {
    public VVE(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), 20.0f), 0.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
