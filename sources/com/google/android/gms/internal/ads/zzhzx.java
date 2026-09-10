package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzx implements zzidu {
    private final zzhzw zza;

    private zzhzx(zzhzw zzhzwVar) {
        zzibe.zza(zzhzwVar, "output");
        this.zza = zzhzwVar;
        zzhzwVar.zze = this;
    }

    public static zzhzx zza(zzhzw zzhzwVar) {
        Object obj = zzhzwVar.zze;
        return obj != null ? (zzhzx) obj : new zzhzx(zzhzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i4 += 8;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzibq zzibqVar = (zzibq) list;
        if (!z2) {
            while (i3 < zzibqVar.size()) {
                this.zza.zzh(i2, zzibqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzibqVar.size(); i7++) {
            zzibqVar.zzc(i7);
            i6 += 8;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zzibqVar.size()) {
            zzhzwVar2.zzv(zzibqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zziai)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzM(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).getClass();
                i4 += 4;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzt(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zziai zziaiVar = (zziai) list;
        if (!z2) {
            while (i3 < zziaiVar.size()) {
                this.zza.zzM(i2, Float.floatToRawIntBits(zziaiVar.zzf(i3)));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zziaiVar.size(); i7++) {
            zziaiVar.zzf(i7);
            i6 += 4;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zziaiVar.size()) {
            zzhzwVar2.zzt(Float.floatToRawIntBits(zziaiVar.zzf(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhzy)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).getClass();
                i4 += 8;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzhzy zzhzyVar = (zzhzy) list;
        if (!z2) {
            while (i3 < zzhzyVar.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzhzyVar.zzf(i3)));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhzyVar.size(); i7++) {
            zzhzyVar.zzf(i7);
            i6 += 8;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zzhzyVar.size()) {
            zzhzwVar2.zzv(Double.doubleToRawLongBits(zzhzyVar.zzf(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzK(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int iZzB = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzB += zzhzw.zzB(((Integer) list.get(i4)).intValue());
            }
            zzhzwVar.zzs(iZzB);
            while (i3 < list.size()) {
                zzhzwVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                this.zza.zzK(i2, zziasVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int iZzB2 = 0;
        for (int i5 = 0; i5 < zziasVar.size(); i5++) {
            iZzB2 += zzhzw.zzB(zziasVar.zzf(i5));
        }
        zzhzwVar2.zzs(iZzB2);
        while (i3 < zziasVar.size()) {
            zzhzwVar2.zzr(zziasVar.zzf(i3));
            i3++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzhzb)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzi(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).getClass();
                i4++;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzq(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzhzb zzhzbVar = (zzhzb) list;
        if (!z2) {
            while (i3 < zzhzbVar.size()) {
                this.zza.zzi(i2, zzhzbVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzhzbVar.size(); i7++) {
            zzhzbVar.zzf(i7);
            i6++;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zzhzbVar.size()) {
            zzhzwVar2.zzq(zzhzbVar.zzf(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzF(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibn)) {
            while (i3 < list.size()) {
                this.zza.zzj(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzibn zzibnVar = (zzibn) list;
        while (i3 < list.size()) {
            Object objZzc = zzibnVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i2, (String) objZzc);
            } else {
                this.zza.zzk(i2, (zzhzl) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzG(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzk(i2, (zzhzl) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzH(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzL(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzA += zzhzw.zzA(((Integer) list.get(i4)).intValue());
            }
            zzhzwVar.zzs(iZzA);
            while (i3 < list.size()) {
                zzhzwVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                this.zza.zzL(i2, zziasVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zziasVar.size(); i5++) {
            iZzA2 += zzhzw.zzA(zziasVar.zzf(i5));
        }
        zzhzwVar2.zzs(iZzA2);
        while (i3 < zziasVar.size()) {
            zzhzwVar2.zzs(zziasVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzI(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzM(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i4 += 4;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                this.zza.zzM(i2, zziasVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zziasVar.size(); i7++) {
            zziasVar.zzf(i7);
            i6 += 4;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zziasVar.size()) {
            zzhzwVar2.zzt(zziasVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i4 += 8;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzv(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzibq zzibqVar = (zzibq) list;
        if (!z2) {
            while (i3 < zzibqVar.size()) {
                this.zza.zzh(i2, zzibqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzibqVar.size(); i7++) {
            zzibqVar.zzc(i7);
            i6 += 8;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zzibqVar.size()) {
            zzhzwVar2.zzv(zzibqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzhzw zzhzwVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzhzwVar.zzL(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar2 = this.zza;
            zzhzwVar2.zzJ(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue2 = ((Integer) list.get(i4)).intValue();
                iZzA += zzhzw.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzhzwVar2.zzs(iZzA);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzhzwVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                zzhzw zzhzwVar3 = this.zza;
                int iZzf = zziasVar.zzf(i3);
                zzhzwVar3.zzL(i2, (iZzf >> 31) ^ (iZzf + iZzf));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar4 = this.zza;
        zzhzwVar4.zzJ(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zziasVar.size(); i5++) {
            int iZzf2 = zziasVar.zzf(i5);
            iZzA2 += zzhzw.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzhzwVar4.zzs(iZzA2);
        while (i3 < zziasVar.size()) {
            int iZzf3 = zziasVar.zzf(i3);
            zzhzwVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzhzw zzhzwVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzhzwVar.zzN(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar2 = this.zza;
            zzhzwVar2.zzJ(i2, 2);
            int iZzB = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long jLongValue2 = ((Long) list.get(i4)).longValue();
                iZzB += zzhzw.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzhzwVar2.zzs(iZzB);
            while (i3 < list.size()) {
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzhzwVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzibq zzibqVar = (zzibq) list;
        if (!z2) {
            while (i3 < zzibqVar.size()) {
                zzhzw zzhzwVar3 = this.zza;
                long jZzc = zzibqVar.zzc(i3);
                zzhzwVar3.zzN(i2, (jZzc >> 63) ^ (jZzc + jZzc));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar4 = this.zza;
        zzhzwVar4.zzJ(i2, 2);
        int iZzB2 = 0;
        for (int i5 = 0; i5 < zzibqVar.size(); i5++) {
            long jZzc2 = zzibqVar.zzc(i5);
            iZzB2 += zzhzw.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzhzwVar4.zzs(iZzB2);
        while (i3 < zzibqVar.size()) {
            long jZzc3 = zzibqVar.zzc(i3);
            zzhzwVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzM(int i2, zzibu zzibuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            zzhzwVar.zzs(zzibv.zzc(zzibuVar, entry.getKey(), entry.getValue()));
            zzibv.zzb(zzhzwVar, zzibuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzM(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzc(int i2, long j) throws IOException {
        this.zza.zzN(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zze(int i2, float f) throws IOException {
        this.zza.zzM(i2, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzf(int i2, double d) throws IOException {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzg(int i2, int i3) throws IOException {
        this.zza.zzK(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzh(int i2, long j) throws IOException {
        this.zza.zzN(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzK(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(int i2, long j) throws IOException {
        this.zza.zzh(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzM(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzl(int i2, boolean z2) throws IOException {
        this.zza.zzi(i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzm(int i2, String str) throws IOException {
        this.zza.zzj(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzn(int i2, zzhzl zzhzlVar) throws IOException {
        this.zza.zzk(i2, zzhzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzo(int i2, int i3) throws IOException {
        this.zza.zzL(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzp(int i2, int i3) throws IOException {
        this.zza.zzL(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzq(int i2, long j) throws IOException {
        this.zza.zzN(i2, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzr(int i2, Object obj, zzicu zzicuVar) throws IOException {
        zzhzw zzhzwVar = this.zza;
        zzhyu zzhyuVar = (zzhyu) obj;
        zzhzwVar.zzJ(i2, 2);
        zzhzwVar.zzs(zzhyuVar.zzaT(zzicuVar));
        zzicuVar.zzf(zzhyuVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzs(int i2, Object obj, zzicu zzicuVar) throws IOException {
        zzhzw zzhzwVar = this.zza;
        zzhzwVar.zzJ(i2, 3);
        zzicuVar.zzf((zzhyu) obj, this);
        zzhzwVar.zzJ(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    @Deprecated
    public final void zzt(int i2) throws IOException {
        this.zza.zzJ(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    @Deprecated
    public final void zzu(int i2) throws IOException {
        this.zza.zzJ(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzv(int i2, Object obj) throws IOException {
        if (obj instanceof zzhzl) {
            this.zza.zzo(i2, (zzhzl) obj);
        } else {
            this.zza.zzn(i2, (zzicc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzw(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzK(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int iZzB = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzB += zzhzw.zzB(((Integer) list.get(i4)).intValue());
            }
            zzhzwVar.zzs(iZzB);
            while (i3 < list.size()) {
                zzhzwVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                this.zza.zzK(i2, zziasVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int iZzB2 = 0;
        for (int i5 = 0; i5 < zziasVar.size(); i5++) {
            iZzB2 += zzhzw.zzB(zziasVar.zzf(i5));
        }
        zzhzwVar2.zzs(iZzB2);
        while (i3 < zziasVar.size()) {
            zzhzwVar2.zzr(zziasVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzx(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzias)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzM(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i4 += 4;
            }
            zzhzwVar.zzs(i4);
            while (i3 < list.size()) {
                zzhzwVar.zzt(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzias zziasVar = (zzias) list;
        if (!z2) {
            while (i3 < zziasVar.size()) {
                this.zza.zzM(i2, zziasVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zziasVar.size(); i7++) {
            zziasVar.zzf(i7);
            i6 += 4;
        }
        zzhzwVar2.zzs(i6);
        while (i3 < zziasVar.size()) {
            zzhzwVar2.zzt(zziasVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzN(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int iZzB = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzB += zzhzw.zzB(((Long) list.get(i4)).longValue());
            }
            zzhzwVar.zzs(iZzB);
            while (i3 < list.size()) {
                zzhzwVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzibq zzibqVar = (zzibq) list;
        if (!z2) {
            while (i3 < zzibqVar.size()) {
                this.zza.zzN(i2, zzibqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int iZzB2 = 0;
        for (int i5 = 0; i5 < zzibqVar.size(); i5++) {
            iZzB2 += zzhzw.zzB(zzibqVar.zzc(i5));
        }
        zzhzwVar2.zzs(iZzB2);
        while (i3 < zzibqVar.size()) {
            zzhzwVar2.zzu(zzibqVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzibq)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzN(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzhzw zzhzwVar = this.zza;
            zzhzwVar.zzJ(i2, 2);
            int iZzB = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzB += zzhzw.zzB(((Long) list.get(i4)).longValue());
            }
            zzhzwVar.zzs(iZzB);
            while (i3 < list.size()) {
                zzhzwVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzibq zzibqVar = (zzibq) list;
        if (!z2) {
            while (i3 < zzibqVar.size()) {
                this.zza.zzN(i2, zzibqVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzhzw zzhzwVar2 = this.zza;
        zzhzwVar2.zzJ(i2, 2);
        int iZzB2 = 0;
        for (int i5 = 0; i5 < zzibqVar.size(); i5++) {
            iZzB2 += zzhzw.zzB(zzibqVar.zzc(i5));
        }
        zzhzwVar2.zzs(iZzB2);
        while (i3 < zzibqVar.size()) {
            zzhzwVar2.zzu(zzibqVar.zzc(i3));
            i3++;
        }
    }
}
