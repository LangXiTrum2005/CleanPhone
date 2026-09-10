package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzik {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i2 = this.zza;
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = this.zzd;
        int i6 = this.zze;
        int i7 = this.zzf;
        int i8 = this.zzg;
        int i9 = this.zzh;
        int i10 = this.zzi;
        int i11 = this.zzj;
        long j = this.zzk;
        int i12 = this.zzl;
        String str = zzfj.zza;
        Locale locale = Locale.US;
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
        androidx.datastore.preferences.protobuf.a.y(sbP, i10, "\n droppedToKeyframeEvents=", i11, "\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i12);
        sbP.append("\n}");
        return sbP.toString();
    }

    public final synchronized void zza() {
    }
}
