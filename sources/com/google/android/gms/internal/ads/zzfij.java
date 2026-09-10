package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfij {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbjn zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzco zzl;
    private zzbpy zzn;
    private zzeqp zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcs zzw;
    private int zzm = 1;
    private final zzfhx zzo = new zzfhx();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzfik zzA() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfik(this, null);
    }

    public final boolean zzB() {
        return this.zzp;
    }

    public final boolean zzC() {
        return this.zzq;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzD() {
        return this.zza;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzE() {
        return this.zzb;
    }

    public final /* synthetic */ String zzF() {
        return this.zzc;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzG() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzH() {
        return this.zze;
    }

    public final /* synthetic */ ArrayList zzI() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzJ() {
        return this.zzg;
    }

    public final /* synthetic */ zzbjn zzK() {
        return this.zzh;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzL() {
        return this.zzi;
    }

    public final /* synthetic */ AdManagerAdViewOptions zzM() {
        return this.zzj;
    }

    public final /* synthetic */ PublisherAdViewOptions zzN() {
        return this.zzk;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzco zzO() {
        return this.zzl;
    }

    public final /* synthetic */ int zzP() {
        return this.zzm;
    }

    public final /* synthetic */ zzbpy zzQ() {
        return this.zzn;
    }

    public final /* synthetic */ zzfhx zzR() {
        return this.zzo;
    }

    public final /* synthetic */ boolean zzS() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzT() {
        return this.zzq;
    }

    public final /* synthetic */ zzeqp zzU() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzV() {
        return this.zzs;
    }

    public final /* synthetic */ Bundle zzW() {
        return this.zzt;
    }

    public final /* synthetic */ AtomicLong zzX() {
        return this.zzu;
    }

    public final /* synthetic */ boolean zzY() {
        return this.zzv;
    }

    public final zzfij zzZ(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzw = zzcsVar;
        return this;
    }

    public final zzfij zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzcs zzaa() {
        return this.zzw;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfij zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfij zzd(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzfij zze(boolean z2) {
        this.zzq = z2;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfij zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfij zzi(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfhx zzj() {
        return this.zzo;
    }

    public final zzfij zzk(boolean z2) {
        this.zze = z2;
        return this;
    }

    public final zzfij zzl(int i2) {
        this.zzm = i2;
        return this;
    }

    public final zzfij zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfij zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfij zzo(zzbjn zzbjnVar) {
        this.zzh = zzbjnVar;
        return this;
    }

    public final zzfij zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfij zzq(zzbpy zzbpyVar) {
        this.zzn = zzbpyVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzfij zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfij zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfij zzt(zzeqp zzeqpVar) {
        this.zzr = zzeqpVar;
        return this;
    }

    public final zzfij zzu(boolean z2) {
        this.zzs = true;
        return this;
    }

    public final zzfij zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfij zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfij zzy(boolean z2) {
        this.zzv = true;
        return this;
    }

    public final zzfij zzz(zzfik zzfikVar) {
        this.zzo.zza(zzfikVar.zzp.zza);
        this.zza = zzfikVar.zzd;
        this.zzb = zzfikVar.zzf;
        this.zzw = zzfikVar.zzw;
        this.zzc = zzfikVar.zzg;
        this.zzd = zzfikVar.zza;
        this.zzf = zzfikVar.zzh;
        this.zzg = zzfikVar.zzi;
        this.zzh = zzfikVar.zzj;
        this.zzi = zzfikVar.zzk;
        zzs(zzfikVar.zzm);
        zzr(zzfikVar.zzn);
        this.zzp = zzfikVar.zzq;
        this.zzq = zzfikVar.zzr;
        this.zzr = zzfikVar.zzc;
        this.zzs = zzfikVar.zzs;
        this.zzt = zzfikVar.zzt;
        this.zzu.set(zzfikVar.zzu.get());
        this.zzv = zzfikVar.zzv;
        return this;
    }
}
