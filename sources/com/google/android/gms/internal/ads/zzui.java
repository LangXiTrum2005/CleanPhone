package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public class zzui extends zzif {
    public final int zza;

    public zzui(Throwable th, zzuj zzujVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zzujVar == null ? null : zzujVar.zza)), th);
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
