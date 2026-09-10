package com.adjust.sdk;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityHandler f6907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6908b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6909c = 0;

    public q0(ActivityHandler activityHandler) {
        this.f6907a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f6909c != 3) {
            runnable.run();
        } else {
            this.f6907a.getAdjustConfig().getLogger().debug(defpackage.e.o("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.f6908b.add(runnable);
        }
    }

    public final void b(String str, IRunActivityHandler iRunActivityHandler) {
        int i10 = this.f6909c;
        ActivityHandler activityHandler = this.f6907a;
        if (i10 != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(defpackage.e.o("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }
}
