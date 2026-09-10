package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasy extends zziip {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zziiz zzm;
    private long zzn;

    public zzasy() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zziiz.zzj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.zzg);
        sb.append(";modificationTime=");
        sb.append(this.zzh);
        sb.append(";timescale=");
        sb.append(this.zzi);
        sb.append(";duration=");
        sb.append(this.zzj);
        sb.append(";rate=");
        sb.append(this.zzk);
        sb.append(";volume=");
        sb.append(this.zzl);
        sb.append(";matrix=");
        sb.append(this.zzm);
        sb.append(";nextTrackId=");
        return android.support.v4.media.a.j(this.zzn, d9.i.f24752e, sb);
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zziin
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zziiu.zza(zzasu.zzd(byteBuffer));
            this.zzh = zziiu.zza(zzasu.zzd(byteBuffer));
            this.zzi = zzasu.zza(byteBuffer);
            this.zzj = zzasu.zzd(byteBuffer);
        } else {
            this.zzg = zziiu.zza(zzasu.zza(byteBuffer));
            this.zzh = zziiu.zza(zzasu.zza(byteBuffer));
            this.zzi = zzasu.zza(byteBuffer);
            this.zzj = zzasu.zza(byteBuffer);
        }
        this.zzk = zzasu.zze(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzasu.zzb(byteBuffer);
        zzasu.zza(byteBuffer);
        zzasu.zza(byteBuffer);
        this.zzm = new zziiz(zzasu.zze(byteBuffer), zzasu.zze(byteBuffer), zzasu.zze(byteBuffer), zzasu.zze(byteBuffer), zzasu.zzf(byteBuffer), zzasu.zzf(byteBuffer), zzasu.zzf(byteBuffer), zzasu.zze(byteBuffer), zzasu.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzasu.zza(byteBuffer);
    }
}
