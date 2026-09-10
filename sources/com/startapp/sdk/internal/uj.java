package com.startapp.sdk.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class uj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41549a;

    public uj(com.startapp.sdk.ads.video.c cVar) {
        this.f41549a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f41549a;
        if (cVar.T && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f41549a;
            if (cVar2.f40535U) {
                int iU = cVar2.u();
                com.startapp.sdk.ads.video.c cVar3 = this.f41549a;
                int iV = cVar3.v();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = iU;
                long seconds = timeUnit.toSeconds(j);
                if (seconds > cVar3.i0) {
                    cVar3.i0 = seconds;
                    vi.a(cVar3.v, true, "videoApi.setVideoCurrentPosition", Long.valueOf(seconds));
                    if (iU != iV || cVar3.g0) {
                        iV -= iU;
                    }
                    vi.a(cVar3.v, true, "videoApi.setVideoRemainingTimer", Long.valueOf(timeUnit.toSeconds(iV)));
                    if (cVar3.E()) {
                        long j2 = 0;
                        if (!cVar3.X && cVar3.C <= 0) {
                            long seconds2 = timeUnit.toSeconds(cVar3.w()) - timeUnit.toSeconds(j);
                            if (seconds2 > 0) {
                                j2 = seconds2;
                            }
                        }
                        vi.a(cVar3.v, true, "videoApi.setSkipTimer", Long.valueOf(j2));
                    }
                }
                this.f41549a.b(iU);
            }
        }
        this.f41549a.p0.postDelayed(this, 200L);
    }
}
