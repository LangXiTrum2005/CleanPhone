package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwx extends zzvo {
    private static final zzak zza;
    private final zzwi[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzwv zzh;
    private final zzvr zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzwx(boolean z2, boolean z3, zzvr zzvrVar, zzwi... zzwiVarArr) {
        this.zzb = zzwiVarArr;
        this.zzi = zzvrVar;
        this.zze = new ArrayList(Arrays.asList(zzwiVarArr));
        this.zzc = new ArrayList(zzwiVarArr.length);
        int i2 = 0;
        while (true) {
            int length = zzwiVarArr.length;
            if (i2 >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgus.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzD(zzwe zzweVar) {
        zzwu zzwuVar = (zzwu) zzweVar;
        int i2 = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zzb;
            if (i2 >= zzwiVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i2);
            zzwe zzweVarZza = zzwuVar.zza(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (((zzww) list.get(i3)).zzb().equals(zzweVarZza)) {
                    list.remove(i3);
                    break;
                }
            }
            zzwiVarArr[i2].zzD(zzwuVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwe zzG(zzwg zzwgVar, zzaah zzaahVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzwi[] zzwiVarArr = this.zzb;
        int length = zzwiVarArr.length;
        zzwe[] zzweVarArr = new zzwe[length];
        int iZze = zzbfVarArr[0].zze(zzwgVar.zza);
        for (int i2 = 0; i2 < length; i2++) {
            zzwg zzwgVarZza = zzwgVar.zza(zzbfVarArr[i2].zzf(iZze));
            zzweVarArr[i2] = zzwiVarArr[i2].zzG(zzwgVarZza, zzaahVar, j - this.zzg[iZze][i2]);
            ((List) this.zzc.get(i2)).add(new zzww(zzwgVarZza, zzweVarArr[i2], null));
        }
        return new zzwu(this.zzi, this.zzg[iZze], zzweVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzak zzJ() {
        zzwi[] zzwiVarArr = this.zzb;
        return zzwiVarArr.length > 0 ? zzwiVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvo, com.google.android.gms.internal.ads.zzvf
    public final void zza(zzhz zzhzVar) {
        super.zza(zzhzVar);
        int i2 = 0;
        while (true) {
            zzwi[] zzwiVarArr = this.zzb;
            if (i2 >= zzwiVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i2), zzwiVarArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvo, com.google.android.gms.internal.ads.zzvf
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvo, com.google.android.gms.internal.ads.zzwi
    public final void zzt() throws IOException {
        zzwv zzwvVar = this.zzh;
        if (zzwvVar != null) {
            throw zzwvVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final /* bridge */ /* synthetic */ void zzu(Object obj, zzwi zzwiVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i2 = this.zzf;
            if (iZzc2 != i2) {
                this.zzh = new zzwv(0);
                return;
            }
            iZzc = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzwiVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final /* bridge */ /* synthetic */ zzwg zzx(Object obj, zzwg zzwgVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i2 = 0; i2 < list2.size(); i2++) {
            if (((zzww) list2.get(i2)).zza().equals(zzwgVar)) {
                return ((zzww) ((List) list.get(0)).get(i2)).zza();
            }
        }
        return null;
    }
}
