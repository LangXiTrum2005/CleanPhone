package com.startapp.sdk.ads.video;

import com.startapp.sdk.internal.sd;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f40530a;

    public b(c cVar) {
        this.f40530a = cVar;
    }

    public final void a() {
        c cVar = this.f40530a;
        if (!cVar.g0) {
            cVar.a(VideoMode$VideoFinishedReason.COMPLETE);
        }
        sd sdVar = this.f40530a.f40531N;
        if (sdVar != null) {
            sdVar.f41480h.stopPlayback();
        }
    }
}
