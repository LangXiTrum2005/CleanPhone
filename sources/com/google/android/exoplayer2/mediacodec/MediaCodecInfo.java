package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.d9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaCodecInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18172c;
    public final android.media.MediaCodecInfo.CodecCapabilities d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18173e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18174h;

    public static final class Api29 {
        public static int a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                String str = Util.f18980b;
                if (!str.equals("sabrina") && !str.equals("boreal")) {
                    String str2 = Util.d;
                    if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                        androidx.core.view.accessibility.b.i();
                        android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointE = androidx.core.view.accessibility.b.e(i2, i3, (int) d);
                        for (int i4 = 0; i4 < supportedPerformancePoints.size(); i4++) {
                            if (androidx.core.view.accessibility.b.f(supportedPerformancePoints.get(i4)).covers(performancePointE)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        }
    }

    public MediaCodecInfo(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.f18170a = str;
        this.f18171b = str2;
        this.f18172c = str3;
        this.d = codecCapabilities;
        this.g = z2;
        this.f18173e = z3;
        this.f = z4;
        this.f18174h = "video".equals(MimeTypes.e(str2));
    }

    public static boolean a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Util.g(i2, widthAlignment) * widthAlignment, Util.g(i3, heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static MediaCodecInfo h(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        if (codecCapabilities == null || (i2 = Util.f18979a) < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z4 = false;
        } else {
            if (i2 <= 22) {
                String str4 = Util.d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (codecCapabilities != null && Util.f18979a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z2, z4, z3 || (codecCapabilities != null && Util.f18979a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final DecoderReuseEvaluation b(Format format, Format format2) {
        Format format3;
        Format format4;
        int i2 = !Util.a(format.m0, format2.m0) ? 8 : 0;
        if (this.f18174h) {
            if (format.u0 != format2.u0) {
                i2 |= 1024;
            }
            if (!this.f18173e && (format.r0 != format2.r0 || format.s0 != format2.s0)) {
                i2 |= 512;
            }
            if (!Util.a(format.y0, format2.y0)) {
                i2 |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
            }
            if (Util.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f18170a) && !format.b(format2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.f18170a, format, format2, format.b(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.z0 != format4.z0) {
                i2 |= 4096;
            }
            if (format3.A0 != format4.A0) {
                i2 |= Segment.SIZE;
            }
            if (format3.B0 != format4.B0) {
                i2 |= 16384;
            }
            String str = this.f18171b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = MediaCodecUtil.d(format3);
                Pair pairD2 = MediaCodecUtil.d(format4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f18170a, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.b(format4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.f18170a, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f18170a, format3, format4, 0, i2);
    }

    public final boolean c(Format format, boolean z2) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = MediaCodecUtil.d(format);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(format.m0);
            int i2 = 8;
            String str = this.f18171b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f18174h || iIntValue == 42) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                if (Util.f18979a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i2 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i2 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i2 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i2 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i2 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i2 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i2 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i2 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i2;
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z2)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = Util.f18980b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + format.j0 + ", " + this.f18172c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(Format format) {
        int i2;
        int i3;
        String str = format.m0;
        String str2 = this.f18171b;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.b(format))) || !c(format, true)) {
            return false;
        }
        if (this.f18174h) {
            int i4 = format.r0;
            if (i4 > 0 && (i3 = format.s0) > 0) {
                if (Util.f18979a >= 21) {
                    return f(i4, i3, format.t0);
                }
                boolean z2 = i4 * i3 <= MediaCodecUtil.i();
                if (!z2) {
                    g("legacyFrameSize, " + i4 + "x" + i3);
                }
                return z2;
            }
        } else {
            int i5 = Util.f18979a;
            if (i5 >= 21) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                int i6 = format.A0;
                if (i6 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i6)) {
                        g("sampleRate.support, " + i6);
                        return false;
                    }
                }
                int i7 = format.z0;
                if (i7 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i2 = 6;
                        } else {
                            i2 = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        Log.g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f18170a + ", [" + maxInputChannelCount + " to " + i2 + d9.i.f24752e);
                        maxInputChannelCount = i2;
                    }
                    if (maxInputChannelCount < i7) {
                        g("channelCount.support, " + i7);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean e(Format format) {
        if (this.f18174h) {
            return this.f18173e;
        }
        Pair pairD = MediaCodecUtil.d(format);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i2, int i3, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (Util.f18979a >= 29) {
            int iA = Api29.a(videoCapabilities, i2, i3, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.cover, ", "x", "@");
                sbP.append(d);
                g(sbP.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i2, i3, d)) {
            if (i2 < i3) {
                String str = this.f18170a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.f18980b)) && a(videoCapabilities, i3, i2, d)) {
                    StringBuilder sbP2 = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.rotated, ", "x", "@");
                    sbP2.append(d);
                    StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                    sbQ.append(this.f18171b);
                    sbQ.append("] [");
                    sbQ.append(Util.f18982e);
                    sbQ.append(d9.i.f24752e);
                    Log.b("MediaCodecInfo", sbQ.toString());
                }
            }
            StringBuilder sbP3 = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.support, ", "x", "@");
            sbP3.append(d);
            g(sbP3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbY = android.support.v4.media.a.y("NoSupport [", str, "] [");
        sbY.append(this.f18170a);
        sbY.append(", ");
        sbY.append(this.f18171b);
        sbY.append("] [");
        sbY.append(Util.f18982e);
        sbY.append(d9.i.f24752e);
        Log.b("MediaCodecInfo", sbY.toString());
    }

    public final String toString() {
        return this.f18170a;
    }
}
