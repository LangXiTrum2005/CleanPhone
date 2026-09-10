package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fs extends mml {
    public fs(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        int i2;
        int i3;
        this.lnr.setTag(2097610711, Integer.valueOf(this.ud.mml()));
        View view = this.lnr;
        if (view == null || !com.bytedance.sdk.component.adexpress.mml.ud.qdl(view.getContext())) {
            i2 = 0;
            i3 = 1;
        } else {
            i3 = 0;
            i2 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "shineValue", i2, i3).setDuration((int) (this.ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
