package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MotionEvent f19997a = MotionEvent.obtain(0, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MotionEvent f19998b = MotionEvent.obtain(0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f19999c;

    public sm(ScheduledExecutorService scheduledExecutorService) {
        this.f19999c = scheduledExecutorService;
    }
}
