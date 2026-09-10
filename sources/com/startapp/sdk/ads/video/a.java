package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f40529a;

    public a(c cVar) {
        this.f40529a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f40529a;
        if (cVar.f40531N == null) {
            return;
        }
        ProgressBar progressBar = cVar.f40534R;
        if (progressBar != null && progressBar.isShown()) {
            cVar.I();
        }
        cVar.a(VideoMode$VideoFinishedReason.SKIPPED);
        ActionTrackingLink[] actionTrackingLinkArrP = cVar.x().getVideoTrackingDetails().p();
        cVar.a(cVar.h0, new VideoTrackingParams(cVar.a(cVar.h0), cVar.C, cVar.o, cVar.j0), "skipped", actionTrackingLinkArrP);
    }
}
