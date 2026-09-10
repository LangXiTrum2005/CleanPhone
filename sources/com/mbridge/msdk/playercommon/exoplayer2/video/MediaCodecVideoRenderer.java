package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderCounters;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecSelector;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil;
import com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaFormatUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsAutoFrcWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private Surface dummySurface;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastInputTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private float pendingPixelWidthHeightRatio;
    private int pendingRotationDegrees;
    private boolean renderedFirstFrame;
    private int reportedHeight;
    private float reportedPixelWidthHeightRatio;
    private int reportedUnappliedRotationDegrees;
    private int reportedWidth;
    private int scalingMode;
    private Surface surface;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i10, int i11, int i12) {
            this.width = i10;
            this.height = i11;
            this.inputSize = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @TargetApi(23)
    public final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener {
        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(@NonNull MediaCodec mediaCodec, long j10, long j11) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener) {
                return;
            }
            mediaCodecVideoRenderer.maybeNotifyRenderedFirstFrame();
        }

        private OnFrameRenderedListenerV23(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private static boolean areAdaptationCompatible(boolean z10, Format format, Format format2) {
        if (format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees) {
            return (z10 || (format.width == format2.width && format.height == format2.height)) && Util.areEqual(format.colorInfo, format2.colorInfo);
        }
        return false;
    }

    private void clearRenderedFirstFrame() {
        MediaCodec codec;
        this.renderedFirstFrame = false;
        if (Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
    }

    private void clearReportedVideoSize() {
        this.reportedWidth = -1;
        this.reportedHeight = -1;
        this.reportedPixelWidthHeightRatio = -1.0f;
        this.reportedUnappliedRotationDegrees = -1;
    }

    @TargetApi(21)
    private static void configureTunnelingV21(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean deviceNeedsAutoFrcWorkaround() {
        return Util.SDK_INT <= 22 && "foster".equals(Util.DEVICE) && "NVIDIA".equals(Util.MANUFACTURER);
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10 = format.height;
        int i11 = format.width;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i15, i13);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, format.frameRate)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                int iCeilDivide = Util.ceilDivide(i13, 16) * 16;
                int iCeilDivide2 = Util.ceilDivide(i14, 16) * 16;
                if (iCeilDivide * iCeilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                    int i16 = z10 ? iCeilDivide2 : iCeilDivide;
                    if (!z10) {
                        iCeilDivide = iCeilDivide2;
                    }
                    return new Point(i16, iCeilDivide);
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += format.initializationData.get(i10).length;
        }
        return format.maxInputSize + length;
    }

    private static boolean isBufferLate(long j10) {
        return j10 < -30000;
    }

    private static boolean isBufferVeryLate(long j10) {
        return j10 < -500000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyVideoSizeChanged() {
        int i10 = this.currentWidth;
        if (i10 == -1 && this.currentHeight == -1) {
            return;
        }
        if (this.reportedWidth == i10 && this.reportedHeight == this.currentHeight && this.reportedUnappliedRotationDegrees == this.currentUnappliedRotationDegrees && this.reportedPixelWidthHeightRatio == this.currentPixelWidthHeightRatio) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i10, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
        this.reportedWidth = this.currentWidth;
        this.reportedHeight = this.currentHeight;
        this.reportedUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
        this.reportedPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        int i10 = this.reportedWidth;
        if (i10 == -1 && this.reportedHeight == -1) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i10, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    @TargetApi(23)
    private static void setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private void setSurface(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.dummySurface;
            if (surface2 != null) {
                surface = surface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUseDummySurface(codecInfo)) {
                    surface = DummySurface.newInstanceV17(this.context, codecInfo.secure);
                    this.dummySurface = surface;
                }
            }
        }
        if (this.surface == surface) {
            if (surface == null || surface == this.dummySurface) {
                return;
            }
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
            return;
        }
        this.surface = surface;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec codec = getCodec();
            if (Util.SDK_INT < 23 || codec == null || surface == null || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodec();
            } else {
                setOutputSurfaceV23(codec, surface);
            }
        }
        if (surface == null || surface == this.dummySurface) {
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            return;
        }
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (state == 2) {
            setJoiningDeadlineMs();
        }
    }

    private boolean shouldUseDummySurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || DummySurface.isSecureSupported(this.context);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (!areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
            return 0;
        }
        int i10 = format2.width;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        if (i10 > codecMaxValues.width || format2.height > codecMaxValues.height || getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            return 0;
        }
        return format.initializationDataEquals(format2) ? 1 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:370:0x059d  */
    /* JADX WARN: Code duplicated, block: B:385:0x05c8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        byte b10 = 0;
        byte b11 = 27;
        if (Util.SDK_INT >= 27 || str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    String str2 = Util.DEVICE;
                    switch (str2.hashCode()) {
                        case -2144781245:
                            if (!str2.equals("GIONEE_SWW1609")) {
                                b11 = -1;
                            } else {
                                b11 = 39;
                            }
                            break;
                        case -2144781185:
                            if (!str2.equals("GIONEE_SWW1627")) {
                                b11 = -1;
                            } else {
                                b11 = 40;
                            }
                            break;
                        case -2144781160:
                            if (!str2.equals("GIONEE_SWW1631")) {
                                b11 = -1;
                            } else {
                                b11 = 41;
                            }
                            break;
                        case -2097309513:
                            if (!str2.equals("K50a40")) {
                                b11 = -1;
                            } else {
                                b11 = 57;
                            }
                            break;
                        case -2022874474:
                            if (!str2.equals("CP8676_I02")) {
                                b11 = -1;
                            } else {
                                b11 = 16;
                            }
                            break;
                        case -1978993182:
                            if (!str2.equals("NX541J")) {
                                b11 = -1;
                            } else {
                                b11 = 69;
                            }
                            break;
                        case -1978990237:
                            if (!str2.equals("NX573J")) {
                                b11 = -1;
                            } else {
                                b11 = 70;
                            }
                            break;
                        case -1936688988:
                            if (!str2.equals("PGN528")) {
                                b11 = -1;
                            } else {
                                b11 = 80;
                            }
                            break;
                        case -1936688066:
                            if (!str2.equals("PGN610")) {
                                b11 = -1;
                            } else {
                                b11 = 81;
                            }
                            break;
                        case -1936688065:
                            if (!str2.equals("PGN611")) {
                                b11 = -1;
                            } else {
                                b11 = 82;
                            }
                            break;
                        case -1931988508:
                            if (!str2.equals("AquaPowerM")) {
                                b11 = -1;
                            } else {
                                b11 = 10;
                            }
                            break;
                        case -1696512866:
                            if (!str2.equals("XT1663")) {
                                b11 = -1;
                            } else {
                                b11 = 115;
                            }
                            break;
                        case -1680025915:
                            if (!str2.equals("ComioS1")) {
                                b11 = -1;
                            } else {
                                b11 = 15;
                            }
                            break;
                        case -1615810839:
                            if (!str2.equals("Phantom6")) {
                                b11 = -1;
                            } else {
                                b11 = 83;
                            }
                            break;
                        case -1554255044:
                            if (!str2.equals("vernee_M5")) {
                                b11 = -1;
                            } else {
                                b11 = 108;
                            }
                            break;
                        case -1481772737:
                            if (!str2.equals("panell_dl")) {
                                b11 = -1;
                            } else {
                                b11 = 76;
                            }
                            break;
                        case -1481772730:
                            if (!str2.equals("panell_ds")) {
                                b11 = -1;
                            } else {
                                b11 = 77;
                            }
                            break;
                        case -1481772729:
                            if (!str2.equals("panell_dt")) {
                                b11 = -1;
                            } else {
                                b11 = 78;
                            }
                            break;
                        case -1320080169:
                            if (!str2.equals("GiONEE_GBL7319")) {
                                b11 = -1;
                            } else {
                                b11 = 37;
                            }
                            break;
                        case -1217592143:
                            if (!str2.equals("BRAVIA_ATV2")) {
                                b11 = -1;
                            } else {
                                b11 = 13;
                            }
                            break;
                        case -1180384755:
                            if (!str2.equals("iris60")) {
                                b11 = -1;
                            } else {
                                b11 = 53;
                            }
                            break;
                        case -1139198265:
                            if (!str2.equals("Slate_Pro")) {
                                b11 = -1;
                            } else {
                                b11 = 96;
                            }
                            break;
                        case -1052835013:
                            if (!str2.equals("namath")) {
                                b11 = -1;
                            } else {
                                b11 = 67;
                            }
                            break;
                        case -993250464:
                            if (!str2.equals("A10-70F")) {
                                b11 = -1;
                            } else {
                                b11 = 3;
                            }
                            break;
                        case -965403638:
                            if (!str2.equals("s905x018")) {
                                b11 = -1;
                            } else {
                                b11 = 98;
                            }
                            break;
                        case -958336948:
                            if (!str2.equals("ELUGA_Ray_X")) {
                                b11 = -1;
                            } else {
                                b11 = 26;
                            }
                            break;
                        case -879245230:
                            if (!str2.equals("tcl_eu")) {
                                b11 = -1;
                            } else {
                                b11 = 104;
                            }
                            break;
                        case -842500323:
                            if (!str2.equals("nicklaus_f")) {
                                b11 = -1;
                            } else {
                                b11 = 68;
                            }
                            break;
                        case -821392978:
                            if (!str2.equals("A7000-a")) {
                                b11 = -1;
                            } else {
                                b11 = 6;
                            }
                            break;
                        case -797483286:
                            if (!str2.equals("SVP-DTV15")) {
                                b11 = -1;
                            } else {
                                b11 = 97;
                            }
                            break;
                        case -794946968:
                            if (!str2.equals("watson")) {
                                b11 = -1;
                            } else {
                                b11 = 109;
                            }
                            break;
                        case -788334647:
                            if (!str2.equals("whyred")) {
                                b11 = -1;
                            } else {
                                b11 = 110;
                            }
                            break;
                        case -782144577:
                            if (!str2.equals("OnePlus5T")) {
                                b11 = -1;
                            } else {
                                b11 = 71;
                            }
                            break;
                        case -575125681:
                            if (!str2.equals("GiONEE_CBL7513")) {
                                b11 = -1;
                            } else {
                                b11 = 36;
                            }
                            break;
                        case -521118391:
                            if (!str2.equals("GIONEE_GBL7360")) {
                                b11 = -1;
                            } else {
                                b11 = 38;
                            }
                            break;
                        case -430914369:
                            if (!str2.equals("Pixi4-7_3G")) {
                                b11 = -1;
                            } else {
                                b11 = 84;
                            }
                            break;
                        case -290434366:
                            if (!str2.equals("taido_row")) {
                                b11 = -1;
                            } else {
                                b11 = 99;
                            }
                            break;
                        case -282781963:
                            if (!str2.equals("BLACK-1X")) {
                                b11 = -1;
                            } else {
                                b11 = 12;
                            }
                            break;
                        case -277133239:
                            if (!str2.equals("Z12_PRO")) {
                                b11 = -1;
                            } else {
                                b11 = 116;
                            }
                            break;
                        case -173639913:
                            if (!str2.equals("ELUGA_A3_Pro")) {
                                b11 = -1;
                            } else {
                                b11 = 23;
                            }
                            break;
                        case -56598463:
                            if (!str2.equals("woods_fn")) {
                                b11 = -1;
                            } else {
                                b11 = 112;
                            }
                            break;
                        case 2126:
                            if (!str2.equals("C1")) {
                                b11 = -1;
                            } else {
                                b11 = 14;
                            }
                            break;
                        case 2564:
                            if (!str2.equals("Q5")) {
                                b11 = -1;
                            } else {
                                b11 = 92;
                            }
                            break;
                        case 2715:
                            if (!str2.equals("V1")) {
                                b11 = -1;
                            } else {
                                b11 = 105;
                            }
                            break;
                        case 2719:
                            if (!str2.equals("V5")) {
                                b11 = -1;
                            } else {
                                b11 = 107;
                            }
                            break;
                        case 3483:
                            if (!str2.equals("mh")) {
                                b11 = -1;
                            } else {
                                b11 = 64;
                            }
                            break;
                        case 73405:
                            if (!str2.equals("JGZ")) {
                                b11 = -1;
                            } else {
                                b11 = 56;
                            }
                            break;
                        case 75739:
                            if (!str2.equals("M5c")) {
                                b11 = -1;
                            } else {
                                b11 = 60;
                            }
                            break;
                        case 76779:
                            if (!str2.equals("MX6")) {
                                b11 = -1;
                            } else {
                                b11 = 66;
                            }
                            break;
                        case 78669:
                            if (!str2.equals("P85")) {
                                b11 = -1;
                            } else {
                                b11 = 74;
                            }
                            break;
                        case 79305:
                            if (!str2.equals("PLE")) {
                                b11 = -1;
                            } else {
                                b11 = 86;
                            }
                            break;
                        case 80618:
                            if (!str2.equals("QX1")) {
                                b11 = -1;
                            } else {
                                b11 = 94;
                            }
                            break;
                        case 88274:
                            if (!str2.equals("Z80")) {
                                b11 = -1;
                            } else {
                                b11 = 117;
                            }
                            break;
                        case 98846:
                            if (!str2.equals("cv1")) {
                                b11 = -1;
                            } else {
                                b11 = 19;
                            }
                            break;
                        case 98848:
                            if (!str2.equals("cv3")) {
                                b11 = -1;
                            } else {
                                b11 = 20;
                            }
                            break;
                        case 99329:
                            if (!str2.equals("deb")) {
                                b11 = -1;
                            } else {
                                b11 = 21;
                            }
                            break;
                        case 101481:
                            if (!str2.equals("flo")) {
                                b11 = -1;
                            } else {
                                b11 = 35;
                            }
                            break;
                        case 1513190:
                            if (!str2.equals("1601")) {
                                b11 = -1;
                            } else {
                                b11 = 0;
                            }
                            break;
                        case 1514184:
                            if (!str2.equals("1713")) {
                                b11 = -1;
                            } else {
                                b11 = 1;
                            }
                            break;
                        case 1514185:
                            if (!str2.equals("1714")) {
                                b11 = -1;
                            } else {
                                b11 = 2;
                            }
                            break;
                        case 2436959:
                            if (!str2.equals("P681")) {
                                b11 = -1;
                            } else {
                                b11 = 73;
                            }
                            break;
                        case 2463773:
                            if (!str2.equals("Q350")) {
                                b11 = -1;
                            } else {
                                b11 = 88;
                            }
                            break;
                        case 2464648:
                            if (!str2.equals("Q427")) {
                                b11 = -1;
                            } else {
                                b11 = 90;
                            }
                            break;
                        case 2689555:
                            if (!str2.equals("XE2X")) {
                                b11 = -1;
                            } else {
                                b11 = 114;
                            }
                            break;
                        case 3351335:
                            if (!str2.equals("mido")) {
                                b11 = -1;
                            } else {
                                b11 = 65;
                            }
                            break;
                        case 3386211:
                            if (!str2.equals("p212")) {
                                b11 = -1;
                            } else {
                                b11 = 72;
                            }
                            break;
                        case 41325051:
                            if (!str2.equals("MEIZU_M5")) {
                                b11 = -1;
                            } else {
                                b11 = Utf8.REPLACEMENT_BYTE;
                            }
                            break;
                        case 55178625:
                            if (!str2.equals("Aura_Note_2")) {
                                b11 = -1;
                            } else {
                                b11 = 11;
                            }
                            break;
                        case 61542055:
                            if (!str2.equals("A1601")) {
                                b11 = -1;
                            } else {
                                b11 = 4;
                            }
                            break;
                        case 65355429:
                            if (!str2.equals("E5643")) {
                                b11 = -1;
                            } else {
                                b11 = 22;
                            }
                            break;
                        case 66214468:
                            if (!str2.equals("F3111")) {
                                b11 = -1;
                            } else {
                                b11 = 28;
                            }
                            break;
                        case 66214470:
                            if (!str2.equals("F3113")) {
                                b11 = -1;
                            } else {
                                b11 = 29;
                            }
                            break;
                        case 66214473:
                            if (!str2.equals("F3116")) {
                                b11 = -1;
                            } else {
                                b11 = 30;
                            }
                            break;
                        case 66215429:
                            if (!str2.equals("F3211")) {
                                b11 = -1;
                            } else {
                                b11 = 31;
                            }
                            break;
                        case 66215431:
                            if (!str2.equals("F3213")) {
                                b11 = -1;
                            } else {
                                b11 = 32;
                            }
                            break;
                        case 66215433:
                            if (!str2.equals("F3215")) {
                                b11 = -1;
                            } else {
                                b11 = 33;
                            }
                            break;
                        case 66216390:
                            if (!str2.equals("F3311")) {
                                b11 = -1;
                            } else {
                                b11 = 34;
                            }
                            break;
                        case 76402249:
                            if (!str2.equals("PRO7S")) {
                                b11 = -1;
                            } else {
                                b11 = 87;
                            }
                            break;
                        case 76404105:
                            if (!str2.equals("Q4260")) {
                                b11 = -1;
                            } else {
                                b11 = 89;
                            }
                            break;
                        case 76404911:
                            if (!str2.equals("Q4310")) {
                                b11 = -1;
                            } else {
                                b11 = 91;
                            }
                            break;
                        case 80963634:
                            if (!str2.equals("V23GB")) {
                                b11 = -1;
                            } else {
                                b11 = 106;
                            }
                            break;
                        case 82882791:
                            if (!str2.equals("X3_HK")) {
                                b11 = -1;
                            } else {
                                b11 = 113;
                            }
                            break;
                        case 102844228:
                            if (!str2.equals("le_x6")) {
                                b11 = -1;
                            } else {
                                b11 = 58;
                            }
                            break;
                        case 165221241:
                            if (!str2.equals("A2016a40")) {
                                b11 = -1;
                            } else {
                                b11 = 5;
                            }
                            break;
                        case 182191441:
                            if (!str2.equals("CPY83_I00")) {
                                b11 = -1;
                            } else {
                                b11 = 18;
                            }
                            break;
                        case 245388979:
                            if (!str2.equals("marino_f")) {
                                b11 = -1;
                            } else {
                                b11 = 62;
                            }
                            break;
                        case 287431619:
                            if (!str2.equals("griffin")) {
                                b11 = -1;
                            } else {
                                b11 = 45;
                            }
                            break;
                        case 307593612:
                            if (!str2.equals("A7010a48")) {
                                b11 = -1;
                            } else {
                                b11 = 8;
                            }
                            break;
                        case 308517133:
                            if (!str2.equals("A7020a48")) {
                                b11 = -1;
                            } else {
                                b11 = 9;
                            }
                            break;
                        case 316215098:
                            if (!str2.equals("TB3-730F")) {
                                b11 = -1;
                            } else {
                                b11 = 100;
                            }
                            break;
                        case 316215116:
                            if (!str2.equals("TB3-730X")) {
                                b11 = -1;
                            } else {
                                b11 = 101;
                            }
                            break;
                        case 316246811:
                            if (!str2.equals("TB3-850F")) {
                                b11 = -1;
                            } else {
                                b11 = 102;
                            }
                            break;
                        case 316246818:
                            if (!str2.equals("TB3-850M")) {
                                b11 = -1;
                            } else {
                                b11 = 103;
                            }
                            break;
                        case 407160593:
                            if (!str2.equals("Pixi5-10_4G")) {
                                b11 = -1;
                            } else {
                                b11 = 85;
                            }
                            break;
                        case 507412548:
                            if (!str2.equals("QM16XE_U")) {
                                b11 = -1;
                            } else {
                                b11 = 93;
                            }
                            break;
                        case 793982701:
                            if (!str2.equals("GIONEE_WBL5708")) {
                                b11 = -1;
                            } else {
                                b11 = 42;
                            }
                            break;
                        case 794038622:
                            if (!str2.equals("GIONEE_WBL7365")) {
                                b11 = -1;
                            } else {
                                b11 = 43;
                            }
                            break;
                        case 794040393:
                            if (!str2.equals("GIONEE_WBL7519")) {
                                b11 = -1;
                            } else {
                                b11 = 44;
                            }
                            break;
                        case 835649806:
                            if (!str2.equals("manning")) {
                                b11 = -1;
                            } else {
                                b11 = 61;
                            }
                            break;
                        case 917340916:
                            if (!str2.equals("A7000plus")) {
                                b11 = -1;
                            } else {
                                b11 = 7;
                            }
                            break;
                        case 958008161:
                            if (!str2.equals("j2xlteins")) {
                                b11 = -1;
                            } else {
                                b11 = 55;
                            }
                            break;
                        case 1060579533:
                            if (!str2.equals("panell_d")) {
                                b11 = -1;
                            } else {
                                b11 = 75;
                            }
                            break;
                        case 1150207623:
                            if (!str2.equals("LS-5017")) {
                                b11 = -1;
                            } else {
                                b11 = 59;
                            }
                            break;
                        case 1176899427:
                            if (!str2.equals("itel_S41")) {
                                b11 = -1;
                            } else {
                                b11 = 54;
                            }
                            break;
                        case 1280332038:
                            if (!str2.equals("hwALE-H")) {
                                b11 = -1;
                            } else {
                                b11 = 47;
                            }
                            break;
                        case 1306947716:
                            if (!str2.equals("EverStar_S")) {
                                b11 = -1;
                            }
                            break;
                        case 1349174697:
                            if (!str2.equals("htc_e56ml_dtul")) {
                                b11 = -1;
                            } else {
                                b11 = 46;
                            }
                            break;
                        case 1522194893:
                            if (!str2.equals("woods_f")) {
                                b11 = -1;
                            } else {
                                b11 = 111;
                            }
                            break;
                        case 1691543273:
                            if (!str2.equals("CPH1609")) {
                                b11 = -1;
                            } else {
                                b11 = 17;
                            }
                            break;
                        case 1709443163:
                            if (!str2.equals("iball8735_9806")) {
                                b11 = -1;
                            } else {
                                b11 = 51;
                            }
                            break;
                        case 1865889110:
                            if (!str2.equals("santoni")) {
                                b11 = -1;
                            } else {
                                b11 = 95;
                            }
                            break;
                        case 1906253259:
                            if (!str2.equals("PB2-670M")) {
                                b11 = -1;
                            } else {
                                b11 = 79;
                            }
                            break;
                        case 1977196784:
                            if (!str2.equals("Infinix-X572")) {
                                b11 = -1;
                            } else {
                                b11 = 52;
                            }
                            break;
                        case 2029784656:
                            if (!str2.equals("HWBLN-H")) {
                                b11 = -1;
                            } else {
                                b11 = 48;
                            }
                            break;
                        case 2030379515:
                            if (!str2.equals("HWCAM-H")) {
                                b11 = -1;
                            } else {
                                b11 = 49;
                            }
                            break;
                        case 2047190025:
                            if (!str2.equals("ELUGA_Note")) {
                                b11 = -1;
                            } else {
                                b11 = 24;
                            }
                            break;
                        case 2047252157:
                            if (!str2.equals("ELUGA_Prim")) {
                                b11 = -1;
                            } else {
                                b11 = 25;
                            }
                            break;
                        case 2048319463:
                            if (!str2.equals("HWVNS-H")) {
                                b11 = -1;
                            } else {
                                b11 = 50;
                            }
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        case 27:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        case 44:
                        case 45:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        case 50:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                        case 60:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                        case 62:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case InterfaceC0435l1.d.b.f29105b /* 101 */:
                        case InterfaceC0435l1.d.b.f29106c /* 102 */:
                        case InterfaceC0435l1.d.b.f29107d /* 103 */:
                        case InterfaceC0435l1.d.b.f29108e /* 104 */:
                        case InterfaceC0435l1.d.b.f29109f /* 105 */:
                        case 106:
                        case 107:
                        case 108:
                        case InterfaceC0435l1.d.b.f29110g /* 109 */:
                        case InterfaceC0435l1.d.b.f29111h /* 110 */:
                        case InterfaceC0435l1.d.b.f29112i /* 111 */:
                        case InterfaceC0435l1.d.b.f29113j /* 112 */:
                        case InterfaceC0435l1.d.b.f29114k /* 113 */:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                            deviceNeedsSetOutputSurfaceWorkaround = true;
                            break;
                    }
                    String str3 = Util.MODEL;
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 2006354) {
                        if (iHashCode == 2006367 && str3.equals("AFTN")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (!str3.equals("AFTA")) {
                        b10 = -1;
                    }
                    if (b10 == 0 || b10 == 1) {
                        deviceNeedsSetOutputSurfaceWorkaround = true;
                    }
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws MediaCodecUtil.DecoderQueryException {
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, codecMaxValues, this.deviceNeedsAutoFrcWorkaround, this.tunnelingAudioSessionId);
        if (this.surface == null) {
            Assertions.checkState(shouldUseDummySurface(mediaCodecInfo));
            if (this.dummySurface == null) {
                this.dummySurface = DummySurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.dummySurface;
        }
        mediaCodec.configure(mediaFormat, this.surface, mediaCrypto, 0);
        if (Util.SDK_INT < 23 || !this.tunneling) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediaCodec);
    }

    public void dropOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void flushCodec() throws ExoPlaybackException {
        super.flushCodec();
        this.buffersInCodecCount = 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) throws MediaCodecUtil.DecoderQueryException {
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (areAdaptationCompatible(mediaCodecInfo.adaptive, format, format2)) {
                int i10 = format2.width;
                z10 |= i10 == -1 || format2.height == -1;
                iMax = Math.max(iMax, i10);
                iMax2 = Math.max(iMax2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z10) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format.sampleMimeType, iMax, iMax2));
                Log.w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, CodecMaxValues codecMaxValues, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        }
        if (z10) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            configureTunnelingV21(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer, com.mbridge.msdk.playercommon.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            setSurface((Surface) obj);
            return;
        }
        if (i10 != 4) {
            super.handleMessage(i10, obj);
            return;
        }
        this.scalingMode = ((Integer) obj).intValue();
        MediaCodec codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.Renderer
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.renderedFirstFrame || (((surface = this.dummySurface) != null && this.surface == surface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i10, long j10, long j11) throws ExoPlaybackException {
        int iSkipSource = skipSource(j11);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(this.buffersInCodecCount + iSkipSource);
        flushCodec();
        return true;
    }

    public void maybeNotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            return;
        }
        this.renderedFirstFrame = true;
        this.eventDispatcher.renderedFirstFrame(this.surface);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j10, long j11) {
        this.eventDispatcher.decoderInitialized(str, j10, j11);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.pendingOutputStreamOffsetCount = 0;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.frameReleaseTimeHelper.disable();
        this.tunnelingOnFrameRenderedListener = null;
        this.tunneling = false;
        try {
            super.onDisabled();
        } finally {
            this.decoderCounters.ensureUpdated();
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onEnabled(boolean z10) throws ExoPlaybackException {
        super.onEnabled(z10);
        int i10 = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i10;
        this.tunneling = i10 != 0;
        this.eventDispatcher.enabled(this.decoderCounters);
        this.frameReleaseTimeHelper.enable();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        super.onInputFormatChanged(format);
        this.eventDispatcher.inputFormatChanged(format);
        this.pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        this.pendingRotationDegrees = format.rotationDegrees;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z10 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.currentWidth = z10 ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
        int integer = z10 ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
        this.currentHeight = integer;
        float f10 = this.pendingPixelWidthHeightRatio;
        this.currentPixelWidthHeightRatio = f10;
        if (Util.SDK_INT >= 21) {
            int i10 = this.pendingRotationDegrees;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.currentWidth;
                this.currentWidth = integer;
                this.currentHeight = i11;
                this.currentPixelWidthHeightRatio = 1.0f / f10;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onPositionReset(long j10, boolean z10) throws ExoPlaybackException {
        super.onPositionReset(j10, z10);
        clearRenderedFirstFrame();
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C.TIME_UNSET;
        int i10 = this.pendingOutputStreamOffsetCount;
        if (i10 != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i10 - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z10) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedOutputBuffer(long j10) {
        this.buffersInCodecCount--;
        while (true) {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 == 0 || j10 < this.pendingOutputStreamSwitchTimesUs[0]) {
                return;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            this.outputStreamOffsetUs = jArr[0];
            int i11 = i10 - 1;
            this.pendingOutputStreamOffsetCount = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.pendingOutputStreamSwitchTimesUs;
            System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        this.buffersInCodecCount++;
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
        if (Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        maybeNotifyRenderedFirstFrame();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer, com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        super.onStopped();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j10) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            this.outputStreamOffsetUs = j10;
        } else {
            int i10 = this.pendingOutputStreamOffsetCount;
            if (i10 == this.pendingOutputStreamOffsetsUs.length) {
                Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
            } else {
                this.pendingOutputStreamOffsetCount = i10 + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i11 = this.pendingOutputStreamOffsetCount - 1;
            jArr[i11] = j10;
            this.pendingOutputStreamSwitchTimesUs[i11] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws ExoPlaybackException {
        MediaCodec mediaCodec2;
        long j13;
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j10;
        }
        long j14 = j12 - this.outputStreamOffsetUs;
        if (z10) {
            skipOutputBuffer(mediaCodec, i10, j14);
            return true;
        }
        long j15 = j12 - j10;
        if (this.surface == this.dummySurface) {
            if (!isBufferLate(j15)) {
                return false;
            }
            skipOutputBuffer(mediaCodec, i10, j14);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z11 = getState() == 2;
        if (!this.renderedFirstFrame || (z11 && shouldForceRenderOutputBuffer(j15, jElapsedRealtime - this.lastRenderTimeUs))) {
            if (Util.SDK_INT >= 21) {
                renderOutputBufferV21(mediaCodec, i10, j14, System.nanoTime());
            } else {
                renderOutputBuffer(mediaCodec, i10, j14);
            }
            return true;
        }
        if (z11 && j10 != this.initialPositionUs) {
            long jNanoTime = System.nanoTime();
            long jAdjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j12, ((j15 - (jElapsedRealtime - j11)) * 1000) + jNanoTime);
            long j16 = (jAdjustReleaseTime - jNanoTime) / 1000;
            if (shouldDropBuffersToKeyframe(j16, j11)) {
                mediaCodec2 = mediaCodec;
                j13 = j14;
                if (maybeDropBuffersToKeyframe(mediaCodec2, i10, j13, j10)) {
                    return false;
                }
            } else {
                mediaCodec2 = mediaCodec;
                j13 = j14;
            }
            if (shouldDropOutputBuffer(j16, j11)) {
                dropOutputBuffer(mediaCodec2, i10, j13);
                return true;
            }
            if (Util.SDK_INT >= 21) {
                if (j16 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    renderOutputBufferV21(mediaCodec2, i10, j13, jAdjustReleaseTime);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - Xa.f27908s) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                renderOutputBuffer(mediaCodec2, i10, j13);
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public void releaseCodec() {
        Surface surface;
        try {
            super.releaseCodec();
            this.buffersInCodecCount = 0;
            surface = this.dummySurface;
            if (surface != null) {
                if (this.surface == surface) {
                    this.surface = null;
                }
            }
        } finally {
            this.buffersInCodecCount = 0;
            if (this.dummySurface != null) {
                Surface surface2 = this.surface;
                surface = this.dummySurface;
                if (surface2 == surface) {
                    this.surface = null;
                }
                surface.release();
                this.dummySurface = null;
            }
        }
    }

    public void renderOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    @TargetApi(21)
    public void renderOutputBufferV21(MediaCodec mediaCodec, int i10, long j10, long j11) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public boolean shouldDropBuffersToKeyframe(long j10, long j11) {
        return isBufferVeryLate(j10);
    }

    public boolean shouldDropOutputBuffer(long j10, long j11) {
        return isBufferLate(j10);
    }

    public boolean shouldForceRenderOutputBuffer(long j10, long j11) {
        return isBufferLate(j10) && j11 > 100000;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUseDummySurface(mediaCodecInfo);
    }

    public void skipOutputBuffer(MediaCodec mediaCodec, int i10, long j10) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10;
        int i11;
        String str = format.sampleMimeType;
        if (!MimeTypes.isVideo(str)) {
            return 0;
        }
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            z10 = false;
            for (int i12 = 0; i12 < drmInitData.schemeDataCount; i12++) {
                z10 |= drmInitData.get(i12).requiresSecureDecryption;
            }
        } else {
            z10 = false;
        }
        MediaCodecInfo decoderInfo = mediaCodecSelector.getDecoderInfo(str, z10);
        if (decoderInfo == null) {
            return (!z10 || mediaCodecSelector.getDecoderInfo(str, false) == null) ? 1 : 2;
        }
        if (!BaseRenderer.supportsFormatDrm(drmSessionManager, drmInitData)) {
            return 2;
        }
        boolean zIsCodecSupported = decoderInfo.isCodecSupported(format.codecs);
        if (zIsCodecSupported && (i10 = format.width) > 0 && (i11 = format.height) > 0) {
            if (Util.SDK_INT >= 21) {
                zIsCodecSupported = decoderInfo.isVideoSizeAndRateSupportedV21(i10, i11, format.frameRate);
            } else {
                boolean z11 = i10 * i11 <= MediaCodecUtil.maxH264DecodableFrameSize();
                if (!z11) {
                    Log.d(TAG, "FalseCheck [legacyFrameSize, " + format.width + "x" + format.height + "] [" + Util.DEVICE_DEBUG_INFO + X3.j.f27836e);
                }
                zIsCodecSupported = z11;
            }
        }
        return (zIsCodecSupported ? 4 : 3) | (decoderInfo.adaptive ? 16 : 8) | (decoderInfo.tunneling ? 32 : 0);
    }

    public void updateDroppedBufferCounters(int i10) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += i10;
        this.droppedFrames += i10;
        int i11 = this.consecutiveDroppedFrameCount + i10;
        this.consecutiveDroppedFrameCount = i11;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedBufferCount);
        if (this.droppedFrames >= this.maxDroppedFramesToNotify) {
            maybeNotifyDroppedFrames();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10) {
        this(context, mediaCodecSelector, j10, null, null, -1);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i10) {
        this(context, mediaCodecSelector, j10, null, false, handler, videoRendererEventListener, i10);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j10, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z10, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i10) {
        super(2, mediaCodecSelector, drmSessionManager, z10);
        this.allowedJoiningTimeMs = j10;
        this.maxDroppedFramesToNotify = i10;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamOffsetUs = C.TIME_UNSET;
        this.lastInputTimeUs = C.TIME_UNSET;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        clearReportedVideoSize();
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, String str, int i10, int i11) {
        int iCeilDivide;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iCeilDivide = i10 * i11;
                i12 = 2;
                return (iCeilDivide * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iCeilDivide = i10 * i11;
                return (iCeilDivide * 3) / (i12 * 2);
            case "video/avc":
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                iCeilDivide = Util.ceilDivide(i11, 16) * Util.ceilDivide(i10, 16) * NotificationCompat.FLAG_LOCAL_ONLY;
                i12 = 2;
                return (iCeilDivide * 3) / (i12 * 2);
            default:
                return -1;
        }
    }
}
