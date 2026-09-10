package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsController;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f20370Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f20370Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.Z;
        Object obj2 = this.f20370Y;
        switch (this.X) {
            case 0:
                ((CrashlyticsCore) obj2).a((SettingsController) obj);
                break;
            case 1:
                ((CrashlyticsCore) obj2).a((SettingsController) obj);
                break;
            default:
                b bVar = CrashlyticsController.r;
                ((CrashlyticsController) obj2).c((String) obj, Boolean.FALSE);
                break;
        }
    }
}
