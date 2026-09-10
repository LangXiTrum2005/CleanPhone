package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzvf implements zzwi {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzwq zzc = new zzwq();
    private final zztf zzd = new zztf();
    private Looper zze;
    private zzbf zzf;
    private zzpn zzg;

    public void zzM() {
    }

    public abstract void zza(zzhz zzhzVar);

    public void zzc() {
    }

    public abstract void zzd();

    public final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzwh) arrayList.get(i2)).zza(this, zzbfVar);
        }
    }

    public final zzwq zzf(zzwg zzwgVar) {
        return this.zzc.zza(0, zzwgVar);
    }

    public final zzwq zzg(int i2, zzwg zzwgVar) {
        return this.zzc.zza(0, zzwgVar);
    }

    public final zztf zzh(zzwg zzwgVar) {
        return this.zzd.zza(0, zzwgVar);
    }

    public final zztf zzi(int i2, zzwg zzwgVar) {
        return this.zzd.zza(0, zzwgVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    public final zzpn zzk() {
        zzpn zzpnVar = this.zzg;
        zzpnVar.getClass();
        return zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzl(Handler handler, zzwr zzwrVar) {
        this.zzc.zzb(handler, zzwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzm(zzwr zzwrVar) {
        this.zzc.zzc(zzwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzn(Handler handler, zztg zztgVar) {
        this.zzd.zzb(handler, zztgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzo(zztg zztgVar) {
        this.zzd.zzc(zztgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzp(zzwh zzwhVar, zzhz zzhzVar, zzpn zzpnVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z2 = true;
        if (looper != null && looper != looperMyLooper) {
            z2 = false;
        }
        zzgqa.zza(z2);
        this.zzg = zzpnVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzwhVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzwhVar);
            zza(zzhzVar);
        } else if (zzbfVar != null) {
            zzq(zzwhVar);
            zzwhVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzq(zzwh zzwhVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzwhVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzr(zzwh zzwhVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzwhVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzs(zzwh zzwhVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzwhVar);
        if (!arrayList.isEmpty()) {
            zzr(zzwhVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }
}
