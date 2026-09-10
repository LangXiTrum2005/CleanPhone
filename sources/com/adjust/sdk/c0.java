package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionResponseData f6823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6824c;

    public /* synthetic */ c0(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i10) {
        this.f6822a = i10;
        this.f6824c = activityHandler;
        this.f6823b = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
        OnSessionTrackingFailedListener onSessionTrackingFailedListener;
        switch (this.f6822a) {
            case 0:
                AdjustConfig adjustConfig = this.f6824c.adjustConfig;
                if (adjustConfig != null && (onSessionTrackingSucceededListener = adjustConfig.onSessionTrackingSucceededListener) != null) {
                    onSessionTrackingSucceededListener.onSessionTrackingSucceeded(this.f6823b.getSuccessResponseData());
                }
                break;
            case 1:
                AdjustConfig adjustConfig2 = this.f6824c.adjustConfig;
                if (adjustConfig2 != null && (onSessionTrackingFailedListener = adjustConfig2.onSessionTrackingFailedListener) != null) {
                    onSessionTrackingFailedListener.onSessionTrackingFailed(this.f6823b.getFailureResponseData());
                }
                break;
            default:
                this.f6824c.launchSessionResponseTasksI(this.f6823b);
                break;
        }
    }
}
