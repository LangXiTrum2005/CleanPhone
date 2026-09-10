package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgj {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzffg zzo;

    public final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    public final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    public final /* synthetic */ zzffg zzC() {
        return this.zzo;
    }

    public final zzdgj zza(zzdak zzdakVar, Executor executor) {
        this.zze.add(new zzdij(zzdakVar, executor));
        return this;
    }

    public final zzdgj zzb(zzdby zzdbyVar, Executor executor) {
        this.zzh.add(new zzdij(zzdbyVar, executor));
        return this;
    }

    public final zzdgj zzc(zzdan zzdanVar, Executor executor) {
        this.zzi.add(new zzdij(zzdanVar, executor));
        return this;
    }

    public final zzdgj zzd(zzdba zzdbaVar, Executor executor) {
        this.zzl.add(new zzdij(zzdbaVar, executor));
        return this;
    }

    public final zzdgj zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdij(appEventListener, executor));
        return this;
    }

    public final zzdgj zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdij(zzaVar, executor));
        return this;
    }

    public final zzdgj zzg(zzdir zzdirVar, Executor executor) {
        this.zzd.add(new zzdij(zzdirVar, executor));
        return this;
    }

    public final zzdgj zzh(zzdbe zzdbeVar, Executor executor) {
        this.zzf.add(new zzdij(zzdbeVar, executor));
        return this;
    }

    public final zzdgj zzi(zzdcj zzdcjVar, Executor executor) {
        this.zzg.add(new zzdij(zzdcjVar, executor));
        return this;
    }

    public final zzdgj zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdij(zzrVar, executor));
        return this;
    }

    public final zzdgj zzk(zzddb zzddbVar, Executor executor) {
        this.zzm.add(new zzdij(zzddbVar, executor));
        return this;
    }

    public final zzdgj zzl(zzffg zzffgVar) {
        this.zzo = zzffgVar;
        return this;
    }

    public final zzdgj zzm(zzddq zzddqVar, Executor executor) {
        this.zzb.add(new zzdij(zzddqVar, executor));
        return this;
    }

    public final zzdgk zzn() {
        return new zzdgk(this, null);
    }

    public final /* synthetic */ Set zzo() {
        return this.zza;
    }

    public final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    public final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    public final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    public final /* synthetic */ Set zzs() {
        return this.zze;
    }

    public final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    public final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    public final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    public final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    public final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    public final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    public final /* synthetic */ Set zzz() {
        return this.zzl;
    }
}
