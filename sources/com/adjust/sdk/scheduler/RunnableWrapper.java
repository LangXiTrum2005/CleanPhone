package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableWrapper implements Runnable {
    private Runnable runnable;

    public RunnableWrapper(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.runnable.run();
        } catch (Throwable th2) {
            AdjustFactory.getLogger().error("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
