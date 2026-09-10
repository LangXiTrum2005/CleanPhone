package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import collectively.dovishness;
import collectively.graveside;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final collectively.taiyuan f21489dern = new collectively.taiyuan("ReviewService");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public graveside f21490attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f21491saneness;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.play.core.review.marial] */
    public taiyuan(Context context) {
        this.f21491saneness = context.getPackageName();
        if (dovishness.attabal(context)) {
            this.f21490attabal = new graveside(context, f21489dern, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: com.google.android.play.core.review.marial
            }, null);
        }
    }

    public final Task attabal() {
        String str = this.f21491saneness;
        collectively.taiyuan taiyuanVar = f21489dern;
        taiyuanVar.dern("requestInAppReview (%s)", str);
        if (this.f21490attabal == null) {
            taiyuanVar.attabal("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f21490attabal.molybdenite(new beachfront(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
