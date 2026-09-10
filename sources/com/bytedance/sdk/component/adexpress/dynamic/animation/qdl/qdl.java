package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends mml {
    public qdl(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        float fJl = this.ud.jl() / 100.0f;
        float fExc = this.ud.exc() / 100.0f;
        if ("reverse".equals(this.ud.jtx()) && this.ud.rdp() <= 0.0d) {
            fExc = fJl;
            fJl = fExc;
        }
        this.lnr.setAlpha(fJl);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "alpha", fJl, fExc).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
