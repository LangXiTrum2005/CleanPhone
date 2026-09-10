package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ka {
    public ri(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        float fNr = this.lr.nr() / 100.0f;
        float fTan = this.lr.tan() / 100.0f;
        if ("reverse".equals(this.lr.slm()) && this.lr.bgr() <= 0.0d) {
            fTan = fNr;
            fNr = fTan;
        }
        this.ik.setAlpha(fNr);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "alpha", fNr, fTan).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        return arrayList;
    }
}
