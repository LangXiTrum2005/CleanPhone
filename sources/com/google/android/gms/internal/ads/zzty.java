package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzty implements zzue {
    private final Context zza;

    @Deprecated
    public zzty() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzue
    public final zzug zzb(zzud zzudVar) throws Throwable {
        Context context;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || ((context = this.zza) != null && i2 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzf = zzas.zzf(zzudVar.zzc.zzo);
            zzee.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzP(iZzf)));
            return new zztq(iZzf).zza(zzudVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzuj zzujVar = zzudVar.zza;
            String str = zzujVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzudVar.zzd;
                int i3 = 0;
                if (surface == null && zzujVar.zzh && i2 >= 35) {
                    i3 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzudVar.zzb, surface, (MediaCrypto) null, i3);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzvd(mediaCodecCreateByCodecName, zzudVar.zzf, null);
            } catch (IOException e2) {
                e = e2;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    public zzty(Context context, zzgqs zzgqsVar, zzgqs zzgqsVar2) {
        this.zza = context;
    }
}
