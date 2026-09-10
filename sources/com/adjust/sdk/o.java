package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6894d;

    public /* synthetic */ o(ActivityHandler activityHandler, String str, String str2, int i10) {
        this.f6891a = i10;
        this.f6892b = activityHandler;
        this.f6893c = str;
        this.f6894d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6891a) {
            case 0:
                this.f6892b.lambda$addGlobalPartnerParameter$23(this.f6893c, this.f6894d);
                break;
            default:
                this.f6892b.lambda$addGlobalCallbackParameter$21(this.f6893c, this.f6894d);
                break;
        }
    }
}
