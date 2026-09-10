package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class sLN extends ZU {
    public sLN(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Lxb() {
        int i;
        int i2;
        this.lk.setTag(2097610711, Integer.valueOf(this.LD.ZU()));
        View view = this.lk;
        if (view == null || !com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(view.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i = 1;
            i2 = 0;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "shineValue", i, i2).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
