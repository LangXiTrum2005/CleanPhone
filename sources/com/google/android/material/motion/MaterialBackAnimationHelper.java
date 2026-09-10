package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.BackEventCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f19358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f19359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19360c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19361e;
    public BackEventCompat f;

    public MaterialBackAnimationHelper(View view) {
        this.f19359b = view;
        Context context = view.getContext();
        this.f19358a = MotionUtils.d(context, R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f19360c = MotionUtils.c(context, R.attr.motionDurationMedium2, 300);
        this.d = MotionUtils.c(context, R.attr.motionDurationShort3, 150);
        this.f19361e = MotionUtils.c(context, R.attr.motionDurationShort2, 100);
    }

    public final BackEventCompat a() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f;
        this.f = null;
        return backEventCompat;
    }
}
