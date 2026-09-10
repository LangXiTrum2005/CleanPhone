package com.startapp.sdk.internal;

import android.view.View;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes6.dex */
public final class oj implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41328a;

    public oj(com.startapp.sdk.ads.video.c cVar) {
        this.f41328a = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f41328a;
        cVar.f40535U = true;
        if (cVar.T && cVar.C()) {
            com.startapp.sdk.ads.video.c cVar2 = this.f41328a;
            if (!cVar2.f40538b0 || (videoView = cVar2.O) == null) {
                return;
            }
            cVar2.a(videoView);
        }
    }
}
