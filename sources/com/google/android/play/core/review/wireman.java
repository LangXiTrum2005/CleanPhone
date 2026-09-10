package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final taiyuan f21492attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f21493saneness = new Handler(Looper.getMainLooper());

    public wireman(taiyuan taiyuanVar) {
        this.f21492attabal = taiyuanVar;
    }

    @Override // com.google.android.play.core.review.attabal
    public final Task<ReviewInfo> attabal() {
        return this.f21492attabal.attabal();
    }

    @Override // com.google.android.play.core.review.attabal
    public final Task<Void> saneness(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.saneness()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.attabal());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.f21493saneness, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
