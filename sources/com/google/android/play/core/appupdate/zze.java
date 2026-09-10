package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sp0;

/* JADX INFO: loaded from: classes3.dex */
final class zze extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(sp0 sp0Var, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f837a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.f837a;
        if (i == 1) {
            taskCompletionSource.trySetResult(-1);
        } else if (i != 2) {
            taskCompletionSource.trySetResult(1);
        } else {
            taskCompletionSource.trySetResult(0);
        }
    }
}
