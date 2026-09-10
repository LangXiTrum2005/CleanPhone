package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdfb implements AppEventListener, OnAdMetadataChangedListener, zzdak, com.google.android.gms.ads.internal.client.zza, zzddb, zzdbe, zzdcj, com.google.android.gms.ads.internal.overlay.zzr, zzdba, zzdir {
    private final zzdea zza = new zzdea(this, null);

    @Nullable
    private zzeqp zzb;

    @Nullable
    private zzeqt zzc;

    @Nullable
    private zzfdr zzd;

    @Nullable
    private zzfgv zze;

    private static void zzs(Object obj, zzdfa zzdfaVar) {
        if (obj != null) {
            zzdfaVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdef.zza);
        zzs(this.zzc, zzdes.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdey.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzdds
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzeqp) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(final zzbzm zzbzmVar, final String str, final String str2) {
        zzs(this.zzb, new zzdfa(zzbzmVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzddz
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddr
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgv) obj).zzd(zzbzmVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
        zzs(this.zzb, zzdec.zza);
        zzs(this.zze, zzdeu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
        zzs(this.zzb, zzdeg.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzs(this.zzd, zzdem.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(final int i2) {
        zzs(this.zzd, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddy
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzfdr) obj).zzdT(i2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        zzs(this.zzb, zzdei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        zzs(this.zzb, zzdeb.zza);
        zzs(this.zze, zzdet.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        zzs(this.zzb, zzdej.zza);
        zzs(this.zze, zzdez.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzs(this.zzb, zzdeh.zza);
        zzs(this.zzc, zzder.zza);
        zzs(this.zze, zzdex.zza);
        zzs(this.zzd, zzdeq.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, zzden.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, zzdeo.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, zzdep.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
        zzs(this.zzb, zzded.zza);
        zzs(this.zze, zzdev.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
        zzs(this.zzb, zzdee.zza);
        zzs(this.zze, zzdew.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdel.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddw
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgv) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddx
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzeqp) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzl() {
        zzs(this.zzd, zzdek.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddt
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzeqp) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddu
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzfgv) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdfa() { // from class: com.google.android.gms.internal.ads.zzddv
            @Override // com.google.android.gms.internal.ads.zzdfa
            public final /* synthetic */ void zza(Object obj) {
                ((zzfdr) obj).zzm(zztVar);
            }
        });
    }

    public final zzdea zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzeqp zzeqpVar) {
        this.zzb = zzeqpVar;
    }

    public final /* synthetic */ void zzp(zzeqt zzeqtVar) {
        this.zzc = zzeqtVar;
    }

    public final /* synthetic */ void zzq(zzfdr zzfdrVar) {
        this.zzd = zzfdrVar;
    }

    public final /* synthetic */ void zzr(zzfgv zzfgvVar) {
        this.zze = zzfgvVar;
    }
}
