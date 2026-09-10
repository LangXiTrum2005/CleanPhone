package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
final class zzait {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzajc zzc = new zzajc();
    private zzaiu zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaep zzaepVar, int i2) throws IOException {
        byte[] bArr = this.zza;
        zzaepVar.zzc(bArr, 0, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j << 8) | ((long) (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }

    public final void zza(zzaiu zzaiuVar) {
        this.zzd = zzaiuVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[LOOP:0: B:3:0x0005->B:37:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e A[LOOP:2: B:61:0x0136->B:64:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140 A[SYNTHETIC] */
    public final boolean zzc(zzaep zzaepVar) throws IOException {
        int i2;
        zzaja zzajaVar;
        long j;
        long j2;
        int i3;
        byte[] bArr;
        String str;
        int i4;
        long j3;
        int i5;
        long jZzd;
        double dLongBitsToDouble;
        int iZzd;
        int iZze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzais zzaisVar = (zzais) arrayDeque.peek();
            if (zzaisVar != null && zzaepVar.zzn() >= zzaisVar.zzb()) {
                ((zzaiv) this.zzd).zza.zzi(((zzais) arrayDeque.pop()).zza());
                return true;
            }
            int i6 = this.zze;
            if (i6 != 0) {
                if (i6 == 1) {
                }
                zzaiu zzaiuVar = this.zzd;
                i2 = this.zzf;
                zzajaVar = ((zzaiv) zzaiuVar).zza;
                switch (i2) {
                    case 131:
                    case PRIVACY_URL_ERROR_VALUE:
                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case AD_RESPONSE_EMPTY_VALUE:
                    case 231:
                    case 238:
                    case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    case 241:
                    case 247:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j = this.zzg;
                        if (j <= 8) {
                            zzajaVar.zzj(i2, zzd(zzaepVar, (int) j));
                            this.zze = 0;
                            return true;
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw zzat.zzb(sb.toString(), null);
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        j2 = this.zzg;
                        if (j2 <= 2147483647L) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 21);
                            sb2.append("String element size: ");
                            sb2.append(j2);
                            throw zzat.zzb(sb2.toString(), null);
                        }
                        i3 = (int) j2;
                        if (i3 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i3];
                            zzaepVar.zzc(bArr, 0, i3);
                            while (i3 > 0) {
                                i4 = i3 - 1;
                                if (bArr[i4] == 0) {
                                    i3 = i4;
                                } else {
                                    str = new String(bArr, 0, i3);
                                }
                            }
                            str = new String(bArr, 0, i3);
                        }
                        zzajaVar.zzl(i2, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzn = zzaepVar.zzn();
                        arrayDeque.push(new zzais(i2, this.zzg + jZzn, null));
                        ((zzaiv) this.zzd).zza.zzh(this.zzf, jZzn, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzajaVar.zzm(i2, (int) this.zzg, zzaepVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j3 = this.zzg;
                        if (j3 == 4 && j3 != 8) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 20);
                            sb3.append("Invalid float size: ");
                            sb3.append(j3);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        i5 = (int) j3;
                        jZzd = zzd(zzaepVar, i5);
                        if (i5 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzajaVar.zzk(i2, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        zzaepVar.zzf((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzb = this.zzc.zzb(zzaepVar, true, false, 4);
                if (jZzb == -2) {
                    zzaepVar.zzl();
                    while (true) {
                        byte[] bArr2 = this.zza;
                        zzaepVar.zzi(bArr2, 0, 4);
                        iZzd = zzajc.zzd(bArr2[0]);
                        if (iZzd != -1 && iZzd <= 4) {
                            iZze = (int) zzajc.zze(bArr2, iZzd, false);
                            zzaja zzajaVar2 = ((zzaiv) this.zzd).zza;
                            if (iZze != 357149030 && iZze != 524531317 && iZze != 475249515) {
                                if (iZze == 374648427) {
                                    iZze = 374648427;
                                }
                            }
                        }
                        zzaepVar.zzf(1);
                    }
                    zzaepVar.zzf(iZzd);
                    jZzb = iZze;
                }
                if (jZzb == -1) {
                    return false;
                }
                this.zzf = (int) jZzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzaepVar, false, true, 8);
            this.zze = 2;
            zzaiu zzaiuVar2 = this.zzd;
            i2 = this.zzf;
            zzajaVar = ((zzaiv) zzaiuVar2).zza;
            switch (i2) {
                case 131:
                case PRIVACY_URL_ERROR_VALUE:
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j = this.zzg;
                    if (j <= 8) {
                        zzajaVar.zzj(i2, zzd(zzaepVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j).length() + 22);
                    sb4.append("Invalid integer size: ");
                    sb4.append(j);
                    throw zzat.zzb(sb4.toString(), null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    j2 = this.zzg;
                    if (j2 <= 2147483647L) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(j2).length() + 21);
                        sb5.append("String element size: ");
                        sb5.append(j2);
                        throw zzat.zzb(sb5.toString(), null);
                    }
                    i3 = (int) j2;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i3];
                        zzaepVar.zzc(bArr, 0, i3);
                        while (i3 > 0) {
                            i4 = i3 - 1;
                            if (bArr[i4] == 0) {
                                i3 = i4;
                            } else {
                                str = new String(bArr, 0, i3);
                            }
                        }
                        str = new String(bArr, 0, i3);
                    }
                    zzajaVar.zzl(i2, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzn2 = zzaepVar.zzn();
                    arrayDeque.push(new zzais(i2, this.zzg + jZzn2, null));
                    ((zzaiv) this.zzd).zza.zzh(this.zzf, jZzn2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzajaVar.zzm(i2, (int) this.zzg, zzaepVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j3 = this.zzg;
                    if (j3 == 4) {
                        break;
                    }
                    i5 = (int) j3;
                    jZzd = zzd(zzaepVar, i5);
                    if (i5 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzajaVar.zzk(i2, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    zzaepVar.zzf((int) this.zzg);
                    this.zze = 0;
                    break;
            }
        }
    }
}
