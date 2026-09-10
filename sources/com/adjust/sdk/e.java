package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f6833c;

    public /* synthetic */ e(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i10) {
        this.f6831a = i10;
        this.f6832b = activityHandler;
        this.f6833c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6831a) {
            case 0:
                this.f6832b.lambda$trackEvent$3(this.f6833c);
                break;
            default:
                this.f6832b.lambda$trackEvent$4(this.f6833c);
                break;
        }
    }
}
