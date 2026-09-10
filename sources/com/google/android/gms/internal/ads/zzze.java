package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzze extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzze() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzze zzx(zzbl zzblVar) {
        zza(zzblVar);
        return this;
    }

    public final zzze zzy(int i2, boolean z2) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i2) == z2) {
            return this;
        }
        if (z2) {
            sparseBooleanArray.put(i2, true);
            return this;
        }
        sparseBooleanArray.delete(i2);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzze(zzzf zzzfVar, byte[] bArr) {
        super(zzzfVar);
        this.zza = zzzfVar.zzK;
        this.zzb = zzzfVar.zzM;
        this.zzc = zzzfVar.zzO;
        this.zzd = zzzfVar.zzT;
        this.zze = zzzfVar.zzU;
        this.zzf = zzzfVar.zzV;
        this.zzg = zzzfVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzzfVar.zze();
            if (i2 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i2), new HashMap((Map) sparseArrayZze.valueAt(i2)));
                i2++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzzfVar.zzf().clone();
                return;
            }
        }
    }
}
