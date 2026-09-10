package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcge implements zzhb {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbev zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhf zzl;

    public zzcge(Context context, zzhb zzhbVar, String str, int i2, zzhz zzhzVar, zzcgd zzcgdVar) {
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = str;
        this.zzd = i2;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfk)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfl)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i2, i3) : this.zzb.zza(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        Long l2;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhfVar.zza;
        this.zzh = uri;
        this.zzl = zzhfVar;
        this.zzi = zzbev.zza(uri);
        zzbes zzbesVarZzc = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfh)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhfVar.zze;
                this.zzi.zzi = zzgqr.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbesVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbesVarZzc != null && zzbesVarZzc.zza()) {
                this.zzj = zzbesVarZzc.zzg();
                this.zzk = zzbesVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbesVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhfVar.zze;
            this.zzi.zzi = zzgqr.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfj);
            } else {
                l2 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfi);
            }
            long jLongValue = l2.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbfg.zza(this.zza, this.zzi);
            try {
                try {
                    zzbfh zzbfhVar = (zzbfh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbfhVar.zzc();
                    this.zzj = zzbfhVar.zzd();
                    this.zzk = zzbfhVar.zzf();
                    zzbfhVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbfhVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhe zzheVarZzb = zzhfVar.zzb();
            zzheVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzheVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }
}
