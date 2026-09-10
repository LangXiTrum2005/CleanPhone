package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzicg implements zzicu {
    private final zzicc zza;
    private final zzidf zzb;
    private final boolean zzc;
    private final zziac zzd;

    private zzicg(zzidf zzidfVar, zziac zziacVar, zzicc zziccVar) {
        this.zzb = zzidfVar;
        this.zzc = zziccVar instanceof zzian;
        this.zzd = zziacVar;
        this.zza = zziccVar;
    }

    public static zzicg zzh(zzidf zzidfVar, zziac zziacVar, zzicc zziccVar) {
        return new zzicg(zzidfVar, zziacVar, zziccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final Object zza() {
        zzicc zziccVar = this.zza;
        return zziccVar instanceof zziar ? ((zziar) zziccVar).zzbg() : zziccVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zziar) obj).zzt.equals(((zziar) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzian) obj).zza.equals(((zzian) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final int zzc(Object obj) {
        int iHashCode = ((zziar) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzian) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzd(Object obj, Object obj2) {
        zzicw.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzicw.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final int zze(Object obj) {
        int iZzh = ((zziar) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zzian) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzf(Object obj, zzidu zziduVar) throws IOException {
        Iterator itZzc = ((zzian) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zziaf zziafVar = (zziaf) entry.getKey();
            if (zziafVar.zzc() != zzidt.MESSAGE || zziafVar.zzd() || zziafVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzibj) {
                zziduVar.zzv(zziafVar.zza(), ((zzibj) entry).zza().zzc());
            } else {
                zziduVar.zzv(zziafVar.zza(), entry.getValue());
            }
        }
        ((zziar) obj).zzt.zzf(zziduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzg(Object obj, zzicp zzicpVar, zziab zziabVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzj(Object obj, byte[] bArr, int i2, int i3, zzhyz zzhyzVar) throws IOException {
        zziar zziarVar = (zziar) obj;
        if (zziarVar.zzt == zzidg.zza()) {
            zziarVar.zzt = zzidg.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final boolean zzl(Object obj) {
        return ((zzian) obj).zza.zze();
    }
}
