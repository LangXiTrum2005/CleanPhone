package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzuj {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public zzuj(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z2;
        this.zze = z5;
        this.zzf = z7;
        this.zzh = z8;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static zzuj zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        boolean z8 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z10 = z6 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z7 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z7 = false;
            } else {
                z7 = true;
            }
        }
        return new zzuj(str, str2, str3, codecCapabilities, z2, z3, z4, z8, z9, z10, z7);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzo) || str.equals(zzvc.zzg(zzvVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[PHI: r5
  0x00b4: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v5 int) binds: [B:42:0x00a5, B:44:0x00ad, B:47:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final boolean zzk(zzv zzvVar, boolean z2) {
        int iIntValue;
        int iIntValue2;
        int i2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        String str;
        int length;
        int i3;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str2;
        int iHashCode;
        int i4 = zzvc.zza;
        Pair pairZzd = zzdo.zzd(zzvVar);
        String str3 = zzvVar.zzo;
        byte b2 = -1;
        if (str3 != null && str3.equals("video/mv-hevc")) {
            String strZzh = zzas.zzh(this.zzc);
            if (!strZzh.equals("video/mv-hevc")) {
                if (strZzh.equals("video/hevc")) {
                    String strZzk = zzgm.zzk(zzvVar.zzr);
                    if (strZzk == null) {
                        pairZzd = null;
                    } else {
                        String strTrim = strZzk.trim();
                        String str4 = zzfj.zza;
                        pairZzd = zzdo.zze(strZzk, strTrim.split("\\.", -1), zzvVar.zzE);
                    }
                }
                if (pairZzd != null) {
                    iIntValue = ((Integer) pairZzd.first).intValue();
                    iIntValue2 = ((Integer) pairZzd.second).intValue();
                    i2 = 8;
                    if ("video/dolby-vision".equals(str3)) {
                        str2 = this.zzb;
                        iHashCode = str2.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    b2 = 0;
                                }
                            } else if (str2.equals("video/hevc")) {
                                b2 = 1;
                            }
                        } else if (str2.equals(MimeTypes.VIDEO_AV1)) {
                            b2 = 2;
                        }
                        if (b2 == 0) {
                            if (b2 != 1) {
                            }
                            iIntValue = 2;
                        } else {
                            iIntValue = 8;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.zzi) {
                        codecProfileLevelArrZzb = zzb();
                        str = this.zzb;
                        if (str.equals("audio/ac4")) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                i2 = 16;
                            }
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvc.zzf(257, i2), zzvc.zzf(513, i2), zzvc.zzf(514, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i2)};
                        }
                        length = codecProfileLevelArrZzb.length;
                        for (i3 = 0; i3 < length; i3++) {
                            codecProfileLevel = codecProfileLevelArrZzb[i3];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        String str5 = zzvVar.zzk;
                        String str6 = this.zzc;
                        zzm(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str6.length() + String.valueOf(str5).length() + 22), "codec.profileLevel, ", str5, ", ", str6));
                        return false;
                    }
                    codecProfileLevelArrZzb = zzb();
                    str = this.zzb;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities = this.zzd;
                        if (codecCapabilities != null) {
                            i2 = 16;
                        }
                        codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvc.zzf(257, i2), zzvc.zzf(513, i2), zzvc.zzf(514, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i2)};
                    }
                    length = codecProfileLevelArrZzb.length;
                    while (i3 < length) {
                        codecProfileLevel = codecProfileLevelArrZzb[i3];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    String str7 = zzvVar.zzk;
                    String str8 = this.zzc;
                    zzm(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str8.length() + String.valueOf(str7).length() + 22), "codec.profileLevel, ", str7, ", ", str8));
                    return false;
                }
            }
        } else if (pairZzd != null) {
            iIntValue = ((Integer) pairZzd.first).intValue();
            iIntValue2 = ((Integer) pairZzd.second).intValue();
            i2 = 8;
            if ("video/dolby-vision".equals(str3)) {
                str2 = this.zzb;
                iHashCode = str2.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str2.equals("video/avc")) {
                            b2 = 0;
                        }
                    } else if (str2.equals("video/hevc")) {
                        b2 = 1;
                    }
                } else if (str2.equals(MimeTypes.VIDEO_AV1)) {
                    b2 = 2;
                }
                if (b2 == 0) {
                    iIntValue = 8;
                } else if (b2 != 1 || b2 == 2) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.zzi || this.zzb.equals("audio/ac4")) {
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i2 = 16;
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvc.zzf(257, i2), zzvc.zzf(513, i2), zzvc.zzf(514, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i2)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i3 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i3];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z2)) {
                        if ("video/hevc".equals(str) && iIntValue == 2) {
                            String str9 = Build.DEVICE;
                            if ("sailfish".equals(str9) || "marlin".equals(str9)) {
                            }
                        }
                    }
                }
                String str10 = zzvVar.zzk;
                String str11 = this.zzc;
                zzm(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str11.length() + String.valueOf(str10).length() + 22), "codec.profileLevel, ", str10, ", ", str11));
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4")) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        i2 = 16;
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvc.zzf(257, i2), zzvc.zzf(513, i2), zzvc.zzf(514, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i2), zzvc.zzf(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i2)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i3 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i3];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                String str12 = zzvVar.zzk;
                String str13 = this.zzc;
                zzm(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(str13.length() + String.valueOf(str12).length() + 22), "codec.profileLevel, ", str12, ", ", str13));
                return false;
            }
        }
        return true;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzo, "audio/flac") && zzvVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfj.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "NoSupport [", str, "] [", str4);
        androidx.media3.extractor.text.ttml.a.C(sb, ", ", str3, "] [", str2);
        sb.append(d9.i.f24752e);
        zzee.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        Point pointZzo = zzo(videoCapabilities, i2, i3);
        int i4 = pointZzo.x;
        int i5 = pointZzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i4, i5);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i4, i5, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i4, i5);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfj.zza;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzv zzvVar) throws zzuu {
        int i2;
        int i3;
        if (!zzj(zzvVar) || !zzk(zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i4 = zzvVar.zzv;
            if (i4 <= 0 || (i3 = zzvVar.zzw) <= 0) {
                return true;
            }
            return zzg(i4, i3, zzvVar.zzz);
        }
        int i5 = zzvVar.zzH;
        if (i5 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i5)) {
                zzm(androidx.datastore.preferences.protobuf.a.g(i5, "sampleRate.support, ", new StringBuilder(String.valueOf(i5).length() + 20)));
                return false;
            }
        }
        int i6 = zzvVar.zzG;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i2 = 6;
                } else {
                    i2 = "audio/eac3".equals(str2) ? 16 : 30;
                }
                StringBuilder sb = new StringBuilder(Z.d(String.valueOf(i2), String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1));
                sb.append("AssumedMaxChannelAdjustment: ");
                sb.append(str);
                sb.append(", [");
                sb.append(maxInputChannelCount);
                sb.append(" to ");
                sb.append(i2);
                sb.append(d9.i.f24752e);
                zzee.zzc("MediaCodecInfo", sb.toString());
                maxInputChannelCount = i2;
            }
            if (maxInputChannelCount < i6) {
                zzm(androidx.datastore.preferences.protobuf.a.g(i6, "channelCount.support, ", new StringBuilder(String.valueOf(i6).length() + 22)));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzv zzvVar) {
        return zzj(zzvVar) && zzk(zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i2 = zzvc.zza;
        Pair pairZzd = zzdo.zzd(zzvVar);
        return pairZzd != null && ((Integer) pairZzd.first).intValue() == 42;
    }

    public final zzil zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i2;
        String str = zzvVar.zzo;
        String str2 = zzvVar2.zzo;
        int i3 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzA != zzvVar2.zzA) {
                i3 |= 1024;
            }
            boolean z2 = (zzvVar.zzv == zzvVar2.zzv && zzvVar.zzw == zzvVar2.zzw) ? false : true;
            if (!this.zze && z2) {
                i3 |= 512;
            }
            zzi zziVar = zzvVar.zzE;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzE)) && !Objects.equals(zziVar, zzvVar2.zzE)) {
                i3 |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i3 |= 2;
            }
            int i4 = zzvVar.zzx;
            if (i4 != -1 && (i2 = zzvVar.zzy) != -1 && i4 == zzvVar2.zzx && i2 == zzvVar2.zzy && z2) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZzd = zzdo.zzd(zzvVar);
                Pair pairZzd2 = zzdo.zzd(zzvVar2);
                if (pairZzd == null || pairZzd2 == null || !((Integer) pairZzd.first).equals(pairZzd2.first)) {
                    i3 = 2;
                }
            }
            if (i3 == 0) {
                return new zzil(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzG != zzvVar4.zzG) {
                i3 |= 4096;
            }
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i3 |= Segment.SIZE;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i3 |= 16384;
            }
            if (i3 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    int i5 = zzvc.zza;
                    Pair pairZzd3 = zzdo.zzd(zzvVar3);
                    Pair pairZzd4 = zzdo.zzd(zzvVar4);
                    if (pairZzd3 != null && pairZzd4 != null) {
                        int iIntValue = ((Integer) pairZzd3.first).intValue();
                        int iIntValue2 = ((Integer) pairZzd4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zzil(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZzd3.equals(pairZzd4)) {
                            return new zzil(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i3 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzil(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new zzil(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzil(this.zza, zzvVar3, zzvVar4, 0, i3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    public final boolean zzg(int i2, int i3, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzul.zza(videoCapabilities, i2, i3, d);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb = new StringBuilder(Z.d(String.valueOf(i3), String.valueOf(i2).length() + 20, 1) + String.valueOf(d).length());
                    androidx.datastore.preferences.protobuf.a.z(sb, "sizeAndRate.cover, ", i2, "x", i3);
                    sb.append("@");
                    sb.append(d);
                    zzm(sb.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i2, i3, d)) {
                    if (i2 < i3) {
                        str = this.zza;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + Z.a(i2, 22) + 1 + String.valueOf(d).length());
                            androidx.datastore.preferences.protobuf.a.z(sb2, "sizeAndRate.rotated, ", i2, "x", i3);
                            sb2.append("@");
                            sb2.append(d);
                            String string = sb2.toString();
                            String str2 = this.zzb;
                            int length = str.length();
                            String str3 = zzfj.zza;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            androidx.media3.extractor.text.ttml.a.C(sb3, ", ", str2, "] [", str3);
                            sb3.append(d9.i.f24752e);
                            zzee.zza("MediaCodecInfo", sb3.toString());
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i3).length() + Z.a(i2, 22) + 1 + String.valueOf(d).length());
                            androidx.datastore.preferences.protobuf.a.z(sb4, "sizeAndRate.rotated, ", i2, "x", i3);
                            sb4.append("@");
                            sb4.append(d);
                            String string2 = sb4.toString();
                            String str4 = this.zzb;
                            int length3 = str.length();
                            String str5 = zzfj.zza;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb5.append("AssumedSupport [");
                            sb5.append(string2);
                            sb5.append("] [");
                            sb5.append(str);
                            androidx.media3.extractor.text.ttml.a.C(sb5, ", ", str4, "] [", str5);
                            sb5.append(d9.i.f24752e);
                            zzee.zza("MediaCodecInfo", sb5.toString());
                        }
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i3).length() + Z.a(i2, 22) + 1 + String.valueOf(d).length());
                    androidx.datastore.preferences.protobuf.a.z(sb6, "sizeAndRate.support, ", i2, "x", i3);
                    sb6.append("@");
                    sb6.append(d);
                    zzm(sb6.toString());
                    return false;
                }
            }
        } else if (!zzn(videoCapabilities, i2, i3, d)) {
            if (i2 < i3) {
                str = this.zza;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i3, i2, d)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i3).length() + Z.a(i2, 22) + 1 + String.valueOf(d).length());
                    androidx.datastore.preferences.protobuf.a.z(sb7, "sizeAndRate.rotated, ", i2, "x", i3);
                    sb7.append("@");
                    sb7.append(d);
                    String string3 = sb7.toString();
                    String str6 = this.zzb;
                    int length5 = str.length();
                    String str7 = zzfj.zza;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    androidx.media3.extractor.text.ttml.a.C(sb8, ", ", str6, "] [", str7);
                    sb8.append(d9.i.f24752e);
                    zzee.zza("MediaCodecInfo", sb8.toString());
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i3).length() + Z.a(i2, 22) + 1 + String.valueOf(d).length());
            androidx.datastore.preferences.protobuf.a.z(sb9, "sizeAndRate.support, ", i2, "x", i3);
            sb9.append("@");
            sb9.append(d);
            zzm(sb9.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i2, int i3) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i2 && this.zzk == i3) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i2, i3, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zZzg = zzg(i2, i3, f5);
                if (true == zZzg) {
                    f3 = f5;
                }
                if (true != zZzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i2;
        this.zzk = i3;
        return f2;
    }

    public final Point zzi(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i2, i3);
    }
}
