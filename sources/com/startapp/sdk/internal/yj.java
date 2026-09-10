package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41724a;

    public yj(com.startapp.sdk.ads.video.c cVar) {
        this.f41724a = cVar;
    }

    public final void a(int i2) {
        com.startapp.sdk.ads.video.c cVar;
        sd sdVar;
        sd sdVar2 = this.f41724a.f40531N;
        int duration = sdVar2 != null ? sdVar2.f41480h.getDuration() : 0;
        com.startapp.sdk.ads.video.c cVar2 = this.f41724a;
        if (cVar2.a0 && duration > 0 && cVar2.C()) {
            com.startapp.sdk.ads.video.c cVar3 = this.f41724a;
            cVar3.Z = i2;
            int currentPosition = (cVar3.f40531N.f41480h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f41724a.f40534R;
            if (progressBar == null || !progressBar.isShown()) {
                int i3 = this.f41724a.Z;
                if (i3 >= 100 || i3 - currentPosition > AdsCommonMetaData.k().F().j() || (sdVar = (cVar = this.f41724a).f40531N) == null) {
                    return;
                }
                sdVar.f41480h.pause();
                ProgressBar progressBar2 = cVar.f40534R;
                if (progressBar2 == null || !progressBar2.isShown()) {
                    cVar.k0.postDelayed(new qj(cVar), AdsCommonMetaData.k().F().h());
                    return;
                }
                return;
            }
            com.startapp.sdk.ads.video.c cVar4 = this.f41724a;
            if (!cVar4.f40538b0 && cVar4.B()) {
                this.f41724a.H();
                return;
            }
            int i4 = this.f41724a.Z;
            if (i4 == 100 || i4 - currentPosition > AdsCommonMetaData.k().F().i()) {
                com.startapp.sdk.ads.video.c cVar5 = this.f41724a;
                sd sdVar3 = cVar5.f40531N;
                if (sdVar3 != null) {
                    sdVar3.f41480h.start();
                    cVar5.v.setBackgroundColor(33554431);
                }
                cVar5.I();
            }
        }
    }
}
