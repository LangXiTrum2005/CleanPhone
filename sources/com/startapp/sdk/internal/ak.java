package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class ak implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f40814a;

    public ak(bk bkVar) {
        this.f40814a = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f40814a.f40844b;
        int i2 = com.startapp.sdk.ads.video.c.t0;
        cVar.j();
        this.f40814a.f40844b.t();
    }
}
