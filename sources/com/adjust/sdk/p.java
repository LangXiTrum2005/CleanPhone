package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6900d;

    public /* synthetic */ p(ActivityHandler activityHandler, boolean z10, String str, int i10) {
        this.f6897a = i10;
        this.f6898b = activityHandler;
        this.f6899c = z10;
        this.f6900d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6897a) {
            case 0:
                this.f6898b.lambda$setPushToken$33(this.f6899c, this.f6900d);
                break;
            default:
                this.f6898b.lambda$setPushToken$32(this.f6899c, this.f6900d);
                break;
        }
    }
}
