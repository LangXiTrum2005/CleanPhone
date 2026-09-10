package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoi implements zzaog {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaga zzb;
    private final zzapy zzd;
    private final String zze;
    private final zzer zzf;
    private final zzaox zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoh zzi = new zzaoh(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzaoi(zzapy zzapyVar, String str) {
        zzer zzerVar;
        this.zzd = zzapyVar;
        this.zze = str;
        if (zzapyVar != null) {
            this.zzg = new zzaox(178, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzaox zzaoxVar = this.zzg;
        if (zzaoxVar != null) {
            zzaoxVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zza = zzapuVar.zzc();
        this.zzb = zzaerVar.zzu(zzapuVar.zzb(), 2);
        zzapy zzapyVar = this.zzd;
        if (zzapyVar != null) {
            zzapyVar.zza(zzaerVar, zzapuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzn = j;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
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
    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        char c2;
        boolean z2;
        boolean z3;
        int i2;
        float f;
        int i3;
        int i4;
        char c3 = 3;
        this.zzb.getClass();
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzj += (long) zzerVar.zzd();
        this.zzb.zzz(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzi == iZze) {
                break;
            }
            int i5 = iZzi + 3;
            int i6 = zzerVar.zzi()[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = iZzi - iZzg;
            if (this.zzl) {
                c2 = c3;
            } else {
                if (i7 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzi);
                }
                int i8 = i7 < 0 ? -i7 : 0;
                zzaoh zzaohVar = this.zzi;
                if (zzaohVar.zzb(i6, i8)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzaohVar.zzc, zzaohVar.zza);
                    int i9 = bArrCopyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    byte b2 = bArrCopyOf[5];
                    int i10 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i11 = bArrCopyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i12 = (i9 << 4) | (i10 >> 4);
                    int i13 = (bArrCopyOf[7] & 240) >> 4;
                    int i14 = ((b2 & 15) << 8) | i11;
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                f = 1.0f;
                            } else {
                                i3 = i14 * 121;
                                i4 = i12 * 100;
                            }
                            c2 = 3;
                        } else {
                            i3 = i14 * 16;
                            i4 = i12 * 9;
                        }
                        f = i3 / i4;
                        c2 = 3;
                    } else {
                        c2 = 3;
                        f = (i14 * 4) / (i12 * 3);
                    }
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl(str2);
                    zztVar.zzm("video/mpeg2");
                    zztVar.zzt(i12);
                    zztVar.zzu(i14);
                    zztVar.zzz(f);
                    zztVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzv zzvVarZzM = zztVar.zzM();
                    int i15 = (bArrCopyOf[7] & 15) - 1;
                    long j = 0;
                    if (i15 >= 0 && i15 < 8) {
                        double d = zzc[i15];
                        byte b3 = bArrCopyOf[zzaohVar.zzb + 9];
                        int i16 = (b3 & 96) >> 5;
                        int i17 = b3 & 31;
                        if (i16 != i17) {
                            d = ((((double) i16) + 1.0d) / ((double) (i17 + 1))) * d;
                        }
                        j = (long) (1000000.0d / d);
                    }
                    Pair pairCreate = Pair.create(zzvVarZzM, Long.valueOf(j));
                    this.zzb.zzu((zzv) pairCreate.first);
                    this.zzm = ((Long) pairCreate.second).longValue();
                    this.zzl = true;
                } else {
                    c2 = c3;
                }
            }
            zzaox zzaoxVar = this.zzg;
            if (zzaoxVar != null) {
                if (i7 > 0) {
                    zzaoxVar.zzd(bArrZzi, iZzg, iZzi);
                    i2 = 0;
                } else {
                    i2 = -i7;
                }
                if (zzaoxVar.zze(i2)) {
                    int iZza = zzgm.zza(zzaoxVar.zza, zzaoxVar.zzb);
                    zzer zzerVar2 = this.zzf;
                    String str3 = zzfj.zza;
                    zzerVar2.zzb(zzaoxVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzerVar2);
                }
                if (i6 == 178) {
                    if (zzerVar.zzi()[iZzi + 2] == 1) {
                        zzaoxVar.zzc(178);
                    }
                    i6 = 178;
                }
            }
            if (i6 == 0 || i6 == 179) {
                int i18 = iZze - iZzi;
                if (this.zzr && this.zzl) {
                    long j2 = this.zzp;
                    if (j2 != -9223372036854775807L) {
                        this.zzb.zzx(j2, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i18, i18, null);
                    }
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i18);
                    long j3 = this.zzn;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.zzp;
                        j3 = j4 != -9223372036854775807L ? j4 + this.zzm : -9223372036854775807L;
                    }
                    this.zzp = j3;
                    z2 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z3 = true;
                    this.zzk = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                this.zzr = i6 == 0 ? z3 : z2;
            } else if (i6 == 184) {
                this.zzq = true;
            }
            iZzg = i5;
            c3 = c2;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzaox zzaoxVar2 = this.zzg;
        if (zzaoxVar2 != null) {
            zzaoxVar2.zzd(bArrZzi, iZzg, iZze);
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
    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        zzaga zzagaVar = this.zzb;
        zzagaVar.getClass();
        if (z2) {
            boolean z3 = this.zzq;
            long j = this.zzj - this.zzo;
            zzagaVar.zzx(this.zzp, z3 ? 1 : 0, (int) j, 0, null);
        }
    }
}
