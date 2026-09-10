package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzxb implements zzaav, zzvv {
    final /* synthetic */ zzxk zza;
    private final long zzb;
    private final Uri zzc;
    private final zzhy zzd;
    private final zzwz zze;
    private final zzaer zzf;
    private final zzdq zzg;
    private final zzafo zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhf zzl;
    private zzaga zzm;
    private boolean zzn;

    public zzxb(zzxk zzxkVar, Uri uri, zzhb zzhbVar, zzwz zzwzVar, zzaer zzaerVar, zzdq zzdqVar) {
        Objects.requireNonNull(zzxkVar);
        this.zza = zzxkVar;
        this.zzc = uri;
        this.zzd = new zzhy(zzhbVar);
        this.zze = zzwzVar;
        this.zzf = zzaerVar;
        this.zzg = zzdqVar;
        this.zzh = new zzafo();
        this.zzj = true;
        this.zzb = zzvx.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhf zzi(long j, String str) {
        Map mapZzd = zzxk.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgtf zzgtfVar = new zzgtf();
            zzgtfVar.zzb(mapZzd.entrySet());
            zzgtfVar.zza("If-Range", str);
            mapZzd = zzgtfVar.zzd();
        }
        zzhe zzheVar = new zzhe();
        zzheVar.zza(this.zzc);
        zzheVar.zzc(j);
        zzheVar.zzd(6);
        zzheVar.zzb(mapZzd);
        return zzheVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zza(zzer zzerVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzerVar.zzd();
        zzaga zzagaVar = this.zzm;
        zzagaVar.getClass();
        zzagaVar.zzz(zzerVar, iZzd);
        zzagaVar.zzx(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaav
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0203 */
    /* JADX WARN: Code duplicated, block: B:108:0x022e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    @Override // com.google.android.gms.internal.ads.zzaav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxb.zzc():void");
    }

    public final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzhf zzh() {
        return this.zzl;
    }
}
