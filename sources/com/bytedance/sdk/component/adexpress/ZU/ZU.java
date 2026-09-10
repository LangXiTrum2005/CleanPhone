package com.bytedance.sdk.component.adexpress.ZU;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static void LD(com.bytedance.sdk.component.OY.OY oy, int i) {
        if (oy == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        ExecutorService executorServiceNXR = lkVarLk != null ? lkVarLk.NXR() : null;
        if (executorServiceNXR == null) {
            com.bytedance.sdk.component.OY.lc.Lxb(oy);
        } else {
            oy.setPriority(i);
            executorServiceNXR.execute(oy);
        }
    }

    public static void Lxb(com.bytedance.sdk.component.OY.OY oy, int i) {
        if (oy == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.Lxb.Lxb.lk lkVarLk = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk();
        ExecutorService executorServiceSTP = lkVarLk != null ? lkVarLk.STP() : null;
        if (executorServiceSTP == null) {
            com.bytedance.sdk.component.OY.lc.Lxb(oy, i);
        } else {
            oy.setPriority(i);
            executorServiceSTP.execute(oy);
        }
    }

    public static ScheduledFuture Lxb(Runnable runnable, long j, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.OY.lc.lc().schedule(runnable, j, timeUnit);
    }
}
