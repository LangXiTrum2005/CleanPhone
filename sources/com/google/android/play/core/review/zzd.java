package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.internal.zzt;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements ReviewManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzi f19669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f19670b = new Handler(Looper.getMainLooper());

    public zzd(zzi zziVar) {
        this.f19669a = zziVar;
    }

    public final Task a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.f19670b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    public final Task b() {
        zzi zziVar = this.f19669a;
        Object[] objArr = {zziVar.f19675b};
        com.google.android.play.core.review.internal.zzi zziVar2 = zzi.f19673c;
        zziVar2.a("requestInAppReview (%s)", objArr);
        zzt zztVar = zziVar.f19674a;
        if (zztVar != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            zztVar.c(new zzf(zziVar, taskCompletionSource, taskCompletionSource), taskCompletionSource);
            return taskCompletionSource.getTask();
        }
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", com.google.android.play.core.review.internal.zzi.c(zziVar2.f19651a, "Play Store app is either not installed or not the official version", objArr2));
        }
        Locale locale = Locale.getDefault();
        HashMap map = com.google.android.play.core.review.model.zza.f19666a;
        return Tasks.forException(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : a.n((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) com.google.android.play.core.review.model.zza.f19667b.get(-1), ")")))));
    }
}
