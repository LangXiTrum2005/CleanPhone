package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: loaded from: classes4.dex */
final class zzacs extends zzacp implements Choreographer$VsyncCallback {
    private final Handler zzf;

    public /* synthetic */ zzacs(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfj.zzc(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.zzc = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.zzd = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzacs zzacsVar = this.zza;
                zzacsVar.zza.postVsyncCallback(zzacsVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
