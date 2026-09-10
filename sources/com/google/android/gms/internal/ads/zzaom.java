package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
final class zzaom {
    private final zzaga zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzaom(zzaga zzagaVar, boolean z2, boolean z3) {
        this.zza = zzagaVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzgn(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j, int i2, long j2, boolean z2) {
        this.zze = i2;
        this.zzg = j2;
        this.zzf = j;
        this.zzl = z2;
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
    public final boolean zze(long j, int i2, boolean z2) {
        boolean z3 = false;
        if (this.zze == 9) {
            if (z2 && this.zzh) {
                long j2 = this.zzf;
                int i3 = i2 + ((int) (j - j2));
                long j3 = this.zzj;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.zzi;
                    if (j2 != j4) {
                        this.zza.zzx(j3, this.zzk ? 1 : 0, (int) (j2 - j4), i3, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z4 = this.zzl;
        boolean z5 = this.zzk;
        int i4 = this.zze;
        if (i4 == 5 || (z4 && i4 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzk = z6;
        this.zze = 24;
        return z6;
    }
}
