package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzum extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzuj zzc;
    public final String zzd;

    public zzum(zzv zzvVar, Throwable th, boolean z2, int i2) {
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzvVar.zzo;
        int iAbs = Math.abs(i2);
        this(string2, th, str, false, null, androidx.datastore.preferences.protobuf.a.g(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)), null);
    }

    public final /* synthetic */ zzum zza(zzum zzumVar) {
        return new zzum(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzumVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzum(zzv zzvVar, Throwable th, boolean z2, zzuj zzujVar) {
        String str = zzujVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        this(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th, zzvVar.zzo, false, zzujVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzum(String str, Throwable th, String str2, boolean z2, zzuj zzujVar, String str3, zzum zzumVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzujVar;
        this.zzd = str3;
    }
}
