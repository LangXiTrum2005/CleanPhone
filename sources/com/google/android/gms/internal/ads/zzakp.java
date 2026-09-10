package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakp implements zzaeo {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private zzaho zzB;
    private final zzalw zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzakt zzi;
    private final List zzj;
    private zzgtd zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaer zzx;
    private zzako[] zzy;
    private long[][] zzz;

    @Deprecated
    public zzakp() {
        this(zzalw.zza, 16);
    }

    public static /* synthetic */ long zzh(zzaky zzakyVar, long j, long j2) {
        int iZzl = zzl(zzakyVar, j);
        return iZzl == -1 ? j2 : Math.min(zzakyVar.zzc[iZzl], j2);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01be  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:99:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzk(long j) throws zzat {
        int i2;
        int i3;
        zzap zzapVarZzc;
        long j2;
        int i4;
        int i5;
        int i6;
        zzako zzakoVar;
        zzaga zzagaVar;
        long j3;
        int i7;
        long j4;
        zzap zzapVar;
        List list;
        zzap zzapVar2;
        zzap zzapVar3;
        int i8;
        int size;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            ArrayDeque arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque.pop();
            if (zzfuVar.zzd == 1836019574) {
                zzfu zzfuVarZzd = zzfuVar.zzd(1835365473);
                new ArrayList();
                zzap zzapVarZze = zzfuVarZzd != null ? zzaka.zze(zzfuVarZzd) : null;
                ArrayList arrayList = new ArrayList();
                boolean z2 = this.zzA == i10 ? i10 : i9;
                zzafg zzafgVar = new zzafg();
                zzfv zzfvVarZzc = zzfuVar.zzc(1969517665);
                if (zzfvVarZzc != null) {
                    zzapVarZzc = zzaka.zzc(zzfvVarZzc);
                    zzafgVar.zza(zzapVarZzc);
                } else {
                    zzapVarZzc = null;
                }
                zzfv zzfvVarZzc2 = zzfuVar.zzc(1836476516);
                zzfvVarZzc2.getClass();
                zzao[] zzaoVarArr = new zzao[i10];
                zzaoVarArr[i9] = zzaka.zzd(zzfvVarZzc2.zza);
                zzap zzapVar4 = new zzap(-9223372036854775807L, zzaoVarArr);
                int i11 = this.zzc;
                zzap zzapVar5 = zzapVarZzc;
                int i12 = i9;
                int i13 = i10;
                zzap zzapVar6 = zzapVar4;
                ArrayList arrayList2 = arrayList;
                List listZzb = zzaka.zzb(zzfuVar, zzafgVar, -9223372036854775807L, null, i10 != (i11 & 1) ? i9 : i10, z2, zzakm.zza, false);
                String strZza = zzakk.zza(listZzb);
                long j5 = -9223372036854775807L;
                long j6 = -9223372036854775807L;
                int i14 = i12;
                int i15 = i14;
                int i16 = -1;
                while (true) {
                    j2 = 0;
                    if (i14 >= listZzb.size()) {
                        break;
                    }
                    zzaky zzakyVar = (zzaky) listZzb.get(i14);
                    int i17 = zzakyVar.zzb;
                    if (i17 == 0) {
                        i5 = i14;
                        i4 = i15;
                        j4 = j6;
                        zzapVar3 = zzapVar6;
                    } else {
                        zzakv zzakvVar = zzakyVar.zza;
                        zzaer zzaerVar = this.zzx;
                        i4 = i15 + 1;
                        int i18 = zzakvVar.zzb;
                        zzako zzakoVar2 = new zzako(zzakvVar, zzakyVar, zzaerVar.zzu(i15, i18));
                        int i19 = i14;
                        long j7 = zzakvVar.zze;
                        if (j7 == j6) {
                            j7 = zzakyVar.zzi;
                        }
                        i5 = i19;
                        zzaga zzagaVar2 = zzakoVar2.zzc;
                        long jMax = Math.max(j5, j7);
                        zzv zzvVar = zzakvVar.zzg;
                        String str = zzvVar.zzo;
                        int i20 = "audio/true-hd".equals(str) ? zzakyVar.zze * 16 : zzakyVar.zze + 30;
                        ArrayList arrayList3 = arrayList2;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(i20);
                        if (i18 == 2) {
                            int i21 = zzvVar.zzf;
                            if ((i11 & 8) != 0) {
                                i21 |= i16 == -1 ? i13 : 2;
                            }
                            zztVarZza.zzg(i21);
                            i18 = 2;
                        }
                        if (zzas.zzb(str)) {
                            boolean z3 = zzakyVar.zzj;
                            i6 = i16;
                            int iMin = Math.min(!z3 ? zzakyVar.zzh.length : i17, 20);
                            zzgqa.zzi(j7 != j6 ? i13 : i12);
                            zzakoVar = zzakoVar2;
                            zzagaVar = zzagaVar2;
                            long jMin = Math.min(j7, 10000000L);
                            int i22 = i12;
                            int i23 = -1;
                            for (int i24 = i22; i24 < iMin; i24++) {
                                int i25 = z3 ? i24 : zzakyVar.zzh[i24];
                                long j8 = zzakyVar.zzf[i25];
                                if (j8 > jMin) {
                                    break;
                                }
                                if (j8 >= 0 && (i7 = zzakyVar.zzd[i25]) > i22) {
                                    i22 = i7;
                                    i23 = i25;
                                }
                            }
                            if (i23 != -1) {
                                j3 = zzakyVar.zzf[i23];
                            }
                            if (j3 != j6) {
                                zzao[] zzaoVarArr2 = new zzao[i13];
                                zzaoVarArr2[i12] = new zzahq(j3);
                                j4 = j6;
                                zzapVar = new zzap(j4, zzaoVarArr2);
                            } else {
                                j4 = j6;
                                zzapVar = null;
                            }
                            zzakj.zzb(i18, zzafgVar, zztVarZza);
                            zzap zzapVar7 = zzvVar.zzl;
                            list = this.zzj;
                            if (list.isEmpty()) {
                                zzapVar2 = null;
                            } else {
                                zzapVar2 = new zzap(list);
                            }
                            zzapVar3 = zzapVar6;
                            zzakj.zza(i18, zzapVarZze, zztVarZza, zzapVar7, zzapVar2, zzapVar5, zzapVar3, zzapVar);
                            zztVarZza.zzl(strZza);
                            if (Objects.equals(str, "audio/mpeg")) {
                                zzakoVar.zzf = zztVarZza.zzM();
                            } else {
                                zzagaVar.zzu(zztVarZza.zzM());
                            }
                            i8 = i6;
                            if (i18 == 2 || i8 != -1) {
                                size = i8;
                            } else {
                                size = arrayList3.size();
                            }
                            arrayList2 = arrayList3;
                            arrayList2.add(zzakoVar);
                            i16 = size;
                            j5 = jMax;
                        } else {
                            zzagaVar = zzagaVar2;
                            i6 = i16;
                            zzakoVar = zzakoVar2;
                        }
                        j3 = j6;
                        if (j3 != j6) {
                            zzao[] zzaoVarArr3 = new zzao[i13];
                            zzaoVarArr3[i12] = new zzahq(j3);
                            j4 = j6;
                            zzapVar = new zzap(j4, zzaoVarArr3);
                        } else {
                            j4 = j6;
                            zzapVar = null;
                        }
                        zzakj.zzb(i18, zzafgVar, zztVarZza);
                        zzap zzapVar8 = zzvVar.zzl;
                        list = this.zzj;
                        if (list.isEmpty()) {
                            zzapVar2 = null;
                        } else {
                            zzapVar2 = new zzap(list);
                        }
                        zzapVar3 = zzapVar6;
                        zzakj.zza(i18, zzapVarZze, zztVarZza, zzapVar8, zzapVar2, zzapVar5, zzapVar3, zzapVar);
                        zztVarZza.zzl(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                            zzakoVar.zzf = zztVarZza.zzM();
                        } else {
                            zzagaVar.zzu(zztVarZza.zzM());
                        }
                        i8 = i6;
                        if (i18 == 2) {
                            size = i8;
                        } else {
                            size = i8;
                        }
                        arrayList2 = arrayList3;
                        arrayList2.add(zzakoVar);
                        i16 = size;
                        j5 = jMax;
                    }
                    zzapVar6 = zzapVar3;
                    j6 = j4;
                    arrayDeque = arrayDeque;
                    i15 = i4;
                    listZzb = listZzb;
                    i13 = 1;
                    i14 = i5 + 1;
                }
                ArrayDeque arrayDeque2 = arrayDeque;
                int i26 = i16;
                int i27 = -1;
                zzako[] zzakoVarArr = (zzako[]) arrayList2.toArray(new zzako[i12]);
                this.zzy = zzakoVarArr;
                int length = zzakoVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i28 = 0; i28 < zzakoVarArr.length; i28++) {
                    jArr[i28] = new long[zzakoVarArr[i28].zzb.zzb];
                    jArr2[i28] = zzakoVarArr[i28].zzb.zzf[0];
                }
                i2 = 0;
                int i29 = 0;
                while (i29 < zzakoVarArr.length) {
                    long j9 = Long.MAX_VALUE;
                    int i30 = i27;
                    for (int i31 = 0; i31 < zzakoVarArr.length; i31++) {
                        if (!zArr[i31]) {
                            long j10 = jArr2[i31];
                            if (j10 <= j9) {
                                i30 = i31;
                                j9 = j10;
                            }
                        }
                    }
                    int i32 = iArr[i30];
                    long[] jArr3 = jArr[i30];
                    jArr3[i32] = j2;
                    zzaky zzakyVar2 = zzakoVarArr[i30].zzb;
                    zzako[] zzakoVarArr2 = zzakoVarArr;
                    j2 += (long) zzakyVar2.zzd[i32];
                    int i33 = i32 + 1;
                    iArr[i30] = i33;
                    if (i33 < jArr3.length) {
                        jArr2[i30] = zzakyVar2.zzf[i33];
                    } else {
                        zArr[i30] = true;
                        i29++;
                    }
                    zzakoVarArr = zzakoVarArr2;
                    i27 = -1;
                }
                i3 = 1;
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzakn(j5, this.zzy, i26));
                arrayDeque2.clear();
                this.zzl = 2;
            } else {
                i2 = i9;
                i3 = i10;
                if (!arrayDeque.isEmpty()) {
                    ((zzfu) arrayDeque.peek()).zzb(zzfuVar);
                }
            }
            i9 = i2;
            i10 = i3;
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzaky zzakyVar, long j) {
        int iZza = zzakyVar.zza(j);
        return iZza == -1 ? zzakyVar.zzb(j) : iZza;
    }

    private static int zzm(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzafv zzafvVarZzb = zzaku.zzb(zzaepVar, (this.zzc & 2) != 0);
        this.zzk = zzafvVarZzb != null ? zzgtd.zzj(zzafvVarZzb) : zzgtd.zzi();
        return zzafvVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        if ((this.zzc & 16) == 0) {
            zzaerVar = new zzalz(zzaerVar, this.zzb);
        }
        this.zzx = zzaerVar;
    }

    /* JADX WARN: Code duplicated, block: B:321:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.google.android.gms.internal.ads.zzaep, com.google.android.gms.internal.ads.zzj] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v31 */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        int i2;
        long j;
        long j2;
        long j3;
        zzaga zzagaVar;
        int i3;
        int i4;
        int i5;
        int iZzc;
        ?? r11;
        boolean z2;
        while (true) {
            ?? r6 = 1;
            while (true) {
                i2 = this.zzl;
                j = 0;
                if (i2 != 0) {
                    break;
                }
                if (this.zzo == 0) {
                    zzer zzerVar = this.zzg;
                    if (!zzaepVar.zzb(zzerVar.zzi(), 0, 8, r6)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzaga zzagaVarZzu = this.zzx.zzu(0, 4);
                        zzaho zzahoVar = this.zzB;
                        zzap zzapVar = zzahoVar == null ? null : new zzap(-9223372036854775807L, zzahoVar);
                        zzt zztVar = new zzt();
                        zztVar.zzk(zzapVar);
                        zzagaVarZzu.zzu(zztVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzafq(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzerVar.zzh(0);
                    this.zzn = zzerVar.zzz();
                    this.zzm = zzerVar.zzB();
                }
                long j4 = this.zzn;
                if (j4 == 1) {
                    zzer zzerVar2 = this.zzg;
                    zzaepVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzerVar2.zzJ();
                } else if (j4 == 0) {
                    long jZzo = zzaepVar.zzo();
                    if (jZzo == -1) {
                        zzfu zzfuVar = (zzfu) this.zzh.peek();
                        jZzo = zzfuVar != null ? zzfuVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzaepVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j5 = this.zzn;
                int i6 = this.zzo;
                long j6 = i6;
                if (j5 < j6) {
                    if (this.zzm != 1718773093 || i6 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzn = j6;
                    i6 = 8;
                }
                int i7 = this.zzm;
                if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473 || i7 == 1635284069) {
                    r6 = 1;
                    r6 = 1;
                    long jZzn = zzaepVar.zzn();
                    long j7 = this.zzn;
                    long j8 = jZzn + j7;
                    long j9 = this.zzo;
                    if (j7 != j9 && this.zzm == 1835365473) {
                        zzer zzerVar3 = this.zzf;
                        zzerVar3.zza(8);
                        zzaepVar.zzi(zzerVar3.zzi(), 0, 8);
                        zzaka.zzf(zzerVar3);
                        zzaepVar.zzf(zzerVar3.zzg());
                        zzaepVar.zzl();
                    }
                    long j10 = j8 - j9;
                    this.zzh.push(new zzfu(this.zzm, j10));
                    if (this.zzn == this.zzo) {
                        zzk(j10);
                    } else {
                        zzj();
                    }
                } else if (i7 == 1835296868 || i7 == 1836476516 || i7 == 1751411826 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1937011571 || i7 == 1668576371 || i7 == 1701606260 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1953196132 || i7 == 1718909296 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124) {
                    zzgqa.zzi(i6 == 8);
                    zzgqa.zzi(this.zzn <= 2147483647L);
                    zzer zzerVar4 = new zzer((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzerVar4.zzi(), 0, 8);
                    this.zzp = zzerVar4;
                    r6 = 1;
                    this.zzl = 1;
                } else {
                    long jZzn2 = zzaepVar.zzn();
                    long j11 = this.zzo;
                    long j12 = jZzn2 - j11;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzaho(0L, j12, -9223372036854775807L, j12 + j11, this.zzn - j11);
                    }
                    this.zzp = null;
                    r6 = 1;
                    this.zzl = 1;
                }
            }
            if (i2 != r6) {
                if (i2 != 2) {
                    this.zzi.zzb(zzaepVar, zzafoVar, this.zzj);
                    if (zzafoVar.zza == 0) {
                        zzj();
                    }
                    return r6;
                }
                long jZzn3 = zzaepVar.zzn();
                int i8 = this.zzq;
                if (i8 == -1) {
                    ?? r21 = r6;
                    ?? r28 = r21 == true ? 1 : 0;
                    int i9 = -1;
                    int i10 = -1;
                    long j13 = Long.MAX_VALUE;
                    long j14 = Long.MAX_VALUE;
                    long j15 = Long.MAX_VALUE;
                    int i11 = 0;
                    j3 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    ?? r22 = r21;
                    while (true) {
                        zzako[] zzakoVarArr = this.zzy;
                        j2 = j;
                        if (i11 >= zzakoVarArr.length) {
                            break;
                        }
                        zzako zzakoVar = zzakoVarArr[i11];
                        int i12 = zzakoVar.zze;
                        zzaky zzakyVar = zzakoVar.zzb;
                        if (i12 != zzakyVar.zzb) {
                            long j16 = zzakyVar.zzc[i12];
                            long[][] jArr = this.zzz;
                            jArr.getClass();
                            long j17 = jArr[i11][i12];
                            long j18 = j16 - jZzn3;
                            ?? r10 = (j18 < j2 || j18 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) ? r6 : 0;
                            if (r10 == 0) {
                                if (r28 == 0) {
                                    r11 = 0;
                                } else {
                                    r28 = r10;
                                    i10 = i11;
                                    j15 = j18;
                                    j14 = j17;
                                }
                                if (j17 < j13) {
                                    r22 = r10;
                                    i9 = i11;
                                    j13 = j17;
                                }
                            } else {
                                r11 = r28;
                            }
                            if (r10 != r11 || j18 >= j15) {
                                r28 = r11;
                            } else {
                                r28 = r10;
                                i10 = i11;
                                j15 = j18;
                                j14 = j17;
                            }
                            if (j17 < j13) {
                                r22 = r10;
                                i9 = i11;
                                j13 = j17;
                            }
                        }
                        i11 += r6;
                        j = j2;
                        r22 = r22;
                        r28 = r28;
                    }
                    i8 = (j13 == Long.MAX_VALUE || r22 == 0 || j14 < j13 + 10485760) ? i10 : i9;
                    this.zzq = i8;
                    if (i8 == -1) {
                        return -1;
                    }
                } else {
                    j2 = 0;
                    j3 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                }
                zzako zzakoVar2 = this.zzy[i8];
                zzaga zzagaVar2 = zzakoVar2.zzc;
                int i13 = zzakoVar2.zze;
                zzaky zzakyVar2 = zzakoVar2.zzb;
                zzaga zzagaVar3 = zzagaVar2;
                long j19 = zzakyVar2.zzc[i13] + this.zzw;
                int[] iArr = zzakyVar2.zzd;
                int i14 = iArr[i13];
                boolean z3 = false;
                zzagb zzagbVar = zzakoVar2.zzd;
                int i15 = 4;
                long j20 = (j19 - jZzn3) + ((long) this.zzr);
                if (j20 < j2 || j20 >= j3) {
                    zzafoVar.zza = j19;
                    return 1;
                }
                zzakv zzakvVar = zzakoVar2.zza;
                if (zzakvVar.zzh == 1) {
                    j20 += 8;
                    i14 -= 8;
                }
                int i16 = i14;
                zzaepVar.zzf((int) j20);
                zzv zzvVar = zzakvVar.zzg;
                String str = zzvVar.zzo;
                if (!Objects.equals(str, "video/avc")) {
                    Objects.equals(str, "video/hevc");
                }
                this.zzu = true;
                int i17 = zzakvVar.zzk;
                if (i17 == 0) {
                    zzagaVar = zzagaVar3;
                    if ("audio/ac4".equals(str)) {
                        if (this.zzs == 0) {
                            zzer zzerVar5 = this.zzf;
                            zzads.zzc(i16, zzerVar5);
                            i3 = 7;
                            zzagaVar.zzz(zzerVar5, 7);
                            this.zzs += 7;
                        } else {
                            i3 = 7;
                        }
                        i16 += i3;
                    } else if (zzakoVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                        zzv zzvVarZzM = zzakoVar2.zzf;
                        zzer zzerVar6 = this.zzf;
                        zzerVar6.zza(4);
                        zzaepVar.zzi(zzerVar6.zzi(), 0, 4);
                        zzaepVar.zzl();
                        zzafk zzafkVar = new zzafk();
                        if (zzafkVar.zza(zzerVar6.zzB()) && !Objects.equals(zzvVarZzM.zzo, zzafkVar.zzb)) {
                            zzt zztVarZza = zzvVarZzM.zza();
                            String str2 = zzafkVar.zzb;
                            str2.getClass();
                            zztVarZza.zzm(str2);
                            zzvVarZzM = zztVarZza.zzM();
                        }
                        zzagaVar.zzu(zzvVarZzM);
                        zzakoVar2.zzf = null;
                    } else if (zzagbVar != null) {
                        zzagbVar.zzb(zzaepVar);
                    }
                    while (true) {
                        int i18 = this.zzs;
                        if (i18 >= i16) {
                            break;
                        }
                        int iZzy = zzagaVar.zzy(zzaepVar, i16 - i18, false);
                        this.zzr += iZzy;
                        this.zzs += iZzy;
                        this.zzt -= iZzy;
                    }
                } else {
                    zzer zzerVar7 = this.zze;
                    byte[] bArrZzi = zzerVar7.zzi();
                    bArrZzi[0] = 0;
                    bArrZzi[1] = 0;
                    bArrZzi[2] = 0;
                    int i19 = 4 - i17;
                    i16 += i19;
                    while (this.zzs < i16) {
                        int i20 = this.zzt;
                        if (i20 == 0) {
                            if (this.zzu || zzgm.zzc(zzvVar) + i17 > iArr[i13] - this.zzr) {
                                i5 = i17;
                                iZzc = z3;
                            } else {
                                iZzc = zzgm.zzc(zzvVar);
                                i5 = i17 + iZzc;
                            }
                            zzaepVar.zzc(bArrZzi, i19, i5);
                            this.zzr += i5;
                            int i21 = z3;
                            zzerVar7.zzh(i21);
                            int iZzB = zzerVar7.zzB();
                            if (iZzB < 0) {
                                throw zzat.zzb("Invalid NAL length", null);
                            }
                            this.zzt = iZzB - iZzc;
                            zzer zzerVar8 = this.zzd;
                            zzerVar8.zzh(i21);
                            i4 = i17;
                            zzaga zzagaVar4 = zzagaVar3;
                            int i22 = i15;
                            zzagaVar4.zzz(zzerVar8, i22);
                            this.zzs += i22;
                            if (iZzc > 0) {
                                zzagaVar4.zzz(zzerVar7, iZzc);
                                this.zzs += iZzc;
                                if (zzgm.zzd(bArrZzi, i22, iZzc, zzvVar)) {
                                    this.zzu = true;
                                }
                                zzagaVar3 = zzagaVar4;
                            } else {
                                i15 = i22;
                                zzagaVar3 = zzagaVar4;
                                i17 = i4;
                            }
                            z3 = false;
                        } else {
                            i4 = i17;
                            int iZzy2 = zzagaVar3.zzy(zzaepVar, i20, z3);
                            this.zzr += iZzy2;
                            this.zzs += iZzy2;
                            this.zzt -= iZzy2;
                        }
                        i17 = i4;
                        i15 = 4;
                        z3 = false;
                    }
                    zzagaVar = zzagaVar3;
                }
                int i23 = i16;
                long j21 = zzakyVar2.zzf[i13];
                int i24 = zzakyVar2.zzg[i13];
                if (!this.zzu) {
                    i24 |= 67108864;
                }
                if (zzagbVar != null) {
                    zzaga zzagaVar5 = zzagaVar;
                    zzagbVar.zzc(zzagaVar5, j21, i24, i23, 0, null);
                    if (i13 + 1 == zzakyVar2.zzb) {
                        zzagbVar.zzd(zzagaVar5, null);
                    }
                } else {
                    zzagaVar.zzx(j21, i24, i23, 0, null);
                }
                zzakoVar2.zze++;
                this.zzq = -1;
                this.zzr = 0;
                this.zzs = 0;
                this.zzt = 0;
                this.zzu = false;
                return 0;
            }
            long j22 = this.zzn - ((long) this.zzo);
            long jZzn4 = zzaepVar.zzn() + j22;
            zzer zzerVar9 = this.zzp;
            if (zzerVar9 != null) {
                zzaepVar.zzc(zzerVar9.zzi(), this.zzo, (int) j22);
                if (this.zzm == 1718909296) {
                    this.zzv = true;
                    zzerVar9.zzh(8);
                    int iZzm = zzm(zzerVar9.zzB());
                    if (iZzm == 0) {
                        zzerVar9.zzk(4);
                        do {
                            if (zzerVar9.zzd() <= 0) {
                                iZzm = 0;
                                break;
                            }
                            iZzm = zzm(zzerVar9.zzB());
                        } while (iZzm == 0);
                    }
                    this.zzA = iZzm;
                } else {
                    ArrayDeque arrayDeque = this.zzh;
                    if (!arrayDeque.isEmpty()) {
                        ((zzfu) arrayDeque.peek()).zza(new zzfv(this.zzm, zzerVar9));
                    }
                }
            } else {
                if (!this.zzv && this.zzm == 1835295092) {
                    this.zzA = 1;
                }
                if (j22 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzaepVar.zzf((int) j22);
                } else {
                    zzafoVar.zza = zzaepVar.zzn() + j22;
                    z2 = true;
                }
                zzk(jZzn4);
                if (!z2 && this.zzl != 2) {
                    return 1;
                }
            }
            z2 = false;
            zzk(jZzn4);
            if (!z2) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzako zzakoVar : this.zzy) {
            zzaky zzakyVar = zzakoVar.zzb;
            int iZza = zzakyVar.zza(j2);
            if (iZza == -1) {
                iZza = zzakyVar.zzb(j2);
            }
            zzakoVar.zze = iZza;
            zzagb zzagbVar = zzakoVar.zzd;
            if (zzagbVar != null) {
                zzagbVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }

    public zzakp(zzalw zzalwVar, int i2) {
        this.zzb = zzalwVar;
        this.zzc = i2;
        this.zzk = zzgtd.zzi();
        this.zzl = (i2 & 4) != 0 ? 3 : 0;
        this.zzi = new zzakt();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaer.zza;
        this.zzy = new zzako[0];
    }
}
