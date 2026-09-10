package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends ZU {
    public lc(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        float f = this.lk.getLayoutParams().width;
        this.lk.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "translationX", f, 0.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lk, "alpha", 0.0f, 1.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        arrayList.add(Lxb(duration2));
        return arrayList;
    }
}
