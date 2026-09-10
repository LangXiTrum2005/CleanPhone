package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzwu implements zzwe, zzwd {
    private final zzwe[] zza;
    private final boolean[] zzb;
    private zzwd zzf;
    private zzyh zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzxy zzi = new zzvq(zzgtd.zzi(), zzgtd.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzwe[] zzh = new zzwe[0];

    public zzwu(zzvr zzvrVar, long[] jArr, zzwe... zzweVarArr) {
        this.zza = zzweVarArr;
        this.zzb = new boolean[zzweVarArr.length];
        for (int i2 = 0; i2 < zzweVarArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.zzb[i2] = true;
                this.zza[i2] = new zzye(zzweVarArr[i2], j);
            }
        }
    }

    public final zzwe zza(int i2) {
        return this.zzb[i2] ? ((zzye) this.zza[i2]).zza() : this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzb(zzwd zzwdVar, long j) {
        this.zzf = zzwdVar;
        ArrayList arrayList = this.zzd;
        zzwe[] zzweVarArr = this.zza;
        Collections.addAll(arrayList, zzweVarArr);
        for (zzwe zzweVar : zzweVarArr) {
            zzweVar.zzb(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzc() throws IOException {
        int i2 = 0;
        while (true) {
            zzwe[] zzweVarArr = this.zza;
            if (i2 >= zzweVarArr.length) {
                return;
            }
            zzweVarArr[i2].zzc();
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final zzyh zzd() {
        zzyh zzyhVar = this.zzg;
        zzyhVar.getClass();
        return zzyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zze(zzzw[] zzzwVarArr, boolean[] zArr, zzxw[] zzxwVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzzwVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = zzzwVarArr.length;
            if (i3 >= length) {
                break;
            }
            zzxw zzxwVar = zzxwVarArr[i3];
            Integer num = zzxwVar == null ? null : (Integer) this.zzc.get(zzxwVar);
            iArr[i3] = num == null ? -1 : num.intValue();
            zzzw zzzwVar = zzzwVarArr[i3];
            if (zzzwVar != null) {
                String str = zzzwVar.zza().zzb;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzwe[] zzweVarArr = this.zza;
        zzxw[] zzxwVarArr2 = new zzxw[length];
        zzxw[] zzxwVarArr3 = new zzxw[length];
        zzzw[] zzzwVarArr2 = new zzzw[length];
        ArrayList arrayList = new ArrayList(zzweVarArr.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < zzweVarArr.length) {
            int i5 = i2;
            while (i5 < zzzwVarArr.length) {
                zzxwVarArr3[i5] = iArr[i5] == i4 ? zzxwVarArr[i5] : null;
                if (iArr2[i5] == i4) {
                    zzzw zzzwVar2 = zzzwVarArr[i5];
                    zzzwVar2.getClass();
                    zzbg zzbgVar = (zzbg) this.zze.get(zzzwVar2.zza());
                    zzbgVar.getClass();
                    zzzwVarArr2[i5] = new zzwt(zzzwVar2, zzbgVar);
                } else {
                    zzzwVarArr2[i5] = null;
                }
                i5++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i6 = i4;
            long jZze = zzweVarArr[i4].zze(zzzwVarArr2, zArr, zzxwVarArr3, zArr2, j2);
            if (i6 == 0) {
                j2 = jZze;
            } else if (jZze != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i7 = 0; i7 < zzzwVarArr.length; i7++) {
                if (iArr3[i7] == i6) {
                    zzxw zzxwVar2 = zzxwVarArr3[i7];
                    zzxwVar2.getClass();
                    zzxwVarArr2[i7] = zzxwVar2;
                    identityHashMap.put(zzxwVar2, Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    zzgqa.zzi(zzxwVarArr3[i7] == null);
                }
            }
            if (z2) {
                arrayList2.add(zzweVarArr[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i2 = 0;
        }
        int i8 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzxwVarArr2, i8, zzxwVarArr, i8, length);
        this.zzh = (zzwe[]) arrayList3.toArray(new zzwe[i8]);
        this.zzi = new zzvq(arrayList3, zzgud.zzc(arrayList3, zzws.zza));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final void zzf(long j, boolean z2) {
        for (zzwe zzweVar : this.zzh) {
            zzweVar.zzf(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        this.zzi.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzh() {
        long j = -9223372036854775807L;
        for (zzwe zzweVar : this.zzh) {
            long jZzh = zzweVar.zzh();
            if (jZzh == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzweVar.zzj(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzwe zzweVar2 : this.zzh) {
                    if (zzweVar2 == zzweVar) {
                        break;
                    }
                    if (zzweVar2.zzj(jZzh) != jZzh) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzh;
            } else if (jZzh != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        return this.zzi.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzj(long j) {
        long jZzj = this.zzh[0].zzj(j);
        int i2 = 1;
        while (true) {
            zzwe[] zzweVarArr = this.zzh;
            if (i2 >= zzweVarArr.length) {
                return jZzj;
            }
            if (zzweVarArr[i2].zzj(jZzj) != jZzj) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final long zzk(long j, zzmq zzmqVar) {
        zzwe[] zzweVarArr = this.zzh;
        return (zzweVarArr.length > 0 ? zzweVarArr[0] : this.zza[0]).zzk(j, zzmqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        return this.zzi.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzm(zzliVar);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzwe) arrayList.get(i2)).zzm(zzliVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwe, com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        return this.zzi.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzp(zzwe zzweVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzweVar);
        if (arrayList.isEmpty()) {
            zzwe[] zzweVarArr = this.zza;
            int i2 = 0;
            for (zzwe zzweVar2 : zzweVarArr) {
                i2 += zzweVar2.zzd().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < zzweVarArr.length; i4++) {
                zzyh zzyhVarZzd = zzweVarArr[i4].zzd();
                int i5 = zzyhVarZzd.zzb;
                int i6 = 0;
                while (i6 < i5) {
                    zzbg zzbgVarZza = zzyhVarZzd.zza(i6);
                    int i7 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        zzv zzvVarZza = zzbgVarZza.zza(i8);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzwe[] zzweVarArr2 = zzweVarArr;
                        StringBuilder sb = new StringBuilder(str.length() + Z.a(i4, 1));
                        sb.append(i4);
                        sb.append(":");
                        sb.append(str);
                        zztVarZza.zza(sb.toString());
                        zzvVarArr[i8] = zztVarZza.zzM();
                        i8++;
                        zzweVarArr = zzweVarArr2;
                    }
                    zzwe[] zzweVarArr3 = zzweVarArr;
                    String str2 = zzbgVarZza.zzb;
                    StringBuilder sb2 = new StringBuilder(Z.a(i4, 1) + String.valueOf(str2).length());
                    sb2.append(i4);
                    sb2.append(":");
                    sb2.append(str2);
                    zzbg zzbgVar = new zzbg(sb2.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    zzbgVarArr[i3] = zzbgVar;
                    i6++;
                    i3++;
                    zzweVarArr = zzweVarArr3;
                }
            }
            this.zzg = new zzyh(zzbgVarArr);
            zzwd zzwdVar = this.zzf;
            zzwdVar.getClass();
            zzwdVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxx
    public final /* bridge */ /* synthetic */ void zzs(zzxy zzxyVar) {
        zzwd zzwdVar = this.zzf;
        zzwdVar.getClass();
        zzwdVar.zzs(this);
    }
}
