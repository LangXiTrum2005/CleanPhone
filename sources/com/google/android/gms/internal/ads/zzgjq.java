package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgjq implements zzgje {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgbc zzc;
    private final String zzd;
    private final String zze;
    private final zzgnc zzf;
    private final zzgjs zzg;

    public zzgjq(Context context, ExecutorService executorService, zzgad zzgadVar, zzgbc zzgbcVar, zzgnc zzgncVar, zzgjs zzgjsVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgbcVar;
        this.zzf = zzgncVar;
        this.zzg = zzgjsVar;
        this.zzd = zzgadVar.zzb();
        this.zze = zzgadVar.zzi().zzc();
    }

    private static zzgcq zze(int i2) {
        zzgcp zzgcpVarZzd = zzgcq.zzd();
        zzgcpVarZzd.zze(i2);
        return (zzgcq) zzgcpVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgje
    public final ListenableFuture zza() {
        int i2;
        zzbbl zzbblVarZza = zzbbm.zza();
        byte[] bArrZza = zzatg.zza();
        zzhzl zzhzlVar = zzhzl.zzb;
        zzbblVarZza.zza(zzhzl.zzs(bArrZza, 0, bArrZza.length));
        zzbblVarZza.zzb(Build.VERSION.SDK_INT);
        zzbblVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzbblVarZza.zzd(context.getPackageName());
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i2 = -1;
        }
        zzgbc zzgbcVar = this.zzc;
        zzgnc zzgncVar = this.zzf;
        zzbblVarZza.zze(i2);
        zzbblVarZza.zzf(this.zzd);
        zzgye zzgyeVar = (zzgye) zzgym.zzg((zzgye) zzgym.zzg((zzgye) zzgym.zzk(zzgye.zzw(zzgbcVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgay.zza(((zzbbm) zzbblVarZza.zzbu()).zzaN(), true)).build().toString())), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzgbb) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((UnknownHostException) obj);
            }
        }, zzgzd.zza()), SocketException.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgjo
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((SocketException) obj);
            }
        }, zzgzd.zza());
        zzgncVar.zze(20002, zzgyeVar);
        return zzgyeVar;
    }

    public final /* synthetic */ zzgcq zzb(zzgbb zzgbbVar) {
        if (zzgbbVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzatg.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String strZzb = zzgbbVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbbo zzbboVarZzb = zzbbo.zzb(zzgay.zzb(strZzb, true), zziab.zzb());
            if (zzbboVarZzb.zza().zzc() && zzbboVarZzb.zza().zza()) {
                if (!this.zzg.zza(zzbboVarZzb)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzgcp zzgcpVarZzd = zzgcq.zzd();
                zzgcr zzgcrVarZze = zzgcs.zze();
                zzgcrVarZze.zzb(zzbboVarZzb.zza().zzb());
                zzgcpVarZzd.zzb(zzgcrVarZze);
                zzgcpVarZzd.zzc(zzbboVarZzb.zza().zzd());
                zzgcpVarZzd.zze(2);
                return (zzgcq) zzgcpVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    public final /* synthetic */ zzgcq zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    public final /* synthetic */ zzgcq zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
