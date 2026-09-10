package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX INFO: loaded from: classes6.dex */
public final class gd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f41010a;

    public gd(od odVar) {
        this.f41010a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f41010a;
        if (odVar.g) {
            return;
        }
        try {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "Failed smart redirect hop info: ".concat(odVar.f41318p ? "Page Finished" : AndroidInitializeBoldSDK.MSG_TIMEOUT);
            g9Var.f = odVar.b();
            g9Var.g = odVar.f;
            g9Var.a();
        } catch (Throwable th) {
            g9.a(th);
        }
        try {
            odVar.o = true;
            h0.d(odVar.f41310a);
            odVar.a();
            if (odVar.k && MetaData.E().i0()) {
                h0.a(odVar.f41310a, odVar.f41313e);
            } else {
                h0.b(odVar.f41310a, odVar.f41313e);
            }
            Runnable runnable = odVar.f41317n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
