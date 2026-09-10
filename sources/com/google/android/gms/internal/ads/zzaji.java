package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaji implements zzaeo {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafk zzc;
    private final zzafg zzd;
    private final zzafi zze;
    private final zzaga zzf;
    private zzaer zzg;
    private zzaga zzh;
    private zzaga zzi;
    private int zzj;
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajk zzq;
    private boolean zzr;

    public zzaji() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.zzafr, com.google.android.gms.internal.ads.zzajk] */
    /* JADX WARN: Type inference failed for: r2v51, types: [com.google.android.gms.internal.ads.zzajj] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.zzaer] */
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
    @RequiresNonNull
    private final int zzi(zzaep zzaepVar) throws Throwable {
        long j;
        Throwable th;
        int iZzB;
        zzajm zzajmVarZza;
        zzafg zzafgVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j2;
        int i2;
        Object zzajdVar;
        long j3;
        long j4;
        int i3;
        int i4;
        zzaij zzaijVar;
        Object objZzd;
        zzajl zzajlVar;
        int i5 = -1;
        if (this.zzj == 0) {
            try {
                zzk(zzaepVar, false);
            } catch (EOFException unused) {
                return i5;
            }
        }
        if (this.zzq == null) {
            zzafk zzafkVar = this.zzc;
            zzer zzerVar = new zzer(zzafkVar.zzc);
            zzaepVar.zzi(zzerVar.zzi(), 0, zzafkVar.zzc);
            int i6 = 21;
            if ((zzafkVar.zza & 1) != 0) {
                if (zzafkVar.zze != 1) {
                    i6 = 36;
                }
            } else if (zzafkVar.zze == 1) {
                i6 = 13;
            }
            j = -9223372036854775807L;
            if (zzerVar.zze() >= i6 + 4) {
                zzerVar.zzh(i6);
                iZzB = zzerVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzerVar.zze() >= 40) {
                        zzerVar.zzh(36);
                        if (zzerVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzerVar.zze() >= 40) {
                zzerVar.zzh(36);
                if (zzerVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzajmVarZza = zzajm.zza(zzafkVar, zzerVar);
                zzafgVar = this.zzd;
                if (!zzafgVar.zzb() && (i3 = zzajmVarZza.zzd) != i5 && (i4 = zzajmVarZza.zze) != i5) {
                    zzafgVar.zza = i3;
                    zzafgVar.zzb = i4;
                }
                jZzn = zzaepVar.zzn();
                if (zzaepVar.zzo() != -1) {
                    j3 = zzajmVarZza.zzc;
                    if (j3 != -1) {
                        j4 = j3 + jZzn;
                        if (zzaepVar.zzo() != j4) {
                            long jZzo2 = zzaepVar.zzo();
                            th = null;
                            StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + String.valueOf(jZzo2).length() + 53 + 20);
                            androidx.datastore.preferences.protobuf.a.A(sb, "Data size mismatch between stream (", jZzo2, ") and Xing frame (");
                            sb.append(j4);
                            sb.append("), using Xing value.");
                            zzee.zzb("Mp3Extractor", sb.toString());
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
                zzaepVar.zzf(zzafkVar.zzc);
                if (iZzB == 1483304551) {
                    zzajdVar = zzajn.zzd(zzajmVarZza, jZzn);
                } else {
                    jZzo = zzaepVar.zzo();
                    jZzb = zzajmVarZza.zzb();
                    if (jZzb == -9223372036854775807L) {
                        zzajdVar = th;
                    } else {
                        j2 = zzajmVarZza.zzc;
                        if (j2 != r14) {
                            jZzo = jZzn + j2;
                            i2 = zzajmVarZza.zza.zzc;
                        } else if (jZzo != -1) {
                            j2 = jZzo - jZzn;
                            i2 = zzajmVarZza.zza.zzc;
                        } else {
                            zzajdVar = th;
                        }
                        long j5 = j2 - ((long) i2);
                        long j6 = jZzo;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzajdVar = new zzajd(j6, jZzn + ((long) zzajmVarZza.zza.zzc), zzgwx.zza(zzfj.zzt(j5, 8000000L, jZzb, roundingMode)), zzgwx.zza(zzgws.zza(j5, zzajmVarZza.zzb, roundingMode)), false);
                    }
                }
            } else {
                if (iZzB == 1447187017) {
                    zzajl zzajlVarZzd = zzajl.zzd(zzaepVar.zzo(), zzaepVar.zzn(), zzafkVar, zzerVar);
                    zzaepVar.zzf(zzafkVar.zzc);
                    zzajlVar = zzajlVarZzd;
                } else if (iZzB != 1483304551) {
                    zzaepVar.zzl();
                    zzajlVar = null;
                } else {
                    zzajmVarZza = zzajm.zza(zzafkVar, zzerVar);
                    zzafgVar = this.zzd;
                    if (!zzafgVar.zzb()) {
                        zzafgVar.zza = i3;
                        zzafgVar.zzb = i4;
                    }
                    jZzn = zzaepVar.zzn();
                    if (zzaepVar.zzo() != -1) {
                        j3 = zzajmVarZza.zzc;
                        if (j3 != -1) {
                            j4 = j3 + jZzn;
                            if (zzaepVar.zzo() != j4) {
                                long jZzo3 = zzaepVar.zzo();
                                th = null;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(j4).length() + String.valueOf(jZzo3).length() + 53 + 20);
                                androidx.datastore.preferences.protobuf.a.A(sb2, "Data size mismatch between stream (", jZzo3, ") and Xing frame (");
                                sb2.append(j4);
                                sb2.append("), using Xing value.");
                                zzee.zzb("Mp3Extractor", sb2.toString());
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                    zzaepVar.zzf(zzafkVar.zzc);
                    if (iZzB == 1483304551) {
                        zzajdVar = zzajn.zzd(zzajmVarZza, jZzn);
                    } else {
                        jZzo = zzaepVar.zzo();
                        jZzb = zzajmVarZza.zzb();
                        if (jZzb == -9223372036854775807L) {
                            zzajdVar = th;
                        } else {
                            j2 = zzajmVarZza.zzc;
                            if (j2 != r14) {
                                jZzo = jZzn + j2;
                                i2 = zzajmVarZza.zza.zzc;
                            } else if (jZzo != -1) {
                                j2 = jZzo - jZzn;
                                i2 = zzajmVarZza.zza.zzc;
                            } else {
                                zzajdVar = th;
                            }
                            long j7 = j2 - ((long) i2);
                            long j8 = jZzo;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            zzajdVar = new zzajd(j8, jZzn + ((long) zzajmVarZza.zza.zzc), zzgwx.zza(zzfj.zzt(j7, 8000000L, jZzb, roundingMode2)), zzgwx.zza(zzgws.zza(j7, zzajmVarZza.zzb, roundingMode2)), false);
                        }
                    }
                }
                th = null;
                zzajdVar = zzajlVar;
            }
            zzap zzapVar = this.zzk;
            long jZzn2 = zzaepVar.zzn();
            if (zzapVar == null || (zzaijVar = (zzaij) zzapVar.zzc(zzaij.class, zzgqe.zza())) == null) {
                objZzd = th;
            } else {
                zzail zzailVar = (zzail) zzapVar.zzc(zzail.class, zzajh.zza);
                objZzd = zzajf.zzd(jZzn2, zzaijVar, zzailVar == null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzailVar.zzb.get(0))));
            }
            ?? zzajdVar2 = zzajdVar;
            if (this.zzr) {
                zzajdVar2 = new zzajj();
            } else {
                if (objZzd != null) {
                    zzajdVar2 = objZzd;
                } else if (zzajdVar == null) {
                    zzajdVar2 = th;
                }
                if (zzajdVar2 == 0) {
                    zzer zzerVar2 = this.zzb;
                    zzaepVar.zzi(zzerVar2.zzi(), 0, 4);
                    zzerVar2.zzh(0);
                    zzafkVar.zza(zzerVar2.zzB());
                    zzajdVar2 = new zzajd(zzaepVar.zzo(), zzaepVar.zzn(), zzafkVar.zzf, zzafkVar.zzc, false);
                }
            }
            this.zzq = zzajdVar2;
            this.zzg.zzw(zzajdVar2);
            zzt zztVar = new zzt();
            zztVar.zzl("audio/mpeg");
            zztVar.zzm(zzafkVar.zzb);
            zztVar.zzn(4096);
            zztVar.zzE(zzafkVar.zze);
            zztVar.zzF(zzafkVar.zzd);
            zzafg zzafgVar2 = this.zzd;
            zztVar.zzH(zzafgVar2.zza);
            zztVar.zzI(zzafgVar2.zzb);
            zztVar.zzk(this.zzk);
            if (this.zzq.zzg() != -2147483647) {
                zztVar.zzh(this.zzq.zzg());
            }
            this.zzi.zzu(zztVar.zzM());
            this.zzn = zzaepVar.zzn();
        } else {
            i5 = i5;
            j = -9223372036854775807L;
            th = null;
            long j9 = this.zzn;
            if (j9 != 0) {
                long jZzn3 = zzaepVar.zzn();
                if (jZzn3 < j9) {
                    zzaepVar.zzf((int) (j9 - jZzn3));
                }
            }
        }
        int i7 = this.zzp;
        if (i7 == 0) {
            zzaepVar.zzl();
            if (zzl(zzaepVar)) {
                return i5;
            }
            zzer zzerVar3 = this.zzb;
            zzerVar3.zzh(0);
            int iZzB2 = zzerVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzafl.zza(iZzB2) == i5) {
                zzaepVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzafk zzafkVar2 = this.zzc;
            zzafkVar2.zza(iZzB2);
            if (this.zzl == j) {
                this.zzl = this.zzq.zze(zzaepVar.zzn());
            }
            i7 = zzafkVar2.zzc;
            this.zzp = i7;
            this.zzo = zzaepVar.zzn() + ((long) i7);
            if (this.zzq instanceof zzaje) {
                zzj(this.zzm + ((long) zzafkVar2.zzg));
                throw th;
            }
        }
        int iZzy = this.zzi.zzy(zzaepVar, i7, true);
        if (iZzy == -1) {
            return -1;
        }
        int i8 = this.zzp - iZzy;
        this.zzp = i8;
        if (i8 > 0) {
            return 0;
        }
        zzaga zzagaVar = this.zzi;
        long jZzj = zzj(this.zzm);
        zzafk zzafkVar3 = this.zzc;
        zzagaVar.zzx(jZzj, 1, zzafkVar3.zzc, 0, null);
        this.zzm += (long) zzafkVar3.zzg;
        this.zzp = 0;
        return 0;
    }

    private final long zzj(long j) {
        zzafk zzafkVar = this.zzc;
        return ((j * 1000000) / ((long) zzafkVar.zzd)) + this.zzl;
    }

    private final boolean zzk(zzaep zzaepVar, boolean z2) throws IOException {
        int iZzm;
        int i2;
        int iZza;
        zzaepVar.zzl();
        long jZzn = zzaepVar.zzn();
        int i3 = true != z2 ? 131072 : 32768;
        if (jZzn == 0) {
            zzap zzapVarZza = this.zze.zza(zzaepVar, null, i3);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzaepVar.zzm();
            if (!z2) {
                zzaepVar.zzf(iZzm);
            }
            i2 = 0;
        } else {
            iZzm = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (zzl(zzaepVar)) {
                if (i4 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzer zzerVar = this.zzb;
            zzerVar.zzh(0);
            int iZzB = zzerVar.zzB();
            if ((i2 == 0 || zzn(iZzB, i2)) && (iZza = zzafl.zza(iZzB)) != -1) {
                i4++;
                if (i4 != 1) {
                    if (i4 == 4) {
                        break;
                    }
                } else {
                    this.zzc.zza(iZzB);
                    i2 = iZzB;
                }
                zzaepVar.zzk(iZza - 4);
            } else {
                int i6 = i5 + 1;
                if (i5 == i3) {
                    if (z2) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z2) {
                    zzaepVar.zzl();
                    zzaepVar.zzk(iZzm + i6);
                } else {
                    zzaepVar.zzf(1);
                }
                i4 = 0;
                i5 = i6;
                i2 = 0;
            }
        }
        if (z2) {
            zzaepVar.zzf(iZzm + i5);
        } else {
            zzaepVar.zzl();
        }
        this.zzj = i2;
        return true;
    }

    private final boolean zzl(zzaep zzaepVar) throws IOException {
        zzajk zzajkVar = this.zzq;
        if (zzajkVar != null) {
            long jZzf = zzajkVar.zzf();
            if (jZzf != -1 && zzaepVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzaepVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajk zzajkVar = this.zzq;
        if ((zzajkVar instanceof zzajd) && zzajkVar.zzb()) {
            long j = this.zzo;
            if (j == -1 || j == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajd) this.zzq).zzh(this.zzo);
            zzaer zzaerVar = this.zzg;
            zzaerVar.getClass();
            zzaerVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i2, long j) {
        return ((long) (i2 & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        return zzk(zzaepVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzg = zzaerVar;
        zzaga zzagaVarZzu = zzaerVar.zzu(0, 1);
        this.zzh = zzagaVarZzu;
        this.zzi = zzagaVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfj.zza;
        int iZzi = zzi(zzaepVar);
        if (iZzi == -1 && (this.zzq instanceof zzaje)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        if (this.zzq instanceof zzaje) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }

    public zzaji(int i2) {
        this.zzb = new zzer(10);
        this.zzc = new zzafk();
        this.zzd = new zzafg();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafi();
        zzael zzaelVar = new zzael();
        this.zzf = zzaelVar;
        this.zzi = zzaelVar;
        this.zzo = -1L;
    }
}
