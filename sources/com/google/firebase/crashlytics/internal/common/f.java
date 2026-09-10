package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f20372Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String e0;

    public /* synthetic */ f(CrashlyticsCore crashlyticsCore, long j, String str, int i2) {
        this.X = i2;
        this.f20372Y = crashlyticsCore;
        this.Z = j;
        this.e0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                CrashlyticsController crashlyticsController = this.f20372Y.g;
                CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.f20325n;
                if (crashlyticsUncaughtExceptionHandler == null || !crashlyticsUncaughtExceptionHandler.f20348e.get()) {
                    crashlyticsController.f20323i.c(this.Z, this.e0);
                }
                break;
            default:
                CrashlyticsCore crashlyticsCore = this.f20372Y;
                crashlyticsCore.o.f20377b.a(new f(crashlyticsCore, this.Z, this.e0, 0));
                break;
        }
    }
}
