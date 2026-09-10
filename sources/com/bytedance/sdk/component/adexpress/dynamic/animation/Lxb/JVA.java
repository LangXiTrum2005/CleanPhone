package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends ZU {
    public JVA(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        float f;
        float fJVA = (float) this.LD.JVA();
        float fSLN = (float) this.LD.sLN();
        String strVVE = this.LD.VVE();
        float f2 = 1.0f;
        if ("reverse".equals(strVVE) || "alternate-reverse".equals(strVVE)) {
            f = 1.0f;
        } else {
            f2 = fJVA;
            f = fSLN;
            fJVA = 1.0f;
            fSLN = 1.0f;
        }
        this.lk.setTag(2097610710, this.LD.LD());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "scaleX", fJVA, f2).setDuration((int) (this.LD.nBu() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lk, "scaleY", fSLN, f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        arrayList.add(Lxb(duration2));
        return arrayList;
    }
}
