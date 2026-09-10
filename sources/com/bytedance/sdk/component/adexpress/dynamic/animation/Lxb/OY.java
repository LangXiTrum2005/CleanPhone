package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends ZU {
    public OY(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Lxb() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ((ViewGroup) this.lk.getParent()).setClipChildren(false);
        ((ViewGroup) this.lk.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.lk.getParent().getParent().getParent()).setClipChildren(false);
        this.lk.setTag(2097610712, this.LD.OY());
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
