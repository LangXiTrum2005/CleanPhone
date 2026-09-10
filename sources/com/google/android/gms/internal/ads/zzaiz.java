package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaiz {
    public byte[] zzO;
    public zzagb zzU;
    public boolean zzW;
    public zzaga zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzafz zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    private static Pair zzf(zzer zzerVar) throws zzat {
        try {
            zzerVar.zzk(16);
            long jZzA = zzerVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzee.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzerVar.zzg() + 20;
            byte[] bArrZzi = zzerVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i2 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i2] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i4 = 0;
            int i5 = 1;
            while (true) {
                int i6 = bArr[i5];
                i5++;
                i2 = i6 & 255;
                if (i2 != 255) {
                    break;
                }
                i4 += 255;
            }
            int i7 = i4 + i2;
            int i8 = 0;
            while (true) {
                int i9 = bArr[i5];
                i5++;
                i3 = i9 & 255;
                if (i3 != 255) {
                    break;
                }
                i8 += 255;
            }
            int i10 = i8 + i3;
            if (bArr[i5] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i5, bArr2, 0, i7);
            int i11 = i5 + i7;
            if (bArr[i11] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = i11 + i10;
            if (bArr[i12] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i12, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzer zzerVar) throws zzat {
        try {
            int iZzu = zzerVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzerVar.zzh(24);
                if (zzerVar.zzD() == zzaja.zzf.getMostSignificantBits() && zzerVar.zzD() == zzaja.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull
    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x040a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0424  */
    /* JADX WARN: Code duplicated, block: B:192:0x0427  */
    /* JADX WARN: Code duplicated, block: B:195:0x0436  */
    /* JADX WARN: Code duplicated, block: B:196:0x0445  */
    /* JADX WARN: Code duplicated, block: B:198:0x044b  */
    /* JADX WARN: Code duplicated, block: B:200:0x044f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0454  */
    /* JADX WARN: Code duplicated, block: B:205:0x045c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0461  */
    /* JADX WARN: Code duplicated, block: B:210:0x0468  */
    /* JADX WARN: Code duplicated, block: B:213:0x0476  */
    /* JADX WARN: Code duplicated, block: B:216:0x047b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0481  */
    /* JADX WARN: Code duplicated, block: B:236:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:239:0x0559  */
    /* JADX WARN: Code duplicated, block: B:242:0x055e  */
    /* JADX WARN: Code duplicated, block: B:247:0x057c  */
    /* JADX WARN: Code duplicated, block: B:265:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:269:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:284:0x0617  */
    /* JADX WARN: Code duplicated, block: B:289:0x0630  */
    /* JADX WARN: Code duplicated, block: B:290:0x0633  */
    @RequiresNonNull
    public final void zza(int i2) throws zzat {
        byte b2;
        List listZzj;
        List list;
        String str;
        String str2;
        int i3;
        int iZzz;
        String str3;
        int i4;
        zzt zztVar;
        int iIntValue;
        int i5;
        float f;
        zzi zziVarZzg;
        String str4;
        byte[] bArr;
        int i6;
        int i7;
        int i8;
        String str5;
        String str6;
        zzfr zzfrVarZza;
        String str7 = this.zzc;
        int i9 = 4;
        int i10 = 0;
        switch (str7) {
            case "V_MPEG4/ISO/AP":
                b2 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b2 = 4;
                break;
            case "A_MS/ACM":
                b2 = 23;
                break;
            case "A_TRUEHD":
                b2 = 18;
                break;
            case "A_VORBIS":
                b2 = 11;
                break;
            case "A_MPEG/L2":
                b2 = 14;
                break;
            case "A_MPEG/L3":
                b2 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b2 = 9;
                break;
            case "S_DVBSUB":
                b2 = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b2 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b2 = 7;
                break;
            case "S_VOBSUB":
                b2 = 31;
                break;
            case "A_DTS/LOSSLESS":
                b2 = 21;
                break;
            case "A_AAC":
                b2 = 13;
                break;
            case "A_AC3":
                b2 = 16;
                break;
            case "A_DTS":
                b2 = 19;
                break;
            case "V_AV1":
                b2 = 2;
                break;
            case "V_VP8":
                b2 = 0;
                break;
            case "V_VP9":
                b2 = 1;
                break;
            case "S_HDMV/PGS":
                b2 = 32;
                break;
            case "V_THEORA":
                b2 = 10;
                break;
            case "A_DTS/EXPRESS":
                b2 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b2 = 26;
                break;
            case "A_PCM/INT/BIG":
                b2 = 25;
                break;
            case "A_PCM/INT/LIT":
                b2 = 24;
                break;
            case "S_TEXT/ASS":
                b2 = 28;
                break;
            case "S_TEXT/SSA":
                b2 = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b2 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b2 = 30;
                break;
            case "S_TEXT/UTF8":
                b2 = 27;
                break;
            case "V_MPEG2":
                b2 = 3;
                break;
            case "A_EAC3":
                b2 = 17;
                break;
            case "A_FLAC":
                b2 = 22;
                break;
            case "A_OPUS":
                b2 = 12;
                break;
            default:
                b2 = -1;
                break;
        }
        String str8 = "audio/raw";
        switch (b2) {
            case 0:
                str8 = "video/x-vnd.on2.vp8";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null && (zzfrVarZza = zzfr.zza(new zzer(this.zzO))) != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z2 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11 = (z2 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue || (i6 = this.zzq) == iIntValue) {
                        f = -1.0f;
                    } else {
                        f = (this.zzn * i5) / (this.zzm * i6);
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f || this.zzN == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzL * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzN + 0.5f));
                            byteBufferOrder.putShort((short) this.zzC);
                            byteBufferOrder.putShort((short) this.zzD);
                        }
                        zzh zzhVar = new zzh();
                        zzhVar.zza(this.zzz);
                        zzhVar.zzb(this.zzB);
                        zzhVar.zzc(this.zzA);
                        zzhVar.zzd(bArr);
                        zzhVar.zze(this.zzo);
                        zzhVar.zzf(this.zzo);
                        zziVarZzg = zzhVar.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null && zzaja.zzg.containsKey(str4)) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i10 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) != 0) {
                        if (Float.compare(this.zzv, 90.0f) == 0) {
                            i10 = 90;
                        } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                            i10 = 180;
                        } else if (Float.compare(this.zzv, -90.0f) == 0) {
                            i10 = 270;
                        } else {
                            i10 = iIntValue;
                        }
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null && !zzaja.zzg.containsKey(str5)) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                listZzj = bArr2 == null ? null : zzgtd.zzj(bArr2);
                str8 = "video/x-vnd.on2.vp9";
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z3 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i12 = (z3 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar2 = new zzh();
                        zzhVar2.zza(this.zzz);
                        zzhVar2.zzb(this.zzB);
                        zzhVar2.zzc(this.zzA);
                        zzhVar2.zzd(bArr);
                        zzhVar2.zze(this.zzo);
                        zzhVar2.zzf(this.zzo);
                        zziVarZzg = zzhVar2.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i12);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                listZzj = bArr3 == null ? null : zzgtd.zzj(bArr3);
                str8 = MimeTypes.VIDEO_AV1;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z4 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i13 = (z4 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar3 = new zzh();
                        zzhVar3.zza(this.zzz);
                        zzhVar3.zzb(this.zzB);
                        zzhVar3.zzc(this.zzA);
                        zzhVar3.zzd(bArr);
                        zzhVar3.zze(this.zzo);
                        zzhVar3.zzf(this.zzo);
                        zziVarZzg = zzhVar3.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i13);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 3:
                str8 = "video/mpeg2";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z5 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i14 = (z5 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar4 = new zzh();
                        zzhVar4.zza(this.zzz);
                        zzhVar4.zzb(this.zzB);
                        zzhVar4.zzc(this.zzA);
                        zzhVar4.zzd(bArr);
                        zzhVar4.zze(this.zzo);
                        zzhVar4.zzf(this.zzo);
                        zziVarZzg = zzhVar4.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i14);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str8 = "video/mp4v-es";
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z6 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i15 = (z6 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar5 = new zzh();
                        zzhVar5.zza(this.zzz);
                        zzhVar5.zzb(this.zzB);
                        zzhVar5.zzc(this.zzA);
                        zzhVar5.zzd(bArr);
                        zzhVar5.zze(this.zzo);
                        zzhVar5.zzf(this.zzo);
                        zziVarZzg = zzhVar5.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i15);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 7:
                zzadt zzadtVarZza = zzadt.zza(new zzer(zzi(this.zzc)));
                list = zzadtVarZza.zza;
                this.zzaa = zzadtVarZza.zzb;
                str = zzadtVarZza.zzl;
                str8 = "video/avc";
                str2 = str;
                listZzj = list;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z7 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i16 = (z7 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar6 = new zzh();
                        zzhVar6.zza(this.zzz);
                        zzhVar6.zzb(this.zzB);
                        zzhVar6.zzc(this.zzA);
                        zzhVar6.zzd(bArr);
                        zzhVar6.zze(this.zzo);
                        zzhVar6.zzf(this.zzo);
                        zziVarZzg = zzhVar6.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i16);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 8:
                zzafh zzafhVarZza = zzafh.zza(new zzer(zzi(this.zzc)));
                list = zzafhVarZza.zza;
                this.zzaa = zzafhVarZza.zzb;
                str = zzafhVarZza.zzn;
                str8 = "video/hevc";
                str2 = str;
                listZzj = list;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z8 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i17 = (z8 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar7 = new zzh();
                        zzhVar7.zza(this.zzz);
                        zzhVar7.zzb(this.zzB);
                        zzhVar7.zzc(this.zzA);
                        zzhVar7.zzd(bArr);
                        zzhVar7.zze(this.zzo);
                        zzhVar7.zzf(this.zzo);
                        zziVarZzg = zzhVar7.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i17);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 9:
                Pair pairZzf = zzf(new zzer(zzi(this.zzc)));
                str8 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z9 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i18 = (z9 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar8 = new zzh();
                        zzhVar8.zza(this.zzz);
                        zzhVar8.zzb(this.zzB);
                        zzhVar8.zzc(this.zzA);
                        zzhVar8.zzd(bArr);
                        zzhVar8.zze(this.zzo);
                        zzhVar8.zzf(this.zzo);
                        zziVarZzg = zzhVar8.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i18);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 10:
                str8 = "video/x-unknown";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z10 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i19 = (z10 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar9 = new zzh();
                        zzhVar9.zza(this.zzz);
                        zzhVar9.zzb(this.zzB);
                        zzhVar9.zzc(this.zzA);
                        zzhVar9.zzd(bArr);
                        zzhVar9.zze(this.zzo);
                        zzhVar9.zzf(this.zzo);
                        zziVarZzg = zzhVar9.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i19);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 11:
                listZzj = zzg(zzi(str7));
                i3 = Segment.SIZE;
                str8 = "audio/vorbis";
                str2 = null;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z11 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i110 = (z11 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar10 = new zzh();
                        zzhVar10.zza(this.zzz);
                        zzhVar10.zzb(this.zzB);
                        zzhVar10.zzc(this.zzA);
                        zzhVar10.zzd(bArr);
                        zzhVar10.zze(this.zzo);
                        zzhVar10.zzf(this.zzo);
                        zziVarZzg = zzhVar10.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzS).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzT).array());
                str8 = "audio/opus";
                i3 = 5760;
                listZzj = arrayList;
                str2 = null;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z12 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i111 = (z12 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar11 = new zzh();
                        zzhVar11.zza(this.zzz);
                        zzhVar11.zzb(this.zzB);
                        zzhVar11.zzc(this.zzA);
                        zzhVar11.zzd(bArr);
                        zzhVar11.zze(this.zzo);
                        zzhVar11.zzf(this.zzo);
                        zziVarZzg = zzhVar11.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 13:
                listZzj = Collections.singletonList(zzi(str7));
                zzadm zzadmVarZza = zzadn.zza(this.zzk);
                this.zzR = zzadmVarZza.zza;
                this.zzP = zzadmVarZza.zzb;
                str8 = "audio/mp4a-latm";
                str2 = zzadmVarZza.zzc;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z13 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i112 = (z13 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar12 = new zzh();
                        zzhVar12.zza(this.zzz);
                        zzhVar12.zzb(this.zzB);
                        zzhVar12.zzc(this.zzA);
                        zzhVar12.zzd(bArr);
                        zzhVar12.zze(this.zzo);
                        zzhVar12.zzf(this.zzo);
                        zziVarZzg = zzhVar12.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i112);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 14:
                str8 = "audio/mpeg-L2";
                listZzj = null;
                str2 = null;
                i3 = 4096;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z14 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i113 = (z14 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar13 = new zzh();
                        zzhVar13.zza(this.zzz);
                        zzhVar13.zzb(this.zzB);
                        zzhVar13.zzc(this.zzA);
                        zzhVar13.zzd(bArr);
                        zzhVar13.zze(this.zzo);
                        zzhVar13.zzf(this.zzo);
                        zziVarZzg = zzhVar13.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i113);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 15:
                str8 = "audio/mpeg";
                listZzj = null;
                str2 = null;
                i3 = 4096;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z15 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i114 = (z15 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar14 = new zzh();
                        zzhVar14.zza(this.zzz);
                        zzhVar14.zzb(this.zzB);
                        zzhVar14.zzc(this.zzA);
                        zzhVar14.zzd(bArr);
                        zzhVar14.zze(this.zzo);
                        zzhVar14.zzf(this.zzo);
                        zziVarZzg = zzhVar14.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i114);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 16:
                str8 = "audio/ac3";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z16 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i115 = (z16 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar15 = new zzh();
                        zzhVar15.zza(this.zzz);
                        zzhVar15.zzb(this.zzB);
                        zzhVar15.zzc(this.zzA);
                        zzhVar15.zzd(bArr);
                        zzhVar15.zze(this.zzo);
                        zzhVar15.zzf(this.zzo);
                        zziVarZzg = zzhVar15.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i115);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 17:
                str8 = "audio/eac3";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z17 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i116 = (z17 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar16 = new zzh();
                        zzhVar16.zza(this.zzz);
                        zzhVar16.zzb(this.zzB);
                        zzhVar16.zzc(this.zzA);
                        zzhVar16.zzd(bArr);
                        zzhVar16.zze(this.zzo);
                        zzhVar16.zzf(this.zzo);
                        zziVarZzg = zzhVar16.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i116);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 18:
                this.zzU = new zzagb();
                str8 = "audio/true-hd";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z18 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i117 = (z18 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar17 = new zzh();
                        zzhVar17.zza(this.zzz);
                        zzhVar17.zzb(this.zzB);
                        zzhVar17.zzc(this.zzA);
                        zzhVar17.zzd(bArr);
                        zzhVar17.zze(this.zzo);
                        zzhVar17.zzf(this.zzo);
                        zziVarZzg = zzhVar17.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i117);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 19:
            case 20:
                this.zzV = true;
                str8 = "audio/vnd.dts";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z19 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i118 = (z19 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar18 = new zzh();
                        zzhVar18.zza(this.zzz);
                        zzhVar18.zzb(this.zzB);
                        zzhVar18.zzc(this.zzA);
                        zzhVar18.zzd(bArr);
                        zzhVar18.zze(this.zzo);
                        zzhVar18.zzf(this.zzo);
                        zziVarZzg = zzhVar18.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i118);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 21:
                str8 = "audio/vnd.dts.hd";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z110 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i119 = (z110 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar19 = new zzh();
                        zzhVar19.zza(this.zzz);
                        zzhVar19.zzb(this.zzB);
                        zzhVar19.zzc(this.zzA);
                        zzhVar19.zzd(bArr);
                        zzhVar19.zze(this.zzo);
                        zzhVar19.zzf(this.zzo);
                        zziVarZzg = zzhVar19.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i119);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str7));
                str8 = "audio/flac";
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z111 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1110 = (z111 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar110 = new zzh();
                        zzhVar110.zza(this.zzz);
                        zzhVar110.zzb(this.zzB);
                        zzhVar110.zzc(this.zzA);
                        zzhVar110.zzd(bArr);
                        zzhVar110.zze(this.zzo);
                        zzhVar110.zzf(this.zzo);
                        zziVarZzg = zzhVar110.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 23:
                if (zzh(new zzer(zzi(this.zzc)))) {
                    iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                    if (iZzz == 0) {
                        int i20 = this.zzQ;
                        StringBuilder sb = new StringBuilder(String.valueOf(i20).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i20);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc("MatroskaExtractor", sb.toString());
                    }
                    i9 = iZzz;
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                    if (this.zzO != null) {
                        str2 = zzfrVarZza.zza;
                        str8 = "video/dolby-vision";
                    }
                    str3 = str8;
                    boolean z112 = this.zzX;
                    if (true != this.zzW) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                    int i1111 = (z112 ? 1 : 0) | i4;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzE(this.zzP);
                        zztVar.zzF(this.zzR);
                        zztVar.zzG(i9);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i7 = this.zzp;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzp = i7;
                            i8 = this.zzq;
                            if (i8 == -1) {
                                i8 = this.zzn;
                            }
                            this.zzq = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzp;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzh zzhVar111 = new zzh();
                            zzhVar111.zza(this.zzz);
                            zzhVar111.zzb(this.zzB);
                            zzhVar111.zzc(this.zzA);
                            zzhVar111.zzd(bArr);
                            zzhVar111.zze(this.zzo);
                            zzhVar111.zzf(this.zzo);
                            zziVarZzg = zzhVar111.zzg();
                        } else {
                            zziVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                            iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f);
                        zztVar.zzy(i10);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str5 = this.zzb;
                    if (str5 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i2);
                    if (true != this.zza) {
                        str6 = "video/x-matroska";
                    } else {
                        str6 = "video/webm";
                    }
                    zztVar.zzl(str6);
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i1111);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                zzee.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listZzj = null;
                str2 = null;
                str8 = "audio/x-unknown";
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z113 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1112 = (z113 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar112 = new zzh();
                        zzhVar112.zza(this.zzz);
                        zzhVar112.zzb(this.zzB);
                        zzhVar112.zzc(this.zzA);
                        zzhVar112.zzd(bArr);
                        zzhVar112.zze(this.zzo);
                        zzhVar112.zzf(this.zzo);
                        zziVarZzg = zzhVar112.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1112);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 24:
                iZzz = zzfj.zzz(this.zzQ, ByteOrder.LITTLE_ENDIAN);
                if (iZzz == 0) {
                    int i21 = this.zzQ;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i21).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i21);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc("MatroskaExtractor", sb2.toString());
                    listZzj = null;
                    str2 = null;
                    str8 = "audio/x-unknown";
                    i3 = -1;
                    i9 = -1;
                    if (this.zzO != null) {
                        str2 = zzfrVarZza.zza;
                        str8 = "video/dolby-vision";
                    }
                    str3 = str8;
                    boolean z114 = this.zzX;
                    if (true != this.zzW) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                    int i1113 = (z114 ? 1 : 0) | i4;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzE(this.zzP);
                        zztVar.zzF(this.zzR);
                        zztVar.zzG(i9);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i7 = this.zzp;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzp = i7;
                            i8 = this.zzq;
                            if (i8 == -1) {
                                i8 = this.zzn;
                            }
                            this.zzq = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzp;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzy) {
                            if (this.zzE != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            zzh zzhVar113 = new zzh();
                            zzhVar113.zza(this.zzz);
                            zzhVar113.zzb(this.zzB);
                            zzhVar113.zzc(this.zzA);
                            zzhVar113.zzd(bArr);
                            zzhVar113.zze(this.zzo);
                            zzhVar113.zzf(this.zzo);
                            zziVarZzg = zzhVar113.zzg();
                        } else {
                            zziVarZzg = null;
                        }
                        str4 = this.zzb;
                        if (str4 != null) {
                            iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        zztVar.zzt(this.zzm);
                        zztVar.zzu(this.zzn);
                        zztVar.zzz(f);
                        zztVar.zzy(i10);
                        zztVar.zzA(this.zzw);
                        zztVar.zzB(this.zzx);
                        zztVar.zzC(zziVarZzg);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str5 = this.zzb;
                    if (str5 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i2);
                    if (true != this.zza) {
                        str6 = "video/x-matroska";
                    } else {
                        str6 = "video/webm";
                    }
                    zztVar.zzl(str6);
                    zztVar.zzm(str3);
                    zztVar.zzn(i3);
                    zztVar.zze(this.zzac);
                    zztVar.zzf(i1113);
                    zztVar.zzp(listZzj);
                    zztVar.zzj(str2);
                    zztVar.zzq(this.zzl);
                    this.zzZ = zztVar.zzM();
                    return;
                }
                i9 = iZzz;
                listZzj = null;
                str2 = null;
                i3 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z115 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1114 = (z115 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar114 = new zzh();
                        zzhVar114.zza(this.zzz);
                        zzhVar114.zzb(this.zzB);
                        zzhVar114.zzc(this.zzA);
                        zzhVar114.zzd(bArr);
                        zzhVar114.zze(this.zzo);
                        zzhVar114.zzf(this.zzo);
                        zziVarZzg = zzhVar114.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1114);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 25:
                int i22 = this.zzQ;
                if (i22 == 8) {
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                    i9 = 3;
                } else {
                    if (i22 == 16) {
                        iZzz = 268435456;
                    } else if (i22 == 24) {
                        iZzz = 1342177280;
                    } else if (i22 == 32) {
                        iZzz = 1610612736;
                    } else {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i22).length() + 75);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i22);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        zzee.zzc("MatroskaExtractor", sb3.toString());
                        listZzj = null;
                        str2 = null;
                        str8 = "audio/x-unknown";
                        i3 = -1;
                        i9 = -1;
                    }
                    i9 = iZzz;
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z116 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1115 = (z116 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar115 = new zzh();
                        zzhVar115.zza(this.zzz);
                        zzhVar115.zzb(this.zzB);
                        zzhVar115.zzc(this.zzA);
                        zzhVar115.zzd(bArr);
                        zzhVar115.zze(this.zzo);
                        zzhVar115.zzf(this.zzo);
                        zziVarZzg = zzhVar115.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1115);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 26:
                int i23 = this.zzQ;
                if (i23 == 32) {
                    listZzj = null;
                    str2 = null;
                    i3 = -1;
                } else {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i23).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i23);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzee.zzc("MatroskaExtractor", sb4.toString());
                    listZzj = null;
                    str2 = null;
                    str8 = "audio/x-unknown";
                    i3 = -1;
                    i9 = -1;
                }
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z117 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1116 = (z117 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar116 = new zzh();
                        zzhVar116.zza(this.zzz);
                        zzhVar116.zzb(this.zzB);
                        zzhVar116.zzc(this.zzA);
                        zzhVar116.zzd(bArr);
                        zzhVar116.zze(this.zzo);
                        zzhVar116.zzf(this.zzo);
                        zziVarZzg = zzhVar116.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1116);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 27:
                str8 = "application/x-subrip";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z118 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1117 = (z118 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar117 = new zzh();
                        zzhVar117.zza(this.zzz);
                        zzhVar117.zzb(this.zzB);
                        zzhVar117.zzc(this.zzA);
                        zzhVar117.zzd(bArr);
                        zzhVar117.zze(this.zzo);
                        zzhVar117.zzf(this.zzo);
                        zziVarZzg = zzhVar117.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1117);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 28:
            case 29:
                int i24 = zzaja.zza;
                listZzj = zzgtd.zzk(zzaja.zzc, zzi(this.zzc));
                str8 = "text/x-ssa";
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z119 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1118 = (z119 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar118 = new zzh();
                        zzhVar118.zza(this.zzz);
                        zzhVar118.zzb(this.zzB);
                        zzhVar118.zzc(this.zzA);
                        zzhVar118.zzd(bArr);
                        zzhVar118.zze(this.zzo);
                        zzhVar118.zzf(this.zzo);
                        zziVarZzg = zzhVar118.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1118);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 30:
                str8 = "text/vtt";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1110 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i1119 = (z1110 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar119 = new zzh();
                        zzhVar119.zza(this.zzz);
                        zzhVar119.zzb(this.zzB);
                        zzhVar119.zzc(this.zzA);
                        zzhVar119.zzd(bArr);
                        zzhVar119.zze(this.zzo);
                        zzhVar119.zzf(this.zzo);
                        zziVarZzg = zzhVar119.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i1119);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 31:
                listZzj = zzgtd.zzj(zzi(str7));
                str8 = "application/vobsub";
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1111 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11110 = (z1111 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar1110 = new zzh();
                        zzhVar1110.zza(this.zzz);
                        zzhVar1110.zzb(this.zzB);
                        zzhVar1110.zzc(this.zzA);
                        zzhVar1110.zzd(bArr);
                        zzhVar1110.zze(this.zzo);
                        zzhVar1110.zzf(this.zzo);
                        zziVarZzg = zzhVar1110.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11110);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 32:
                str8 = "application/pgs";
                listZzj = null;
                str2 = null;
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1112 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11111 = (z1112 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar1111 = new zzh();
                        zzhVar1111.zza(this.zzz);
                        zzhVar1111.zzb(this.zzB);
                        zzhVar1111.zzc(this.zzA);
                        zzhVar1111.zzd(bArr);
                        zzhVar1111.zze(this.zzo);
                        zzhVar1111.zzf(this.zzo);
                        zziVarZzg = zzhVar1111.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11111);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str7), 0, bArr5, 0, 4);
                listZzj = zzgtd.zzj(bArr5);
                str2 = null;
                str8 = "application/dvbsubs";
                i3 = -1;
                i9 = -1;
                if (this.zzO != null) {
                    str2 = zzfrVarZza.zza;
                    str8 = "video/dolby-vision";
                }
                str3 = str8;
                boolean z1113 = this.zzX;
                if (true != this.zzW) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                int i11112 = (z1113 ? 1 : 0) | i4;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzE(this.zzP);
                    zztVar.zzF(this.zzR);
                    zztVar.zzG(i9);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i7 = this.zzp;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzp = i7;
                        i8 = this.zzq;
                        if (i8 == -1) {
                            i8 = this.zzn;
                        }
                        this.zzq = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzp;
                    if (i5 != iIntValue) {
                        f = -1.0f;
                    } else {
                        f = -1.0f;
                    }
                    if (this.zzy) {
                        if (this.zzE != -1.0f) {
                            bArr = null;
                        } else {
                            bArr = null;
                        }
                        zzh zzhVar1112 = new zzh();
                        zzhVar1112.zza(this.zzz);
                        zzhVar1112.zzb(this.zzB);
                        zzhVar1112.zzc(this.zzA);
                        zzhVar1112.zzd(bArr);
                        zzhVar1112.zze(this.zzo);
                        zzhVar1112.zzf(this.zzo);
                        zziVarZzg = zzhVar1112.zzg();
                    } else {
                        zziVarZzg = null;
                    }
                    str4 = this.zzb;
                    if (str4 != null) {
                        iIntValue = ((Integer) zzaja.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i10 = iIntValue;
                    } else {
                        i10 = iIntValue;
                    }
                    zztVar.zzt(this.zzm);
                    zztVar.zzu(this.zzn);
                    zztVar.zzz(f);
                    zztVar.zzy(i10);
                    zztVar.zzA(this.zzw);
                    zztVar.zzB(this.zzx);
                    zztVar.zzC(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str5 = this.zzb;
                if (str5 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i2);
                if (true != this.zza) {
                    str6 = "video/x-matroska";
                } else {
                    str6 = "video/webm";
                }
                zztVar.zzl(str6);
                zztVar.zzm(str3);
                zztVar.zzn(i3);
                zztVar.zze(this.zzac);
                zztVar.zzf(i11112);
                zztVar.zzp(listZzj);
                zztVar.zzj(str2);
                zztVar.zzq(this.zzl);
                this.zzZ = zztVar.zzM();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i2) {
        this.zzab = i2;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
