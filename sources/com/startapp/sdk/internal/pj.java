package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;

/* JADX INFO: loaded from: classes6.dex */
public final class pj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qj f41375a;

    public pj(qj qjVar) {
        this.f41375a = qjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.startapp.sdk.ads.video.c cVar = this.f41375a.f41414a;
            int i2 = com.startapp.sdk.ads.video.c.t0;
            cVar.I();
            com.startapp.sdk.ads.video.c cVar2 = this.f41375a.f41414a;
            cVar2.a(new ck(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", cVar2.u()));
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
