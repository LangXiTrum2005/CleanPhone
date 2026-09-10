package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaif {
    public static final zzaic zza = zzaid.zza;

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe A[SYNTHETIC] */
    public static final zzap zza(byte[] bArr, int i2, zzaic zzaicVar, zzahp zzahpVar) {
        boolean z2;
        zzaie zzaieVar;
        int i3;
        boolean zZzb;
        int iZzc;
        zzaig zzaigVarZzc;
        ArrayList arrayList = new ArrayList();
        zzer zzerVar = new zzer(bArr, i2);
        boolean z3 = false;
        if (zzerVar.zzd() < 10) {
            zzee.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzerVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzerVar.zzs();
                zzerVar.zzk(1);
                int iZzs2 = zzerVar.zzs();
                int iZzG = zzerVar.zzG();
                if (iZzs != 2) {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzerVar.zzB();
                            zzerVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzerVar.zzG();
                            zzerVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        Z.w(new StringBuilder(String.valueOf(iZzs).length() + 46), "Skipped ID3 tag with unsupported majorVersion=", iZzs, "Id3Decoder");
                    }
                    if (iZzs < 4) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    zzaieVar = new zzaie(iZzs, z2, iZzG);
                } else if ((iZzs2 & 64) != 0) {
                    zzee.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzs < 4 || (iZzs2 & 128) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zzaieVar = new zzaie(iZzs, z2, iZzG);
                }
                if (zzaieVar == null) {
                    return null;
                }
                int iZzg = zzerVar.zzg();
                i3 = zzaieVar.zza() == 2 ? 6 : 10;
                zZzb = zzaieVar.zzb();
                iZzc = zzaieVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzerVar, zzaieVar.zzc());
                }
                zzerVar.zzf(iZzg + iZzc);
                if (!zzb(zzerVar, zzaieVar.zza(), i3, false)) {
                    if (zzaieVar.zza() == 4 || !zzb(zzerVar, 4, i3, true)) {
                        int iZza = zzaieVar.zza();
                        Z.w(new StringBuilder(String.valueOf(iZza).length() + 45), "Failed to validate ID3 tag with majorVersion=", iZza, "Id3Decoder");
                        return null;
                    }
                    z3 = true;
                }
                while (zzerVar.zzd() >= i3) {
                    zzaigVarZzc = zzc(zzaieVar.zza(), zzerVar, z3, i3, zzaicVar);
                    if (zzaigVarZzc != null) {
                        arrayList.add(zzaigVarZzc);
                    }
                }
                return new zzap(arrayList);
            }
            zzee.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzx))));
        }
        zzaieVar = null;
        if (zzaieVar == null) {
            return null;
        }
        int iZzg2 = zzerVar.zzg();
        if (zzaieVar.zza() == 2) {
        }
        zZzb = zzaieVar.zzb();
        iZzc = zzaieVar.zzc();
        if (zZzb) {
            iZzc = zze(zzerVar, zzaieVar.zzc());
        }
        zzerVar.zzf(iZzg2 + iZzc);
        if (!zzb(zzerVar, zzaieVar.zza(), i3, false)) {
            if (zzaieVar.zza() == 4) {
            }
            int iZza2 = zzaieVar.zza();
            Z.w(new StringBuilder(String.valueOf(iZza2).length() + 45), "Failed to validate ID3 tag with majorVersion=", iZza2, "Id3Decoder");
            return null;
        }
        while (zzerVar.zzd() >= i3) {
            zzaigVarZzc = zzc(zzaieVar.zza(), zzerVar, z3, i3, zzaicVar);
            if (zzaigVarZzc != null) {
                arrayList.add(zzaigVarZzc);
            }
        }
        return new zzap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean zzb(zzer zzerVar, int i2, int i3, boolean z2) {
        boolean z3;
        int iZzx;
        long jZzx;
        int iZzt;
        int i4;
        int iZzg = zzerVar.zzg();
        while (true) {
            try {
                z3 = true;
                z3 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzerVar.zzd() >= i3) {
                    if (i2 >= 3) {
                        iZzx = zzerVar.zzB();
                        jZzx = zzerVar.zzz();
                        iZzt = zzerVar.zzt();
                    } else {
                        iZzx = zzerVar.zzx();
                        jZzx = zzerVar.zzx();
                        iZzt = 0;
                    }
                    if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                        if (i2 != 4 || z2) {
                            if (i2 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i5 = 0;
                                }
                                int i7 = i5;
                                i6 = iZzt & 1;
                                i4 = i7;
                            } else if (i2 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i6 = 0;
                                }
                            } else {
                                i4 = 0;
                                i6 = 0;
                            }
                            if (i6 != 0) {
                                i4 += 4;
                            }
                            if (jZzx >= i4 && zzerVar.zzd() >= jZzx) {
                                zzerVar.zzk((int) jZzx);
                            }
                        } else if ((8421504 & jZzx) == 0) {
                            long j = ((jZzx >> 16) & 255) << 14;
                            jZzx = ((jZzx >> 24) << 21) | j | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                            if (i2 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i5 = 0;
                                }
                                int i8 = i5;
                                i6 = iZzt & 1;
                                i4 = i8;
                            } else if (i2 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i6 = 0;
                                }
                            } else {
                                i4 = 0;
                                i6 = 0;
                            }
                            if (i6 != 0) {
                                i4 += 4;
                            }
                            if (jZzx >= i4) {
                                zzerVar.zzk((int) jZzx);
                            }
                        }
                        z3 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzerVar.zzh(iZzg);
                throw th;
            }
        }
        zzerVar.zzh(iZzg);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02e9 A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x03a3, B:200:0x03b4, B:201:0x03bc, B:203:0x03c2, B:205:0x03c9, B:206:0x03cd, B:214:0x03ee, B:218:0x0419, B:220:0x0424, B:221:0x045a, B:222:0x0467, B:224:0x046d, B:226:0x0474, B:227:0x0478, B:231:0x048e, B:239:0x04a1, B:241:0x04cb, B:242:0x04da, B:243:0x04e5), top: B:256:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:208:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0493 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0495  */
    /* JADX WARN: Code duplicated, block: B:250:0x0506  */
    private static zzaig zzc(int i2, zzer zzerVar, boolean z2, int i3, zzaic zzaicVar) {
        int iZzH;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        zzaig zzaigVar;
        int i6;
        zzaig zzahxVar;
        zzaig zzaijVar;
        zzaig zzaiaVar;
        byte[] bArr;
        int iZzi;
        String strZza;
        String strConcat;
        int iZzs = zzerVar.zzs();
        int iZzs2 = zzerVar.zzs();
        int iZzs3 = zzerVar.zzs();
        int iZzs4 = i2 >= 3 ? zzerVar.zzs() : 0;
        if (i2 == 4) {
            iZzH = zzerVar.zzH();
            if (!z2) {
                iZzH = ((iZzH >> 24) << 21) | (iZzH & 255) | (((iZzH >> 8) & 255) << 7) | (((iZzH >> 16) & 255) << 14);
            }
        } else {
            iZzH = i2 == 3 ? zzerVar.zzH() : zzerVar.zzx();
        }
        int iZzt = i2 >= 3 ? zzerVar.zzt() : 0;
        if (iZzs == 0 && iZzs2 == 0 && iZzs3 == 0 && iZzs4 == 0 && iZzH == 0 && iZzt == 0) {
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        int iZzg = zzerVar.zzg() + iZzH;
        String str = "Id3Decoder";
        if (iZzg > zzerVar.zze()) {
            zzee.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        if (zzaicVar != null) {
            zzerVar.zzh(iZzg);
            return null;
        }
        if (i2 == 3) {
            int i7 = iZzt & 64;
            i4 = (iZzt & 128) != 0 ? 1 : 0;
            iZzs = 0;
            z4 = i7 != 0;
            z3 = (iZzt & 32) != 0;
            i5 = i4;
        } else if (i2 == 4) {
            boolean z5 = (iZzt & 64) != 0;
            int i8 = (iZzt & 8) != 0 ? 1 : 0;
            z4 = (iZzt & 4) != 0;
            iZzs = (iZzt & 2) != 0 ? 1 : 0;
            i5 = iZzt & 1;
            int i9 = i8;
            z3 = z5;
            i4 = i9;
        } else {
            i4 = 0;
            i5 = 0;
            z3 = false;
            z4 = false;
            iZzs = 0;
        }
        if (i4 != 0 || z4) {
            zzee.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzerVar.zzh(iZzg);
            return null;
        }
        if (z3) {
            zzerVar.zzk(1);
            iZzH--;
        }
        if (i5 != 0) {
            zzerVar.zzk(4);
            iZzH -= 4;
        }
        if (iZzs != 0) {
            iZzH = zze(zzerVar, iZzH);
        }
        try {
            try {
                if (iZzs == 84 && iZzs2 == 88 && iZzs3 == 88 && (i2 == 2 || iZzs4 == 88)) {
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzaiaVar = null;
                    } else {
                        int iZzs5 = zzerVar.zzs();
                        int i10 = iZzH - 1;
                        byte[] bArr2 = new byte[i10];
                        zzerVar.zzm(bArr2, 0, i10);
                        int iZzh = zzh(bArr2, 0, iZzs5);
                        zzaiaVar = new zzail("TXXX", new String(bArr2, 0, iZzh, zzf(iZzs5)), zzd(bArr2, iZzs5, iZzh + zzj(iZzs5)));
                        str = "Id3Decoder";
                    }
                } else if (iZzs == 84) {
                    String strZzg = zzg(i2, 84, iZzs2, iZzs3, iZzs4);
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzaiaVar = null;
                    } else {
                        int iZzs6 = zzerVar.zzs();
                        int i11 = iZzH - 1;
                        byte[] bArr3 = new byte[i11];
                        zzerVar.zzm(bArr3, 0, i11);
                        zzaiaVar = new zzail(strZzg, null, zzd(bArr3, iZzs6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iZzs == 87) {
                        if (iZzs2 != 88 || iZzs3 != 88 || (i2 != 2 && iZzs4 != 88)) {
                            i6 = 87;
                        }
                        if (iZzH <= 0) {
                            iZzs = iZzs;
                            str = "Id3Decoder";
                            zzaiaVar = null;
                        } else {
                            int iZzs7 = zzerVar.zzs();
                            int i12 = iZzH - 1;
                            byte[] bArr4 = new byte[i12];
                            zzerVar.zzm(bArr4, 0, i12);
                            int iZzh2 = zzh(bArr4, 0, iZzs7);
                            String str2 = new String(bArr4, 0, iZzh2, zzf(iZzs7));
                            int iZzj = iZzh2 + zzj(iZzs7);
                            zzaiaVar = new zzaim("WXXX", str2, zzl(bArr4, iZzj, zzi(bArr4, iZzj), StandardCharsets.ISO_8859_1));
                            str = "Id3Decoder";
                        }
                    } else {
                        i6 = iZzs;
                    }
                    if (i6 == 87) {
                        String strZzg2 = zzg(i2, 87, iZzs2, iZzs3, iZzs4);
                        byte[] bArr5 = new byte[iZzH];
                        zzerVar.zzm(bArr5, 0, iZzH);
                        zzaiaVar = new zzaim(strZzg2, null, new String(bArr5, 0, zzi(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i6 == 80) {
                            if (iZzs2 == 82 && iZzs3 == 73 && iZzs4 == 86) {
                                byte[] bArr6 = new byte[iZzH];
                                zzerVar.zzm(bArr6, 0, iZzH);
                                int iZzi2 = zzi(bArr6, 0);
                                zzaiaVar = new zzaik(new String(bArr6, 0, iZzi2, StandardCharsets.ISO_8859_1), zzk(bArr6, iZzi2 + 1, iZzH));
                            } else {
                                i6 = 80;
                            }
                        }
                        try {
                            if (i6 != 71) {
                                try {
                                    if (i2 != 2) {
                                        if (i6 != 65 && iZzs2 == 80 && iZzs3 == 73 && iZzs4 == 67) {
                                            int iZzs8 = zzerVar.zzs();
                                            Charset charsetZzf = zzf(iZzs8);
                                            int i13 = iZzH - 1;
                                            bArr = new byte[i13];
                                            zzerVar.zzm(bArr, 0, i13);
                                            if (i2 == 2) {
                                                iZzs = iZzs;
                                                strConcat = "image/".concat(String.valueOf(zzgpj.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iZzi = 2;
                                            } else {
                                                iZzs = iZzs;
                                                iZzi = zzi(bArr, 0);
                                                strZza = zzgpj.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                                if (strZza.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strZza);
                                                } else {
                                                    strConcat = strZza;
                                                }
                                            }
                                            int i14 = bArr[iZzi + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            int i15 = iZzi + 2;
                                            int iZzh3 = zzh(bArr, i15, iZzs8);
                                            zzahxVar = new zzahw(strConcat, new String(bArr, i15, iZzh3 - i15, charsetZzf), i14, zzk(bArr, iZzh3 + zzj(iZzs8), i13));
                                        } else {
                                            iZzs = iZzs;
                                            if (i6 == 67) {
                                                if (i6 != 67) {
                                                    if (i6 != 67) {
                                                        if (i6 != 77) {
                                                        }
                                                        String strZzg3 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr7 = new byte[iZzH];
                                                        zzerVar.zzm(bArr7, 0, iZzH);
                                                        zzahxVar = new zzahx(strZzg3, bArr7);
                                                    } else {
                                                        if (i6 != 77) {
                                                        }
                                                        String strZzg4 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr8 = new byte[iZzH];
                                                        zzerVar.zzm(bArr8, 0, iZzH);
                                                        zzahxVar = new zzahx(strZzg4, bArr8);
                                                    }
                                                } else if (i6 != 67) {
                                                    if (i6 != 77) {
                                                    }
                                                    String strZzg5 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr9 = new byte[iZzH];
                                                    zzerVar.zzm(bArr9, 0, iZzH);
                                                    zzahxVar = new zzahx(strZzg5, bArr9);
                                                } else {
                                                    if (i6 != 77) {
                                                    }
                                                    String strZzg6 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr10 = new byte[iZzH];
                                                    zzerVar.zzm(bArr10, 0, iZzH);
                                                    zzahxVar = new zzahx(strZzg6, bArr10);
                                                }
                                                zzaiaVar = zzaijVar;
                                            } else {
                                                if (i6 != 67) {
                                                    if (i6 != 67) {
                                                        if (i6 != 77) {
                                                        }
                                                        String strZzg7 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr11 = new byte[iZzH];
                                                        zzerVar.zzm(bArr11, 0, iZzH);
                                                        zzahxVar = new zzahx(strZzg7, bArr11);
                                                    } else {
                                                        if (i6 != 77) {
                                                        }
                                                        String strZzg8 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr12 = new byte[iZzH];
                                                        zzerVar.zzm(bArr12, 0, iZzH);
                                                        zzahxVar = new zzahx(strZzg8, bArr12);
                                                    }
                                                } else if (i6 != 67) {
                                                    if (i6 != 77) {
                                                    }
                                                    String strZzg9 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr13 = new byte[iZzH];
                                                    zzerVar.zzm(bArr13, 0, iZzH);
                                                    zzahxVar = new zzahx(strZzg9, bArr13);
                                                } else {
                                                    if (i6 != 77) {
                                                    }
                                                    String strZzg10 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr14 = new byte[iZzH];
                                                    zzerVar.zzm(bArr14, 0, iZzH);
                                                    zzahxVar = new zzahx(strZzg10, bArr14);
                                                }
                                                zzaiaVar = zzaijVar;
                                            }
                                        }
                                        zzaiaVar = zzahxVar;
                                    } else if (i6 != 80 && iZzs2 == 73 && iZzs3 == 67) {
                                        int iZzs9 = zzerVar.zzs();
                                        Charset charsetZzf2 = zzf(iZzs9);
                                        int i16 = iZzH - 1;
                                        bArr = new byte[i16];
                                        zzerVar.zzm(bArr, 0, i16);
                                        if (i2 == 2) {
                                            iZzs = iZzs;
                                            strConcat = "image/".concat(String.valueOf(zzgpj.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = "image/jpeg";
                                            }
                                            iZzi = 2;
                                        } else {
                                            iZzs = iZzs;
                                            iZzi = zzi(bArr, 0);
                                            strZza = zzgpj.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                            if (strZza.indexOf(47) == -1) {
                                                strConcat = "image/".concat(strZza);
                                            } else {
                                                strConcat = strZza;
                                            }
                                        }
                                        int i17 = bArr[iZzi + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                        int i18 = iZzi + 2;
                                        int iZzh4 = zzh(bArr, i18, iZzs9);
                                        zzahxVar = new zzahw(strConcat, new String(bArr, i18, iZzh4 - i18, charsetZzf2), i17, zzk(bArr, iZzh4 + zzj(iZzs9), i16));
                                        zzaiaVar = zzahxVar;
                                    } else {
                                        iZzs = iZzs;
                                        if (i6 == 67 || iZzs2 != 79 || iZzs3 != 77 || (iZzs4 != 77 && i2 != 2)) {
                                            if (i6 != 67 && iZzs2 == 72 && iZzs3 == 65 && iZzs4 == 80) {
                                                int iZzg2 = zzerVar.zzg();
                                                int iZzi3 = zzi(zzerVar.zzi(), iZzg2);
                                                String str3 = new String(zzerVar.zzi(), iZzg2, iZzi3 - iZzg2, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(iZzi3 + 1);
                                                int iZzB = zzerVar.zzB();
                                                int iZzB2 = zzerVar.zzB();
                                                long jZzz = zzerVar.zzz();
                                                if (jZzz == 4294967295L) {
                                                    jZzz = -1;
                                                }
                                                long j = jZzz;
                                                long jZzz2 = zzerVar.zzz();
                                                if (jZzz2 == 4294967295L) {
                                                    jZzz2 = -1;
                                                }
                                                long j2 = jZzz2;
                                                ArrayList arrayList = new ArrayList();
                                                int i19 = iZzg2 + iZzH;
                                                while (zzerVar.zzg() < i19) {
                                                    zzaig zzaigVarZzc = zzc(i2, zzerVar, z2, i3, null);
                                                    if (zzaigVarZzc != null) {
                                                        arrayList.add(zzaigVarZzc);
                                                    }
                                                }
                                                zzaijVar = new zzahy(str3, iZzB, iZzB2, j, j2, (zzaig[]) arrayList.toArray(new zzaig[0]));
                                            } else if (i6 != 67 && iZzs2 == 84 && iZzs3 == 79 && iZzs4 == 67) {
                                                int iZzg3 = zzerVar.zzg();
                                                int iZzi4 = zzi(zzerVar.zzi(), iZzg3);
                                                String str4 = new String(zzerVar.zzi(), iZzg3, iZzi4 - iZzg3, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(iZzi4 + 1);
                                                int iZzs10 = zzerVar.zzs();
                                                boolean z6 = (iZzs10 & 2) != 0;
                                                int i20 = iZzs10 & 1;
                                                int iZzs11 = zzerVar.zzs();
                                                String[] strArr = new String[iZzs11];
                                                int i21 = 0;
                                                while (i21 < iZzs11) {
                                                    int iZzg4 = zzerVar.zzg();
                                                    int i22 = iZzg3;
                                                    int iZzi5 = zzi(zzerVar.zzi(), iZzg4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i21] = new String(zzerVar.zzi(), iZzg4, iZzi5 - iZzg4, StandardCharsets.ISO_8859_1);
                                                    zzerVar.zzh(iZzi5 + 1);
                                                    i21++;
                                                    iZzg3 = i22;
                                                    iZzs11 = iZzs11;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i23 = iZzg3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i24 = i23 + iZzH;
                                                while (zzerVar.zzg() < i24) {
                                                    zzaig zzaigVarZzc2 = zzc(i2, zzerVar, z2, i3, null);
                                                    if (zzaigVarZzc2 != null) {
                                                        arrayList2.add(zzaigVarZzc2);
                                                    }
                                                }
                                                zzaijVar = new zzahz(str5, z6, 1 == i20, strArr3, (zzaig[]) arrayList2.toArray(new zzaig[0]));
                                            } else if (i6 != 77 && iZzs2 == 76 && iZzs3 == 76 && iZzs4 == 84) {
                                                int iZzt2 = zzerVar.zzt();
                                                int iZzx = zzerVar.zzx();
                                                int iZzx2 = zzerVar.zzx();
                                                int iZzs12 = zzerVar.zzs();
                                                int iZzs13 = zzerVar.zzs();
                                                zzeq zzeqVar = new zzeq();
                                                zzeqVar.zza(zzerVar);
                                                int i25 = ((iZzH - 10) * 8) / (iZzs12 + iZzs13);
                                                int[] iArr = new int[i25];
                                                int[] iArr2 = new int[i25];
                                                for (int i26 = 0; i26 < i25; i26++) {
                                                    int iZzj2 = zzeqVar.zzj(iZzs12);
                                                    int iZzj3 = zzeqVar.zzj(iZzs13);
                                                    iArr[i26] = iZzj2;
                                                    iArr2[i26] = iZzj3;
                                                }
                                                zzaijVar = new zzaij(iZzt2, iZzx, iZzx2, iArr, iArr2);
                                            } else {
                                                String strZzg11 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr15 = new byte[iZzH];
                                                zzerVar.zzm(bArr15, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg11, bArr15);
                                                zzaiaVar = zzahxVar;
                                            }
                                            zzaiaVar = zzaijVar;
                                        } else if (iZzH < 4) {
                                            zzaiaVar = null;
                                        } else {
                                            int iZzs14 = zzerVar.zzs();
                                            Charset charsetZzf3 = zzf(iZzs14);
                                            byte[] bArr16 = new byte[3];
                                            zzerVar.zzm(bArr16, 0, 3);
                                            String str6 = new String(bArr16, 0, 3);
                                            int i27 = iZzH - 4;
                                            byte[] bArr17 = new byte[i27];
                                            zzerVar.zzm(bArr17, 0, i27);
                                            int iZzh5 = zzh(bArr17, 0, iZzs14);
                                            String str7 = new String(bArr17, 0, iZzh5, charsetZzf3);
                                            int iZzj4 = iZzh5 + zzj(iZzs14);
                                            zzaiaVar = new zzaia(str6, str7, zzl(bArr17, iZzj4, zzh(bArr17, iZzj4, iZzs14), charsetZzf3));
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    zzerVar.zzh(iZzg);
                                    zzaigVar = null;
                                } catch (OutOfMemoryError e3) {
                                    e = e3;
                                    zzerVar.zzh(iZzg);
                                    zzaigVar = null;
                                }
                                if (zzaigVar == null) {
                                    String strZzg12 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(strZzg12).length() + 39 + String.valueOf(iZzH).length());
                                    sb.append("Failed to decode frame: id=");
                                    sb.append(strZzg12);
                                    sb.append(", frameSize=");
                                    sb.append(iZzH);
                                    zzee.zzd(str, sb.toString(), e);
                                }
                                return zzaigVar;
                            }
                            if (iZzs2 != 69 || iZzs3 != 79) {
                                i6 = 71;
                                if (i2 != 2) {
                                    if (i6 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i6 == 67) {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg13 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr18 = new byte[iZzH];
                                                zzerVar.zzm(bArr18, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg13, bArr18);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg14 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr19 = new byte[iZzH];
                                                zzerVar.zzm(bArr19, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg14, bArr19);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg15 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr110 = new byte[iZzH];
                                            zzerVar.zzm(bArr110, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg15, bArr110);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg16 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr111 = new byte[iZzH];
                                            zzerVar.zzm(bArr111, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg16, bArr111);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    } else {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg17 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr112 = new byte[iZzH];
                                                zzerVar.zzm(bArr112, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg17, bArr112);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg18 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr113 = new byte[iZzH];
                                                zzerVar.zzm(bArr113, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg18, bArr113);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg19 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr114 = new byte[iZzH];
                                            zzerVar.zzm(bArr114, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg19, bArr114);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg110 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr115 = new byte[iZzH];
                                            zzerVar.zzm(bArr115, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg110, bArr115);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    }
                                } else {
                                    if (i6 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i6 == 67) {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg111 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr116 = new byte[iZzH];
                                                zzerVar.zzm(bArr116, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg111, bArr116);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg112 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr117 = new byte[iZzH];
                                                zzerVar.zzm(bArr117, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg112, bArr117);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg113 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr118 = new byte[iZzH];
                                            zzerVar.zzm(bArr118, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg113, bArr118);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg114 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr119 = new byte[iZzH];
                                            zzerVar.zzm(bArr119, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg114, bArr119);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    } else {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg115 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1110 = new byte[iZzH];
                                                zzerVar.zzm(bArr1110, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg115, bArr1110);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg116 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1111 = new byte[iZzH];
                                                zzerVar.zzm(bArr1111, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg116, bArr1111);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg117 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1112 = new byte[iZzH];
                                            zzerVar.zzm(bArr1112, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg117, bArr1112);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg118 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1113 = new byte[iZzH];
                                            zzerVar.zzm(bArr1113, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg118, bArr1113);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    }
                                }
                                if (zzaigVar == null) {
                                    String strZzg119 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzg119).length() + 39 + String.valueOf(iZzH).length());
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strZzg119);
                                    sb2.append(", frameSize=");
                                    sb2.append(iZzH);
                                    zzee.zzd(str, sb2.toString(), e);
                                }
                                return zzaigVar;
                            }
                            if (iZzs4 != 66 && i2 != 2) {
                                i6 = 71;
                                if (i2 != 2) {
                                    if (i6 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i6 == 67) {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1110 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1114 = new byte[iZzH];
                                                zzerVar.zzm(bArr1114, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1110, bArr1114);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1111 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1115 = new byte[iZzH];
                                                zzerVar.zzm(bArr1115, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1111, bArr1115);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg1112 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1116 = new byte[iZzH];
                                            zzerVar.zzm(bArr1116, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg1112, bArr1116);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg1113 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1117 = new byte[iZzH];
                                            zzerVar.zzm(bArr1117, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg1113, bArr1117);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    } else {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1114 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1118 = new byte[iZzH];
                                                zzerVar.zzm(bArr1118, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1114, bArr1118);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1115 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1119 = new byte[iZzH];
                                                zzerVar.zzm(bArr1119, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1115, bArr1119);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg1116 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11110 = new byte[iZzH];
                                            zzerVar.zzm(bArr11110, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg1116, bArr11110);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg1117 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11111 = new byte[iZzH];
                                            zzerVar.zzm(bArr11111, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg1117, bArr11111);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    }
                                } else {
                                    if (i6 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i6 == 67) {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1118 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11112 = new byte[iZzH];
                                                zzerVar.zzm(bArr11112, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1118, bArr11112);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg1119 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11113 = new byte[iZzH];
                                                zzerVar.zzm(bArr11113, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg1119, bArr11113);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg11110 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11114 = new byte[iZzH];
                                            zzerVar.zzm(bArr11114, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg11110, bArr11114);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg11111 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11115 = new byte[iZzH];
                                            zzerVar.zzm(bArr11115, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg11111, bArr11115);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    } else {
                                        if (i6 != 67) {
                                            if (i6 != 67) {
                                                if (i6 != 77) {
                                                }
                                                String strZzg11112 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11116 = new byte[iZzH];
                                                zzerVar.zzm(bArr11116, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg11112, bArr11116);
                                                zzaiaVar = zzahxVar;
                                            } else {
                                                if (i6 != 77) {
                                                }
                                                String strZzg11113 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11117 = new byte[iZzH];
                                                zzerVar.zzm(bArr11117, 0, iZzH);
                                                zzahxVar = new zzahx(strZzg11113, bArr11117);
                                                zzaiaVar = zzahxVar;
                                            }
                                        } else if (i6 != 67) {
                                            if (i6 != 77) {
                                            }
                                            String strZzg11114 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11118 = new byte[iZzH];
                                            zzerVar.zzm(bArr11118, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg11114, bArr11118);
                                            zzaiaVar = zzahxVar;
                                        } else {
                                            if (i6 != 77) {
                                            }
                                            String strZzg11115 = zzg(i2, i6, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11119 = new byte[iZzH];
                                            zzerVar.zzm(bArr11119, 0, iZzH);
                                            zzahxVar = new zzahx(strZzg11115, bArr11119);
                                            zzaiaVar = zzahxVar;
                                        }
                                        zzaiaVar = zzaijVar;
                                    }
                                }
                                if (zzaigVar == null) {
                                    String strZzg1120 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZzg1120).length() + 39 + String.valueOf(iZzH).length());
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(strZzg1120);
                                    sb3.append(", frameSize=");
                                    sb3.append(iZzH);
                                    zzee.zzd(str, sb3.toString(), e);
                                }
                                return zzaigVar;
                            }
                            try {
                                int iZzs15 = zzerVar.zzs();
                                Charset charsetZzf4 = zzf(iZzs15);
                                int i28 = iZzH - 1;
                                byte[] bArr20 = new byte[i28];
                                zzerVar.zzm(bArr20, 0, i28);
                                int iZzi6 = zzi(bArr20, 0);
                                str = "Id3Decoder";
                                String strZzh = zzas.zzh(new String(bArr20, 0, iZzi6, StandardCharsets.ISO_8859_1));
                                int i29 = iZzi6 + 1;
                                int iZzh6 = zzh(bArr20, i29, iZzs15);
                                String strZzl = zzl(bArr20, i29, iZzh6, charsetZzf4);
                                int iZzj5 = iZzh6 + zzj(iZzs15);
                                int iZzh7 = zzh(bArr20, iZzj5, iZzs15);
                                iZzs = iZzs;
                                zzaiaVar = new zzaib(strZzh, strZzl, zzl(bArr20, iZzj5, iZzh7, charsetZzf4), zzk(bArr20, iZzh7 + zzj(iZzs15), i28));
                            } catch (Exception e4) {
                                e = e4;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzerVar.zzh(iZzg);
                                zzaigVar = null;
                            } catch (OutOfMemoryError e5) {
                                e = e5;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzerVar.zzh(iZzg);
                                zzaigVar = null;
                            }
                        } catch (Exception e6) {
                            e = e6;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                        }
                    }
                    str = "Id3Decoder";
                }
                zzerVar.zzh(iZzg);
                zzaigVar = zzaiaVar;
                e = null;
            } catch (Exception e8) {
                e = e8;
                iZzs = iZzs;
                str = "Id3Decoder";
                zzerVar.zzh(iZzg);
                zzaigVar = null;
                if (zzaigVar == null) {
                    String strZzg1121 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strZzg1121).length() + 39 + String.valueOf(iZzH).length());
                    sb4.append("Failed to decode frame: id=");
                    sb4.append(strZzg1121);
                    sb4.append(", frameSize=");
                    sb4.append(iZzH);
                    zzee.zzd(str, sb4.toString(), e);
                }
                return zzaigVar;
            } catch (OutOfMemoryError e9) {
                e = e9;
                iZzs = iZzs;
                str = "Id3Decoder";
                zzerVar.zzh(iZzg);
                zzaigVar = null;
                if (zzaigVar == null) {
                    String strZzg1122 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(strZzg1122).length() + 39 + String.valueOf(iZzH).length());
                    sb5.append("Failed to decode frame: id=");
                    sb5.append(strZzg1122);
                    sb5.append(", frameSize=");
                    sb5.append(iZzH);
                    zzee.zzd(str, sb5.toString(), e);
                }
                return zzaigVar;
            }
            if (zzaigVar == null) {
                String strZzg1123 = zzg(i2, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb6 = new StringBuilder(String.valueOf(strZzg1123).length() + 39 + String.valueOf(iZzH).length());
                sb6.append("Failed to decode frame: id=");
                sb6.append(strZzg1123);
                sb6.append(", frameSize=");
                sb6.append(iZzH);
                zzee.zzd(str, sb6.toString(), e);
            }
            return zzaigVar;
        } catch (Throwable th) {
            zzerVar.zzh(iZzg);
            throw th;
        }
    }

    private static zzgtd zzd(byte[] bArr, int i2, int i3) {
        if (i3 >= bArr.length) {
            return zzgtd.zzj("");
        }
        int i4 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        int iZzh = zzh(bArr, i3, i2);
        while (i3 < iZzh) {
            zzgtaVar.zzf(new String(bArr, i3, iZzh - i3, zzf(i2)));
            i3 = zzj(i2) + iZzh;
            iZzh = zzh(bArr, i3, i2);
        }
        zzgtd zzgtdVarZzi = zzgtaVar.zzi();
        return zzgtdVarZzi.isEmpty() ? zzgtd.zzj("") : zzgtdVarZzi;
    }

    private static int zze(zzer zzerVar, int i2) {
        byte[] bArrZzi = zzerVar.zzi();
        int iZzg = zzerVar.zzg();
        int i3 = iZzg;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iZzg + i2) {
                return i2;
            }
            if ((bArrZzi[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArrZzi[i4] == 0) {
                System.arraycopy(bArrZzi, i3 + 2, bArrZzi, i4, (i2 - (i3 - iZzg)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    private static Charset zzf(int i2) {
        if (i2 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i2 != 2) {
            return i2 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String zzg(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static int zzh(byte[] bArr, int i2, int i3) {
        int iZzi = zzi(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi >= length - 1) {
                return length;
            }
            int i4 = iZzi + 1;
            if ((iZzi - i2) % 2 == 0 && bArr[i4] == 0) {
                return iZzi;
            }
            iZzi = zzi(bArr, i4);
        }
    }

    private static int zzi(byte[] bArr, int i2) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    private static int zzj(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? zzfj.zzb : Arrays.copyOfRange(bArr, i2, i3);
    }

    private static String zzl(byte[] bArr, int i2, int i3, Charset charset) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, charset);
    }
}
