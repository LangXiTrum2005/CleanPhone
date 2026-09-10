package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bjy extends mml {
    public bjy(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        float f;
        float fQdl = com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.mo());
        float fQdl2 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.wd());
        float f2 = 0.0f;
        if ("reverse".equals(this.ud.jtx())) {
            f = fQdl2;
            fQdl2 = 0.0f;
            f2 = fQdl;
            fQdl = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.mml.ud.qdl(this.lnr.getContext())) {
            fQdl = -fQdl;
            f2 = -f2;
        }
        this.lnr.setTranslationX(fQdl);
        this.lnr.setTranslationY(fQdl2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationX", fQdl, f2).setDuration((int) (this.ud.to() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lnr, "translationY", fQdl2, f).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        return arrayList;
    }
}
