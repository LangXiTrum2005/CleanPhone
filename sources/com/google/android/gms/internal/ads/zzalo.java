package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
final class zzalo extends zzalm {
    private zzaln zza;
    private int zzb;
    private boolean zzc;
    private zzagf zzd;
    private zzagd zze;

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = zzerVar.zzi()[0];
        zzaln zzalnVar = this.zza;
        zzalnVar.getClass();
        int i2 = !zzalnVar.zzd[(b2 >> 1) & (255 >>> (8 - zzalnVar.zze))].zza ? zzalnVar.zza.zze : zzalnVar.zza.zzf;
        int i3 = this.zzc ? (this.zzb + i2) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j = i3;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i2;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x03da  */
    @Override // com.google.android.gms.internal.ads.zzalm
    @EnsuresNonNullIf
    public final boolean zzc(zzer zzerVar, long j, zzalk zzalkVar) throws IOException {
        zzaln zzalnVar;
        int i2;
        int iZzb;
        int i3;
        if (this.zza != null) {
            zzalkVar.zza.getClass();
            return false;
        }
        zzagf zzagfVar = this.zzd;
        int i4 = 1;
        if (zzagfVar != null) {
            int i5 = 4;
            zzagd zzagdVar = this.zze;
            if (zzagdVar == null) {
                this.zze = zzagg.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i6 = zzagfVar.zza;
                int i7 = 5;
                zzagg.zzd(5, zzerVar, false);
                int iZzs = zzerVar.zzs() + 1;
                zzagc zzagcVar = new zzagc(zzerVar.zzi());
                zzagcVar.zzc(zzerVar.zzg() * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 2;
                    int i10 = 16;
                    if (i8 >= iZzs) {
                        int i11 = i4;
                        int i12 = 6;
                        int iZzb2 = zzagcVar.zzb(6) + i11;
                        for (int i13 = 0; i13 < iZzb2; i13++) {
                            if (zzagcVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzagcVar.zzb(6) + i11;
                        int i14 = 0;
                        while (true) {
                            int i15 = 3;
                            if (i14 >= iZzb3) {
                                int i16 = 1;
                                int iZzb4 = zzagcVar.zzb(i12) + 1;
                                int i17 = 0;
                                while (i17 < iZzb4) {
                                    if (zzagcVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagcVar.zzc(24);
                                    zzagcVar.zzc(24);
                                    zzagcVar.zzc(24);
                                    int iZzb5 = zzagcVar.zzb(i12) + i16;
                                    int i18 = 8;
                                    zzagcVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i19 = 0; i19 < iZzb5; i19++) {
                                        iArr[i19] = ((zzagcVar.zza() ? zzagcVar.zzb(5) : 0) * 8) + zzagcVar.zzb(3);
                                    }
                                    int i20 = 0;
                                    while (i20 < iZzb5) {
                                        int i21 = 0;
                                        while (i21 < i18) {
                                            if ((iArr[i20] & (1 << i21)) != 0) {
                                                zzagcVar.zzc(i18);
                                            }
                                            i21++;
                                            i18 = 8;
                                        }
                                        i20++;
                                        i18 = 8;
                                    }
                                    i17++;
                                    i12 = 6;
                                    i16 = 1;
                                }
                                int iZzb6 = zzagcVar.zzb(i12) + 1;
                                for (int i22 = 0; i22 < iZzb6; i22++) {
                                    int iZzb7 = zzagcVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb = new StringBuilder(Z.a(iZzb7, 41));
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iZzb7);
                                        zzee.zze("VorbisUtil", sb.toString());
                                    } else {
                                        if (zzagcVar.zza()) {
                                            i2 = 1;
                                            iZzb = zzagcVar.zzb(4) + 1;
                                        } else {
                                            i2 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagcVar.zza()) {
                                            int iZzb8 = zzagcVar.zzb(8) + i2;
                                            for (int i23 = 0; i23 < iZzb8; i23++) {
                                                int i24 = i6 - 1;
                                                zzagcVar.zzc(zzagg.zza(i24));
                                                zzagcVar.zzc(zzagg.zza(i24));
                                            }
                                        }
                                        if (zzagcVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i25 = 0; i25 < i6; i25++) {
                                                zzagcVar.zzc(4);
                                            }
                                        }
                                        for (int i26 = 0; i26 < iZzb; i26++) {
                                            zzagcVar.zzc(8);
                                            zzagcVar.zzc(8);
                                            zzagcVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzagcVar.zzb(6);
                                int i27 = iZzb9 + 1;
                                zzage[] zzageVarArr = new zzage[i27];
                                for (int i28 = 0; i28 < i27; i28++) {
                                    zzageVarArr[i28] = new zzage(zzagcVar.zza(), zzagcVar.zzb(16), zzagcVar.zzb(16), zzagcVar.zzb(8));
                                }
                                if (!zzagcVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzalnVar = new zzaln(zzagfVar, zzagdVar, bArr, zzageVarArr, zzagg.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzagcVar.zzb(i10);
                            if (iZzb10 == 0) {
                                int i29 = 8;
                                zzagcVar.zzc(8);
                                zzagcVar.zzc(16);
                                zzagcVar.zzc(16);
                                zzagcVar.zzc(6);
                                zzagcVar.zzc(8);
                                int iZzb11 = zzagcVar.zzb(4) + 1;
                                int i30 = 0;
                                while (i30 < iZzb11) {
                                    zzagcVar.zzc(i29);
                                    i30++;
                                    i29 = 8;
                                }
                            } else {
                                if (iZzb10 != 1) {
                                    StringBuilder sb2 = new StringBuilder(Z.a(iZzb10, 41));
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iZzb10);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                int iZzb12 = zzagcVar.zzb(5);
                                int[] iArr2 = new int[iZzb12];
                                int i31 = -1;
                                for (int i32 = 0; i32 < iZzb12; i32++) {
                                    int iZzb13 = zzagcVar.zzb(4);
                                    iArr2[i32] = iZzb13;
                                    if (iZzb13 > i31) {
                                        i31 = iZzb13;
                                    }
                                }
                                int i33 = i31 + 1;
                                int[] iArr3 = new int[i33];
                                int i34 = 0;
                                while (i34 < i33) {
                                    iArr3[i34] = zzagcVar.zzb(i15) + 1;
                                    int iZzb14 = zzagcVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i3 = 8;
                                        zzagcVar.zzc(8);
                                    } else {
                                        i3 = 8;
                                    }
                                    int i35 = i33;
                                    int i36 = 0;
                                    for (int i37 = 1; i36 < (i37 << iZzb14); i37 = 1) {
                                        zzagcVar.zzc(i3);
                                        i36++;
                                        i3 = 8;
                                    }
                                    i34++;
                                    i33 = i35;
                                    i15 = 3;
                                }
                                zzagcVar.zzc(2);
                                int iZzb15 = zzagcVar.zzb(4);
                                int i38 = 0;
                                int i39 = 0;
                                for (int i40 = 0; i40 < iZzb12; i40++) {
                                    i38 += iArr3[iArr2[i40]];
                                    while (i39 < i38) {
                                        zzagcVar.zzc(iZzb15);
                                        i39++;
                                    }
                                }
                            }
                            i14++;
                            i12 = 6;
                            i10 = 16;
                        }
                    } else {
                        if (zzagcVar.zzb(24) != 5653314) {
                            int iZzd = zzagcVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzagcVar.zzb(16);
                        int iZzb17 = zzagcVar.zzb(24);
                        if (zzagcVar.zza()) {
                            zzagcVar.zzc(i7);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagcVar.zzb(zzagg.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagcVar.zza();
                            for (int i41 = 0; i41 < iZzb17; i41++) {
                                if (!zZza) {
                                    zzagcVar.zzc(i7);
                                } else if (zzagcVar.zza()) {
                                    zzagcVar.zzc(i7);
                                }
                            }
                        }
                        int i42 = i5;
                        int iZzb19 = zzagcVar.zzb(i42);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i4) {
                            if (iZzb19 != 2) {
                                i4 = i4;
                            }
                            i8++;
                            i4 = i4;
                            i5 = 4;
                            i7 = 5;
                        } else {
                            i9 = iZzb19;
                        }
                        zzagcVar.zzc(32);
                        zzagcVar.zzc(32);
                        int iZzb20 = zzagcVar.zzb(i42) + i4;
                        zzagcVar.zzc(i4);
                        zzagcVar.zzc((int) ((i9 == i4 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i8++;
                        i4 = i4;
                        i5 = 4;
                        i7 = 5;
                    }
                }
            }
            this.zza = zzalnVar;
            if (zzalnVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzagf zzagfVar2 = zzalnVar.zza;
            arrayList.add(zzagfVar2.zzg);
            arrayList.add(zzalnVar.zzc);
            zzap zzapVarZzc = zzagg.zzc(zzgtd.zzr(zzalnVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/vorbis");
            zztVar.zzh(zzagfVar2.zzd);
            zztVar.zzi(zzagfVar2.zzc);
            zztVar.zzE(zzagfVar2.zza);
            zztVar.zzF(zzagfVar2.zzb);
            zztVar.zzp(arrayList);
            zztVar.zzk(zzapVarZzc);
            zzalkVar.zza = zztVar.zzM();
            return true;
        }
        zzagg.zzd(1, zzerVar, false);
        int iZzI = zzerVar.zzI();
        int iZzs2 = zzerVar.zzs();
        int iZzI2 = zzerVar.zzI();
        int iZzC = zzerVar.zzC();
        int i43 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzerVar.zzC();
        int i44 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzerVar.zzC();
        int i45 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzerVar.zzs();
        this.zzd = new zzagf(iZzI, iZzs2, iZzI2, i43, i44, i45, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        zzalnVar = null;
        this.zza = zzalnVar;
        if (zzalnVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzagf zzagfVar3 = zzalnVar.zza;
        arrayList2.add(zzagfVar3.zzg);
        arrayList2.add(zzalnVar.zzc);
        zzap zzapVarZzc2 = zzagg.zzc(zzgtd.zzr(zzalnVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzl("audio/ogg");
        zztVar2.zzm("audio/vorbis");
        zztVar2.zzh(zzagfVar3.zzd);
        zztVar2.zzi(zzagfVar3.zzc);
        zztVar2.zzE(zzagfVar3.zza);
        zztVar2.zzF(zzagfVar3.zzb);
        zztVar2.zzp(arrayList2);
        zztVar2.zzk(zzapVarZzc2);
        zzalkVar.zza = zztVar2.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzagf zzagfVar = this.zzd;
        this.zzb = zzagfVar != null ? zzagfVar.zze : 0;
    }
}
