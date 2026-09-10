package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ap0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cp0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rp0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.up0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends rp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4 f840a;
    public final TaskCompletionSource b;
    public final /* synthetic */ up0 c;

    public c(up0 up0Var, TaskCompletionSource taskCompletionSource) {
        B4 b4 = new B4("OnRequestInstallCallback", 0);
        this.c = up0Var;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f840a = b4;
        this.b = taskCompletionSource;
    }

    public final void zzb(Bundle bundle) {
        Cp0 cp0 = this.c.f5105a;
        int i = 0;
        if (cp0 != null) {
            TaskCompletionSource taskCompletionSource = this.b;
            synchronized (cp0.f) {
                cp0.e.remove(taskCompletionSource);
            }
            synchronized (cp0.f) {
                try {
                    if (cp0.k.get() <= 0 || cp0.k.decrementAndGet() <= 0) {
                        cp0.a().post(new Ap0(cp0, i));
                    } else {
                        cp0.b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f840a.c("onGetLaunchReviewFlowInfo", new Object[0]);
        this.b.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
