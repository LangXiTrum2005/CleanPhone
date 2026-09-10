package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes2.dex */
public class slm {
    private boolean lr;
    private final com.bytedance.sdk.openadsdk.utils.ri ri = new com.bytedance.sdk.openadsdk.utils.ri();

    public static class ri {
        private static final slm ri = new slm();
    }

    public static slm ri() {
        return ri.ri;
    }

    public com.bytedance.sdk.openadsdk.utils.ri fi() {
        return this.ri;
    }

    public boolean ik() {
        return this.lr;
    }

    public boolean ka() {
        return this.ri.ri();
    }

    public void lr() {
        try {
            Context contextRi = nr.ri();
            if (contextRi instanceof Application) {
                ((Application) contextRi).registerActivityLifecycleCallbacks(this.ri);
                this.lr = true;
            } else {
                if (contextRi == null || contextRi.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextRi.getApplicationContext()).registerActivityLifecycleCallbacks(this.ri);
                this.lr = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean ri(boolean z) {
        return this.ri.ri(z);
    }
}
