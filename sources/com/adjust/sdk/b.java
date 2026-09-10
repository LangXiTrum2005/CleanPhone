package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f6813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6814c;

    public /* synthetic */ b(ActivityHandler activityHandler, boolean z10, int i10) {
        this.f6812a = i10;
        this.f6813b = activityHandler;
        this.f6814c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6812a) {
            case 0:
                this.f6813b.lambda$onActivityLifecycle$0(this.f6814c);
                break;
            case 1:
                this.f6813b.lambda$trackMeasurementConsent$39(this.f6814c);
                break;
            case 2:
                this.f6813b.lambda$setCoppaComplianceInDelay$49(this.f6814c);
                break;
            case 3:
                this.f6813b.lambda$setOfflineMode$7(this.f6814c);
                break;
            case 4:
                this.f6813b.lambda$setOfflineMode$8(this.f6814c);
                break;
            case 5:
                this.f6813b.lambda$setEnabled$6(this.f6814c);
                break;
            case 6:
                this.f6813b.lambda$setPlayStoreKidsComplianceInDelay$50(this.f6814c);
                break;
            case 7:
                this.f6813b.lambda$setEnabled$5(this.f6814c);
                break;
            default:
                this.f6813b.lambda$onActivityLifecycle$1(this.f6814c);
                break;
        }
    }
}
