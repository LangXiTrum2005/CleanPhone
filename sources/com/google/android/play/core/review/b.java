package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.up0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up0 f839a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public b(up0 up0Var) {
        this.f839a = up0Var;
    }

    public final Task a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.c()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.b());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
