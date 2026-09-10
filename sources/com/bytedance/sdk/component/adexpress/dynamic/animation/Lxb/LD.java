package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements nJ {
    List<ZU> Lxb = new ArrayList();

    public LD(View view, List<com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb> it = list.iterator();
        while (it.hasNext()) {
            ZU zuLxb = lk.Lxb().Lxb(view, it.next());
            if (zuLxb != null) {
                this.Lxb.add(zuLxb);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ
    public void LD() {
        Iterator<ZU> it = this.Lxb.iterator();
        while (it.hasNext()) {
            try {
                it.next().LD();
            } catch (Exception unused) {
            }
        }
    }

    public void Lxb() {
        Iterator<ZU> it = this.Lxb.iterator();
        while (it.hasNext()) {
            try {
                it.next().lk();
            } catch (Exception unused) {
            }
        }
    }
}
