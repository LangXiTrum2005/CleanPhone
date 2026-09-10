package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface zzug {
    void zza(int i2, int i3, int i4, long j, int i5);

    void zzb(int i2, int i3, zzie zzieVar, long j, int i4);

    void zzc(int i2, boolean z2);

    void zzd(int i2, long j);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i2);

    default void zzi(Runnable runnable) {
        runnable.run();
    }

    ByteBuffer zzj(int i2);

    void zzk();

    void zzl();

    default boolean zzm(zzuf zzufVar) {
        return false;
    }

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i2);
}
