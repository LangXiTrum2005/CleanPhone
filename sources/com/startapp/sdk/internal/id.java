package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class id implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ od f41094a;

    public id(od odVar) {
        this.f41094a = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f41094a;
        if (odVar.o || odVar.g) {
            return;
        }
        try {
            odVar.g = true;
            h0.d(odVar.f41310a);
            if (odVar.k && MetaData.E().i0()) {
                h0.a(odVar.f41310a, odVar.f41313e);
            } else {
                h0.b(odVar.f41310a, odVar.f41313e);
            }
            Runnable runnable = odVar.f41317n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
