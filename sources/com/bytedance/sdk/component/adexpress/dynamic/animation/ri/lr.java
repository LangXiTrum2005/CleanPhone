package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements dzy {
    List<ka> ri = new ArrayList();

    public lr(View view, List<com.bytedance.sdk.component.adexpress.dynamic.ka.ri> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ka.ri> it = list.iterator();
        while (it.hasNext()) {
            ka kaVarRi = ik.ri().ri(view, it.next());
            if (kaVarRi != null) {
                this.ri.add(kaVarRi);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    public void lr() {
        Iterator<ka> it = this.ri.iterator();
        while (it.hasNext()) {
            try {
                it.next().lr();
            } catch (Exception unused) {
            }
        }
    }

    public void ri() {
        Iterator<ka> it = this.ri.iterator();
        while (it.hasNext()) {
            try {
                it.next().ik();
            } catch (Exception unused) {
            }
        }
    }
}
