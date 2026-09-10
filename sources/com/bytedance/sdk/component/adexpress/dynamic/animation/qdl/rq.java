package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rq extends mml {
    public rq(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        float f;
        float fRq = (float) this.ud.rq();
        float fFs = (float) this.ud.fs();
        String strJtx = this.ud.jtx();
        float f2 = 1.0f;
        if ("reverse".equals(strJtx) || "alternate-reverse".equals(strJtx)) {
            f = 1.0f;
        } else {
            f = fFs;
            fFs = 1.0f;
            f2 = fRq;
            fRq = 1.0f;
        }
        this.lnr.setTag(2097610710, this.ud.ud());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "scaleX", fRq, f2).setDuration((int) (this.ud.to() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lnr, "scaleY", fFs, f).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        return arrayList;
    }
}
