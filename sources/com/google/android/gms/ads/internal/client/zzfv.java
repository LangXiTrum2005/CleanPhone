package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfv extends zzec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoController.VideoLifecycleCallbacks f10879a;

    public zzfv(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f10879a = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        this.f10879a.onVideoStart();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        this.f10879a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() {
        this.f10879a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() {
        this.f10879a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi(boolean z10) {
        this.f10879a.onVideoMute(z10);
    }
}
