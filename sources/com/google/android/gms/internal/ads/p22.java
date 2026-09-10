package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f18455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18462k;
    public float l;

    public p22(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.f18452a = str;
        this.f18453b = str2;
        this.f18454c = str3;
        this.f18455d = codecCapabilities;
        this.f18458g = z10;
        this.f18456e = z11;
        this.f18457f = z12;
        this.f18459h = z13;
        this.f18460i = na.a(str2);
        this.l = -3.4028235E38f;
        this.f18461j = -1;
        this.f18462k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    public static p22 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z14 = z11 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z12 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        return new p22(str, str2, str3, codecCapabilities, z10, z13, z14, z12);
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointJ = j(videoCapabilities, i10, i11);
        int i12 = pointJ.x;
        int i13 = pointJ.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = uu0.f20901a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(Context context, g22 g22Var) {
        int i10;
        int i11;
        String str = g22Var.f14678o;
        String str2 = this.f18453b;
        if ((!str2.equals(str) && !str2.equals(z22.d(g22Var))) || !f(context, g22Var, true) || !g(g22Var)) {
            return false;
        }
        if (this.f18460i) {
            int i12 = g22Var.f14685v;
            if (i12 > 0 && (i11 = g22Var.f14686w) > 0) {
                return e(i12, i11, g22Var.f14689z);
            }
        } else {
            int i13 = g22Var.I;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18455d;
            if (i13 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i13)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 20);
                    sb2.append("sampleRate.support, ");
                    sb2.append(i13);
                    h(sb2.toString());
                    return false;
                }
            }
            int i14 = g22Var.G;
            if (i14 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2)) {
                    if (MimeTypes.AUDIO_AC3.equals(str2)) {
                        i10 = 6;
                    } else {
                        i10 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                    }
                    String str3 = this.f18452a;
                    StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.i(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i10)));
                    sb3.append("AssumedMaxChannelAdjustment: ");
                    sb3.append(str3);
                    sb3.append(", [");
                    sb3.append(maxInputChannelCount);
                    sb3.append(" to ");
                    sb3.append(i10);
                    sb3.append(X3.j.f27836e);
                    v71.y(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb3.toString());
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i14).length() + 22);
                    sb4.append("channelCount.support, ");
                    sb4.append(i14);
                    h(sb4.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(g22 g22Var) {
        boolean z10;
        if (this.f18460i) {
            return this.f18456e;
        }
        he0 he0VarC = re0.c(g22Var);
        if (he0VarC == null || !(z10 = he0VarC.f15268b)) {
            return false;
        }
        ps1.c0(z10);
        return he0VarC.f15267a == 42;
    }

    public final yx1 d(g22 g22Var, g22 g22Var2) {
        g22 g22Var3;
        g22 g22Var4;
        int i10;
        String str = g22Var.f14678o;
        String str2 = g22Var2.f14678o;
        lq1 lq1Var = g22Var2.E;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.f18460i) {
            if (g22Var.A != g22Var2.A) {
                i11 |= 1024;
            }
            boolean z10 = (g22Var.f14685v == g22Var2.f14685v && g22Var.f14686w == g22Var2.f14686w) ? false : true;
            if (!this.f18456e && z10) {
                i11 |= 512;
            }
            lq1 lq1Var2 = g22Var.E;
            if ((!lq1.a(lq1Var2) || !lq1.a(lq1Var)) && !Objects.equals(lq1Var2, lq1Var)) {
                i11 |= com.ironsource.mediationsdk.metadata.a.f29616n;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f18452a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !g22Var.b(g22Var2)) {
                i11 |= 2;
            }
            int i12 = g22Var.f14687x;
            if (i12 != -1 && (i10 = g22Var.f14688y) != -1 && i12 == g22Var2.f14687x && i10 == g22Var2.f14688y && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairB = re0.b(g22Var);
                Pair pairB2 = re0.b(g22Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new yx1(str3, g22Var, g22Var2, true == g22Var.b(g22Var2) ? 3 : 2, 0);
            }
            g22Var3 = g22Var;
            g22Var4 = g22Var2;
        } else {
            g22Var3 = g22Var;
            g22Var4 = g22Var2;
            if (g22Var3.G != g22Var4.G) {
                i11 |= 4096;
            }
            if (g22Var3.I != g22Var4.I) {
                i11 |= Segment.SIZE;
            }
            if (g22Var3.J != g22Var4.J) {
                i11 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str4 = this.f18453b;
            if (i11 == 0 && (str4.equals(MimeTypes.AUDIO_AAC) || str4.equals("audio/ac4"))) {
                Pair pairB3 = re0.b(g22Var3);
                Pair pairB4 = re0.b(g22Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new yx1(this.f18452a, g22Var3, g22Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new yx1(this.f18452a, g22Var3, g22Var4, 3, 0);
                    }
                }
            }
            if (i11 == 0 && (str4.equals(MimeTypes.AUDIO_E_AC3_JOC) || str4.equals(MimeTypes.AUDIO_E_AC3))) {
                return new yx1(this.f18452a, g22Var3, g22Var4, 3, 0);
            }
            if (!g22Var3.b(g22Var4)) {
                i11 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str4)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new yx1(this.f18452a, g22Var3, g22Var4, 1, 0);
            }
        }
        return new yx1(this.f18452a, g22Var3, g22Var4, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    public final boolean e(int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        char c4;
        boolean z10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18455d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i12 = Build.VERSION.SDK_INT;
        Boolean bool = zw1.f22739c;
        if ((bool != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty()) {
            c4 = 0;
        } else {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            int i13 = 0;
            while (true) {
                if (i13 >= supportedPerformancePoints.size()) {
                    c4 = 1;
                    break;
                }
                if (supportedPerformancePoints.get(i13).covers(performancePoint)) {
                    c4 = 2;
                    break;
                }
                i13++;
            }
            if (c4 == 1 && zw1.f22739c == null) {
                if (i12 >= 37) {
                    z10 = false;
                } else {
                    int iG = jd1.g(true);
                    if (i12 < 35 ? jd1.g(false) != 2 || iG == 1 : iG == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zw1.f22739c = Boolean.valueOf(z10);
                if (z10) {
                    c4 = 0;
                }
            }
        }
        if (c4 != 2) {
            if (c4 == 1) {
                StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(String.valueOf(i10).length() + 20, 1, String.valueOf(i11)) + String.valueOf(d10).length());
                l1.d.p(sb2, "sizeAndRate.cover, ", i10, "x", i11);
                sb2.append("@");
                sb2.append(d10);
                h(sb2.toString());
                return false;
            }
            if (!i(videoCapabilities, i10, i11, d10)) {
                if (i10 < i11) {
                    String str = this.f18452a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && i(videoCapabilities, i11, i10, d10)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + com.applovin.impl.ca.e(i10, 22) + 1 + String.valueOf(d10).length());
                        l1.d.p(sb3, "sizeAndRate.rotated, ", i10, "x", i11);
                        sb3.append("@");
                        sb3.append(d10);
                        String string = sb3.toString();
                        int length = str.length();
                        String str2 = uu0.f20901a;
                        String str3 = this.f18453b;
                        StringBuilder sb4 = new StringBuilder(string.length() + 19 + length + 2 + String.valueOf(str3).length() + 3 + String.valueOf(str2).length() + 1);
                        sb4.append("AssumedSupport [");
                        sb4.append(string);
                        sb4.append("] [");
                        sb4.append(str);
                        d5.u.r(sb4, ", ", str3, "] [", str2);
                        sb4.append(X3.j.f27836e);
                        v71.l(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb4.toString());
                        return true;
                    }
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(i11).length() + com.applovin.impl.ca.e(i10, 22) + 1 + String.valueOf(d10).length());
                l1.d.p(sb5, "sizeAndRate.support, ", i10, "x", i11);
                sb5.append("@");
                sb5.append(d10);
                h(sb5.toString());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final boolean f(Context context, g22 g22Var, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        boolean zEquals;
        String str;
        int i12;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i13;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int iHashCode;
        he0 he0VarC = re0.c(g22Var);
        String str2 = g22Var.f14678o;
        String str3 = this.f18454c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strG = na.g(str3);
            if (!strG.equals("video/mv-hevc")) {
                if (strG.equals("video/hevc")) {
                    HashMap map = z22.f22480a;
                    String strM = dv.M(g22Var.f14681r);
                    if (strM == null) {
                        he0VarC = null;
                    } else {
                        String strTrim = strM.trim();
                        String str4 = uu0.f20901a;
                        he0VarC = re0.d(strM, strTrim.split("\\.", -1), g22Var.E);
                    }
                }
                if (he0VarC != null) {
                    z11 = he0VarC.f15268b;
                    if (!z11) {
                        return false;
                    }
                    ps1.c0(z11);
                    i10 = he0VarC.f15267a;
                    ps1.c0(z11);
                    i11 = he0VarC.f15269c;
                    zEquals = "video/dolby-vision".equals(str2);
                    str = this.f18453b;
                    i12 = 8;
                    if (zEquals) {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    i11 = 0;
                                    i10 = 8;
                                }
                            } else if (str.equals("video/hevc")) {
                                i11 = 0;
                                i10 = 2;
                            }
                        } else if (str.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1)) {
                            i11 = 0;
                            i10 = 2;
                        }
                    }
                    if (this.f18460i) {
                        codecCapabilities = this.f18455d;
                        if (codecCapabilities != null) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                        }
                        if (str.equals("audio/ac4")) {
                            if (codecCapabilities != null) {
                                i12 = 16;
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12)};
                            } else {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(257, i12), z22.c(513, i12), z22.c(514, i12), z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12), z22.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i12)};
                            }
                        }
                        length = codecProfileLevelArr.length;
                        for (i13 = 0; i13 < length; i13++) {
                            codecProfileLevel = codecProfileLevelArr[i13];
                            if (codecProfileLevel.profile != i10) {
                            }
                        }
                        String str5 = g22Var.f14675k;
                        h(d5.u.h(new StringBuilder(str3.length() + String.valueOf(str5).length() + 22), "codec.profileLevel, ", str5, ", ", str3));
                        return false;
                    }
                    codecCapabilities = this.f18455d;
                    if (codecCapabilities != null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str.equals("audio/ac4")) {
                        if (codecCapabilities != null) {
                            i12 = 16;
                        }
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12)};
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(257, i12), z22.c(513, i12), z22.c(514, i12), z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12), z22.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i12)};
                        }
                    }
                    length = codecProfileLevelArr.length;
                    while (i13 < length) {
                        codecProfileLevel = codecProfileLevelArr[i13];
                        if (codecProfileLevel.profile != i10) {
                        }
                    }
                    String str6 = g22Var.f14675k;
                    h(d5.u.h(new StringBuilder(str3.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str3));
                    return false;
                }
            }
        } else if (he0VarC != null) {
            z11 = he0VarC.f15268b;
            if (!z11) {
                return false;
            }
            ps1.c0(z11);
            i10 = he0VarC.f15267a;
            ps1.c0(z11);
            i11 = he0VarC.f15269c;
            zEquals = "video/dolby-vision".equals(str2);
            str = this.f18453b;
            i12 = 8;
            if (zEquals) {
                iHashCode = str.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str.equals("video/avc")) {
                            i11 = 0;
                            i10 = 8;
                        }
                    } else if (str.equals("video/hevc")) {
                        i11 = 0;
                        i10 = 2;
                    }
                } else if (str.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1)) {
                    i11 = 0;
                    i10 = 2;
                }
            }
            if (this.f18460i || str.equals("audio/ac4") || i10 == 42) {
                codecCapabilities = this.f18455d;
                if (codecCapabilities != null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (str.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i12 = 16;
                    }
                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{z22.c(257, i12), z22.c(513, i12), z22.c(514, i12), z22.c(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i12), z22.c(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i12)};
                    }
                }
                length = codecProfileLevelArr.length;
                while (i13 < length) {
                    codecProfileLevel = codecProfileLevelArr[i13];
                    if (codecProfileLevel.profile != i10 && (codecProfileLevel.level >= i11 || !z10)) {
                        if ("video/hevc".equals(str) && i10 == 2) {
                            String str7 = Build.DEVICE;
                            if ("sailfish".equals(str7) || "marlin".equals(str7)) {
                            }
                        }
                    }
                }
                String str8 = g22Var.f14675k;
                h(d5.u.h(new StringBuilder(str3.length() + String.valueOf(str8).length() + 22), "codec.profileLevel, ", str8, ", ", str3));
                return false;
            }
        }
        return true;
    }

    public final boolean g(g22 g22Var) {
        return (Objects.equals(g22Var.f14678o, MimeTypes.AUDIO_FLAC) && g22Var.J == 22 && Build.VERSION.SDK_INT < 34 && this.f18452a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = uu0.f20901a;
        String str3 = this.f18453b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f18452a;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        d5.u.r(sb2, "NoSupport [", str, "] [", str4);
        d5.u.r(sb2, ", ", str3, "] [", str2);
        sb2.append(X3.j.f27836e);
        v71.l(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb2.toString());
    }

    public final String toString() {
        return this.f18452a;
    }
}
