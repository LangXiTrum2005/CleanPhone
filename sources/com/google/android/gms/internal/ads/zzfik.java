package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfik {
    public final com.google.android.gms.ads.internal.client.zzga zza;
    public final zzbpy zzb;
    public final zzeqp zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbjn zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzco zzo;
    public final zzfhy zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final com.google.android.gms.ads.internal.client.zzcs zzw;

    public /* synthetic */ zzfik(zzfij zzfijVar, byte[] bArr) {
        this.zzf = zzfijVar.zzE();
        this.zzg = zzfijVar.zzF();
        this.zzw = zzfijVar.zzaa();
        this.zze = zzfijVar.zzD().zzB;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD2 = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD3 = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD4 = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD5 = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD6 = zzfijVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzD7 = zzfijVar.zzD();
        int i2 = zzfijVar.zzD().zza;
        long j = zzmVarZzD7.zzb;
        Bundle bundle = zzmVarZzD6.zzc;
        int i3 = zzmVarZzD5.zzd;
        List list = zzmVarZzD4.zze;
        boolean z2 = zzmVarZzD3.zzf;
        int i4 = zzmVarZzD2.zzg;
        boolean z3 = true;
        if (!zzmVarZzD.zzh && !zzfijVar.zzH()) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i2, j, bundle, i3, list, z2, i4, z3, zzfijVar.zzD().zzi, zzfijVar.zzD().zzj, zzfijVar.zzD().zzk, zzfijVar.zzD().zzl, zzfijVar.zzD().zzm, zzfijVar.zzD().zzn, zzfijVar.zzD().zzo, zzfijVar.zzD().zzp, zzfijVar.zzD().zzq, zzfijVar.zzD().zzr, zzfijVar.zzD().zzs, zzfijVar.zzD().zzt, zzfijVar.zzD().zzu, zzfijVar.zzD().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfijVar.zzD().zzw), zzfijVar.zzD().zzx, zzfijVar.zzD().zzy, zzfijVar.zzD().zzz, zzfijVar.zzD().zzA);
        this.zzd = zzmVar;
        this.zza = zzfijVar.zzG() != null ? zzfijVar.zzG() : zzfijVar.zzK() != null ? zzfijVar.zzK().zzf : null;
        this.zzh = zzfijVar.zzI();
        this.zzi = zzfijVar.zzJ();
        this.zzj = zzfijVar.zzI() == null ? null : zzfijVar.zzK() == null ? new zzbjn(new NativeAdOptions.Builder().build()) : zzfijVar.zzK();
        this.zzk = zzfijVar.zzL();
        this.zzl = zzfijVar.zzP();
        this.zzm = zzfijVar.zzM();
        this.zzn = zzfijVar.zzN();
        this.zzo = zzfijVar.zzO();
        this.zzb = zzfijVar.zzQ();
        this.zzp = new zzfhy(zzfijVar.zzR(), null);
        this.zzq = zzfijVar.zzS();
        this.zzr = zzfijVar.zzT();
        this.zzc = zzfijVar.zzU();
        this.zzs = zzfijVar.zzV();
        this.zzt = zzfijVar.zzW();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfijVar.zzX();
        this.zzv = zzfijVar.zzY();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdY));
    }
}
