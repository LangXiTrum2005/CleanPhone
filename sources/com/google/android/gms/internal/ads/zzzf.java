package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p004ironsource.f9;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzf extends zzbl {
    public static final zzzf zzJ = new zzzf(new zzze());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfj.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(f9.f24992i, 36);
        Integer.toString(f9.j, 36);
        Integer.toString(1015, 36);
        Integer.toString(f9.f24993l, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public /* synthetic */ zzzf(zzze zzzeVar, byte[] bArr) {
        this(zzzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzf.class == obj.getClass()) {
            zzzf zzzfVar = (zzzf) obj;
            if (super.equals(zzzfVar) && this.zzK == zzzfVar.zzK && this.zzM == zzzfVar.zzM && this.zzO == zzzfVar.zzO && this.zzT == zzzfVar.zzT && this.zzU == zzzfVar.zzU && this.zzV == zzzfVar.zzV && this.zzX == zzzfVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzzfVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzZ;
                    SparseArray sparseArray2 = zzzfVar.zzZ;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i3 = 0; i3 < size2; i3++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i3);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzyh zzyhVar = (zzyh) entry.getKey();
                                        if (!map2.containsKey(zzyhVar) || !Objects.equals(entry.getValue(), map2.get(zzyhVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i2) {
        return this.zzaa.get(i2);
    }

    @Deprecated
    public final boolean zzb(int i2, zzyh zzyhVar) {
        Map map = (Map) this.zzZ.get(i2);
        return map != null && map.containsKey(zzyhVar);
    }

    @Deprecated
    public final zzzg zzc(int i2, zzyh zzyhVar) {
        Map map = (Map) this.zzZ.get(i2);
        if (map != null) {
            return (zzzg) map.get(zzyhVar);
        }
        return null;
    }

    public final zzze zzd() {
        return new zzze(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzzf(zzze zzzeVar) {
        super(zzzeVar);
        this.zzK = zzzeVar.zzz();
        this.zzL = false;
        this.zzM = zzzeVar.zzA();
        this.zzN = false;
        this.zzO = zzzeVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzzeVar.zzC();
        this.zzU = zzzeVar.zzD();
        this.zzV = zzzeVar.zzE();
        this.zzW = false;
        this.zzX = zzzeVar.zzF();
        this.zzY = false;
        this.zzZ = zzzeVar.zzG();
        this.zzaa = zzzeVar.zzH();
    }
}
