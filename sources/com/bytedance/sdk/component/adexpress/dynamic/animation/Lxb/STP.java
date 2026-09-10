package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class STP extends ZU {
    public STP(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, Key.ROTATION, 0.0f, this.LD.JXs(), 0.0f, this.LD.JXs(), 0.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        return arrayList;
    }
}
