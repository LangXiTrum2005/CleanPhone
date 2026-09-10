package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6845c;

    public /* synthetic */ g(ActivityHandler activityHandler, String str, int i10) {
        this.f6843a = i10;
        this.f6844b = activityHandler;
        this.f6845c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6843a) {
            case 0:
                this.f6844b.lambda$setExternalDeviceIdInDelay$51(this.f6845c);
                break;
            case 1:
                this.f6844b.lambda$removeGlobalPartnerParameter$27(this.f6845c);
                break;
            default:
                this.f6844b.lambda$removeGlobalCallbackParameter$25(this.f6845c);
                break;
        }
    }
}
