package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAdidReadListener f6914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6915c;

    public /* synthetic */ s(ActivityHandler activityHandler, OnAdidReadListener onAdidReadListener, int i10) {
        this.f6913a = i10;
        this.f6915c = activityHandler;
        this.f6914b = onAdidReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6913a) {
            case 0:
                this.f6914b.onAdidRead(this.f6915c.activityState.adid);
                break;
            default:
                this.f6914b.onAdidRead(this.f6915c.activityState.adid);
                break;
        }
    }
}
