package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnAttributionReadListener f7042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f7043c;

    public /* synthetic */ u(ActivityHandler activityHandler, OnAttributionReadListener onAttributionReadListener, int i10) {
        this.f7041a = i10;
        this.f7043c = activityHandler;
        this.f7042b = onAttributionReadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7041a) {
            case 0:
                this.f7042b.onAttributionRead(this.f7043c.attribution);
                break;
            default:
                this.f7042b.onAttributionRead(this.f7043c.attribution);
                break;
        }
    }
}
