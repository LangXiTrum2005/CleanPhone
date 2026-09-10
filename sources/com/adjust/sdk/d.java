package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAdRevenue f6827c;

    public /* synthetic */ d(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i10) {
        this.f6825a = i10;
        this.f6826b = activityHandler;
        this.f6827c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6825a) {
            case 0:
                this.f6826b.lambda$trackAdRevenue$41(this.f6827c);
                break;
            default:
                this.f6826b.lambda$trackAdRevenue$40(this.f6827c);
                break;
        }
    }
}
