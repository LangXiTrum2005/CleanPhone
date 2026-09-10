package com.bytedance.sdk.component.lc.Lxb.lk;

import com.bytedance.sdk.component.lc.Lxb.JXs;
import com.bytedance.sdk.component.lc.Lxb.OY;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static void Lxb(AtomicLong atomicLong, int i) {
        JXs jXsVVE = OY.ebl().VVE();
        if (jXsVVE == null || !jXsVVE.ebl() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
