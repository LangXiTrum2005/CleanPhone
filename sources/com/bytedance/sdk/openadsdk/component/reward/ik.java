package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.dzy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.sdk.component.mj.lr.ik {
    private final List<? extends com.bytedance.sdk.component.mj.lr.ik> ri;

    public ik(String str, List<? extends com.bytedance.sdk.component.mj.lr.ik> list) {
        super(str);
        this.ri = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.mj.lr.ik> list;
        if (com.bytedance.sdk.component.utils.nr.ik(com.bytedance.sdk.openadsdk.core.nr.ri()) != 0 && (list = this.ri) != null) {
            Iterator<? extends com.bytedance.sdk.component.mj.lr.ik> it = list.iterator();
            while (it.hasNext()) {
                dzy.ri(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.jbs.ri().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
