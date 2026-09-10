package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6294c;
    public final android.media.MediaCodecInfo.CodecCapabilities d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6295e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6296h;

    public MediaCodecInfo(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.f6292a = str;
        this.f6293b = str2;
        this.f6294c = str3;
        this.d = codecCapabilities;
        this.g = z2;
        this.f6295e = z3;
        this.f = z4;
        this.f6296h = MimeTypes.k(str2);
    }

    public static boolean a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Util.f(i2, widthAlignment) * widthAlignment, Util.f(i3, heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static MediaCodecInfo h(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3) {
        boolean z4;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z4 = false;
        } else {
            if (Util.f5683a <= 22) {
                String str4 = Util.d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (codecCapabilities != null && Util.f5683a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z2, z4, z3 || (codecCapabilities != null && Util.f5683a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final DecoderReuseEvaluation b(Format format, Format format2) {
        Format format3;
        Format format4;
        int i2 = !Util.a(format.m, format2.m) ? 8 : 0;
        if (this.f6296h) {
            if (format.v != format2.v) {
                i2 |= 1024;
            }
            if (!this.f6295e && (format.s != format2.s || format.t != format2.t)) {
                i2 |= 512;
            }
            ColorInfo colorInfo = format.f5417z;
            boolean zE = ColorInfo.e(colorInfo);
            ColorInfo colorInfo2 = format2.f5417z;
            if ((!zE || !ColorInfo.e(colorInfo2)) && !Util.a(colorInfo, colorInfo2)) {
                i2 |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
            }
            if (Util.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f6292a) && !format.b(format2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.f6292a, format, format2, format.b(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.f5400A != format4.f5400A) {
                i2 |= 4096;
            }
            if (format3.f5401B != format4.f5401B) {
                i2 |= Segment.SIZE;
            }
            if (format3.C != format4.C) {
                i2 |= 16384;
            }
            String str = this.f6293b;
            if (i2 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = MediaCodecUtil.d(format3);
                Pair pairD2 = MediaCodecUtil.d(format4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f6292a, format3, format4, 3, 0);
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
                return new DecoderReuseEvaluation(this.f6292a, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f6292a, format3, format4, 0, i2);
    }

    public final boolean c(Format format, boolean z2) {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = MediaCodecUtil.d(format);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(format.m);
            int i2 = 8;
            String str = this.f6293b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f6296h || iIntValue == 42) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                if (Util.f5683a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
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
                            String str2 = Util.f5684b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + format.j + ", " + this.f6294c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(Format format) {
        int i2;
        int i3;
        String str = format.m;
        String str2 = this.f6293b;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.b(format))) || !c(format, true)) {
            return false;
        }
        if (this.f6296h) {
            int i4 = format.s;
            if (i4 > 0 && (i3 = format.t) > 0) {
                if (Util.f5683a >= 21) {
                    return f(i4, i3, format.f5415u);
                }
                boolean z2 = i4 * i3 <= MediaCodecUtil.j();
                if (!z2) {
                    g("legacyFrameSize, " + i4 + "x" + i3);
                }
                return z2;
            }
        } else {
            int i5 = Util.f5683a;
            if (i5 >= 21) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                int i6 = format.f5401B;
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
                int i7 = format.f5400A;
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
                        Log.g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f6292a + ", [" + maxInputChannelCount + " to " + i2 + d9.i.f24752e);
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
        if (this.f6296h) {
            return this.f6295e;
        }
        Pair pairD = MediaCodecUtil.d(format);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i2, int i3, double d) {
        Boolean bool;
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
        int i4 = Util.f5683a;
        if (i4 >= 29) {
            int iA = (i4 < 29 || ((bool = MediaCodecPerformancePointCoverageProvider.f6297a) != null && bool.booleanValue())) ? 0 : MediaCodecPerformancePointCoverageProvider.Api29.a(videoCapabilities, i2, i3, d);
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
                String str = this.f6292a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.f5684b)) && a(videoCapabilities, i3, i2, d)) {
                    StringBuilder sbP2 = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.rotated, ", "x", "@");
                    sbP2.append(d);
                    StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("AssumedSupport [", sbP2.toString(), "] [", str, ", ");
                    sbQ.append(this.f6293b);
                    sbQ.append("] [");
                    sbQ.append(Util.f5686e);
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
        sbY.append(this.f6292a);
        sbY.append(", ");
        sbY.append(this.f6293b);
        sbY.append("] [");
        sbY.append(Util.f5686e);
        sbY.append(d9.i.f24752e);
        Log.b("MediaCodecInfo", sbY.toString());
    }

    public final String toString() {
        return this.f6292a;
    }
}
