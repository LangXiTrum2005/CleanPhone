package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzacc implements zzadl {
    final /* synthetic */ zzaci zza;
    private zzgtd zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzacc(zzaci zzaciVar, Context context, int i2) {
        Objects.requireNonNull(zzaciVar);
        this.zza = zzaciVar;
        zzfj.zzR(context);
        this.zzb = zzgtd.zzi();
        this.zze = -9223372036854775807L;
        zzadi zzadiVar = zzadi.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzC(zzaci.zzC(zzvVar.zzE));
        zztVarZza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zza() {
        zzaci zzaciVar = this.zza;
        if (zzaciVar.zzt()) {
            zzaciVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzb() {
        zzaci zzaciVar = this.zza;
        if (zzaciVar.zzt()) {
            zzaciVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzc(zzadi zzadiVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzd(zzv zzvVar) throws zzadk {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzg(boolean z2) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzh(boolean z2) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzi() {
        zzaci zzaciVar = this.zza;
        zzaciVar.zzA(this.zze);
        if (zzaciVar.zzy() >= zzaciVar.zzz()) {
            zzaciVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final Surface zzk() {
        zzgqa.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzl(zzacj zzacjVar) {
        this.zza.zzp(zzacjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgtd.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzr(int i2) {
        this.zza.zzr(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzs(int i2, zzv zzvVar, long j, int i3, List list) {
        zzgqa.zzi(false);
        this.zzb = zzgtd.zzq(list);
        this.zzc = zzvVar;
        zzaci zzaciVar = this.zza;
        zzaciVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzaciVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        zzaciVar.zzw().zza(j4, new zzach(j + this.zzd, i3, j4));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzt() {
        zzaci zzaciVar = this.zza;
        if (zzaciVar.zzw().zzc() == 0) {
            zzaciVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z2 = true;
        while (zzaciVar.zzw().zzc() > 0) {
            zzach zzachVar = (zzach) zzaciVar.zzw().zzd();
            zzachVar.getClass();
            if (z2) {
                int i2 = zzachVar.zzb;
                if (i2 == 0 || i2 == 1) {
                    zzachVar = new zzach(zzachVar.zza, 0, zzachVar.zzc);
                } else {
                    zzaciVar.zzo();
                }
            }
            zzffVar.zza(zzachVar.zzc, zzachVar);
            z2 = false;
        }
        zzaciVar.zzx(zzffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final boolean zzu(long j, zzadj zzadjVar) {
        int i2;
        zzgqa.zzi(false);
        long j2 = j + this.zzd;
        zzaci zzaciVar = this.zza;
        long jZzb = zzaciVar.zzv().zzb(j2);
        if (jZzb == -9223372036854775807L || zzaciVar.zzu() == -9223372036854775807L || jZzb >= zzaciVar.zzu() || (i2 = this.zzf) >= 2) {
            if (zzaciVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i2 + 1;
        zzadjVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzv(long j, long j2) throws zzadk {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzw(boolean z2) {
        zzaci zzaciVar = this.zza;
        if (zzaciVar.zzt()) {
            zzaciVar.zzn(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void zzx() {
        this.zza.zzg();
    }
}
