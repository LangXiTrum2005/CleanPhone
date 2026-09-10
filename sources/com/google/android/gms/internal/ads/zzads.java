package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzads {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, com.p004ironsource.mediationsdk.metadata.a.f25965n};

    /* JADX WARN: Code duplicated, block: B:143:0x0210  */
    /* JADX WARN: Code duplicated, block: B:145:0x0216  */
    /* JADX WARN: Code duplicated, block: B:152:0x022a  */
    /* JADX WARN: Code duplicated, block: B:154:0x023e A[LOOP:2: B:153:0x023c->B:154:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x024e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257  */
    /* JADX WARN: Code duplicated, block: B:161:0x0261  */
    /* JADX WARN: Code duplicated, block: B:162:0x0266  */
    /* JADX WARN: Code duplicated, block: B:166:0x0271  */
    /* JADX WARN: Code duplicated, block: B:169:0x0277  */
    /* JADX WARN: Code duplicated, block: B:171:0x0297  */
    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) throws zzat {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zZzi;
        int i10;
        int iZzj;
        int iZzj2;
        int iZzc;
        int i11;
        int i12;
        int iZzj3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzc2;
        int iZzj4;
        int i18;
        int i19 = 8;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int iZzc3 = zzeqVar.zzc();
        int iZzj5 = zzeqVar.zzj(3);
        int i20 = 1;
        if (iZzj5 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(iZzj5);
            throw zzat.zzc(sb.toString());
        }
        int iZzj6 = zzeqVar.zzj(7);
        int i21 = true != zzeqVar.zzi() ? 44100 : 48000;
        zzeqVar.zzh(4);
        int iZzj7 = zzeqVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(16);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzeqVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeqVar.zzm();
        }
        zzadq zzadqVar = new zzadq(null);
        int i22 = 0;
        while (true) {
            if (i22 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzeqVar.zzi();
                    i10 = i19;
                    iZzj = zzeqVar.zzj(5);
                    iZzj2 = zzeqVar.zzj(5);
                    iZzc = 0;
                    i11 = 0;
                    i12 = i20;
                    iZzj3 = 0;
                } else {
                    int iZzj8 = zzeqVar.zzj(i19);
                    i12 = i20;
                    iZzj3 = zzeqVar.zzj(i19);
                    i10 = i19;
                    if (iZzj3 == 255) {
                        iZzj3 = zzeqVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzeqVar.zzh(iZzj3 * 8);
                        i22++;
                        i20 = i12;
                        i19 = i10;
                    } else {
                        iZzc = (iZzc3 - zzeqVar.zzc()) / 8;
                        int iZzj9 = zzeqVar.zzj(5);
                        i11 = iZzj9 == 31 ? i12 : 0;
                        iZzj2 = iZzj8;
                        iZzj = iZzj9;
                        zZzi = false;
                    }
                }
                zzadqVar.zzf = iZzj2;
                if (!zZzi && i11 == 0 && iZzj == 6) {
                    i13 = iZzc;
                    i5 = 7;
                } else {
                    zzadqVar.zzg = zzeqVar.zzj(3);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(5);
                    }
                    zzeqVar.zzh(2);
                    int i23 = i12;
                    if (iZzj5 == i23) {
                        if (iZzj2 == i23) {
                            zzeqVar.zzh(2);
                        } else {
                            if (iZzj2 == 2) {
                                iZzj2 = 2;
                                zzeqVar.zzh(2);
                            }
                            if (iZzj2 <= 0) {
                                i17 = 1;
                                i2 = 8;
                                i3 = 5;
                            } else {
                                if (!zzeqVar.zzi() && !zzg(zzeqVar)) {
                                    throw zzat.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzm();
                                    zzeqVar.zzo(zzeqVar.zzj(16));
                                    i3 = 5;
                                    iZzj4 = zzeqVar.zzj(5);
                                    for (i18 = 0; i18 < iZzj4; i18++) {
                                        zzeqVar.zzh(3);
                                        zzeqVar.zzh(8);
                                    }
                                    i17 = 1;
                                    i2 = 8;
                                } else {
                                    i17 = 1;
                                    i2 = 8;
                                    i3 = 5;
                                }
                            }
                            zzeqVar.zzm();
                            if (iZzj5 == i17) {
                                iZzc2 = ((iZzc3 - zzeqVar.zzc()) / i2) - i13;
                                if (iZzj3 < iZzc2) {
                                    throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzeqVar.zzo(iZzj3 - iZzc2);
                            }
                            if (zzadqVar.zza) {
                                i4 = -1;
                                if (zzadqVar.zzb == -1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i22).length() + 45);
                                    sb2.append("Can't determine channel mode of presentation ");
                                    sb2.append(i22);
                                    throw zzat.zzc(sb2.toString());
                                }
                            } else {
                                i4 = -1;
                            }
                        }
                    }
                    zzeqVar.zzh(5);
                    zzeqVar.zzh(10);
                    if (iZzj5 == i23) {
                        if (iZzj2 > 0) {
                            zzadqVar.zza = zzeqVar.zzi();
                        }
                        if (zzadqVar.zza) {
                            if (iZzj2 != i23) {
                                i14 = 2;
                                if (iZzj2 == 2) {
                                    i16 = 2;
                                } else {
                                    i13 = iZzc;
                                    i16 = iZzj2;
                                }
                                zzeqVar.zzh(24);
                                i15 = 1;
                            } else {
                                i16 = 1;
                            }
                            i13 = iZzc;
                            int iZzj10 = zzeqVar.zzj(5);
                            if (iZzj10 >= 0 && iZzj10 <= 15) {
                                zzadqVar.zzb = iZzj10;
                            }
                            if (iZzj10 < 11 || iZzj10 > 14) {
                                i14 = 2;
                            } else {
                                zzadqVar.zzd = zzeqVar.zzi();
                                i14 = 2;
                                zzadqVar.zze = zzeqVar.zzj(2);
                            }
                            zzeqVar.zzh(24);
                            i15 = 1;
                        } else {
                            i13 = iZzc;
                            i14 = 2;
                            i15 = i23;
                            i16 = iZzj2;
                        }
                        if (iZzj2 == i15 || iZzj2 == i14) {
                            if (zzeqVar.zzi() && zzeqVar.zzi()) {
                                zzeqVar.zzh(i14);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzg();
                                int i24 = i10;
                                int iZzj11 = zzeqVar.zzj(i24);
                                int i25 = 0;
                                while (i25 < iZzj11) {
                                    zzeqVar.zzh(i24);
                                    i25++;
                                    i24 = 8;
                                }
                            }
                        }
                        iZzj2 = i16;
                    } else {
                        i13 = iZzc;
                    }
                    if (!zZzi && i11 == 0) {
                        zzeqVar.zzg();
                        if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                            if (iZzj2 == 0) {
                                for (int i26 = 0; i26 < 2; i26++) {
                                    zzd(zzeqVar, zzadqVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i27 = 0; i27 < 2; i27++) {
                                    zze(zzeqVar, zzadqVar);
                                }
                            }
                        } else if (iZzj == 3 || iZzj == 4) {
                            if (iZzj2 == 0) {
                                for (int i28 = 0; i28 < 3; i28++) {
                                    zzd(zzeqVar, zzadqVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i29 = 0; i29 < 3; i29++) {
                                    zze(zzeqVar, zzadqVar);
                                }
                            }
                        } else if (iZzj != 5) {
                            int iZzj12 = zzeqVar.zzj(7);
                            for (int i30 = 0; i30 < iZzj12; i30++) {
                                zzeqVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzeqVar, zzadqVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj13 = zzeqVar.zzj(3);
                            for (int i31 = 0; i31 < iZzj13 + 2; i31++) {
                                zze(zzeqVar, zzadqVar);
                            }
                        }
                    } else if (iZzj2 == 0) {
                        zzd(zzeqVar, zzadqVar);
                        iZzj2 = 0;
                    } else {
                        zze(zzeqVar, zzadqVar);
                    }
                    zzeqVar.zzg();
                    i5 = 7;
                    if (zzeqVar.zzi()) {
                    }
                    if (iZzj2 <= 0) {
                        i17 = 1;
                        i2 = 8;
                        i3 = 5;
                    } else {
                        if (!zzeqVar.zzi()) {
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzm();
                            zzeqVar.zzo(zzeqVar.zzj(16));
                            i3 = 5;
                            iZzj4 = zzeqVar.zzj(5);
                            while (i18 < iZzj4) {
                                zzeqVar.zzh(3);
                                zzeqVar.zzh(8);
                            }
                            i17 = 1;
                            i2 = 8;
                        } else {
                            i17 = 1;
                            i2 = 8;
                            i3 = 5;
                        }
                    }
                    zzeqVar.zzm();
                    if (iZzj5 == i17) {
                        iZzc2 = ((iZzc3 - zzeqVar.zzc()) / i2) - i13;
                        if (iZzj3 < iZzc2) {
                            throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                        }
                        zzeqVar.zzo(iZzj3 - iZzc2);
                    }
                    if (zzadqVar.zza) {
                        i4 = -1;
                        if (zzadqVar.zzb == -1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i22).length() + 45);
                            sb3.append("Can't determine channel mode of presentation ");
                            sb3.append(i22);
                            throw zzat.zzc(sb3.toString());
                        }
                    } else {
                        i4 = -1;
                    }
                }
                int iZzj14 = zzeqVar.zzj(i5);
                for (int i32 = 0; i32 < iZzj14; i32++) {
                    zzeqVar.zzh(15);
                }
                if (iZzj2 <= 0) {
                    i17 = 1;
                    i2 = 8;
                    i3 = 5;
                } else {
                    if (!zzeqVar.zzi()) {
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzm();
                        zzeqVar.zzo(zzeqVar.zzj(16));
                        i3 = 5;
                        iZzj4 = zzeqVar.zzj(5);
                        while (i18 < iZzj4) {
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(8);
                        }
                        i17 = 1;
                        i2 = 8;
                    } else {
                        i17 = 1;
                        i2 = 8;
                        i3 = 5;
                    }
                }
                zzeqVar.zzm();
                if (iZzj5 == i17) {
                    iZzc2 = ((iZzc3 - zzeqVar.zzc()) / i2) - i13;
                    if (iZzj3 < iZzc2) {
                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzeqVar.zzo(iZzj3 - iZzc2);
                }
                if (zzadqVar.zza) {
                    i4 = -1;
                    if (zzadqVar.zzb == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i22).length() + 45);
                        sb4.append("Can't determine channel mode of presentation ");
                        sb4.append(i22);
                        throw zzat.zzc(sb4.toString());
                    }
                } else {
                    i4 = -1;
                }
            } else {
                i2 = i19;
                i3 = 5;
                i4 = -1;
                i5 = 7;
            }
            if (zzadqVar.zza) {
                int i33 = zzadqVar.zzb;
                boolean z2 = zzadqVar.zzd;
                int i34 = zzadqVar.zze;
                switch (i33) {
                    case 0:
                        i8 = 11;
                        i9 = 1;
                        break;
                    case 1:
                        i8 = 11;
                        i9 = 2;
                        break;
                    case 2:
                        i8 = 11;
                        i9 = 3;
                        break;
                    case 3:
                        i9 = i3;
                        i8 = 11;
                        break;
                    case 4:
                        i8 = 11;
                        i9 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i9 = i5;
                        i8 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i9 = i2;
                        i8 = 11;
                        break;
                    case 11:
                        i8 = 11;
                        i9 = 11;
                        break;
                    case 12:
                        i9 = 12;
                        i8 = 11;
                        break;
                    case 13:
                        i9 = 13;
                        i8 = 11;
                        break;
                    case 14:
                        i8 = 11;
                        i9 = 14;
                        break;
                    case 15:
                        i8 = 11;
                        i9 = 24;
                        break;
                    default:
                        i9 = i4;
                        i8 = 11;
                        break;
                }
                if (i33 == i8 || i33 == 12 || i33 == 13 || i33 == 14) {
                    if (!z2) {
                        i9 -= 2;
                    }
                    i7 = i9;
                    if (i34 == 0) {
                        i7 -= 4;
                    } else if (i34 == 1) {
                        i7 -= 2;
                    }
                } else {
                    i7 = i9;
                }
            } else {
                int i35 = zzadqVar.zzc;
                if (i35 > 0) {
                    i7 = i35 + 1;
                    if (zzadqVar.zzg == 4 && i7 == 17) {
                        i7 = 21;
                    }
                } else {
                    int i36 = zzadqVar.zzg;
                    if (i36 == 0) {
                        i6 = 2;
                    } else if (i36 != 1) {
                        i6 = 2;
                        if (i36 == 2) {
                            i7 = i2;
                        } else if (i36 == 3) {
                            i7 = 10;
                        } else if (i36 != 4) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i36).length() + 33);
                            sb5.append("AC-4 level ");
                            sb5.append(i36);
                            sb5.append(" has not been defined.");
                            zzee.zzc("Ac4Util", sb5.toString());
                        } else {
                            i7 = 12;
                        }
                    } else {
                        i7 = 6;
                    }
                    i7 = i6;
                }
            }
            if (i7 <= 0) {
                throw zzat.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzadqVar.zzf), Integer.valueOf(zzadqVar.zzg)};
            String str3 = zzfj.zza;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            zzt zztVar = new zzt();
            zztVar.zza(str);
            zztVar.zzm("audio/ac4");
            zztVar.zzE(i7);
            zztVar.zzF(i21);
            zztVar.zzq(zzqVar);
            zztVar.zze(str2);
            zztVar.zzj(str4);
            return zztVar.zzM();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    public static zzadr zzb(zzeq zzeqVar) {
        int i2;
        int iZzj;
        int iZzj2 = zzeqVar.zzj(16);
        int iZzj3 = zzeqVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzeqVar.zzj(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i3 = iZzj3 + i2;
        if (iZzj2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iZzj4 = zzeqVar.zzj(2);
        int i5 = 0;
        if (iZzj4 == 3) {
            int i6 = 0;
            while (true) {
                iZzj = zzeqVar.zzj(2) + i6;
                if (!zzeqVar.zzi()) {
                    break;
                }
                i6 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i7 = iZzj4;
        int iZzj5 = zzeqVar.zzj(10);
        if (zzeqVar.zzi() && zzeqVar.zzj(3) > 0) {
            zzeqVar.zzh(2);
        }
        int i8 = 48000;
        if (true != zzeqVar.zzi()) {
            i8 = 44100;
        }
        int iZzj6 = zzeqVar.zzj(4);
        if (i8 == 44100 && iZzj6 == 13) {
            i5 = zzb[13];
        } else if (i8 == 48000 && iZzj6 < 14) {
            i5 = zzb[iZzj6];
            int i9 = iZzj5 % 5;
            if (i9 == 1) {
                if (iZzj6 != 3 || iZzj6 == 8) {
                    i5++;
                }
            } else if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                        i5++;
                    }
                } else if (iZzj6 != 3) {
                    i5++;
                } else {
                    i5++;
                }
            } else if (iZzj6 == 8 || iZzj6 == 11) {
                i5++;
            }
        }
        return new zzadr(i7, 2, i8, i4, i5, null);
    }

    public static void zzc(int i2, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i2 >> 16) & 255);
        bArrZzi[5] = (byte) ((i2 >> 8) & 255);
        bArrZzi[6] = (byte) (i2 & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadq zzadqVar) throws zzat {
        int iZzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int iZzj2 = zzeqVar.zzj(3);
            if (zzadqVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzadqVar.zzb = iZzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadq zzadqVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(8);
        for (int i2 = 0; i2 < iZzj; i2++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zZzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadqVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int iZzj = zzeqVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeqVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}
