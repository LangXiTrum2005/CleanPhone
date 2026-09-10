package y1;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.xd1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l1.y;
import oa.e0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f54130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f54132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f54134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f54135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54137k;
    public float l;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f54127a = str;
        this.f54128b = str2;
        this.f54129c = str3;
        this.f54130d = codecCapabilities;
        this.f54133g = z10;
        this.f54131e = z13;
        this.f54132f = z14;
        this.f54134h = z15;
        this.f54135i = d0.m(str2);
        this.l = -3.4028235E38f;
        this.f54136j = -1;
        this.f54137k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(y.g(i10, widthAlignment) * widthAlignment, y.g(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
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

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    public static m i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z16 = z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z14 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        return new m(str, str2, str3, codecCapabilities, z10, z11, z12, z15, z16, z14);
    }

    public final p1.c b(i1.p pVar, i1.p pVar2) {
        i1.p pVar3;
        i1.p pVar4;
        int i10;
        String str = pVar.f42643n;
        i1.h hVar = pVar.D;
        String str2 = pVar2.f42643n;
        i1.h hVar2 = pVar2.D;
        int i11 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f54135i) {
            if (pVar.f42655z != pVar2.f42655z) {
                i11 |= 1024;
            }
            boolean z10 = (pVar.f42650u == pVar2.f42650u && pVar.f42651v == pVar2.f42651v) ? false : true;
            if (!this.f54131e && z10) {
                i11 |= 512;
            }
            if ((!i1.h.e(hVar) || !i1.h.e(hVar2)) && !Objects.equals(hVar, hVar2)) {
                i11 |= com.ironsource.mediationsdk.metadata.a.f29616n;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f54127a) && !pVar.b(pVar2)) {
                i11 |= 2;
            }
            int i12 = pVar.f42652w;
            if (i12 != -1 && (i10 = pVar.f42653x) != -1 && i12 == pVar2.f42652w && i10 == pVar2.f42653x && z10) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(pVar2.f42643n, "video/dolby-vision")) {
                Pair pairC = l1.c.c(pVar);
                Pair pairC2 = l1.c.c(pVar2);
                if (pairC == null || pairC2 == null || !((Integer) pairC.first).equals(pairC2.first)) {
                    i11 |= 2;
                }
            }
            if (i11 == 0) {
                return new p1.c(this.f54127a, pVar, pVar2, pVar.b(pVar2) ? 3 : 2, 0);
            }
            pVar3 = pVar;
            pVar4 = pVar2;
        } else {
            pVar3 = pVar;
            pVar4 = pVar2;
            if (pVar3.F != pVar4.F) {
                i11 |= 4096;
            }
            if (pVar3.G != pVar4.G) {
                i11 |= Segment.SIZE;
            }
            if (pVar3.H != pVar4.H) {
                i11 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str3 = this.f54128b;
            if (i11 == 0 && (str3.equals(MimeTypes.AUDIO_AAC) || str3.equals("audio/ac4"))) {
                Pair pairC3 = l1.c.c(pVar3);
                Pair pairC4 = l1.c.c(pVar4);
                if (pairC3 != null && pairC4 != null) {
                    int iIntValue = ((Integer) pairC3.first).intValue();
                    int iIntValue2 = ((Integer) pairC4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new p1.c(this.f54127a, pVar3, pVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairC3.equals(pairC4)) {
                        return new p1.c(this.f54127a, pVar3, pVar4, 3, 0);
                    }
                }
            }
            if (i11 == 0 && (str3.equals(MimeTypes.AUDIO_E_AC3_JOC) || str3.equals(MimeTypes.AUDIO_E_AC3))) {
                return new p1.c(this.f54127a, pVar3, pVar4, 3, 0);
            }
            if (!pVar3.b(pVar4)) {
                i11 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str3)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new p1.c(this.f54127a, pVar3, pVar4, 1, 0);
            }
        }
        return new p1.c(this.f54127a, pVar3, pVar4, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[PHI: r2
  0x00c0: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x000e, B:5:0x0016, B:10:0x002a, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c(Context context, i1.p pVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String strB;
        Pair pairC = l1.c.c(pVar);
        String str = pVar.f42643n;
        String str2 = this.f54129c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strN = d0.n(str2);
            if (strN.equals("video/mv-hevc")) {
                return true;
            }
            if (strN.equals("video/hevc")) {
                HashMap map = u.f54183a;
                List list = pVar.f42646q;
                int i10 = 0;
                loop0: while (true) {
                    if (i10 >= list.size()) {
                        pair = null;
                        strB = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i10);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        e0 e0VarU = j0.u();
                        int i11 = 0;
                        while (i11 < bArr.length) {
                            int iB = m1.n.b(bArr, i11, bArr.length, zArr);
                            if (iB != bArr.length) {
                                e0VarU.b(Integer.valueOf(iB));
                            }
                            i11 = iB + 3;
                        }
                        n1 n1VarG = e0VarU.g();
                        for (int i12 = 0; i12 < n1VarG.f47283d; i12++) {
                            if (((Integer) n1VarG.get(i12)).intValue() + 3 < length) {
                                xd1 xd1Var = new xd1(bArr, ((Integer) n1VarG.get(i12)).intValue() + 3, length);
                                t0 t0VarF = m1.n.f(xd1Var);
                                if (t0VarF.f20103a == 33 && t0VarF.f20104b == 0) {
                                    xd1Var.t(4);
                                    int i13 = xd1Var.i(3);
                                    xd1Var.s();
                                    pair = null;
                                    m1.h hVarG = m1.n.g(xd1Var, true, i13, null);
                                    strB = l1.c.b(hVarG.f45784a, hVarG.f45785b, hVarG.f45786c, hVarG.f45787d, hVarG.f45788e, hVarG.f45789f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i10++;
                }
                if (strB == null) {
                    pairC = pair;
                } else {
                    String strTrim = strB.trim();
                    String str3 = y.f44830a;
                    pairC = l1.c.d(strB, strTrim.split("\\.", -1), pVar.D);
                }
            }
        }
        if (pairC == null) {
            return true;
        }
        int iIntValue = ((Integer) pairC.first).intValue();
        int iIntValue2 = ((Integer) pairC.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.f54128b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f54135i && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f54130d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            int i14 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
            codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{u.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i14)} : new MediaCodecInfo.CodecProfileLevel[]{u.b(257, i14), u.b(513, i14), u.b(514, i14), u.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i14), u.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i14)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z10)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + pVar.f42641k + ", " + str2);
        return false;
    }

    public final boolean d(i1.p pVar) {
        return (Objects.equals(pVar.f42643n, MimeTypes.AUDIO_FLAC) && pVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.f54127a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, i1.p pVar) {
        int i10;
        int i11;
        String str = pVar.f42643n;
        String str2 = this.f54128b;
        if ((!str2.equals(str) && !str2.equals(u.c(pVar))) || !c(context, pVar, true) || !d(pVar)) {
            return false;
        }
        if (this.f54135i) {
            int i12 = pVar.f42650u;
            if (i12 > 0 && (i11 = pVar.f42651v) > 0) {
                return g(i12, i11, pVar.f42654y);
            }
        } else {
            int i13 = pVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f54130d;
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
                    h("sampleRate.support, " + i13);
                    return false;
                }
            }
            int i14 = pVar.F;
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
                    l1.a.s(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + this.f54127a + ", [" + maxInputChannelCount + " to " + i10 + X3.j.f27836e);
                    maxInputChannelCount = i10;
                }
                if (maxInputChannelCount < i14) {
                    h("channelCount.support, " + i14);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(i1.p pVar) {
        if (this.f54135i) {
            return this.f54131e;
        }
        Pair pairC = l1.c.c(pVar);
        return pairC != null && ((Integer) pairC.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public final boolean g(int i10, int i11, double d10) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        char c4;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f54130d;
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
        Boolean bool = go.c.f42028b;
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
            if (c4 == 1 && go.c.f42028b == null) {
                int i14 = i12 >= 35 ? 2 : d0.c.i(false);
                int i15 = d0.c.i(true);
                boolean z10 = i14 == 0 || (i15 != 0 ? !(i14 == 2 && i15 == 2) : i14 != 2);
                go.c.f42028b = Boolean.valueOf(z10);
                if (z10) {
                    c4 = 0;
                }
            }
        }
        if (c4 != 2) {
            if (c4 == 1) {
                StringBuilder sbL = l1.d.l("sizeAndRate.cover, ", i10, "x", i11, "@");
                sbL.append(d10);
                h(sbL.toString());
                return false;
            }
            if (!a(videoCapabilities, i10, i11, d10)) {
                if (i10 < i11) {
                    String str = this.f54127a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d10)) {
                        StringBuilder sbL2 = l1.d.l("sizeAndRate.rotated, ", i10, "x", i11, "@");
                        sbL2.append(d10);
                        StringBuilder sbV = defpackage.e.v("AssumedSupport [", sbL2.toString(), "] [", str, ", ");
                        sbV.append(this.f54128b);
                        sbV.append("] [");
                        sbV.append(y.f44830a);
                        sbV.append(X3.j.f27836e);
                        l1.a.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbV.toString());
                        return true;
                    }
                }
                StringBuilder sbL3 = l1.d.l("sizeAndRate.support, ", i10, "x", i11, "@");
                sbL3.append(d10);
                h(sbL3.toString());
                return false;
            }
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbK = d5.u.k("NoSupport [", str, "] [");
        sbK.append(this.f54127a);
        sbK.append(", ");
        sbK.append(this.f54128b);
        sbK.append("] [");
        sbK.append(y.f44830a);
        sbK.append(X3.j.f27836e);
        l1.a.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbK.toString());
    }

    public final String toString() {
        return this.f54127a;
    }
}
