package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzmg extends zzii {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzmg(Collection collection, zzxz zzxzVar) {
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i3] = ((zzlo) it.next()).zzb();
            i3++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i2] = ((zzlo) it2.next()).zza();
            i2++;
        }
        this(zzbfVarArr, objArr, zzxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzp(int i2) {
        return zzfj.zzl(this.zze, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzq(int i2) {
        return zzfj.zzl(this.zzf, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final zzbf zzs(int i2) {
        return this.zzg[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzt(int i2) {
        return this.zze[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzu(int i2) {
        return this.zzf[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final Object zzv(int i2) {
        return this.zzh[i2];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzmg zzx(zzxz zzxzVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i2 = 0; i2 < zzbfVarArr.length; i2++) {
            zzbfVarArr2[i2] = new zzmf(this, zzbfVarArr[i2]);
        }
        return new zzmg(zzbfVarArr2, this.zzh, zzxzVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmg(zzbf[] zzbfVarArr, Object[] objArr, zzxz zzxzVar) {
        super(false, zzxzVar);
        int i2 = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i3 = 0;
        while (i2 < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i2];
            this.zzg[i3] = zzbfVar;
            this.zzf[i3] = iZza;
            this.zze[i3] = iZzc;
            iZza += zzbfVar.zza();
            iZzc += this.zzg[i3].zzc();
            this.zzi.put(objArr[i3], Integer.valueOf(i3));
            i2++;
            i3++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}
