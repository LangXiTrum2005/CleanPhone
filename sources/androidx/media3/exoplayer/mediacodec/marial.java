package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.polloi;
import androidx.media3.common.rotuma;
import androidx.media3.exoplayer.arytenoidectomy;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import decarock.triweekly;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f12079attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f12080beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f12081competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final boolean f12082cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f12083dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f12084impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f12085marial;
    public final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f12086saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final boolean f12087taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f12088wireman;

    public marial(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.name = (String) decarock.attabal.marial(str);
        this.f12079attabal = str2;
        this.f12086saneness = str3;
        this.f12083dern = codecCapabilities;
        this.f12081competently = z;
        this.f12084impromptu = z2;
        this.f12087taiyuan = z3;
        this.f12088wireman = z4;
        this.f12085marial = z5;
        this.f12080beachfront = z6;
        this.f12082cutely = rotuma.apical(str2);
    }

    public static int attabal(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((grimness.f25080attabal >= 26 && i > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        triweekly.impromptu(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + X3.j.e);
        return i2;
    }

    public static MediaCodecInfo.CodecProfileLevel[] beachfront(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean cord(String str) {
        if (grimness.f25080attabal > 22) {
            return false;
        }
        String str2 = grimness.f25094wireman;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    public static boolean cuirassed(String str, int i) {
        if (!"video/hevc".equals(str) || 2 != i) {
            return false;
        }
        String str2 = grimness.f25091saneness;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    public static Point dern(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(grimness.cutely(i, widthAlignment) * widthAlignment, grimness.cutely(i2, heightAlignment) * heightAlignment);
    }

    public static boolean graveside(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean impromptu(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean molybdenite(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return grimness.f25080attabal >= 21 && graveside(codecCapabilities);
    }

    public static boolean monoploid(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return grimness.f25080attabal >= 21 && polloi(codecCapabilities);
    }

    public static boolean polloi(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean preprohormone(String str) {
        return grimness.f25094wireman.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean rotuma(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    public static boolean stratoscope(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(grimness.f25091saneness)) ? false : true;
    }

    public static marial trm(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new marial(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !impromptu(codecCapabilities) || cord(str)) ? false : true, codecCapabilities != null && molybdenite(codecCapabilities), z5 || (codecCapabilities != null && monoploid(codecCapabilities)));
    }

    public static boolean wireman(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointDern = dern(videoCapabilities, i, i2);
        int i3 = pointDern.x;
        int i4 = pointDern.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public boolean adultoid(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12083dern;
        if (codecCapabilities == null) {
            gintrap("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            gintrap("sizeAndRate.vCaps");
            return false;
        }
        if (grimness.f25080attabal >= 29) {
            int iDern = beachfront.dern(videoCapabilities, i, i2, d);
            if (iDern == 2) {
                return true;
            }
            if (iDern == 1) {
                gintrap("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!wireman(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !stratoscope(this.name) || !wireman(videoCapabilities, i2, i, d)) {
                gintrap("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            dovishness("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    public final boolean apical(polloi polloiVar, boolean z) {
        Pair<Integer, Integer> pairPolloi = MediaCodecUtil.polloi(polloiVar);
        if (pairPolloi == null) {
            return true;
        }
        int iIntValue = ((Integer) pairPolloi.first).intValue();
        int iIntValue2 = ((Integer) pairPolloi.second).intValue();
        if ("video/dolby-vision".equals(polloiVar.f11218triweekly)) {
            if (!"video/avc".equals(this.f12079attabal)) {
                iIntValue = "video/hevc".equals(this.f12079attabal) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f12082cutely && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrCompetently = competently();
        if (grimness.f25080attabal <= 23 && MimeTypes.VIDEO_VP9.equals(this.f12079attabal) && codecProfileLevelArrCompetently.length == 0) {
            codecProfileLevelArrCompetently = beachfront(this.f12083dern);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrCompetently) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !cuirassed(this.f12079attabal, iIntValue))) {
                return true;
            }
        }
        gintrap("codec.profileLevel, " + polloiVar.f11192cutely + ", " + this.f12086saneness);
        return false;
    }

    public boolean arytenoidectomy(polloi polloiVar) {
        if (this.f12082cutely) {
            return this.f12088wireman;
        }
        Pair<Integer, Integer> pairPolloi = MediaCodecUtil.polloi(polloiVar);
        return pairPolloi != null && ((Integer) pairPolloi.first).intValue() == 42;
    }

    public MediaCodecInfo.CodecProfileLevel[] competently() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12083dern;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean cutely(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12083dern;
        if (codecCapabilities == null) {
            gintrap("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            gintrap("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        gintrap("sampleRate.support, " + i);
        return false;
    }

    public final void dovishness(String str) {
        triweekly.saneness(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.f12079attabal + "] [" + grimness.f25089marial + X3.j.e);
    }

    public boolean formularize(polloi polloiVar) {
        return kowloon(polloiVar) && apical(polloiVar, false);
    }

    public final void gintrap(String str) {
        triweekly.saneness(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.f12079attabal + "] [" + grimness.f25089marial + X3.j.e);
    }

    public boolean impassible(polloi polloiVar) throws MediaCodecUtil.DecoderQueryException {
        int i;
        int i2;
        int i3;
        if (!kowloon(polloiVar) || !apical(polloiVar, true)) {
            return false;
        }
        if (!this.f12082cutely) {
            return grimness.f25080attabal < 21 || (((i = polloiVar.f11219trm) == -1 || cutely(i)) && ((i2 = polloiVar.f11215stratoscope) == -1 || taiyuan(i2)));
        }
        int i4 = polloiVar.f11197graveside;
        if (i4 <= 0 || (i3 = polloiVar.f11184adultoid) <= 0) {
            return true;
        }
        if (grimness.f25080attabal >= 21) {
            return adultoid(i4, i3, polloiVar.f11194dovishness);
        }
        boolean z = i4 * i3 <= MediaCodecUtil.seminary();
        if (!z) {
            gintrap("legacyFrameSize, " + polloiVar.f11197graveside + "x" + polloiVar.f11184adultoid);
        }
        return z;
    }

    public final boolean kowloon(polloi polloiVar) {
        return this.f12079attabal.equals(polloiVar.f11218triweekly) || this.f12079attabal.equals(MediaCodecUtil.impassible(polloiVar));
    }

    public arytenoidectomy marial(polloi polloiVar, polloi polloiVar2) {
        polloi polloiVar3;
        polloi polloiVar4;
        int i = !grimness.dern(polloiVar.f11218triweekly, polloiVar2.f11218triweekly) ? 8 : 0;
        if (this.f12082cutely) {
            if (polloiVar.f11196gintrap != polloiVar2.f11196gintrap) {
                i |= 1024;
            }
            if (!this.f12088wireman && (polloiVar.f11197graveside != polloiVar2.f11197graveside || polloiVar.f11184adultoid != polloiVar2.f11184adultoid)) {
                i |= 512;
            }
            if ((!androidx.media3.common.impromptu.taiyuan(polloiVar.f11191cuirassed) || !androidx.media3.common.impromptu.taiyuan(polloiVar2.f11191cuirassed)) && !grimness.dern(polloiVar.f11191cuirassed, polloiVar2.f11191cuirassed)) {
                i |= 2048;
            }
            if (preprohormone(this.name) && !polloiVar.competently(polloiVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new arytenoidectomy(this.name, polloiVar, polloiVar2, polloiVar.competently(polloiVar2) ? 3 : 2, 0);
            }
            polloiVar3 = polloiVar;
            polloiVar4 = polloiVar2;
        } else {
            polloiVar3 = polloiVar;
            polloiVar4 = polloiVar2;
            if (polloiVar3.f11215stratoscope != polloiVar4.f11215stratoscope) {
                i |= 4096;
            }
            if (polloiVar3.f11219trm != polloiVar4.f11219trm) {
                i |= 8192;
            }
            if (polloiVar3.f11206oilcan != polloiVar4.f11206oilcan) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.f12079attabal)) {
                Pair<Integer, Integer> pairPolloi = MediaCodecUtil.polloi(polloiVar3);
                Pair<Integer, Integer> pairPolloi2 = MediaCodecUtil.polloi(polloiVar4);
                if (pairPolloi != null && pairPolloi2 != null) {
                    int iIntValue = ((Integer) pairPolloi.first).intValue();
                    int iIntValue2 = ((Integer) pairPolloi2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new arytenoidectomy(this.name, polloiVar3, polloiVar4, 3, 0);
                    }
                }
            }
            if (!polloiVar3.competently(polloiVar4)) {
                i |= 32;
            }
            if (rotuma(this.f12079attabal)) {
                i |= 2;
            }
            if (i == 0) {
                return new arytenoidectomy(this.name, polloiVar3, polloiVar4, 1, 0);
            }
        }
        return new arytenoidectomy(this.name, polloiVar3, polloiVar4, 0, i);
    }

    public Point saneness(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12083dern;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return dern(videoCapabilities, i, i2);
    }

    public boolean taiyuan(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12083dern;
        if (codecCapabilities == null) {
            gintrap("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            gintrap("channelCount.aCaps");
            return false;
        }
        if (attabal(this.name, this.f12079attabal, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        gintrap("channelCount.support, " + i);
        return false;
    }

    public String toString() {
        return this.name;
    }

    public boolean triweekly() {
        if (grimness.f25080attabal >= 29 && MimeTypes.VIDEO_VP9.equals(this.f12079attabal)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : competently()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }
}
