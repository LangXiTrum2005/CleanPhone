package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.Z;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakh implements zzaeo {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzakg zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaer zzI;
    private zzaga[] zzJ;
    private zzaga[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzalw zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahs zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaed zzq;
    private zzgtd zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzakh() {
        this(zzalw.zza, 32, null, null, zzgtd.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:143:0x0420  */
    /* JADX WARN: Code duplicated, block: B:146:0x0435 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0437  */
    /* JADX WARN: Code duplicated, block: B:148:0x0440  */
    /* JADX WARN: Code duplicated, block: B:151:0x0449  */
    /* JADX WARN: Code duplicated, block: B:152:0x0454  */
    /* JADX WARN: Code duplicated, block: B:155:0x045d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0462  */
    /* JADX WARN: Code duplicated, block: B:157:0x0464 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0466  */
    /* JADX WARN: Code duplicated, block: B:159:0x046b  */
    /* JADX WARN: Code duplicated, block: B:160:0x046d A[PHI: r33
  0x046d: PHI (r33v4 int) = (r4v53 int), (r33v5 int) binds: [B:156:0x0462, B:159:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x0471  */
    /* JADX WARN: Code duplicated, block: B:164:0x047c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0495  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x04a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:174:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0277  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        zzakg zzakgVar;
        int i10;
        byte[] bArr;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i15;
        boolean z3;
        int i16;
        long j2;
        long j3;
        int i17;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzt;
        boolean z4;
        long[] jArr2;
        int i18 = 8;
        int i19 = 1;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque.pop();
            int i20 = zzfuVar.zzd;
            int i21 = 12;
            if (i20 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfuVar.zzb);
                zzfu zzfuVarZzd = zzfuVar.zzd(1836475768);
                zzfuVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzfuVarZzd.zzb;
                int size = list2.size();
                int i22 = 0;
                long jZzz = -9223372036854775807L;
                while (i22 < size) {
                    zzfv zzfvVar = (zzfv) list2.get(i22);
                    int i23 = zzfvVar.zzd;
                    if (i23 == 1953654136) {
                        zzer zzerVar = zzfvVar.zza;
                        zzerVar.zzh(i21);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzerVar.zzB()), new zzakb(zzerVar.zzB() - 1, zzerVar.zzB(), zzerVar.zzB(), zzerVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzakb) pairCreate.second);
                    } else if (i23 == 1835362404) {
                        zzer zzerVar2 = zzfvVar.zza;
                        zzerVar2.zzh(i18);
                        jZzz = zzaka.zza(zzerVar2.zzB()) == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                    }
                    i22 += i19;
                    i21 = 12;
                }
                zzfu zzfuVarZzd2 = zzfuVar.zzd(1835365473);
                zzap zzapVarZze = zzfuVarZzd2 != null ? zzaka.zze(zzfuVarZzd2) : null;
                zzafg zzafgVar = new zzafg();
                zzfv zzfvVarZzc = zzfuVar.zzc(1969517665);
                if (zzfvVarZzc != null) {
                    zzap zzapVarZzc = zzaka.zzc(zzfvVarZzc);
                    zzafgVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar.zzc(1836476516);
                zzfvVarZzc2.getClass();
                zzao[] zzaoVarArr = new zzao[i19];
                zzaoVarArr[0] = zzaka.zzd(zzfvVarZzc2.zza);
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzaoVarArr);
                List listZzb = zzaka.zzb(zzfuVar, zzafgVar, jZzz, zzqVarZzn, (this.zzd & 16) != 0 ? i19 : 0, false, new zzgpr(this) { // from class: com.google.android.gms.internal.ads.zzakc
                    @Override // com.google.android.gms.internal.ads.zzgpr
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzakv) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzakk.zza(listZzb);
                    int i24 = 0;
                    while (i24 < size2) {
                        zzaky zzakyVar = (zzaky) listZzb.get(i24);
                        zzakv zzakvVar = zzakyVar.zza;
                        zzaer zzaerVar = this.zzI;
                        int i25 = i19;
                        int i26 = zzakvVar.zzb;
                        zzaga zzagaVarZzu = zzaerVar.zzu(i24, i26);
                        zzap zzapVar3 = zzapVar;
                        long j4 = zzakvVar.zze;
                        int i27 = i24;
                        zzv zzvVar = zzakvVar.zzg;
                        List list3 = listZzb;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzl(strZza);
                        zzakj.zzb(i26, zzafgVar, zztVarZza);
                        zzakj.zza(i26, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVar3, zzapVar2);
                        int i28 = zzakvVar.zza;
                        sparseArray2.put(i28, new zzakg(zzagaVarZzu, zzakyVar, zzo(sparseArray, i28), zztVarZza.zzM()));
                        this.zzA = Math.max(this.zzA, j4);
                        i24 = i27 + 1;
                        zzapVar = zzapVar3;
                        i19 = i25;
                        strZza = strZza;
                        listZzb = list3;
                        zzafgVar = zzafgVar;
                    }
                    this.zzI.zzv();
                } else {
                    int i29 = i19;
                    zzgqa.zzi(sparseArray2.size() == size2 ? i29 : 0);
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzaky zzakyVar2 = (zzaky) listZzb.get(i30);
                        int i31 = zzakyVar2.zza.zza;
                        ((zzakg) sparseArray2.get(i31)).zza(zzakyVar2, zzo(sparseArray, i31));
                    }
                    i19 = i29;
                }
                i18 = 8;
            } else {
                int i32 = i19;
                int i33 = 16;
                int i34 = 4;
                int i35 = 2;
                int i36 = 0;
                if (i20 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i37 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list4 = zzfuVar.zzc;
                    int size3 = list4.size();
                    int i38 = 0;
                    while (i38 < size3) {
                        zzfu zzfuVar2 = (zzfu) list4.get(i38);
                        if (zzfuVar2.zzd == 1953653094) {
                            zzfv zzfvVarZzc3 = zzfuVar2.zzc(1952868452);
                            zzfvVarZzc3.getClass();
                            zzer zzerVar3 = zzfvVarZzc3.zza;
                            zzerVar3.zzh(8);
                            int iZzB5 = zzerVar3.zzB();
                            int i39 = zzaka.zza;
                            zzakg zzakgVar2 = (zzakg) sparseArray3.get(zzerVar3.zzB());
                            if (zzakgVar2 == null) {
                                zzakgVar = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzerVar3.zzJ();
                                    zzakx zzakxVar = zzakgVar2.zzb;
                                    zzakxVar.zzb = jZzJ;
                                    zzakxVar.zzc = jZzJ;
                                }
                                zzakb zzakbVar = zzakgVar2.zze;
                                zzakgVar2.zzb.zza = new zzakb((iZzB5 & 2) != 0 ? zzerVar3.zzB() - 1 : zzakbVar.zza, (iZzB5 & 8) != 0 ? zzerVar3.zzB() : zzakbVar.zzb, (iZzB5 & 16) != 0 ? zzerVar3.zzB() : zzakbVar.zzc, (iZzB5 & 32) != 0 ? zzerVar3.zzB() : zzakbVar.zzd);
                                zzakgVar = zzakgVar2;
                            }
                            if (zzakgVar == null) {
                                i3 = i37;
                                list = list4;
                                i4 = size3;
                                i5 = i38;
                                i6 = i33;
                                i7 = i34;
                                i8 = i35;
                                i9 = i36;
                            } else {
                                zzakx zzakxVar2 = zzakgVar.zzb;
                                long j5 = zzakxVar2.zzp;
                                boolean z5 = zzakxVar2.zzq;
                                zzakgVar.zzc();
                                boolean z6 = i32;
                                zzakgVar.zzl(z6);
                                zzfv zzfvVarZzc4 = zzfuVar2.zzc(1952867444);
                                if (zzfvVarZzc4 == null || (i37 & 2) != 0) {
                                    zzakxVar2.zzp = j5;
                                    zzakxVar2.zzq = z5;
                                } else {
                                    zzer zzerVar4 = zzfvVarZzc4.zza;
                                    zzerVar4.zzh(8);
                                    zzakxVar2.zzp = zzaka.zza(zzerVar4.zzB()) == z6 ? zzerVar4.zzJ() : zzerVar4.zzz();
                                    zzakxVar2.zzq = z6;
                                }
                                List list5 = zzfuVar2.zzb;
                                int size4 = list5.size();
                                i3 = i37;
                                int i40 = i36;
                                int i41 = i40;
                                int i42 = i41;
                                while (true) {
                                    i10 = 1953658222;
                                    if (i40 >= size4) {
                                        break;
                                    }
                                    List list6 = list4;
                                    zzfv zzfvVar2 = (zzfv) list5.get(i40);
                                    int i43 = size3;
                                    if (zzfvVar2.zzd == 1953658222) {
                                        zzer zzerVar5 = zzfvVar2.zza;
                                        zzerVar5.zzh(12);
                                        int iZzH = zzerVar5.zzH();
                                        if (iZzH > 0) {
                                            i42 += iZzH;
                                            i41++;
                                        }
                                    }
                                    i40++;
                                    size3 = i43;
                                    list4 = list6;
                                }
                                list = list4;
                                i4 = size3;
                                int i44 = i36;
                                zzakgVar.zzh = i44;
                                zzakgVar.zzg = i44;
                                zzakgVar.zzf = i44;
                                zzakxVar2.zzd = i41;
                                zzakxVar2.zze = i42;
                                if (zzakxVar2.zzg.length < i41) {
                                    zzakxVar2.zzf = new long[i41];
                                    zzakxVar2.zzg = new int[i41];
                                }
                                if (zzakxVar2.zzh.length < i42) {
                                    int i45 = (i42 * 125) / 100;
                                    zzakxVar2.zzh = new int[i45];
                                    zzakxVar2.zzi = new long[i45];
                                    zzakxVar2.zzj = new boolean[i45];
                                    zzakxVar2.zzl = new boolean[i45];
                                }
                                int i46 = 0;
                                int i47 = 0;
                                int i48 = 0;
                                while (i46 < size4) {
                                    long j6 = 0;
                                    zzfv zzfvVar3 = (zzfv) list5.get(i46);
                                    if (zzfvVar3.zzd == i10) {
                                        int i49 = i47 + 1;
                                        zzer zzerVar6 = zzfvVar3.zza;
                                        zzerVar6.zzh(8);
                                        int iZzB6 = zzerVar6.zzB();
                                        zzakv zzakvVar2 = zzakgVar.zzd.zza;
                                        int i50 = i47;
                                        zzakb zzakbVar2 = zzakxVar2.zza;
                                        String str = zzfj.zza;
                                        zzakxVar2.zzg[i50] = zzerVar6.zzH();
                                        long[] jArr3 = zzakxVar2.zzf;
                                        int i51 = i48;
                                        long j7 = zzakxVar2.zzb;
                                        jArr3[i50] = j7;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr3[i50] = j7 + ((long) zzerVar6.zzB());
                                        }
                                        boolean z7 = (iZzB6 & 4) != 0;
                                        int i52 = zzakbVar2.zzd;
                                        int iZzB7 = z7 ? zzerVar6.zzB() : i52;
                                        boolean z8 = z7;
                                        int i53 = iZzB6 & 256;
                                        int i54 = iZzB6 & 512;
                                        int i55 = iZzB6 & 1024;
                                        int i56 = iZzB6 & com.p004ironsource.mediationsdk.metadata.a.f25965n;
                                        long[] jArr4 = zzakvVar2.zzi;
                                        if (jArr4 != null) {
                                            i12 = i55;
                                            if (jArr4.length == 1 && (jArr2 = zzakvVar2.zzj) != null) {
                                                long j8 = jArr4[0];
                                                if (j8 == 0) {
                                                    i13 = i52;
                                                    i14 = iZzB7;
                                                } else {
                                                    i13 = i52;
                                                    i14 = iZzB7;
                                                    long j9 = zzakvVar2.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (zzfj.zzt(j8, 1000000L, j9, roundingMode) + zzfj.zzt(jArr2[0], 1000000L, zzakvVar2.zzc, roundingMode) >= zzakvVar2.zze) {
                                                    }
                                                }
                                                j6 = jArr2[0];
                                            }
                                            iArr = zzakxVar2.zzh;
                                            jArr = zzakxVar2.zzi;
                                            zArr = zzakxVar2.zzj;
                                            i15 = i13;
                                            if (zzakvVar2.zzb == i35 || (i3 & 1) == 0) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            i16 = i51 + zzakxVar2.zzg[i50];
                                            j2 = zzakvVar2.zzc;
                                            j3 = zzakxVar2.zzp;
                                            i17 = i51;
                                            while (i17 < i16) {
                                                if (i53 != 0) {
                                                    iZzB = zzerVar6.zzB();
                                                } else {
                                                    iZzB = zzakbVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i54 != 0) {
                                                    iZzB2 = zzerVar6.zzB();
                                                } else {
                                                    iZzB2 = zzakbVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i12 != 0) {
                                                    iZzB3 = zzerVar6.zzB();
                                                } else if (i17 != 0) {
                                                    iZzB3 = i15;
                                                } else if (z8) {
                                                    iZzB3 = i14;
                                                    i17 = 0;
                                                } else {
                                                    i17 = 0;
                                                    iZzB3 = i15;
                                                }
                                                if (i56 != 0) {
                                                    iZzB4 = zzerVar6.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                zzakb zzakbVar3 = zzakbVar2;
                                                jZzt = zzfj.zzt((((long) iZzB4) + j3) - j6, 1000000L, j2, RoundingMode.DOWN);
                                                jArr[i17] = jZzt;
                                                if (!zzakxVar2.zzq) {
                                                    jArr[i17] = jZzt + zzakgVar.zzd.zzi;
                                                }
                                                iArr[i17] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z4 = false;
                                                } else if (z3) {
                                                    z4 = true;
                                                } else if (i17 == 0) {
                                                    z4 = true;
                                                    i17 = 0;
                                                } else {
                                                    z4 = false;
                                                }
                                                zArr[i17] = z4;
                                                j3 += (long) iZzB;
                                                i17++;
                                                z3 = z3;
                                                zzakbVar2 = zzakbVar3;
                                            }
                                            zzakxVar2.zzp = j3;
                                            i48 = i16;
                                            i47 = i49;
                                        } else {
                                            i12 = i55;
                                        }
                                        i13 = i52;
                                        i14 = iZzB7;
                                        iArr = zzakxVar2.zzh;
                                        jArr = zzakxVar2.zzi;
                                        zArr = zzakxVar2.zzj;
                                        i15 = i13;
                                        if (zzakvVar2.zzb == i35) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        i16 = i51 + zzakxVar2.zzg[i50];
                                        j2 = zzakvVar2.zzc;
                                        j3 = zzakxVar2.zzp;
                                        i17 = i51;
                                        while (i17 < i16) {
                                            if (i53 != 0) {
                                                iZzB = zzerVar6.zzB();
                                            } else {
                                                iZzB = zzakbVar2.zzb;
                                            }
                                            zzk(iZzB);
                                            if (i54 != 0) {
                                                iZzB2 = zzerVar6.zzB();
                                            } else {
                                                iZzB2 = zzakbVar2.zzc;
                                            }
                                            zzk(iZzB2);
                                            if (i12 != 0) {
                                                iZzB3 = zzerVar6.zzB();
                                            } else if (i17 != 0) {
                                                iZzB3 = i15;
                                            } else if (z8) {
                                                iZzB3 = i14;
                                                i17 = 0;
                                            } else {
                                                i17 = 0;
                                                iZzB3 = i15;
                                            }
                                            if (i56 != 0) {
                                                iZzB4 = zzerVar6.zzB();
                                            } else {
                                                iZzB4 = 0;
                                            }
                                            zzakb zzakbVar4 = zzakbVar2;
                                            jZzt = zzfj.zzt((((long) iZzB4) + j3) - j6, 1000000L, j2, RoundingMode.DOWN);
                                            jArr[i17] = jZzt;
                                            if (!zzakxVar2.zzq) {
                                                jArr[i17] = jZzt + zzakgVar.zzd.zzi;
                                            }
                                            iArr[i17] = iZzB2;
                                            if (((iZzB3 >> 16) & 1) != 0) {
                                                z4 = false;
                                            } else if (z3) {
                                                z4 = true;
                                            } else if (i17 == 0) {
                                                z4 = true;
                                                i17 = 0;
                                            } else {
                                                z4 = false;
                                            }
                                            zArr[i17] = z4;
                                            j3 += (long) iZzB;
                                            i17++;
                                            z3 = z3;
                                            zzakbVar2 = zzakbVar4;
                                        }
                                        zzakxVar2.zzp = j3;
                                        i48 = i16;
                                        i47 = i49;
                                    }
                                    i46++;
                                    i38 = i38;
                                    size4 = size4;
                                    i10 = 1953658222;
                                    i35 = 2;
                                }
                                i5 = i38;
                                zzakv zzakvVar3 = zzakgVar.zzd.zza;
                                zzakb zzakbVar5 = zzakxVar2.zza;
                                zzakbVar5.getClass();
                                zzakw zzakwVarZza = zzakvVar3.zza(zzakbVar5.zza);
                                zzfv zzfvVarZzc5 = zzfuVar2.zzc(1935763834);
                                if (zzfvVarZzc5 != null) {
                                    zzakwVarZza.getClass();
                                    int i57 = zzakwVarZza.zzd;
                                    zzer zzerVar7 = zzfvVarZzc5.zza;
                                    zzerVar7.zzh(8);
                                    if ((zzerVar7.zzB() & 1) == 1) {
                                        zzerVar7.zzk(8);
                                    }
                                    int iZzs = zzerVar7.zzs();
                                    int iZzH2 = zzerVar7.zzH();
                                    int i58 = zzakxVar2.zze;
                                    if (iZzH2 > i58) {
                                        throw zzat.zzb(p005e.a.a(new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i58).length()), iZzH2, "Saiz sample count ", i58, " is greater than fragment sample count"), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr2 = zzakxVar2.zzl;
                                        i11 = 0;
                                        for (int i59 = 0; i59 < iZzH2; i59++) {
                                            int iZzs2 = zzerVar7.zzs();
                                            i11 += iZzs2;
                                            zArr2[i59] = iZzs2 > i57;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z9 = iZzs > i57;
                                        i11 = iZzs * iZzH2;
                                        z2 = false;
                                        Arrays.fill(zzakxVar2.zzl, 0, iZzH2, z9);
                                    }
                                    Arrays.fill(zzakxVar2.zzl, iZzH2, zzakxVar2.zze, z2);
                                    if (i11 > 0) {
                                        zzakxVar2.zza(i11);
                                    }
                                }
                                zzfv zzfvVarZzc6 = zzfuVar2.zzc(1935763823);
                                if (zzfvVarZzc6 != null) {
                                    zzer zzerVar8 = zzfvVarZzc6.zza;
                                    zzerVar8.zzh(8);
                                    int iZzB8 = zzerVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzerVar8.zzk(8);
                                    }
                                    int iZzH3 = zzerVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb.append("Unexpected saio entry count: ");
                                        sb.append(iZzH3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    zzakxVar2.zzc += zzaka.zza(iZzB8) == 0 ? zzerVar8.zzz() : zzerVar8.zzJ();
                                }
                                zzfv zzfvVarZzc7 = zzfuVar2.zzc(1936027235);
                                if (zzfvVarZzc7 != null) {
                                    zzl(zzfvVarZzc7.zza, 0, zzakxVar2);
                                }
                                String str2 = zzakwVarZza != null ? zzakwVarZza.zzb : null;
                                zzer zzerVar9 = null;
                                zzer zzerVar10 = null;
                                for (int i60 = 0; i60 < list5.size(); i60++) {
                                    zzfv zzfvVar4 = (zzfv) list5.get(i60);
                                    zzer zzerVar11 = zzfvVar4.zza;
                                    int i61 = zzfvVar4.zzd;
                                    if (i61 == 1935828848) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar9 = zzerVar11;
                                        }
                                    } else if (i61 == 1936158820) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar10 = zzerVar11;
                                        }
                                    }
                                }
                                if (zzerVar9 == null || zzerVar10 == null) {
                                    i7 = i34;
                                    i8 = 2;
                                } else {
                                    zzerVar9.zzh(8);
                                    int iZza = zzaka.zza(zzerVar9.zzB());
                                    i7 = i34;
                                    zzerVar9.zzk(i7);
                                    if (iZza == 1) {
                                        zzerVar9.zzk(i7);
                                    }
                                    if (zzerVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzerVar10.zzh(8);
                                    int iZza2 = zzaka.zza(zzerVar10.zzB());
                                    zzerVar10.zzk(i7);
                                    if (iZza2 != 1) {
                                        i8 = 2;
                                        if (iZza2 >= 2) {
                                            zzerVar10.zzk(i7);
                                        }
                                    } else {
                                        if (zzerVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                        i8 = 2;
                                    }
                                    if (zzerVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzerVar10.zzk(1);
                                    int iZzs3 = zzerVar10.zzs();
                                    int i62 = (iZzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i63 = iZzs3 & 15;
                                    if (zzerVar10.zzs() == 1) {
                                        int iZzs4 = zzerVar10.zzs();
                                        int i64 = i33;
                                        byte[] bArr3 = new byte[i64];
                                        zzerVar10.zzm(bArr3, 0, i64);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzerVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzerVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzakxVar2.zzk = true;
                                        zzakxVar2.zzm = new zzakw(true, str2, iZzs4, bArr3, i62, i63, bArr);
                                    }
                                }
                                int size5 = list5.size();
                                for (int i65 = 0; i65 < size5; i65++) {
                                    zzfv zzfvVar5 = (zzfv) list5.get(i65);
                                    if (zzfvVar5.zzd == 1970628964) {
                                        zzer zzerVar12 = zzfvVar5.zza;
                                        zzerVar12.zzh(8);
                                        zzerVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzerVar12, 16, zzakxVar2);
                                        }
                                    }
                                }
                                i9 = 0;
                                i6 = 16;
                                i32 = 1;
                            }
                        } else {
                            i3 = i37;
                            list = list4;
                            i4 = size3;
                            i5 = i38;
                            i6 = i33;
                            i7 = i34;
                            i8 = i35;
                            i9 = i36;
                        }
                        i35 = i8;
                        i34 = i7;
                        i36 = i9;
                        i33 = i6;
                        size3 = i4;
                        list4 = list;
                        i38 = i5 + 1;
                        i37 = i3;
                    }
                    int i66 = i36;
                    i2 = 8;
                    zzq zzqVarZzn2 = zzn(zzfuVar.zzb);
                    if (zzqVarZzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i67 = i66; i67 < size6; i67++) {
                            ((zzakg) sparseArray3.valueAt(i67)).zzb(zzqVarZzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i68 = i66; i68 < size7; i68++) {
                            zzakg zzakgVar3 = (zzakg) sparseArray3.valueAt(i68);
                            long j10 = this.zzz;
                            int i69 = zzakgVar3.zzf;
                            while (true) {
                                zzakx zzakxVar3 = zzakgVar3.zzb;
                                if (i69 >= zzakxVar3.zze || zzakxVar3.zzi[i69] > j10) {
                                    break;
                                }
                                if (zzakxVar3.zzj[i69]) {
                                    zzakgVar3.zzi = i69;
                                }
                                i69++;
                            }
                        }
                        i32 = 1;
                        this.zzz = -9223372036854775807L;
                    } else {
                        i32 = 1;
                    }
                } else {
                    i2 = 8;
                    if (!arrayDeque.isEmpty()) {
                        ((zzfu) arrayDeque.peek()).zzb(zzfuVar);
                    }
                }
                i18 = i2;
                i19 = i32;
            }
        }
        zzi();
    }

    private static int zzk(int i2) throws zzat {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i2, zzakx zzakxVar) throws zzat {
        zzerVar.zzh(i2 + 8);
        int iZzB = zzerVar.zzB();
        int i3 = zzaka.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iZzB & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzakxVar.zzl, 0, zzakxVar.zze, false);
            return;
        }
        int i4 = zzakxVar.zze;
        if (iZzH != i4) {
            throw zzat.zzb(p005e.a.a(new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i4).length()), iZzH, "Senc sample count ", i4, " is different from fragment sample count"), null);
        }
        Arrays.fill(zzakxVar.zzl, 0, iZzH, z2);
        zzakxVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzakxVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzakxVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzh(8);
        int iZza = zzaka.zza(zzerVar2.zzB());
        zzerVar2.zzk(4);
        long jZzz = zzerVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar2.zzz();
            jZzJ2 = zzerVar2.zzz();
        } else {
            jZzJ = zzerVar2.zzJ();
            jZzJ2 = zzerVar2.zzJ();
        }
        long j2 = jZzJ2 + j;
        long jZzt = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar2.zzk(2);
        int iZzt = zzerVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j3 = j2;
        long j4 = jZzt;
        int i2 = 0;
        while (i2 < iZzt) {
            int iZzB = zzerVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar2.zzz();
            iArr[i2] = iZzB & Integer.MAX_VALUE;
            jArr[i2] = j3;
            jArr3[i2] = j4;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzt2 = zzfj.zzt(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i2] = jZzt2 - jArr5[i2];
            zzerVar2.zzk(4);
            j3 += (long) iArr[i2];
            i2++;
            zzerVar2 = zzerVar;
            iZzt = iZzt;
            j4 = jZzt2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaec(iArr, jArr, jArr2, jArr3));
    }

    private static zzq zzn(List list) {
        int i2;
        UUID[] uuidArr;
        zzakr zzakrVar;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            zzfv zzfvVar = (zzfv) list.get(i3);
            if (zzfvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzfvVar.zza.zzi();
                zzer zzerVar = new zzer(bArrZzi);
                if (zzerVar.zze() < 32) {
                    i2 = i3;
                    zzakrVar = null;
                } else {
                    zzerVar.zzh(0);
                    int iZzd = zzerVar.zzd();
                    int iZzB = zzerVar.zzB();
                    if (iZzB != iZzd) {
                        zzee.zzc("PsshAtomUtil", p005e.a.a(new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length()), iZzB, "Advertised atom size (", iZzd, ") does not match buffer size: "));
                    } else {
                        int iZzB2 = zzerVar.zzB();
                        if (iZzB2 != 1886614376) {
                            Z.w(new StringBuilder(String.valueOf(iZzB2).length() + 23), "Atom type is not pssh: ", iZzB2, "PsshAtomUtil");
                        } else {
                            int iZza = zzaka.zza(zzerVar.zzB());
                            if (iZza > 1) {
                                Z.w(new StringBuilder(String.valueOf(iZza).length() + 26), "Unsupported pssh version: ", iZza, "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzerVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i4 = 0;
                                    while (i4 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i5 = i4;
                                        uuidArr2[i5] = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                        i4 = i5 + 1;
                                        i3 = i3;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i2 = i3;
                                int iZzH2 = zzerVar.zzH();
                                int iZzd2 = zzerVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    zzee.zzc("PsshAtomUtil", p005e.a.a(new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length()), iZzH2, "Atom data size (", iZzd2, ") does not match the bytes left: "));
                                    zzakrVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzerVar.zzm(bArr, 0, iZzH2);
                                    zzakrVar = new zzakr(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i2 = i3;
                    zzakrVar = null;
                }
                UUID uuid2 = zzakrVar == null ? null : zzakrVar.zza;
                if (uuid2 == null) {
                    zzee.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzp(uuid2, null, "video/mp4", bArrZzi));
                }
                i3 = i2 + 1;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzakb zzo(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (zzakb) sparseArray.valueAt(0);
        }
        zzakb zzakbVar = (zzakb) sparseArray.get(i2);
        zzakbVar.getClass();
        return zzakbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzafv zzafvVarZza = zzaku.zza(zzaepVar);
        this.zzr = zzafvVarZza != null ? zzgtd.zzj(zzafvVarZza) : zzgtd.zzi();
        return zzafvVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        int i2;
        int i3 = this.zzd;
        if ((i3 & 32) == 0) {
            zzaerVar = new zzalz(zzaerVar, this.zzc);
        }
        this.zzI = zzaerVar;
        zzi();
        zzaga[] zzagaVarArr = new zzaga[2];
        this.zzJ = zzagaVarArr;
        int i4 = 100;
        int i5 = 0;
        if ((i3 & 4) != 0) {
            zzagaVarArr[0] = this.zzI.zzu(100, 5);
            i2 = 1;
            i4 = 101;
        } else {
            i2 = 0;
        }
        zzaga[] zzagaVarArr2 = (zzaga[]) zzfj.zzb(this.zzJ, i2);
        this.zzJ = zzagaVarArr2;
        for (zzaga zzagaVar : zzagaVarArr2) {
            zzagaVar.zzu(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaga[list.size()];
        while (i5 < this.zzK.length) {
            zzaga zzagaVarZzu = this.zzI.zzu(i4, 3);
            zzagaVarZzu.zzu((zzv) list.get(i5));
            this.zzK[i5] = zzagaVarZzu;
            i5++;
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x0230  */
    /* JADX WARN: Code duplicated, block: B:111:0x0238  */
    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0244  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x0258  */
    /* JADX WARN: Code duplicated, block: B:122:0x0274  */
    /* JADX WARN: Code duplicated, block: B:125:0x027e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0282  */
    /* JADX WARN: Code duplicated, block: B:130:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:443:0x026c A[EDGE_INSN: B:443:0x026c->B:120:0x026c BREAK  A[LOOP:6: B:68:0x0154->B:70:0x015a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x02bf A[EDGE_INSN: B:444:0x02bf->B:136:0x02bf BREAK  A[LOOP:7: B:128:0x0289->B:447:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154 A[LOOP:6: B:68:0x0154->B:70:0x015a, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:70:0x015a A[LOOP:6: B:68:0x0154->B:70:0x015a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0189  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        zzakg zzakgVar;
        char c2;
        zzakv zzakvVar;
        zzaga zzagaVar;
        long jZzd;
        int i2;
        zzer zzerVar;
        byte[] bArrZzi;
        int i3;
        int i4;
        int i5;
        int iZzy;
        int i6;
        zzgq zzgqVar;
        zzgq zzgqVar2;
        zzgq zzgqVar3;
        int iZzc;
        int iZzB;
        boolean z2;
        int iZzg;
        zzakw zzakwVarZzj;
        zzafz zzafzVar;
        ArrayDeque arrayDeque;
        int i7;
        zzakf zzakfVar;
        int i8;
        long j;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        int iZzi;
        String strZzM;
        String strZzM2;
        long jZzt;
        long jZzz;
        long j3;
        long j4;
        while (true) {
            int i13 = this.zzs;
            char c3 = 2;
            if (i13 == 0) {
                if (this.zzv == 0) {
                    zzer zzerVar2 = this.zzm;
                    if (!zzaepVar.zzb(zzerVar2.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzafoVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzerVar2.zzh(0);
                    this.zzu = zzerVar2.zzz();
                    this.zzt = zzerVar2.zzB();
                }
                long j5 = this.zzu;
                if (j5 == 1) {
                    zzer zzerVar3 = this.zzm;
                    zzaepVar.zzc(zzerVar3.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzerVar3.zzJ();
                } else if (j5 == 0) {
                    long jZzo = zzaepVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque2 = this.zzn;
                        jZzo = !arrayDeque2.isEmpty() ? ((zzfu) arrayDeque2.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzaepVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j6 = this.zzu;
                int i14 = this.zzv;
                long j7 = i14;
                if (j6 < j7) {
                    if (this.zzt != 1718773093 || i14 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzu = j7;
                    j6 = j7;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzer zzerVar4 = this.zzk;
                        zzerVar4.zza((int) j6);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar4.zzi(), 0, 8);
                        zzaepVar.zzc(zzerVar4.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzaec) zzm(new zzfv(1936286840, zzerVar4).zza, zzaepVar.zzm()).second);
                    } else {
                        zzaepVar.zze((int) (j6 - j7), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzaepVar.zzn() - j7;
                    int i15 = this.zzt;
                    if ((i15 == 1836019558 || i15 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzafq(this.zzA, jZzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            zzakx zzakxVar = ((zzakg) sparseArray.valueAt(i16)).zzb;
                            zzakxVar.zzc = jZzn;
                            zzakxVar.zzb = jZzn;
                        }
                    }
                    int i17 = this.zzt;
                    if (i17 == 1835295092) {
                        this.zzC = null;
                        this.zzx = jZzn + this.zzu;
                        this.zzs = 2;
                    } else if (i17 == 1836019574 || i17 == 1953653099 || i17 == 1835297121 || i17 == 1835626086 || i17 == 1937007212 || i17 == 1836019558 || i17 == 1953653094 || i17 == 1836475768 || i17 == 1701082227 || i17 == 1835365473) {
                        long jZzn2 = zzaepVar.zzn();
                        long j8 = this.zzu;
                        long j9 = jZzn2 + j8;
                        if (j8 != this.zzv && i17 == 1835365473) {
                            zzer zzerVar5 = this.zzk;
                            zzerVar5.zza(8);
                            zzaepVar.zzi(zzerVar5.zzi(), 0, 8);
                            zzaka.zzf(zzerVar5);
                            zzaepVar.zzf(zzerVar5.zzg());
                            zzaepVar.zzl();
                        }
                        long j10 = j9 - 8;
                        this.zzn.push(new zzfu(this.zzt, j10));
                        if (this.zzu == this.zzv) {
                            zzj(j10);
                        } else {
                            zzi();
                        }
                    } else if (i17 == 1751411826 || i17 == 1835296868 || i17 == 1836476516 || i17 == 1936286840 || i17 == 1937011556 || i17 == 1937011827 || i17 == 1668576371 || i17 == 1937011555 || i17 == 1937011578 || i17 == 1937013298 || i17 == 1937007471 || i17 == 1668232756 || i17 == 1937011571 || i17 == 1952867444 || i17 == 1952868452 || i17 == 1953196132 || i17 == 1953654136 || i17 == 1953658222 || i17 == 1886614376 || i17 == 1935763834 || i17 == 1935763823 || i17 == 1936027235 || i17 == 1970628964 || i17 == 1935828848 || i17 == 1936158820 || i17 == 1701606260 || i17 == 1835362404 || i17 == 1701671783 || i17 == 1969517665 || i17 == 1801812339 || i17 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzer zzerVar6 = new zzer((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar6.zzi(), 0, 8);
                        this.zzw = zzerVar6;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i13 != 1) {
                long j11 = Long.MAX_VALUE;
                if (i13 != 2) {
                    zzakgVar = this.zzC;
                    if (zzakgVar != null) {
                        c2 = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j12 = Long.MAX_VALUE;
                    int i18 = 0;
                    zzakg zzakgVar2 = null;
                    while (i18 < size2) {
                        char c4 = c3;
                        zzakg zzakgVar3 = (zzakg) sparseArray2.valueAt(i18);
                        if ((zzakgVar3.zzk() || zzakgVar3.zzf != zzakgVar3.zzd.zzb) && (!zzakgVar3.zzk() || zzakgVar3.zzh != zzakgVar3.zzb.zzd)) {
                            long jZze = zzakgVar3.zze();
                            if (jZze < j12) {
                                zzakgVar2 = zzakgVar3;
                                j12 = jZze;
                            }
                        }
                        i18++;
                        c3 = c4;
                    }
                    c2 = c3;
                    if (zzakgVar2 != null) {
                        int iZze = (int) (zzakgVar2.zze() - zzaepVar.zzn());
                        if (iZze < 0) {
                            zzee.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzaepVar.zzf(iZze);
                        this.zzC = zzakgVar2;
                        zzakgVar = zzakgVar2;
                        break;
                    }
                    int iZzn = (int) (this.zzx - zzaepVar.zzn());
                    if (iZzn < 0) {
                        throw zzat.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzaepVar.zzf(iZzn);
                    zzi();
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzakg zzakgVar4 = null;
                    for (int i19 = 0; i19 < size3; i19++) {
                        zzakx zzakxVar2 = ((zzakg) sparseArray3.valueAt(i19)).zzb;
                        if (zzakxVar2.zzo) {
                            long j13 = zzakxVar2.zzc;
                            if (j13 < j11) {
                                zzakgVar4 = (zzakg) sparseArray3.valueAt(i19);
                                j11 = j13;
                            }
                        }
                    }
                    if (zzakgVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn2 = (int) (j11 - zzaepVar.zzn());
                        if (iZzn2 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzaepVar.zzf(iZzn2);
                        zzakx zzakxVar3 = zzakgVar4.zzb;
                        zzer zzerVar7 = zzakxVar3.zzn;
                        zzaepVar.zzc(zzerVar7.zzi(), 0, zzerVar7.zze());
                        zzerVar7.zzh(0);
                        zzakxVar3.zzo = false;
                    }
                }
            } else {
                long j14 = this.zzu - ((long) this.zzv);
                zzer zzerVar8 = this.zzw;
                int i20 = (int) j14;
                if (zzerVar8 != null) {
                    zzaepVar.zzc(zzerVar8.zzi(), 8, i20);
                    zzfv zzfvVar = new zzfv(this.zzt, zzerVar8);
                    ArrayDeque arrayDeque3 = this.zzn;
                    if (arrayDeque3.isEmpty()) {
                        int i21 = zzfvVar.zzd;
                        if (i21 == 1936286840) {
                            Pair pairZzm = zzm(zzfvVar.zza, zzaepVar.zzn());
                            this.zzq.zza((zzaec) pairZzm.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) pairZzm.first).longValue();
                                this.zzI.zzw((zzafr) pairZzm.second);
                                this.zzL = true;
                            }
                        } else if (i21 == 1701671783) {
                            zzer zzerVar9 = zzfvVar.zza;
                            if (this.zzJ.length != 0) {
                                zzerVar9.zzh(8);
                                int iZza = zzaka.zza(zzerVar9.zzB());
                                if (iZza == 0) {
                                    strZzM = zzerVar9.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzerVar9.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz2 = zzerVar9.zzz();
                                    long jZzz3 = zzerVar9.zzz();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long jZzt2 = zzfj.zzt(jZzz3, 1000000L, jZzz2, roundingMode);
                                    long j15 = this.zzB;
                                    long j16 = j15 != -9223372036854775807L ? j15 + jZzt2 : -9223372036854775807L;
                                    jZzt = zzfj.zzt(zzerVar9.zzz(), 1000L, jZzz2, roundingMode);
                                    jZzz = zzerVar9.zzz();
                                    j3 = jZzt2;
                                    j4 = j16;
                                } else if (iZza != 1) {
                                    Z.w(new StringBuilder(String.valueOf(iZza).length() + 35), "Skipping unsupported emsg version: ", iZza, "FragmentedMp4Extractor");
                                } else {
                                    long jZzz4 = zzerVar9.zzz();
                                    long jZzJ = zzerVar9.zzJ();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long jZzt3 = zzfj.zzt(jZzJ, 1000000L, jZzz4, roundingMode2);
                                    long jZzt4 = zzfj.zzt(zzerVar9.zzz(), 1000L, jZzz4, roundingMode2);
                                    long jZzz5 = zzerVar9.zzz();
                                    strZzM = zzerVar9.zzM((char) 0);
                                    strZzM.getClass();
                                    strZzM2 = zzerVar9.zzM((char) 0);
                                    strZzM2.getClass();
                                    jZzt = jZzt4;
                                    jZzz = jZzz5;
                                    j3 = -9223372036854775807L;
                                    j4 = jZzt3;
                                }
                                String str = strZzM;
                                String str2 = strZzM2;
                                byte[] bArr = new byte[zzerVar9.zzd()];
                                zzerVar9.zzm(bArr, 0, zzerVar9.zzd());
                                zzer zzerVar10 = new zzer(this.zzl.zza(new zzahr(str, str2, jZzt, jZzz, bArr)));
                                int iZzd = zzerVar10.zzd();
                                for (zzaga zzagaVar2 : this.zzJ) {
                                    zzerVar10.zzh(0);
                                    zzagaVar2.zzz(zzerVar10, iZzd);
                                }
                                if (j4 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakf(j3, true, iZzd));
                                    this.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque4 = this.zzo;
                                    if (arrayDeque4.isEmpty()) {
                                        for (zzaga zzagaVar3 : this.zzJ) {
                                            zzagaVar3.zzx(j4, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque4.addLast(new zzakf(j4, false, iZzd));
                                        this.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfu) arrayDeque3.peek()).zza(zzfvVar);
                    }
                } else {
                    zzaepVar.zzf(i20);
                }
                zzj(zzaepVar.zzn());
            }
        }
        int i22 = 4;
        if (this.zzs == 3) {
            this.zzD = zzakgVar.zzf();
            String str3 = zzakgVar.zzd.zza.zzg.zzo;
            if (!Objects.equals(str3, "video/avc")) {
                Objects.equals(str3, "video/hevc");
            }
            this.zzG = true;
            if (zzakgVar.zzf < zzakgVar.zzi) {
                zzaepVar.zzf(this.zzD);
                zzakw zzakwVarZzj2 = zzakgVar.zzj();
                if (zzakwVarZzj2 != null) {
                    zzakx zzakxVar4 = zzakgVar.zzb;
                    zzer zzerVar11 = zzakxVar4.zzn;
                    int i23 = zzakwVarZzj2.zzd;
                    if (i23 != 0) {
                        zzerVar11.zzk(i23);
                    }
                    if (zzakxVar4.zzb(zzakgVar.zzf)) {
                        zzerVar11.zzk(zzerVar11.zzt() * 6);
                    }
                }
                if (!zzakgVar.zzh()) {
                    this.zzC = null;
                }
                i7 = 3;
            } else {
                if (zzakgVar.zzd.zza.zzh == 1) {
                    this.zzD -= 8;
                    zzaepVar.zzf(8);
                }
                if ("audio/ac4".equals(zzakgVar.zzd.zza.zzg.zzo)) {
                    this.zzE = zzakgVar.zzi(this.zzD, 7);
                    int i24 = this.zzD;
                    zzer zzerVar12 = this.zzk;
                    zzads.zzc(i24, zzerVar12);
                    zzakgVar.zza.zzz(zzerVar12, 7);
                    iZzi = this.zzE + 7;
                    this.zzE = iZzi;
                    i12 = 0;
                } else {
                    i12 = 0;
                    iZzi = zzakgVar.zzi(this.zzD, 0);
                    this.zzE = iZzi;
                }
                this.zzD += iZzi;
                this.zzs = 4;
                this.zzF = i12;
                zzakvVar = zzakgVar.zzd.zza;
                zzagaVar = zzakgVar.zza;
                jZzd = zzakgVar.zzd();
                i2 = zzakvVar.zzk;
                if (i2 == 0) {
                    while (true) {
                        i10 = this.zzE;
                        i11 = this.zzD;
                        if (i10 < i11) {
                            break;
                        }
                        this.zzE += zzagaVar.zzy(zzaepVar, i11 - i10, false);
                    }
                } else {
                    zzerVar = this.zzh;
                    bArrZzi = zzerVar.zzi();
                    bArrZzi[0] = 0;
                    bArrZzi[1] = 0;
                    bArrZzi[c2] = 0;
                    i3 = 4 - i2;
                    while (this.zzE < this.zzD) {
                        i4 = this.zzF;
                        if (i4 == 0) {
                            if (this.zzK.length <= 0 || !this.zzG) {
                                iZzc = zzgm.zzc(zzakvVar.zzg);
                                if (i2 + iZzc > this.zzD - this.zzE) {
                                    iZzc = 0;
                                }
                            } else {
                                iZzc = 0;
                            }
                            zzaepVar.zzc(bArrZzi, i3, i2 + iZzc);
                            zzerVar.zzh(0);
                            iZzB = zzerVar.zzB();
                            if (iZzB >= 0) {
                                throw zzat.zzb("Invalid NAL length", null);
                            }
                            this.zzF = iZzB - iZzc;
                            zzer zzerVar13 = this.zzg;
                            zzerVar13.zzh(0);
                            zzagaVar.zzz(zzerVar13, i22);
                            this.zzE += i22;
                            this.zzD += i3;
                            if (this.zzK.length > 0 || iZzc <= 0 || !zzgm.zzb(zzakvVar.zzg, bArrZzi[i22])) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.zzH = z2;
                            zzagaVar.zzz(zzerVar, iZzc);
                            this.zzE += iZzc;
                            if (iZzc <= 0 && !this.zzG && zzgm.zzd(bArrZzi, i22, iZzc, zzakvVar.zzg)) {
                                this.zzG = true;
                            }
                        } else {
                            if (this.zzH) {
                                zzer zzerVar14 = this.zzi;
                                zzerVar14.zza(i4);
                                zzaepVar.zzc(zzerVar14.zzi(), 0, this.zzF);
                                zzagaVar.zzz(zzerVar14, this.zzF);
                                iZzy = this.zzF;
                                i5 = i22;
                                int iZza2 = zzgm.zza(zzerVar14.zzi(), zzerVar14.zze());
                                zzerVar14.zzh(0);
                                zzerVar14.zzf(iZza2);
                                i6 = zzakvVar.zzg.zzq;
                                if (i6 == -1) {
                                    zzgqVar3 = this.zzp;
                                    if (zzgqVar3.zzb() != 0) {
                                        zzgqVar3.zza(0);
                                    }
                                } else {
                                    zzgqVar = this.zzp;
                                    if (zzgqVar.zzb() != i6) {
                                        zzgqVar.zza(i6);
                                    }
                                }
                                zzgqVar2 = this.zzp;
                                zzgqVar2.zzc(jZzd, zzerVar14);
                                if ((zzakgVar.zzg() & 4) != 0) {
                                    zzgqVar2.zze();
                                }
                            } else {
                                i5 = i22;
                                iZzy = zzagaVar.zzy(zzaepVar, i4, false);
                            }
                            this.zzE += iZzy;
                            this.zzF -= iZzy;
                            i22 = i5;
                        }
                    }
                }
                iZzg = zzakgVar.zzg();
                if (!this.zzG) {
                    iZzg |= 67108864;
                }
                int i25 = iZzg;
                zzakwVarZzj = zzakgVar.zzj();
                if (zzakwVarZzj != null) {
                    zzafzVar = zzakwVarZzj.zzc;
                } else {
                    zzafzVar = null;
                }
                zzagaVar.zzx(jZzd, i25, this.zzD, 0, zzafzVar);
                while (true) {
                    arrayDeque = this.zzo;
                    if (!arrayDeque.isEmpty()) {
                        break;
                    }
                    zzakfVar = (zzakf) arrayDeque.removeFirst();
                    int i26 = this.zzy;
                    i8 = zzakfVar.zzc;
                    this.zzy = i26 - i8;
                    j = zzakfVar.zza;
                    if (zzakfVar.zzb) {
                        j += jZzd;
                    }
                    j2 = j;
                    for (zzaga zzagaVar4 : this.zzJ) {
                        zzagaVar4.zzx(j2, 1, i8, this.zzy, null);
                    }
                }
                if (!zzakgVar.zzh()) {
                    this.zzC = null;
                }
                i7 = 3;
            }
        } else {
            zzakvVar = zzakgVar.zzd.zza;
            zzagaVar = zzakgVar.zza;
            jZzd = zzakgVar.zzd();
            i2 = zzakvVar.zzk;
            if (i2 == 0) {
                while (true) {
                    i10 = this.zzE;
                    i11 = this.zzD;
                    if (i10 < i11) {
                        break;
                        break;
                    }
                    this.zzE += zzagaVar.zzy(zzaepVar, i11 - i10, false);
                }
            } else {
                zzerVar = this.zzh;
                bArrZzi = zzerVar.zzi();
                bArrZzi[0] = 0;
                bArrZzi[1] = 0;
                bArrZzi[c2] = 0;
                i3 = 4 - i2;
                while (this.zzE < this.zzD) {
                    i4 = this.zzF;
                    if (i4 == 0) {
                        if (this.zzK.length <= 0) {
                            iZzc = zzgm.zzc(zzakvVar.zzg);
                            if (i2 + iZzc > this.zzD - this.zzE) {
                                iZzc = 0;
                            }
                        } else {
                            iZzc = zzgm.zzc(zzakvVar.zzg);
                            if (i2 + iZzc > this.zzD - this.zzE) {
                                iZzc = 0;
                            }
                        }
                        zzaepVar.zzc(bArrZzi, i3, i2 + iZzc);
                        zzerVar.zzh(0);
                        iZzB = zzerVar.zzB();
                        if (iZzB >= 0) {
                            throw zzat.zzb("Invalid NAL length", null);
                        }
                        this.zzF = iZzB - iZzc;
                        zzer zzerVar15 = this.zzg;
                        zzerVar15.zzh(0);
                        zzagaVar.zzz(zzerVar15, i22);
                        this.zzE += i22;
                        this.zzD += i3;
                        if (this.zzK.length > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        this.zzH = z2;
                        zzagaVar.zzz(zzerVar, iZzc);
                        this.zzE += iZzc;
                        if (iZzc <= 0) {
                        }
                    } else {
                        if (this.zzH) {
                            zzer zzerVar16 = this.zzi;
                            zzerVar16.zza(i4);
                            zzaepVar.zzc(zzerVar16.zzi(), 0, this.zzF);
                            zzagaVar.zzz(zzerVar16, this.zzF);
                            iZzy = this.zzF;
                            i5 = i22;
                            int iZza3 = zzgm.zza(zzerVar16.zzi(), zzerVar16.zze());
                            zzerVar16.zzh(0);
                            zzerVar16.zzf(iZza3);
                            i6 = zzakvVar.zzg.zzq;
                            if (i6 == -1) {
                                zzgqVar3 = this.zzp;
                                if (zzgqVar3.zzb() != 0) {
                                    zzgqVar3.zza(0);
                                }
                            } else {
                                zzgqVar = this.zzp;
                                if (zzgqVar.zzb() != i6) {
                                    zzgqVar.zza(i6);
                                }
                            }
                            zzgqVar2 = this.zzp;
                            zzgqVar2.zzc(jZzd, zzerVar16);
                            if ((zzakgVar.zzg() & 4) != 0) {
                                zzgqVar2.zze();
                            }
                        } else {
                            i5 = i22;
                            iZzy = zzagaVar.zzy(zzaepVar, i4, false);
                        }
                        this.zzE += iZzy;
                        this.zzF -= iZzy;
                        i22 = i5;
                    }
                }
            }
            iZzg = zzakgVar.zzg();
            if (!this.zzG) {
                iZzg |= 67108864;
            }
            int i27 = iZzg;
            zzakwVarZzj = zzakgVar.zzj();
            if (zzakwVarZzj != null) {
                zzafzVar = zzakwVarZzj.zzc;
            } else {
                zzafzVar = null;
            }
            zzagaVar.zzx(jZzd, i27, this.zzD, 0, zzafzVar);
            while (true) {
                arrayDeque = this.zzo;
                if (!arrayDeque.isEmpty()) {
                    break;
                    break;
                }
                zzakfVar = (zzakf) arrayDeque.removeFirst();
                int i28 = this.zzy;
                i8 = zzakfVar.zzc;
                this.zzy = i28 - i8;
                j = zzakfVar.zza;
                if (zzakfVar.zzb) {
                    j += jZzd;
                }
                j2 = j;
                while (i9 < r3) {
                    zzagaVar4.zzx(j2, 1, i8, this.zzy, null);
                }
            }
            if (!zzakgVar.zzh()) {
                this.zzC = null;
            }
            i7 = 3;
        }
        this.zzs = i7;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzakg) sparseArray.valueAt(i2)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public final /* synthetic */ void zzh(long j, zzer zzerVar) {
        zzaeb.zza(j, zzerVar, this.zzK);
    }

    public zzakh(zzalw zzalwVar, int i2, zzfg zzfgVar, zzakv zzakvVar, List list, zzaga zzagaVar) {
        this.zzc = zzalwVar;
        this.zzd = i2;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahs();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgtd.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaer.zza;
        this.zzJ = new zzaga[0];
        this.zzK = new zzaga[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzake
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j, zzer zzerVar) {
                this.zza.zzh(j, zzerVar);
            }
        });
        this.zzq = new zzaed();
        this.zzM = -1L;
    }
}
