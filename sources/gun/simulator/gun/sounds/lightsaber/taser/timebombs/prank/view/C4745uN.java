package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4745uN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5075a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public C4745uN(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f5075a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = AbstractC5011xP.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(Ug0.g(i, widthAlignment) * widthAlignment, Ug0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static C4745uN h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        if (codecCapabilities != null && (i = Ug0.f3833a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                String str4 = Ug0.d;
                z5 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        if (codecCapabilities != null && Ug0.f3833a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new C4745uN(str, str2, str3, codecCapabilities, z, z5, z4 || (codecCapabilities != null && Ug0.f3833a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final C2729Rl b(C4619sw c4619sw, C4619sw c4619sw2) {
        int i = !Ug0.a(c4619sw.l, c4619sw2.l) ? 8 : 0;
        if (this.h) {
            if (c4619sw.t != c4619sw2.t) {
                i |= 1024;
            }
            if (!this.e && (c4619sw.q != c4619sw2.q || c4619sw.r != c4619sw2.r)) {
                i |= 512;
            }
            if (!Ug0.a(c4619sw.x, c4619sw2.x)) {
                i |= 2048;
            }
            if (Ug0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f5075a) && !c4619sw.c(c4619sw2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C2729Rl(this.f5075a, c4619sw, c4619sw2, c4619sw.c(c4619sw2) ? 3 : 2, 0);
            }
        } else {
            if (c4619sw.y != c4619sw2.y) {
                i |= 4096;
            }
            if (c4619sw.z != c4619sw2.z) {
                i |= 8192;
            }
            if (c4619sw.A != c4619sw2.A) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(str)) {
                Pair pairD = GN.d(c4619sw);
                Pair pairD2 = GN.d(c4619sw2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C2729Rl(this.f5075a, c4619sw, c4619sw2, 3, 0);
                    }
                }
            }
            if (!c4619sw.c(c4619sw2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C2729Rl(this.f5075a, c4619sw, c4619sw2, 1, 0);
            }
        }
        return new C2729Rl(this.f5075a, c4619sw, c4619sw2, 0, i);
    }

    public final boolean c(C4619sw c4619sw, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = GN.d(c4619sw);
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c4619sw.l);
        int i = 8;
        String str = this.b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (Ug0.f3833a <= 23 && MimeTypes.VIDEO_VP9.equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = Ug0.b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c4619sw.i + ", " + this.c);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x012b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0141, please report this as an issue */
    public final boolean d(C4619sw c4619sw) {
        int i;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i2;
        String str = c4619sw.l;
        String str2 = this.b;
        boolean z = true;
        if (!(str2.equals(str) || str2.equals(GN.b(c4619sw))) || !c(c4619sw, true)) {
            return false;
        }
        if (this.h) {
            int i3 = c4619sw.q;
            if (i3 > 0 && (i2 = c4619sw.r) > 0) {
                if (Ug0.f3833a >= 21) {
                    return f(i3, i2, c4619sw.s);
                }
                z = i3 * i2 <= GN.i();
                if (!z) {
                    g("legacyFrameSize, " + i3 + "x" + i2);
                }
            }
            return z;
        }
        int i4 = Ug0.f3833a;
        if (i4 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i5 = c4619sw.z;
        if (i5 == -1) {
            i = c4619sw.y;
            if (i != -1) {
                return true;
            }
            if (codecCapabilities == null) {
                g("channelCount.caps");
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("channelCount.aCaps");
                } else {
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
                        if (MimeTypes.AUDIO_AC3.equals(str2)) {
                            maxInputChannelCount = 6;
                        } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                            maxInputChannelCount = 16;
                        } else {
                            maxInputChannelCount = 30;
                        }
                        AbstractC4038mJ.f();
                    }
                    if (maxInputChannelCount < i) {
                        return true;
                    }
                    g("channelCount.support, " + i);
                }
            }
        } else if (codecCapabilities == null) {
            g("sampleRate.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("sampleRate.aCaps");
            } else if (audioCapabilities2.isSampleRateSupported(i5)) {
                i = c4619sw.y;
                if (i != -1) {
                    return true;
                }
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                } else {
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("channelCount.aCaps");
                    } else {
                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1) {
                            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                                maxInputChannelCount = 6;
                            } else if (MimeTypes.AUDIO_E_AC3.equals(str2)) {
                                maxInputChannelCount = 16;
                            } else {
                                maxInputChannelCount = 30;
                            }
                            AbstractC4038mJ.f();
                        }
                        if (maxInputChannelCount < i) {
                            return true;
                        }
                        g("channelCount.support, " + i);
                    }
                }
            } else {
                g("sampleRate.support, " + i5);
            }
        }
        return false;
    }

    public final boolean e(C4619sw c4619sw) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = GN.d(c4619sw);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (Ug0.f3833a >= 29) {
            int iA = AbstractC4657tN.a(videoCapabilities, i, i2, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbT = AbstractC3950lJ.t("sizeAndRate.cover, ", i, "x", i2, "@");
                sbT.append(d);
                g(sbT.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f5075a) && "mcv5a".equals(Ug0.b)) || !a(videoCapabilities, i2, i, d))) {
                StringBuilder sbT2 = AbstractC3950lJ.t("sizeAndRate.support, ", i, "x", i2, "@");
                sbT2.append(d);
                g(sbT2.toString());
                return false;
            }
            AbstractC3950lJ.t("sizeAndRate.rotated, ", i, "x", i2, "@").append(d);
            int i3 = Ug0.f3833a;
            AbstractC4038mJ.b();
        }
        return true;
    }

    public final void g(String str) {
        int i = Ug0.f3833a;
        AbstractC4038mJ.b();
    }

    public final String toString() {
        return this.f5075a;
    }
}
