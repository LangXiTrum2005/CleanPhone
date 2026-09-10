package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class rh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f41453a;

    public rh(yh yhVar) {
        this.f41453a = yhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh yhVar = this.f41453a;
        try {
            vh vhVar = yhVar.f;
            if (vhVar != null) {
                vhVar.b();
                yhVar.f = null;
            }
        } catch (Throwable th) {
            if (yhVar.a(4)) {
                g9.a(th);
            }
        }
    }
}
