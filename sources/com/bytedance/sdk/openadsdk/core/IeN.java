package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {
    private boolean LD;
    private final com.bytedance.sdk.openadsdk.utils.Lxb Lxb = new com.bytedance.sdk.openadsdk.utils.Lxb();

    public static class Lxb {
        private static final IeN Lxb = new IeN();
    }

    public static IeN Lxb() {
        return Lxb.Lxb;
    }

    public com.bytedance.sdk.openadsdk.utils.Lxb JXs() {
        return this.Lxb;
    }

    public void LD() {
        try {
            Context contextLxb = kqm.Lxb();
            if (contextLxb instanceof Application) {
                ((Application) contextLxb).registerActivityLifecycleCallbacks(this.Lxb);
                this.LD = true;
            } else {
                if (contextLxb == null || contextLxb.getApplicationContext() == null) {
                    return;
                }
                ((Application) contextLxb.getApplicationContext()).registerActivityLifecycleCallbacks(this.Lxb);
                this.LD = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public boolean ZU() {
        return this.Lxb.Lxb();
    }

    public boolean lk() {
        return this.LD;
    }

    public boolean Lxb(boolean z) {
        return this.Lxb.Lxb(z);
    }
}
