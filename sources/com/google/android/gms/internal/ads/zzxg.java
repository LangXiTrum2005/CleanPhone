package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxg extends zzbv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxg() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    private final void zzy() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzxg zzq(int i, boolean z) {
        if (this.zzi.get(i) != z) {
            if (z) {
                this.zzi.put(i, true);
            } else {
                this.zzi.delete(i);
            }
        }
        return this;
    }

    public zzxg(Context context) {
        zze(context);
        Point pointZzw = zzei.zzw(context);
        zzf(pointZzw.x, pointZzw.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    public /* synthetic */ zzxg(zzxh zzxhVar, zzxs zzxsVar) {
        super(zzxhVar);
        this.zza = zzxhVar.zzD;
        this.zzb = zzxhVar.zzF;
        this.zzc = zzxhVar.zzH;
        this.zzd = zzxhVar.zzM;
        this.zze = zzxhVar.zzN;
        this.zzf = zzxhVar.zzO;
        this.zzg = zzxhVar.zzQ;
        SparseArray sparseArray = zzxhVar.zzS;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzxhVar.zzT.clone();
    }
}
