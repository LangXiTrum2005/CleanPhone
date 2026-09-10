package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends ZU {
    public Lxb(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        float fBrP = this.LD.brP() / 100.0f;
        float fTD = this.LD.tD() / 100.0f;
        if ("reverse".equals(this.LD.VVE()) && this.LD.STP() <= 0.0d) {
            fTD = fBrP;
            fBrP = fTD;
        }
        this.lk.setAlpha(fBrP);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "alpha", fBrP, fTD).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
