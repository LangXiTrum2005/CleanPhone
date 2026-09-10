package com.smartdigimkt.d4;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.p004ironsource.d9;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34430h = "MediaCodecInfo";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f34431i = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f34434c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34435e;
    public final boolean f;
    public final boolean g;

    private a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z4) {
        this.f34432a = (String) com.smartdigimkt.p4.a.a(str);
        this.f34433b = str2;
        this.f34434c = codecCapabilities;
        this.g = z2;
        boolean z5 = false;
        this.d = (z3 || codecCapabilities == null || !b(codecCapabilities)) ? false : true;
        this.f34435e = codecCapabilities != null && f(codecCapabilities);
        if (z4 || (codecCapabilities != null && d(codecCapabilities))) {
            z5 = true;
        }
        this.f = z5;
    }

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return new a(str, str2, codecCapabilities, false, false, false);
    }

    private void c(String str) {
        StringBuilder sbY = android.support.v4.media.a.y("NoSupport [", str, "] [");
        sbY.append(this.f34432a);
        sbY.append(", ");
        sbY.append(this.f34433b);
        sbY.append("] [");
        sbY.append(f0.f37543e);
        sbY.append(d9.i.f24752e);
        Log.d("MediaCodecInfo", sbY.toString());
    }

    public static a d(String str) {
        return new a(str, null, null, true, false, false);
    }

    private static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return f0.f37540a >= 21 && g(codecCapabilities);
    }

    private static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public MediaCodecInfo.CodecProfileLevel[] b() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34434c;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public static a a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3) {
        return new a(str, str2, codecCapabilities, false, z2, z3);
    }

    private static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return f0.f37540a >= 21 && e(codecCapabilities);
    }

    public boolean b(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34434c;
        if (codecCapabilities == null) {
            c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        c(android.support.v4.media.a.h(i2, "sampleRate.support, "));
        return false;
    }

    public int a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (f0.f37540a < 23 || (codecCapabilities = this.f34434c) == null) {
            return -1;
        }
        return a(codecCapabilities);
    }

    public boolean a(String str) {
        String strD;
        if (str == null || this.f34433b == null || (strD = o.d(str)) == null) {
            return true;
        }
        if (!this.f34433b.equals(strD)) {
            c(android.support.v4.media.a.o("codec.mime ", str, ", ", strD));
            return false;
        }
        Pair<Integer, Integer> pairB = d.b(str);
        if (pairB == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : b()) {
            if (codecProfileLevel.profile == ((Integer) pairB.first).intValue() && codecProfileLevel.level >= ((Integer) pairB.second).intValue()) {
                return true;
            }
        }
        c(android.support.v4.media.a.o("codec.profileLevel, ", str, ", ", strD));
        return false;
    }

    private static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private void b(String str) {
        StringBuilder sbY = android.support.v4.media.a.y("AssumedSupport [", str, "] [");
        sbY.append(this.f34432a);
        sbY.append(", ");
        sbY.append(this.f34433b);
        sbY.append("] [");
        sbY.append(f0.f37543e);
        sbY.append(d9.i.f24752e);
        Log.d("MediaCodecInfo", sbY.toString());
    }

    private static boolean b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return f0.f37540a >= 19 && c(codecCapabilities);
    }

    public boolean a(int i2, int i3, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34434c;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i2, i3, d)) {
            return true;
        }
        if (i2 < i3 && a(videoCapabilities, i3, i2, d)) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.rotated, ", "x", "x");
            sbP.append(d);
            b(sbP.toString());
            return true;
        }
        StringBuilder sbP2 = androidx.datastore.preferences.protobuf.a.p(i2, i3, "sizeAndRate.support, ", "x", "x");
        sbP2.append(d);
        c(sbP2.toString());
        return false;
    }

    public Point a(int i2, int i3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34434c;
        if (codecCapabilities == null) {
            c("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(f0.a(i2, widthAlignment) * widthAlignment, f0.a(i3, heightAlignment) * heightAlignment);
    }

    public boolean a(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f34434c;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        if (a(this.f34432a, this.f34433b, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        c(android.support.v4.media.a.h(i2, "channelCount.support, "));
        return false;
    }

    private static int a(String str, String str2, int i2) {
        int i3;
        if (i2 > 1 || ((f0.f37540a >= 26 && i2 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i2;
        }
        if ("audio/ac3".equals(str2)) {
            i3 = 6;
        } else {
            i3 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        StringBuilder sbZ = android.support.v4.media.a.z("AssumedMaxChannelAdjustment: ", str, ", [", i2, " to ");
        sbZ.append(i3);
        sbZ.append(d9.i.f24752e);
        Log.w("MediaCodecInfo", sbZ.toString());
        return i3;
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        if (d != -1.0d && d > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i2, i3, d);
        }
        return videoCapabilities.isSizeSupported(i2, i3);
    }

    private static int a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }
}
