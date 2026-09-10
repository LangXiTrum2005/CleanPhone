package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zztq implements zzue {
    private final zzgqs zza;
    private final zzgqs zzb;

    public zztq(final int i2) {
        zzgqs zzgqsVar = new zzgqs() { // from class: com.google.android.gms.internal.ads.zztp
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztr.zzv(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgqs zzgqsVar2 = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzto
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zztr.zzv(i2, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgqsVar;
        this.zzb = zzgqsVar2;
    }

    public final zztr zza(zzud zzudVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzuj zzujVar = zzudVar.zza;
        String str = zzujVar.zza;
        zztr zztrVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zztr zztrVar2 = new zztr(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), new zztu(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza()), zzudVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzudVar.zzd;
                    int i2 = 0;
                    if (surface == null && zzujVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i2 = 8;
                    }
                    zztrVar2.zzs(zzudVar.zzb, surface, null, i2);
                    return zztrVar2;
                } catch (Exception e2) {
                    exc = e2;
                    zztrVar = zztrVar2;
                    if (zztrVar != null) {
                        zztrVar.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Exception e4) {
            exc = e4;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final /* bridge */ /* synthetic */ zzug zzb(zzud zzudVar) throws IOException {
        throw null;
    }
}
