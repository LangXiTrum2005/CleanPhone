package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class co extends ka {
    public co(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        super(view, riVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka
    public List<ObjectAnimator> ri() {
        int i;
        int i2;
        this.ik.setTag(2097610711, Integer.valueOf(this.lr.ka()));
        View view = this.ik;
        if (view == null || !com.bytedance.sdk.component.adexpress.ka.lr.ri(view.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i2 = 0;
            i = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.ik, "shineValue", i, i2).setDuration((int) (this.lr.qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ri(duration));
        return arrayList;
    }
}
