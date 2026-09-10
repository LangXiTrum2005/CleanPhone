package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzmm {
    private final zzmi zza;
    private final int zzb;
    private final zzmi zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmm(zzmi zzmiVar, zzmi zzmiVar2, int i2) {
        this.zza = zzmiVar;
        this.zzb = i2;
        this.zzc = zzmiVar2;
    }

    private final boolean zzN() {
        int i2 = this.zzd;
        return i2 == 2 || i2 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzlk zzlkVar, zzmi zzmiVar) {
        if (zzmiVar == null) {
            return true;
        }
        zzxw[] zzxwVarArr = zzlkVar.zzc;
        int i2 = this.zzb;
        zzxw zzxwVar = zzxwVarArr[i2];
        if (zzmiVar.zzcV() != null) {
            if (zzmiVar.zzcV() == zzxwVar) {
                if (zzxwVar != null && !zzmiVar.zzcW()) {
                    zzlkVar.zzp();
                    boolean z2 = zzlkVar.zzg.zzg;
                }
            }
            zzlk zzlkVarZzp = zzlkVar.zzp();
            return zzlkVarZzp != null && zzlkVarZzp.zzc[i2] == zzmiVar.zzcV();
        }
        return true;
    }

    private final void zzQ(boolean z2) throws zzit {
        if (z2) {
            zzmi zzmiVar = this.zzc;
            zzmiVar.getClass();
            zzmiVar.zzx(17, this.zza);
        } else {
            zzmi zzmiVar2 = this.zza;
            zzmi zzmiVar3 = this.zzc;
            zzmiVar3.getClass();
            zzmiVar2.zzx(17, zzmiVar3);
        }
    }

    private final void zzR(zzmi zzmiVar, zzxw zzxwVar, zzir zzirVar, long j, boolean z2) throws zzit {
        if (zzW(zzmiVar)) {
            if (zzxwVar != zzmiVar.zzcV()) {
                zzS(zzmiVar, zzirVar);
            } else if (z2) {
                zzmiVar.zzp(j, true);
            }
        }
    }

    private final void zzS(zzmi zzmiVar, zzir zzirVar) {
        boolean z2 = true;
        if (this.zza != zzmiVar && this.zzc != zzmiVar) {
            z2 = false;
        }
        zzgqa.zzi(z2);
        if (zzW(zzmiVar)) {
            zzirVar.zze(zzmiVar);
            zzY(zzmiVar);
            zzmiVar.zzr();
        }
    }

    private final void zzT(boolean z2) {
        if (z2) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzmi zzmiVar = this.zzc;
            zzmiVar.getClass();
            zzmiVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzmi zzmiVar, zzlk zzlkVar, zzaae zzaaeVar, zzir zzirVar) throws zzit {
        if (zzmiVar != null && zzW(zzmiVar)) {
            zzmi zzmiVar2 = this.zza;
            boolean z2 = zzmiVar != zzmiVar2;
            if ((zzmiVar != zzmiVar2 || !zzN()) && (zzmiVar != this.zzc || !zzO())) {
                zzxw zzxwVarZzcV = zzmiVar.zzcV();
                zzxw[] zzxwVarArr = zzlkVar.zzc;
                int i2 = this.zzb;
                zzxw zzxwVar = zzxwVarArr[i2];
                boolean zZza = zzaaeVar.zza(i2);
                if (zZza && zzxwVarZzcV == zzxwVar) {
                    return 1;
                }
                if (!zzmiVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzaaeVar.zzc[i2]);
                    zzxw zzxwVar2 = zzxwVarArr[i2];
                    zzxwVar2.getClass();
                    zzmiVar.zzcU(zzvVarArrZzV, zzxwVar2, zzlkVar.zzc(), zzlkVar.zza(), zzlkVar.zzg.zza);
                    return 3;
                }
                if (!zzmiVar.zzZ()) {
                    return 0;
                }
                zzS(zzmiVar, zzirVar);
                if (!zZza || zzc()) {
                    zzT(!z2);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzzw zzzwVar) {
        int iZze = zzzwVar != null ? zzzwVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i2 = 0; i2 < iZze; i2++) {
            zzzwVar.getClass();
            zzvVarArr[i2] = zzzwVar.zzb(i2);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzmi zzmiVar) {
        return zzmiVar.zze() != 0;
    }

    private final zzmi zzX(zzlk zzlkVar) {
        if (zzlkVar != null) {
            int i2 = this.zzb;
            zzxw[] zzxwVarArr = zzlkVar.zzc;
            if (zzxwVarArr[i2] != null) {
                zzmi zzmiVar = this.zza;
                zzxw zzxwVarZzcV = zzmiVar.zzcV();
                zzxw zzxwVar = zzxwVarArr[i2];
                if (zzxwVarZzcV == zzxwVar) {
                    return zzmiVar;
                }
                zzmi zzmiVar2 = this.zzc;
                if (zzmiVar2 != null && zzmiVar2.zzcV() == zzxwVar) {
                    return zzmiVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzmi zzmiVar) {
        if (zzmiVar.zze() == 2) {
            zzmiVar.zzq();
        }
    }

    private static final void zzZ(zzmi zzmiVar, long j) {
        zzmiVar.zzl();
        if (zzmiVar instanceof zzyl) {
            throw null;
        }
    }

    public final void zzA(zzir zzirVar) throws zzit {
        zzS(this.zza, zzirVar);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            boolean z2 = zzW(zzmiVar) && this.zzd != 3;
            zzS(zzmiVar, zzirVar);
            zzT(false);
            if (z2) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzit {
        int i2 = this.zzd;
        if (i2 == 3 || i2 == 4) {
            zzQ(i2 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i2 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zzir zzirVar) {
        boolean z2;
        zzmi zzmiVar;
        if (zzc()) {
            int i2 = this.zzd;
            if (i2 == 4) {
                z2 = true;
            } else if (i2 == 2) {
                i2 = 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                zzmiVar = this.zza;
            } else {
                zzmiVar = this.zzc;
                zzmiVar.getClass();
            }
            zzS(zzmiVar, zzirVar);
            zzT(z2);
            this.zzd = i2 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzxw zzxwVar, zzir zzirVar, long j, boolean z2) throws zzit {
        zzR(this.zza, zzxwVar, zzirVar, j, z2);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzR(zzmiVar, zzxwVar, zzirVar, j, z2);
        }
    }

    public final void zzE(zzlk zzlkVar, long j, boolean z2) throws zzit {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        if (zzmiVarZzX != null) {
            zzmiVarZzX.zzp(j, z2);
        }
    }

    public final boolean zzF(zzlk zzlkVar, long j) {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        return zzmiVarZzX != null && zzmiVarZzX.zzU(j);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzmi zzmiVar = this.zzc;
        if (zzmiVar == null || zzW(zzmiVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzlk zzlkVar, zzaae zzaaeVar, zzir zzirVar) throws zzit {
        int iZzU = zzU(this.zza, zzlkVar, zzaaeVar, zzirVar);
        return iZzU == 1 ? zzU(this.zzc, zzlkVar, zzaaeVar, zzirVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzmiVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzit {
        if (zze() != 2) {
            return;
        }
        int i2 = this.zzd;
        if (i2 != 4 && i2 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzmi zzmiVar = this.zzc;
        zzmiVar.getClass();
        zzmiVar.zzx(1, obj);
    }

    public final void zzK(zzacj zzacjVar) throws zzit {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzacjVar);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzmiVar.zzx(7, zzacjVar);
        }
    }

    public final void zzL(float f) throws zzit {
        if (zze() != 1) {
            return;
        }
        zzmi zzmiVar = this.zza;
        Float fValueOf = Float.valueOf(f);
        zzmiVar.zzx(2, fValueOf);
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 != null) {
            zzmiVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i2 = this.zzd;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            return zzW(this.zza);
        }
        zzmi zzmiVar = this.zzc;
        zzmiVar.getClass();
        return zzW(zzmiVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i2;
        zzgqa.zzi(!zzc());
        if (zzW(this.zza)) {
            i2 = 3;
        } else {
            zzmi zzmiVar = this.zzc;
            i2 = (zzmiVar == null || !zzW(zzmiVar)) ? 2 : 4;
        }
        this.zzd = i2;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzmi zzmiVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i2 = 0;
        if (zzmiVar != null && zzW(zzmiVar)) {
            i2 = 1;
        }
        return (zZzW ? 1 : 0) + i2;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzlk zzlkVar) {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        Objects.requireNonNull(zzmiVarZzX);
        return zzmiVarZzX.zzk();
    }

    public final boolean zzg(zzlk zzlkVar) {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        zzmiVarZzX.getClass();
        return zzmiVarZzX.zzcW();
    }

    public final void zzh(zzlk zzlkVar, long j) {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        zzmiVarZzX.getClass();
        zzZ(zzmiVarZzX, j);
    }

    public final void zzi(zzaae zzaaeVar, zzaae zzaaeVar2, long j) {
        int i2;
        int i3 = this.zzb;
        boolean zZza = zzaaeVar.zza(i3);
        boolean zZza2 = zzaaeVar2.zza(i3);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar == null || (i2 = this.zzd) == 3 || (i2 == 0 && zzW(this.zza))) {
            zzmiVar = this.zza;
        }
        if (!zZza || zzmiVar.zzm()) {
            return;
        }
        zze();
        zzml zzmlVar = zzaaeVar.zzb[i3];
        zzml zzmlVar2 = zzaaeVar2.zzb[i3];
        if (zZza2 && Objects.equals(zzmlVar2, zzmlVar) && !zzc()) {
            return;
        }
        zzZ(zzmiVar, j);
    }

    public final void zzj(long j) {
        int i2;
        zzmi zzmiVar = this.zza;
        if (zzW(zzmiVar) && (i2 = this.zzd) != 4 && i2 != 2) {
            zzZ(zzmiVar, j);
        }
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 == null || !zzW(zzmiVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmiVar2, j);
    }

    public final long zzk(long j, long j2) {
        zzmi zzmiVar = this.zza;
        long jZzT = zzW(zzmiVar) ? zzmiVar.zzT(j, j2) : Long.MAX_VALUE;
        zzmi zzmiVar2 = this.zzc;
        return (zzmiVar2 == null || !zzW(zzmiVar2)) ? jZzT : Math.min(jZzT, zzmiVar2.zzT(j, j2));
    }

    public final void zzl() {
        zzmi zzmiVar = this.zza;
        if (zzW(zzmiVar)) {
            zzmiVar.zzW();
            return;
        }
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 == null || !zzW(zzmiVar2)) {
            return;
        }
        zzmiVar2.zzW();
    }

    public final void zzm(float f, float f2) throws zzit {
        this.zza.zzV(f, f2);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzmiVar.zzV(f, f2);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzmiVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzmi zzmiVar = this.zza;
        boolean zZzZ = zzW(zzmiVar) ? zzmiVar.zzZ() : true;
        zzmi zzmiVar2 = this.zzc;
        return (zzmiVar2 == null || !zzW(zzmiVar2)) ? zZzZ : zZzZ & zzmiVar2.zzZ();
    }

    public final boolean zzp(zzlk zzlkVar) {
        return zzX(zzlkVar) != null;
    }

    public final boolean zzq(zzlk zzlkVar) {
        return (zzN() && zzX(zzlkVar) == this.zza) || (zzO() && zzX(zzlkVar) == this.zzc);
    }

    public final boolean zzr(zzlk zzlkVar) {
        return zzP(zzlkVar, this.zza) && zzP(zzlkVar, this.zzc);
    }

    public final void zzs(long j, long j2) throws zzit {
        zzmi zzmiVar = this.zza;
        if (zzW(zzmiVar)) {
            zzmiVar.zzX(j, j2);
        }
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 == null || !zzW(zzmiVar2)) {
            return;
        }
        zzmiVar2.zzX(j, j2);
    }

    public final boolean zzt(zzlk zzlkVar) {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        return zzmiVarZzX == null || zzmiVarZzX.zzcW() || zzmiVarZzX.zzY() || zzmiVarZzX.zzZ();
    }

    public final void zzu(zzlk zzlkVar) throws IOException {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        zzmiVarZzX.getClass();
        zzmiVarZzX.zzn();
    }

    public final void zzv() throws zzit {
        zzmi zzmiVar = this.zza;
        if (zzmiVar.zze() == 1 && this.zzd != 4) {
            zzmiVar.zzcT();
            return;
        }
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 == null || zzmiVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmiVar2.zzcT();
    }

    public final void zzw() {
        zzmi zzmiVar = this.zza;
        if (zzW(zzmiVar)) {
            zzY(zzmiVar);
        }
        zzmi zzmiVar2 = this.zzc;
        if (zzmiVar2 == null || !zzW(zzmiVar2)) {
            return;
        }
        zzY(zzmiVar2);
    }

    public final void zzx(zzml zzmlVar, zzzw zzzwVar, zzxw zzxwVar, long j, boolean z2, boolean z3, long j2, long j3, zzwg zzwgVar, zzir zzirVar) throws zzit {
        zzv[] zzvVarArrZzV = zzV(zzzwVar);
        int i2 = this.zzd;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.zze = true;
            zzmi zzmiVar = this.zza;
            zzmiVar.zzf(zzmlVar, zzvVarArrZzV, zzxwVar, j, z2, z3, j2, j3, zzwgVar);
            zzirVar.zzd(zzmiVar);
            return;
        }
        this.zzf = true;
        zzmi zzmiVar2 = this.zzc;
        zzmiVar2.getClass();
        zzmiVar2.zzf(zzmlVar, zzvVarArrZzV, zzxwVar, j, z2, z3, j2, j3, zzwgVar);
        zzirVar.zzd(zzmiVar2);
    }

    public final void zzy(int i2, Object obj, zzlk zzlkVar) throws zzit {
        zzmi zzmiVarZzX = zzX(zzlkVar);
        zzmiVarZzX.getClass();
        zzmiVarZzX.zzx(11, obj);
    }

    public final void zzz(zzmp zzmpVar) throws zzit {
        this.zza.zzx(18, zzmpVar);
        zzmi zzmiVar = this.zzc;
        if (zzmiVar != null) {
            zzmiVar.zzx(18, zzmpVar);
        }
    }
}
