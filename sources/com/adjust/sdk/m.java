package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustDeeplink f6880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6881d;

    public /* synthetic */ m(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j10, int i10) {
        this.f6878a = i10;
        this.f6879b = activityHandler;
        this.f6880c = adjustDeeplink;
        this.f6881d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6878a) {
            case 0:
                this.f6879b.lambda$processDeeplink$13(this.f6880c, this.f6881d);
                break;
            case 1:
                this.f6879b.lambda$processDeeplink$12(this.f6880c, this.f6881d);
                break;
            case 2:
                this.f6879b.lambda$processAndResolveDeeplink$14(this.f6880c, this.f6881d);
                break;
            default:
                this.f6879b.lambda$processAndResolveDeeplink$15(this.f6880c, this.f6881d);
                break;
        }
    }
}
