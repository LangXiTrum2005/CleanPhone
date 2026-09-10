package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzna)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i4 += 8;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z2) {
            while (i3 < zznaVar.size()) {
                this.zza.zzf(i2, zznaVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zznaVar.size(); i7++) {
            zznaVar.zzc(i7);
            i6 += 8;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzly)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).getClass();
                i4 += 4;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z2) {
            while (i3 < zzlyVar.size()) {
                this.zza.zzd(i2, Float.floatToRawIntBits(zzlyVar.zze(i3)));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzlyVar.size(); i7++) {
            zzlyVar.zze(i7);
            i6 += 4;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzlo)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).getClass();
                i4 += 8;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z2) {
            while (i3 < zzloVar.size()) {
                this.zza.zzf(i2, Double.doubleToRawLongBits(zzloVar.zze(i3)));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzloVar.size(); i7++) {
            zzloVar.zze(i7);
            i6 += 8;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i3)));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzA += zzlm.zzA(((Integer) list.get(i4)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                this.zza.zzb(i2, zzmgVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmgVar.size(); i5++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i5));
        }
        zzlmVar2.zzr(iZzA2);
        while (i3 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i3));
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
    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzky)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzg(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).getClass();
                i4++;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z2) {
            while (i3 < zzkyVar.size()) {
                this.zza.zzg(i2, zzkyVar.zze(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzkyVar.size(); i7++) {
            zzkyVar.zze(i7);
            i6++;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i2, List list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmx)) {
            while (i3 < list.size()) {
                this.zza.zzh(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i3 < list.size()) {
            Object objZzc = zzmxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i2, (String) objZzc);
            } else {
                this.zza.zzi(i2, (zzlh) objZzc);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i2, List list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zzi(i2, (zzlh) list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzc(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int iZzz = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzz += zzlm.zzz(((Integer) list.get(i4)).intValue());
            }
            zzlmVar.zzr(iZzz);
            while (i3 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                this.zza.zzc(i2, zzmgVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int iZzz2 = 0;
        for (int i5 = 0; i5 < zzmgVar.size(); i5++) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i5));
        }
        zzlmVar2.zzr(iZzz2);
        while (i3 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i4 += 4;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                this.zza.zzd(i2, zzmgVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzmgVar.size(); i7++) {
            zzmgVar.zzf(i7);
            i6 += 4;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzna)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzf(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).getClass();
                i4 += 8;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z2) {
            while (i3 < zznaVar.size()) {
                this.zza.zzf(i2, zznaVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zznaVar.size(); i7++) {
            zznaVar.zzc(i7);
            i6 += 8;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    zzlmVar.zzc(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i2, 2);
            int iZzz = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int iIntValue2 = ((Integer) list.get(i4)).intValue();
                iZzz += zzlm.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlmVar2.zzr(iZzz);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                zzlmVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int iZzf = zzmgVar.zzf(i3);
                zzlmVar3.zzc(i2, (iZzf >> 31) ^ (iZzf + iZzf));
                i3++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i2, 2);
        int iZzz2 = 0;
        for (int i5 = 0; i5 < zzmgVar.size(); i5++) {
            int iZzf2 = zzmgVar.zzf(i5);
            iZzz2 += zzlm.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzlmVar4.zzr(iZzz2);
        while (i3 < zzmgVar.size()) {
            int iZzf3 = zzmgVar.zzf(i3);
            zzlmVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzna)) {
            if (!z2) {
                while (i3 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    zzlmVar.zze(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long jLongValue2 = ((Long) list.get(i4)).longValue();
                iZzA += zzlm.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlmVar2.zzr(iZzA);
            while (i3 < list.size()) {
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                zzlmVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z2) {
            while (i3 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long jZzc = zznaVar.zzc(i3);
                zzlmVar3.zze(i2, (jZzc >> 63) ^ (jZzc + jZzc));
                i3++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zznaVar.size(); i5++) {
            long jZzc2 = zznaVar.zzc(i5);
            iZzA2 += zzlm.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzlmVar4.zzr(iZzA2);
        while (i3 < zznaVar.size()) {
            long jZzc3 = zznaVar.zzc(i3);
            zzlmVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i2, zzne zzneVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i2, long j) throws IOException {
        this.zza.zze(i2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i2, long j) throws IOException {
        this.zza.zzf(i2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i2, float f) throws IOException {
        this.zza.zzd(i2, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i2, double d) throws IOException {
        this.zza.zzf(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i2, long j) throws IOException {
        this.zza.zze(i2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i2, long j) throws IOException {
        this.zza.zzf(i2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i2, boolean z2) throws IOException {
        this.zza.zzg(i2, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i2, String str) throws IOException {
        this.zza.zzh(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i2, zzlh zzlhVar) throws IOException {
        this.zza.zzi(i2, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i2, int i3) throws IOException {
        this.zza.zzc(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i2, int i3) throws IOException {
        this.zza.zzc(i2, (i3 >> 31) ^ (i3 + i3));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i2, long j) throws IOException {
        this.zza.zze(i2, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i2, Object obj, zznx zznxVar) throws IOException {
        this.zza.zzl(i2, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i2, Object obj, zznx zznxVar) throws IOException {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i2, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i2) throws IOException {
        this.zza.zza(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i2) throws IOException {
        this.zza.zza(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i2, Object obj) throws IOException {
        if (obj instanceof zzlh) {
            this.zza.zzn(i2, (zzlh) obj);
        } else {
            this.zza.zzm(i2, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzA += zzlm.zzA(((Integer) list.get(i4)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                this.zza.zzb(i2, zzmgVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zzmgVar.size(); i5++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i5));
        }
        zzlmVar2.zzr(iZzA2);
        while (i3 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzmg)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).getClass();
                i4 += 4;
            }
            zzlmVar.zzr(i4);
            while (i3 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z2) {
            while (i3 < zzmgVar.size()) {
                this.zza.zzd(i2, zzmgVar.zzf(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzmgVar.size(); i7++) {
            zzmgVar.zzf(i7);
            i6 += 4;
        }
        zzlmVar2.zzr(i6);
        while (i3 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzna)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zze(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzA += zzlm.zzA(((Long) list.get(i4)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z2) {
            while (i3 < zznaVar.size()) {
                this.zza.zze(i2, zznaVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zznaVar.size(); i5++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i5));
        }
        zzlmVar2.zzr(iZzA2);
        while (i3 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i2, List list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzna)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zze(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i2, 2);
            int iZzA = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iZzA += zzlm.zzA(((Long) list.get(i4)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i3 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z2) {
            while (i3 < zznaVar.size()) {
                this.zza.zze(i2, zznaVar.zzc(i3));
                i3++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i2, 2);
        int iZzA2 = 0;
        for (int i5 = 0; i5 < zznaVar.size(); i5++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i5));
        }
        zzlmVar2.zzr(iZzA2);
        while (i3 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i3));
            i3++;
        }
    }
}
