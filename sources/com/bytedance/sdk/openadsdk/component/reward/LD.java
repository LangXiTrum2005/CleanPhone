package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.IeN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends com.bytedance.sdk.component.OY.OY {
    private final List<? extends com.bytedance.sdk.component.OY.OY> Lxb;

    public LD(String str, List<? extends com.bytedance.sdk.component.OY.OY> list) {
        super(str);
        this.Lxb = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.OY.OY> list;
        if (IeN.lk(kqm.Lxb()) != 0 && (list = this.Lxb) != null) {
            Iterator<? extends com.bytedance.sdk.component.OY.OY> it = list.iterator();
            while (it.hasNext()) {
                hg.Lxb(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.ebl.Lxb().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
