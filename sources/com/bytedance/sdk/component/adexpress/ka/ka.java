package com.bytedance.sdk.component.adexpress.ka;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static void lr(com.bytedance.sdk.component.mj.lr.ik ikVar, int i) {
        if (ikVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        ExecutorService executorServiceAw = ikVarIk != null ? ikVarIk.aw() : null;
        if (executorServiceAw != null) {
            ikVar.setPriority(i);
            executorServiceAw.execute(ikVar);
        }
    }

    public static void ri(com.bytedance.sdk.component.mj.lr.ik ikVar, int i) {
        if (ikVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        ExecutorService executorServiceBgr = ikVarIk != null ? ikVarIk.bgr() : null;
        if (executorServiceBgr != null) {
            ikVar.setPriority(i);
            executorServiceBgr.execute(ikVar);
        }
    }

    public static ScheduledFuture ri(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.ri.ri.ik ikVarIk = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik();
        ScheduledExecutorService scheduledExecutorServiceVr = ikVarIk != null ? ikVarIk.vr() : null;
        if (scheduledExecutorServiceVr != null) {
            return scheduledExecutorServiceVr.schedule(runnable, j, timeUnit);
        }
        return null;
    }
}
