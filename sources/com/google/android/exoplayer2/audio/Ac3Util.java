package com.google.android.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.v0.p;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac3Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17271a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17272b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17273c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17274e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, p.e.f39014a, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, com.smartdigimkt.b0.a.W0, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }
    }

    public static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = f17272b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = f17274e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }
}
