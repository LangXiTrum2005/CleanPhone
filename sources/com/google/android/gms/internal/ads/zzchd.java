package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchd extends zzcgx implements zzhz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcfj zze;
    private boolean zzf;
    private final zzchc zzg;
    private final zzcgg zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzchd(zzcfk zzcfkVar, zzcfj zzcfjVar) {
        super(zzcfkVar);
        this.zze = zzcfjVar;
        this.zzg = new zzchc();
        this.zzh = new zzcgg();
        this.zzk = new Object();
        this.zzl = (String) zzgpy.zzd(zzcfkVar != null ? zzcfkVar.zzn() : null).zza("");
        this.zzm = zzcfkVar != null ? zzcfkVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzP = zzcfb.zzP();
        int iZzQ = zzcfb.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
        if (zzhbVar instanceof zzhm) {
            this.zzg.zzb((zzhm) zzhbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhz
    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zze(String str) {
        String str2;
        String str3;
        Clock clock;
        this.zzd = str;
        String str4 = "error";
        String strZzv = zzv(str);
        try {
            zzhi zzhiVar = new zzhi();
            zzhiVar.zzb(this.zzb);
            zzcfj zzcfjVar = this.zze;
            zzhiVar.zzc(zzcfjVar.zzd);
            zzhiVar.zzd(zzcfjVar.zze);
            zzhiVar.zze(true);
            zzhiVar.zzf(this);
            zzhb zzhbVarZza = zzhiVar.zza();
            if (zzcfjVar.zzi) {
                zzhbVarZza = new zzcge(this.zza, zzhbVarZza, this.zzl, this.zzm, null, null);
            }
            zzhbVarZza.zzb(new zzhf(Uri.parse(str), 0L, -1L, null));
            zzcfk zzcfkVar = (zzcfk) this.zzc.get();
            if (zzcfkVar != null) {
                zzcfkVar.zzt(strZzv, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzag)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaf)).longValue();
            this.zzi = ByteBuffer.allocate(zzcfjVar.zzc);
            byte[] bArr = new byte[Segment.SIZE];
            long j = jCurrentTimeMillis;
            while (true) {
                str2 = str4;
                try {
                    int iZza = zzhbVarZza.zza(bArr, 0, Math.min(this.zzi.remaining(), Segment.SIZE));
                    if (iZza == -1) {
                        this.zzn = true;
                        zzp(str, strZzv, (int) this.zzh.zza(this.zzi));
                        break;
                    }
                    synchronized (this.zzk) {
                        clock = clockZzk;
                        try {
                            if (!this.zzf) {
                                this.zzi.put(bArr, 0, iZza);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzx();
                        break;
                    }
                    str3 = this.zzf;
                    try {
                        if (str3 != 0) {
                            int iLimit = this.zzi.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(iLimit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long jCurrentTimeMillis2 = clock.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j >= jLongValue) {
                            zzx();
                            j = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(jLongValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        clockZzk = clock;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                    } catch (Exception e2) {
                        e = e2;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                        String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(strS.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", strS);
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
                        zzq(str, strZzv, str3, strS);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    String strS2 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                    String strQ2 = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(strS2.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", strS2);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ2);
                    zzq(str, strZzv, str3, strS2);
                    return false;
                }
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }
}
