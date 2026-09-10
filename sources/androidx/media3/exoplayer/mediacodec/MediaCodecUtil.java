package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.applovin.shadow.okio.Segment;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f6305a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f6306b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6307c = -1;

    public static final class CodecKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6310c;

        public CodecKey(String str, boolean z2, boolean z3) {
            this.f6308a = str;
            this.f6309b = z2;
            this.f6310c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.f6308a, codecKey.f6308a) && this.f6309b == codecKey.f6309b && this.f6310c == codecKey.f6310c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((androidx.datastore.preferences.protobuf.a.b(this.f6308a, 31, 31) + (this.f6309b ? 1231 : 1237)) * 31) + (this.f6310c ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
    }

    public interface MediaCodecListCompat {
        boolean a(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i2);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean a(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean b(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return false;
        }
    }

    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public android.media.MediaCodecInfo[] f6312b;

        public MediaCodecListCompatV21(boolean z2, boolean z3) {
            this.f6311a = (z2 || z3) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean a(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean b(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final int getCodecCount() {
            if (this.f6312b == null) {
                this.f6312b = new MediaCodecList(this.f6311a).getCodecInfos();
            }
            return this.f6312b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final android.media.MediaCodecInfo getCodecInfoAt(int i2) {
            if (this.f6312b == null) {
                this.f6312b = new MediaCodecList(this.f6311a).getCodecInfos();
            }
            return this.f6312b[i2];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public final boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        int a(Object obj);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Util.f5683a < 26 && Util.f5684b.equals("R9") && arrayList.size() == 1 && ((MediaCodecInfo) arrayList.get(0)).f6292a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(MediaCodecInfo.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new f(new d(0)));
        }
        int i2 = Util.f5683a;
        if (i2 < 21 && arrayList.size() > 1) {
            String str2 = ((MediaCodecInfo) arrayList.get(0)).f6292a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new f(new d(1)));
            }
        }
        if (i2 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) arrayList.get(0)).f6292a)) {
            return;
        }
        arrayList.add((MediaCodecInfo) arrayList.remove(0));
    }

    public static String b(Format format) {
        Pair pairD;
        if ("audio/eac3-joc".equals(format.m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.m) || (pairD = d(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return MimeTypes.VIDEO_AV1;
        }
        return null;
    }

    public static String c(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:301:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    public static Pair d(Format format) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer numValueOf;
        int i9;
        int i10;
        Integer num;
        Integer numValueOf2;
        Pattern pattern = f6305a;
        byte b2 = 11;
        int i11 = 2;
        String str = format.j;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(format.m);
        String str2 = format.j;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                androidx.datastore.preferences.protobuf.a.D("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                androidx.datastore.preferences.protobuf.a.D("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = 128;
                        break;
                    case "08":
                        num = 256;
                        break;
                    case "09":
                        num = 512;
                        break;
                    case "10":
                        num = 1024;
                        break;
                    default:
                        num = null;
                        break;
                }
            } else {
                num = null;
            }
            if (num == null) {
                androidx.datastore.preferences.protobuf.a.D("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case 1537:
                        b2 = !str3.equals("01") ? (byte) -1 : (byte) 0;
                        break;
                    case 1538:
                        b2 = !str3.equals("02") ? (byte) -1 : (byte) 1;
                        break;
                    case 1539:
                        b2 = !str3.equals("03") ? (byte) -1 : (byte) 2;
                        break;
                    case 1540:
                        b2 = !str3.equals("04") ? (byte) -1 : (byte) 3;
                        break;
                    case 1541:
                        b2 = !str3.equals("05") ? (byte) -1 : (byte) 4;
                        break;
                    case 1542:
                        b2 = !str3.equals("06") ? (byte) -1 : (byte) 5;
                        break;
                    case 1543:
                        b2 = !str3.equals("07") ? (byte) -1 : (byte) 6;
                        break;
                    case 1544:
                        b2 = !str3.equals("08") ? (byte) -1 : (byte) 7;
                        break;
                    case 1545:
                        b2 = !str3.equals("09") ? (byte) -1 : (byte) 8;
                        break;
                    case 1567:
                        b2 = !str3.equals("10") ? (byte) -1 : (byte) 9;
                        break;
                    case 1568:
                        b2 = !str3.equals("11") ? (byte) -1 : (byte) 10;
                        break;
                    case 1569:
                        if (!str3.equals("12")) {
                            b2 = -1;
                        }
                        break;
                    case 1570:
                        b2 = !str3.equals("13") ? (byte) -1 : (byte) 12;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    case 0:
                        numValueOf2 = 1;
                        break;
                    case 1:
                        numValueOf2 = 2;
                        break;
                    case 2:
                        numValueOf2 = 4;
                        break;
                    case 3:
                        numValueOf2 = 8;
                        break;
                    case 4:
                        numValueOf2 = 16;
                        break;
                    case 5:
                        numValueOf2 = 32;
                        break;
                    case 6:
                        numValueOf2 = 64;
                        break;
                    case 7:
                        numValueOf2 = 128;
                        break;
                    case 8:
                        numValueOf2 = 256;
                        break;
                    case 9:
                        numValueOf2 = 512;
                        break;
                    case 10:
                        numValueOf2 = 1024;
                        break;
                    case 11:
                        numValueOf2 = Integer.valueOf(com.p004ironsource.mediationsdk.metadata.a.f25965n);
                        break;
                    case 12:
                        numValueOf2 = 4096;
                        break;
                    default:
                        numValueOf2 = null;
                        break;
                }
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                return new Pair(num, numValueOf2);
            }
            androidx.datastore.preferences.protobuf.a.D("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                if (strArrSplit.length < 4) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i12 = Integer.parseInt(strArrSplit[1]);
                    int i13 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i14 = Integer.parseInt(strArrSplit[3]);
                    if (i12 != 0) {
                        androidx.datastore.preferences.protobuf.a.C(i12, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    int i15 = 8;
                    if (i14 != 8 && i14 != 10) {
                        androidx.datastore.preferences.protobuf.a.C(i14, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i14 == 8) {
                        i2 = 1;
                    } else {
                        ColorInfo colorInfo = format.f5417z;
                        i2 = (colorInfo == null || !(colorInfo.d != null || (i3 = colorInfo.f5385c) == 7 || i3 == 6)) ? 2 : 4096;
                    }
                    switch (i13) {
                        case 0:
                            i15 = 1;
                            break;
                        case 1:
                            i15 = 2;
                            break;
                        case 2:
                            i15 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i15 = 16;
                            break;
                        case 5:
                            i15 = 32;
                            break;
                        case 6:
                            i15 = 64;
                            break;
                        case 7:
                            i15 = 128;
                            break;
                        case 8:
                            i15 = 256;
                            break;
                        case 9:
                            i15 = 512;
                            break;
                        case 10:
                            i15 = 1024;
                            break;
                        case 11:
                            i15 = 2048;
                            break;
                        case 12:
                            i15 = 4096;
                            break;
                        case 13:
                            i15 = 8192;
                            break;
                        case 14:
                            i15 = 16384;
                            break;
                        case 15:
                            i15 = 32768;
                            break;
                        case 16:
                            i15 = 65536;
                            break;
                        case 17:
                            i15 = 131072;
                            break;
                        case 18:
                            i15 = 262144;
                            break;
                        case 19:
                            i15 = 524288;
                            break;
                        case 20:
                            i15 = 1048576;
                            break;
                        case 21:
                            i15 = 2097152;
                            break;
                        case 22:
                            i15 = 4194304;
                            break;
                        case 23:
                            i15 = 8388608;
                            break;
                        default:
                            i15 = -1;
                            break;
                    }
                    if (i15 != -1) {
                        return new Pair(Integer.valueOf(i2), Integer.valueOf(i15));
                    }
                    androidx.datastore.preferences.protobuf.a.C(i13, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i4 = 16;
                        i5 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i6 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i4 = 16;
                        if (strArrSplit.length < 3) {
                            Log.g("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i5 = Integer.parseInt(strArrSplit[1]);
                        i6 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i5 == 66) {
                        i11 = 1;
                    } else if (i5 != 77) {
                        if (i5 == 88) {
                            i11 = 4;
                        } else if (i5 == 100) {
                            i11 = 8;
                        } else if (i5 == 110) {
                            i11 = i4;
                        } else if (i5 != 122) {
                            i11 = i5 != 244 ? -1 : 64;
                        } else {
                            i11 = 32;
                        }
                    }
                    if (i11 == -1) {
                        androidx.datastore.preferences.protobuf.a.C(i5, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i6) {
                        case 10:
                            i7 = 1;
                            break;
                        case 11:
                            i7 = 4;
                            break;
                        case 12:
                            i7 = 8;
                            break;
                        case 13:
                            i7 = i4;
                            break;
                        default:
                            switch (i6) {
                                case 20:
                                    i7 = 32;
                                    break;
                                case 21:
                                    i7 = 64;
                                    break;
                                case 22:
                                    i7 = 128;
                                    break;
                                default:
                                    switch (i6) {
                                        case 30:
                                            i7 = 256;
                                            break;
                                        case 31:
                                            i7 = 512;
                                            break;
                                        case 32:
                                            i7 = 1024;
                                            break;
                                        default:
                                            switch (i6) {
                                                case 40:
                                                    i7 = 2048;
                                                    break;
                                                case 41:
                                                    i7 = 4096;
                                                    break;
                                                case 42:
                                                    i7 = 8192;
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 50:
                                                            i7 = 16384;
                                                            break;
                                                        case AD_REWARD_USER_VALUE:
                                                            i7 = 32768;
                                                            break;
                                                        case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                                            i7 = 65536;
                                                            break;
                                                        default:
                                                            i7 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i7 != -1) {
                        return new Pair(Integer.valueOf(i11), Integer.valueOf(i7));
                    }
                    androidx.datastore.preferences.protobuf.a.C(i6, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i8 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        androidx.datastore.preferences.protobuf.a.D("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        return null;
                    }
                    ColorInfo colorInfo2 = format.f5417z;
                    i8 = (colorInfo2 == null || colorInfo2.f5385c != 6) ? 2 : 4096;
                }
                String str5 = strArrSplit[3];
                if (str5 != null) {
                    switch (str5) {
                        case "H30":
                            numValueOf = 2;
                            break;
                        case "H60":
                            numValueOf = 8;
                            break;
                        case "H63":
                            numValueOf = 32;
                            break;
                        case "H90":
                            numValueOf = 128;
                            break;
                        case "H93":
                            numValueOf = 512;
                            break;
                        case "L30":
                            numValueOf = 1;
                            break;
                        case "L60":
                            numValueOf = 4;
                            break;
                        case "L63":
                            numValueOf = 16;
                            break;
                        case "L90":
                            numValueOf = 64;
                            break;
                        case "L93":
                            numValueOf = 256;
                            break;
                        case "H120":
                            numValueOf = Integer.valueOf(com.p004ironsource.mediationsdk.metadata.a.f25965n);
                            break;
                        case "H123":
                            numValueOf = Integer.valueOf(Segment.SIZE);
                            break;
                        case "H150":
                            numValueOf = 32768;
                            break;
                        case "H153":
                            numValueOf = 131072;
                            break;
                        case "H156":
                            numValueOf = 524288;
                            break;
                        case "H180":
                            numValueOf = 2097152;
                            break;
                        case "H183":
                            numValueOf = 8388608;
                            break;
                        case "H186":
                            numValueOf = 33554432;
                            break;
                        case "L120":
                            numValueOf = 1024;
                            break;
                        case "L123":
                            numValueOf = 4096;
                            break;
                        case "L150":
                            numValueOf = 16384;
                            break;
                        case "L153":
                            numValueOf = 65536;
                            break;
                        case "L156":
                            numValueOf = 262144;
                            break;
                        case "L180":
                            numValueOf = 1048576;
                            break;
                        case "L183":
                            numValueOf = 4194304;
                            break;
                        case "L186":
                            numValueOf = 16777216;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new Pair(Integer.valueOf(i8), numValueOf);
                }
                androidx.datastore.preferences.protobuf.a.D("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(androidx.media3.common.MimeTypes.d(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i16 = Integer.parseInt(strArrSplit[2]);
                        int i17 = 17;
                        if (i16 != 17) {
                            if (i16 != 20) {
                                i17 = 23;
                                if (i16 != 23) {
                                    i17 = 29;
                                    if (i16 != 29) {
                                        i17 = 39;
                                        if (i16 != 39) {
                                            i17 = 42;
                                            if (i16 != 42) {
                                                switch (i16) {
                                                    case 1:
                                                        i17 = 1;
                                                        break;
                                                    case 2:
                                                        i17 = 2;
                                                        break;
                                                    case 3:
                                                        i17 = 3;
                                                        break;
                                                    case 4:
                                                        i17 = 4;
                                                        break;
                                                    case 5:
                                                        i17 = 5;
                                                        break;
                                                    case 6:
                                                        i17 = 6;
                                                        break;
                                                    default:
                                                        i17 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i17 = 20;
                            }
                        }
                        if (i17 != -1) {
                            return new Pair(Integer.valueOf(i17), 0);
                        }
                    }
                } catch (NumberFormatException unused3) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                }
                return null;
            case "vp09":
                if (strArrSplit.length < 3) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i18 = Integer.parseInt(strArrSplit[1]);
                    int i19 = Integer.parseInt(strArrSplit[2]);
                    if (i18 == 0) {
                        i9 = 1;
                    } else if (i18 == 1) {
                        i9 = 2;
                    } else if (i18 != 2) {
                        i9 = i18 != 3 ? -1 : 8;
                    } else {
                        i9 = 4;
                    }
                    if (i9 == -1) {
                        androidx.datastore.preferences.protobuf.a.C(i18, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i19 == 10) {
                        i10 = 1;
                    } else if (i19 == 11) {
                        i10 = 2;
                    } else if (i19 == 20) {
                        i10 = 4;
                    } else if (i19 == 21) {
                        i10 = 8;
                    } else if (i19 == 30) {
                        i10 = 16;
                    } else if (i19 == 31) {
                        i10 = 32;
                    } else if (i19 == 40) {
                        i10 = 64;
                    } else if (i19 == 41) {
                        i10 = 128;
                    } else if (i19 == 50) {
                        i10 = 256;
                    } else if (i19 != 51) {
                        switch (i19) {
                            case 60:
                                i10 = 2048;
                                break;
                            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                i10 = 4096;
                                break;
                            case 62:
                                i10 = 8192;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 512;
                    }
                    if (i10 != -1) {
                        return new Pair(Integer.valueOf(i9), Integer.valueOf(i10));
                    }
                    androidx.datastore.preferences.protobuf.a.C(i19, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    androidx.datastore.preferences.protobuf.a.D("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List e(String str, boolean z2, boolean z3) {
        try {
            CodecKey codecKey = new CodecKey(str, z2, z3);
            HashMap map = f6306b;
            List list = (List) map.get(codecKey);
            if (list != null) {
                return list;
            }
            int i2 = Util.f5683a;
            ArrayList arrayListF = f(codecKey, i2 >= 21 ? new MediaCodecListCompatV21(z2, z3) : new MediaCodecListCompatV16());
            if (z2 && arrayListF.isEmpty() && 21 <= i2 && i2 <= 23) {
                arrayListF = f(codecKey, new MediaCodecListCompatV16());
                if (!arrayListF.isEmpty()) {
                    Log.g("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((MediaCodecInfo) arrayListF.get(0)).f6292a);
                }
            }
            a(str, arrayListF);
            ImmutableList immutableListU = ImmutableList.u(arrayListF);
            map.put(codecKey, immutableListU);
            return immutableListU;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList f(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        String strC;
        String str;
        String str2;
        MediaCodecListCompat mediaCodecListCompat2 = mediaCodecListCompat;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = codecKey.f6308a;
            int codecCount = mediaCodecListCompat2.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat2.secureDecodersExplicit();
            int i2 = 0;
            while (i2 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat2.getCodecInfoAt(i2);
                int i3 = Util.f5683a;
                if (i3 < 29 || !codecInfoAt.isAlias()) {
                    String name = codecInfoAt.getName();
                    if (h(codecInfoAt, name, zSecureDecodersExplicit, str3) && (strC = c(codecInfoAt, name, str3)) != null) {
                        try {
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(strC);
                            boolean zA = mediaCodecListCompat2.a("tunneled-playback", strC, capabilitiesForType);
                            boolean zB = mediaCodecListCompat2.b("tunneled-playback", capabilitiesForType);
                            boolean z2 = codecKey.f6310c;
                            if ((z2 || !zB) && (!z2 || zA)) {
                                boolean zA2 = mediaCodecListCompat2.a("secure-playback", strC, capabilitiesForType);
                                boolean zB2 = mediaCodecListCompat2.b("secure-playback", capabilitiesForType);
                                boolean z3 = codecKey.f6309b;
                                if ((z3 || !zB2) && (!z3 || zA2)) {
                                    boolean zIsHardwareAccelerated = i3 >= 29 ? codecInfoAt.isHardwareAccelerated() : !i(codecInfoAt, str3);
                                    i(codecInfoAt, str3);
                                    if (i3 >= 29) {
                                        codecInfoAt.isVendor();
                                    } else {
                                        String strB = Ascii.b(codecInfoAt.getName());
                                        if (!strB.startsWith("omx.google.") && !strB.startsWith("c2.android.")) {
                                            strB.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zSecureDecodersExplicit && z3 == zA2) && (zSecureDecodersExplicit || z3)) {
                                        str2 = name;
                                        boolean z4 = zIsHardwareAccelerated;
                                        if (!zSecureDecodersExplicit && zA2) {
                                            str = strC;
                                            try {
                                                arrayList.add(MediaCodecInfo.h(str2 + ".secure", str3, str, capabilitiesForType, z4, true));
                                                break;
                                            } catch (Exception e2) {
                                                e = e2;
                                                if (Util.f5683a <= 23 || arrayList.isEmpty()) {
                                                    Log.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                Log.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i2++;
                                                mediaCodecListCompat2 = mediaCodecListCompat;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            str2 = name;
                                            try {
                                                arrayList.add(MediaCodecInfo.h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false));
                                            } catch (Exception e3) {
                                                e = e3;
                                                str = str;
                                                if (Util.f5683a <= 23) {
                                                }
                                                Log.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i2++;
                mediaCodecListCompat2 = mediaCodecListCompat;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new DecoderQueryException("Failed to query underlying media codecs", e6);
        }
    }

    public static List g(d dVar, Format format, boolean z2, boolean z3) {
        String str = format.m;
        dVar.getClass();
        List listE = e(str, z2, z3);
        String strB = b(format);
        List listX = strB == null ? ImmutableList.x() : e(strB, z2, z3);
        ImmutableList.Builder builderS = ImmutableList.s();
        builderS.f(listE);
        builderS.f(listX);
        return builderS.j();
    }

    public static boolean h(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(".secure")) {
            return false;
        }
        int i2 = Util.f5683a;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.f5685c))) {
            String str3 = Util.f5684b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i2 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.f5685c)) {
            String str4 = Util.f5684b;
            if (str4.startsWith(com.smartdigimkt.b0.a.S) || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i2 == 19 && Util.f5684b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i2 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.f5683a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (androidx.media3.common.MimeTypes.h(str)) {
            return true;
        }
        String strB = Ascii.b(mediaCodecInfo.getName());
        if (strB.startsWith("arc.")) {
            return false;
        }
        if (strB.startsWith("omx.google.") || strB.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strB.startsWith("omx.sec.") && strB.contains(".sw.")) || strB.equals("omx.qcom.video.decoder.hevcswvdec") || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
            return true;
        }
        return (strB.startsWith("omx.") || strB.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (f6307c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            MediaCodecInfo mediaCodecInfo = listE.isEmpty() ? null : (MediaCodecInfo) listE.get(0);
            if (mediaCodecInfo != null) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i3 = codecProfileLevelArr[iMax].level;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case com.p004ironsource.mediationsdk.metadata.a.f25965n /* 2048 */:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case Segment.SIZE /* 8192 */:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.f5683a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f6307c = iMax;
        }
        return f6307c;
    }
}
