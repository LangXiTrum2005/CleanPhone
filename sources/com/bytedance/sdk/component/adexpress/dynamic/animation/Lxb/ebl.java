package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends ZU {
    public ebl(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Lxb() {
        this.lk.setTag(2097610709, Integer.valueOf(this.LD.lk()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
