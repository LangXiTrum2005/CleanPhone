package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepr extends com.google.android.gms.ads.internal.client.zzbs {
    final zzfij zza;
    final zzdnv zzb;
    private final Context zzc;
    private final zzclg zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    public zzepr(zzclg zzclgVar, Context context, String str) {
        zzfij zzfijVar = new zzfij();
        this.zza = zzfijVar;
        this.zzb = new zzdnv();
        this.zzd = zzclgVar;
        zzfijVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdnw zzdnwVarZzg = this.zzb.zzg();
        ArrayList arrayListZzh = zzdnwVarZzg.zzh();
        zzfij zzfijVar = this.zza;
        zzfijVar.zzm(arrayListZzh);
        zzfijVar.zzn(zzdnwVarZzg.zzi());
        if (zzfijVar.zzf() == null) {
            zzfijVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new zzeps(this.zzc, this.zzd, zzfijVar, zzdnwVarZzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbkw zzbkwVar) {
        this.zzb.zzb(zzbkwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzbkz zzbkzVar) {
        this.zzb.zza(zzbkzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzblf zzblfVar, zzblc zzblcVar) {
        this.zzb.zzf(str, zzblfVar, zzblcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbjn zzbjnVar) {
        this.zza.zzo(zzbjnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzblj zzbljVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbljVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzblm zzblmVar) {
        this.zzb.zzc(zzblmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbpy zzbpyVar) {
        this.zza.zzq(zzbpyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbqh zzbqhVar) {
        this.zzb.zze(zzbqhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zza.zzZ(zzcsVar);
    }
}
