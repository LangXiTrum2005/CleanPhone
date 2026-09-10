package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PackageHandler f7054b;

    public /* synthetic */ v0(PackageHandler packageHandler, int i10) {
        this.f7053a = i10;
        this.f7054b = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7053a) {
            case 0:
                this.f7054b.initI();
                break;
            case 1:
                this.f7054b.sendFirstI();
                break;
            case 2:
                PackageHandler packageHandler = this.f7054b;
                packageHandler.logger.verbose("Package handler can send", new Object[0]);
                packageHandler.isSending.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                this.f7054b.flushI();
                break;
            default:
                PackageHandler packageHandler2 = this.f7054b;
                packageHandler2.logger.verbose("Package handler finished waiting to continue", new Object[0]);
                packageHandler2.isSending.set(false);
                packageHandler2.sendFirstPackage();
                break;
        }
    }
}
