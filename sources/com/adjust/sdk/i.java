package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnIsEnabledListener f6854c;

    public /* synthetic */ i(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i10) {
        this.f6852a = i10;
        this.f6853b = activityHandler;
        this.f6854c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6852a) {
            case 0:
                this.f6853b.lambda$isEnabled$9(this.f6854c);
                break;
            case 1:
                this.f6853b.lambda$isEnabled$11(this.f6854c);
                break;
            default:
                this.f6853b.lambda$isEnabled$10(this.f6854c);
                break;
        }
    }
}
