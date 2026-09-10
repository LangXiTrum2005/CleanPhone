package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class rj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41455a;

    public rj(com.startapp.sdk.ads.video.c cVar) {
        this.f41455a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f41455a;
        vi.a(cVar.v, true, "videoApi.setCloseable", Boolean.TRUE);
    }
}
