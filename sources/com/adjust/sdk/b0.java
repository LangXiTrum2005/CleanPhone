package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventResponseData f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6817c;

    public /* synthetic */ b0(ActivityHandler activityHandler, EventResponseData eventResponseData, int i10) {
        this.f6815a = i10;
        this.f6817c = activityHandler;
        this.f6816b = eventResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnEventTrackingSucceededListener onEventTrackingSucceededListener;
        OnEventTrackingFailedListener onEventTrackingFailedListener;
        switch (this.f6815a) {
            case 0:
                AdjustConfig adjustConfig = this.f6817c.adjustConfig;
                if (adjustConfig != null && (onEventTrackingSucceededListener = adjustConfig.onEventTrackingSucceededListener) != null) {
                    onEventTrackingSucceededListener.onEventTrackingSucceeded(this.f6816b.getSuccessResponseData());
                }
                break;
            case 1:
                AdjustConfig adjustConfig2 = this.f6817c.adjustConfig;
                if (adjustConfig2 != null && (onEventTrackingFailedListener = adjustConfig2.onEventTrackingFailedListener) != null) {
                    onEventTrackingFailedListener.onEventTrackingFailed(this.f6816b.getFailureResponseData());
                }
                break;
            default:
                this.f6817c.launchEventResponseTasksI(this.f6816b);
                break;
        }
    }
}
