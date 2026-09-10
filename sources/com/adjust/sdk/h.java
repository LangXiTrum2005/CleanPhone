package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStoreSubscription f6849c;

    public /* synthetic */ h(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i10) {
        this.f6847a = i10;
        this.f6848b = activityHandler;
        this.f6849c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6847a) {
            case 0:
                this.f6848b.lambda$trackPlayStoreSubscription$42(this.f6849c);
                break;
            default:
                this.f6848b.lambda$trackPlayStoreSubscription$43(this.f6849c);
                break;
        }
    }
}
