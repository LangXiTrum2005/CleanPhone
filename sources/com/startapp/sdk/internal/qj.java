package com.startapp.sdk.internal;

import android.widget.ProgressBar;
import com.startapp.sdk.adsbase.AdsCommonMetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class qj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f41414a;

    public qj(com.startapp.sdk.ads.video.c cVar) {
        this.f41414a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = this.f41414a.f40534R;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.f41414a.k0.postDelayed(new pj(this), AdsCommonMetaData.k().F().d());
        } catch (Throwable th) {
            this.f41414a.I();
            g9.a(th);
        }
    }
}
