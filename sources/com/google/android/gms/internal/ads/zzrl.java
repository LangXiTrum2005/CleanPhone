package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrl implements zzsb {
    private final zzfvf zza;
    private final zzfvf zzb;
    private boolean zzc;

    public zzrl(int i) {
        zzrj zzrjVar = new zzrj(i);
        zzrk zzrkVar = new zzrk(i);
        this.zza = zzrjVar;
        this.zzb = zzrkVar;
        this.zzc = true;
    }

    public static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzrn.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzrn.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:4:0x001a, B:6:0x0020, B:10:0x002b, B:15:0x0036, B:17:0x0051, B:16:0x003f), top: B:39:0x001a }] */
    public final zzrn zzc(zzsa zzsaVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        zzse zzrrVar;
        int i;
        String str = zzsaVar.zza.zza;
        zzrn zzrnVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc) {
                    zzab zzabVar = zzsaVar.zzc;
                    int i2 = zzei.zza;
                    if (i2 >= 34 && (i2 >= 35 || zzbb.zzi(zzabVar.zzo))) {
                        zzrrVar = new zztd(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        zzrrVar = new zzrr(mediaCodecCreateByCodecName, zzb(((zzrk) this.zzb).zza));
                        i = 0;
                    }
                } else {
                    zzrrVar = new zzrr(mediaCodecCreateByCodecName, zzb(((zzrk) this.zzb).zza));
                    i = 0;
                }
                zzrn zzrnVar2 = new zzrn(mediaCodecCreateByCodecName, zza(((zzrj) this.zza).zza), zzrrVar, zzsaVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzsaVar.zzd;
                    if (surface == null && zzsaVar.zza.zzh && zzei.zza >= 35) {
                        i |= 8;
                    }
                    zzrn.zzh(zzrnVar2, zzsaVar.zzb, surface, null, i);
                    return zzrnVar2;
                } catch (Exception e) {
                    e = e;
                    zzrnVar = zzrnVar2;
                    if (zzrnVar != null) {
                        zzrnVar.zzm();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final /* bridge */ /* synthetic */ zzsd zzd(zzsa zzsaVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzc = true;
    }
}
