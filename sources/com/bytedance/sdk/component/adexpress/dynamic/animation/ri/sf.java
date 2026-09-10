package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends ka {
    public sf(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        float f;
        float fSf = (float) this.lr.sf();
        float fCo = (float) this.lr.co();
        String strSlm = this.lr.slm();
        float f2 = 1.0f;
        if ("reverse".equals(strSlm) || "alternate-reverse".equals(strSlm)) {
            f = 1.0f;
        } else {
            f = fCo;
            fCo = 1.0f;
            f2 = fSf;
            fSf = 1.0f;
        }
        this.ik.setTag(2097610710, this.lr.lr());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "scaleX", fSf, f2).setDuration((int) (this.lr.qt() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.ik, "scaleY", fCo, f).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        arrayList.add(ri(duration2));
        return arrayList;
    }
}
