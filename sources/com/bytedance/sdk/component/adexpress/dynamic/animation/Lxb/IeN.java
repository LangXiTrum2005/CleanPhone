package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends ZU {
    public IeN(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        float f;
        float fLxb = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.LD.lc());
        float fLxb2 = com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), this.LD.ebl());
        float f2 = 0.0f;
        if ("reverse".equals(this.LD.VVE())) {
            f2 = fLxb;
            f = fLxb2;
            fLxb = 0.0f;
            fLxb2 = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(this.lk.getContext())) {
            fLxb = -fLxb;
            f2 = -f2;
        }
        this.lk.setTranslationX(fLxb);
        this.lk.setTranslationY(fLxb2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "translationX", fLxb, f2).setDuration((int) (this.LD.nBu() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lk, "translationY", fLxb2, f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        arrayList.add(Lxb(duration2));
        return arrayList;
    }
}
