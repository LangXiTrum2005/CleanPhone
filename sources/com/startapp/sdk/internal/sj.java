package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class sj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41491a;

    public sj(com.startapp.sdk.ads.video.c cVar) {
        this.f41491a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f41491a;
        if (cVar.f40531N == null) {
            return;
        }
        cVar.S = !cVar.S;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f41491a;
        cVar2.a(cVar2.S);
    }
}
