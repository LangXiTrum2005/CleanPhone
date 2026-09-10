package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6808b;

    public /* synthetic */ a(ActivityHandler activityHandler, int i10) {
        this.f6807a = i10;
        this.f6808b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6807a;
        ActivityHandler activityHandler = this.f6808b;
        switch (i10) {
            case 0:
                activityHandler.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                activityHandler.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                activityHandler.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                activityHandler.lambda$sendReftagReferrer$17();
                break;
            case 5:
                activityHandler.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                activityHandler.lambda$gdprForgetMe$34();
                break;
            case 7:
                activityHandler.lambda$gdprForgetMe$35();
                break;
            default:
                activityHandler.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
