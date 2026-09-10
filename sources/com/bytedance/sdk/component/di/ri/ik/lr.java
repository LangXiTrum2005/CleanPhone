package com.bytedance.sdk.component.di.ri.ik;

import com.bytedance.sdk.component.di.ri.fi;
import com.bytedance.sdk.component.di.ri.xha;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static void ri(AtomicLong atomicLong, int i) {
        fi fiVarVr = xha.di().vr();
        if (fiVarVr == null || !fiVarVr.xha() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
