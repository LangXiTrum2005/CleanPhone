package com.google.android.exoplayer2.audio;

import A.I0;
import A.RunnableC0916x;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.impl.H0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.CrashConfig;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    public final Context C1;
    public final AudioRendererEventListener.EventDispatcher D1;
    public final DefaultAudioSink E1;
    public int F1;
    public boolean G1;
    public Format H1;
    public Format I1;
    public long J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public Renderer.WakeupListener N1;

    public static final class Api23 {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public final class AudioSinkListener implements AudioSink.Listener {
        public AudioSinkListener() {
        }

        public final void a(Exception exc) {
            Log.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.D1;
            Handler handler = eventDispatcher.f17291a;
            if (handler != null) {
                handler.post(new a(eventDispatcher, exc, 1));
            }
        }

        public final void b() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.N1;
            if (wakeupListener != null) {
                wakeupListener.b();
            }
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, Handler handler, AudioRendererEventListener audioRendererEventListener, DefaultAudioSink defaultAudioSink) {
        super(1, factory, 44100.0f);
        this.C1 = context.getApplicationContext();
        this.E1 = defaultAudioSink;
        this.D1 = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        defaultAudioSink.r = new AudioSinkListener();
    }

    public static ImmutableList k0(d dVar, Format format, boolean z2, DefaultAudioSink defaultAudioSink) {
        String str = format.m0;
        if (str == null) {
            return ImmutableList.x();
        }
        if (defaultAudioSink.f(format) != 0) {
            List listE = MediaCodecUtil.e("audio/raw", false, false);
            MediaCodecInfo mediaCodecInfo = listE.isEmpty() ? null : (MediaCodecInfo) listE.get(0);
            if (mediaCodecInfo != null) {
                return ImmutableList.z(mediaCodecInfo);
            }
        }
        dVar.getClass();
        List listE2 = MediaCodecUtil.e(str, z2, false);
        String strB = MediaCodecUtil.b(format);
        if (strB == null) {
            return ImmutableList.u(listE2);
        }
        List listE3 = MediaCodecUtil.e(strB, z2, false);
        ImmutableList.Builder builderS = ImmutableList.s();
        builderS.f(listE2);
        builderS.f(listE3);
        return builderS.j();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float C(float f, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i2 = format.A0;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final ArrayList D(d dVar, Format format, boolean z2) {
        ImmutableList immutableListK0 = k0(dVar, format, z2, this.E1);
        Pattern pattern = MediaCodecUtil.f18180a;
        ArrayList arrayList = new ArrayList(immutableListK0);
        Collections.sort(arrayList, new f(new e(format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final MediaCodecAdapter.Configuration F(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        boolean z2;
        Format[] formatArr = this.i0;
        formatArr.getClass();
        int iJ0 = j0(mediaCodecInfo, format);
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (mediaCodecInfo.b(format, format2).d != 0) {
                    iJ0 = Math.max(iJ0, j0(mediaCodecInfo, format2));
                }
            }
        }
        this.F1 = iJ0;
        int i2 = Util.f18979a;
        if (i2 < 24 && "OMX.SEC.aac.dec".equals(mediaCodecInfo.f18170a) && "samsung".equals(Util.f18981c)) {
            String str = Util.f18980b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.G1 = z2;
        int i3 = this.F1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mediaCodecInfo.f18172c);
        mediaFormat.setInteger("channel-count", format.z0);
        int i4 = format.A0;
        mediaFormat.setInteger("sample-rate", i4);
        MediaFormatUtil.b(mediaFormat, format.o0);
        MediaFormatUtil.a(mediaFormat, "max-input-size", i3);
        if (i2 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                if (i2 == 23) {
                    String str2 = Util.d;
                    if (!"ZTE B2017G".equals(str2) && !"AXON 7 mini".equals(str2)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str3 = format.m0;
        if (i2 <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24) {
            Format.Builder builder = new Format.Builder();
            builder.k = "audio/raw";
            builder.x = format.z0;
            builder.y = i4;
            builder.f17092z = 4;
            if (this.E1.f(new Format(builder)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.I1 = (!"audio/raw".equals(mediaCodecInfo.f18171b) || "audio/raw".equals(str3)) ? null : format;
        return new MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void L(Exception exc) {
        Log.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        Handler handler = eventDispatcher.f17291a;
        if (handler != null) {
            handler.post(new a(eventDispatcher, exc, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void M(String str, long j, long j2) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        Handler handler = eventDispatcher.f17291a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.d(eventDispatcher, str, j, j2, 2));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void N(String str) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        Handler handler = eventDispatcher.f17291a;
        if (handler != null) {
            handler.post(new I0(27, eventDispatcher, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation O(FormatHolder formatHolder) {
        Format format = formatHolder.f17094b;
        format.getClass();
        this.H1 = format;
        DecoderReuseEvaluation decoderReuseEvaluationO = super.O(formatHolder);
        Format format2 = this.H1;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        Handler handler = eventDispatcher.f17291a;
        if (handler != null) {
            handler.post(new H0(eventDispatcher, format2, decoderReuseEvaluationO, 8));
        }
        return decoderReuseEvaluationO;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void P(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iS;
        int i2;
        Format format2 = this.I1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.G0 != null) {
            if ("audio/raw".equals(format.m0)) {
                iS = format.B0;
            } else if (Util.f18979a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iS = mediaFormat.containsKey("v-bits-per-sample") ? Util.s(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iS = mediaFormat.getInteger("pcm-encoding");
            }
            Format.Builder builder = new Format.Builder();
            builder.k = "audio/raw";
            builder.f17092z = iS;
            builder.f17077A = format.C0;
            builder.f17078B = format.D0;
            builder.x = mediaFormat.getInteger("channel-count");
            builder.y = mediaFormat.getInteger("sample-rate");
            Format format3 = new Format(builder);
            if (this.G1 && format3.z0 == 6 && (i2 = format.z0) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = i3;
                }
            }
            format = format3;
        }
        try {
            this.E1.b(format, iArr);
        } catch (AudioSink.ConfigurationException e2) {
            throw i(e2, e2.X, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Q(long j) {
        this.E1.getClass();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void S() {
        this.E1.G = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void T(DecoderInputBuffer decoderInputBuffer) {
        if (!this.K1 || decoderInputBuffer.b(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f0 - this.J1) > 500000) {
            this.J1 = decoderInputBuffer.f0;
        }
        this.K1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean V(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.I1 != null && (i3 & 2) != 0) {
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.j(i2, false);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.E1;
        if (z2) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.j(i2, false);
            }
            this.x1.f += i4;
            defaultAudioSink.G = true;
            return true;
        }
        try {
            if (!defaultAudioSink.j(byteBuffer, j3, i4)) {
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.j(i2, false);
            }
            this.x1.f17429e += i4;
            return true;
        } catch (AudioSink.InitializationException e2) {
            throw i(e2, this.H1, e2.f17293Y, IronSourceConstants.errorCode_biddingDataException);
        } catch (AudioSink.WriteException e3) {
            throw i(e3, format, e3.f17294Y, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Y() throws ExoPlaybackException {
        try {
            DefaultAudioSink defaultAudioSink = this.E1;
            if (!defaultAudioSink.S && defaultAudioSink.m() && defaultAudioSink.c()) {
                defaultAudioSink.p();
                defaultAudioSink.S = true;
            }
        } catch (AudioSink.WriteException e2) {
            throw i(e2, e2.Z, e2.f17294Y, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean e0(Format format) {
        return this.E1.f(format) != 0;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final void f(PlaybackParameters playbackParameters) {
        DefaultAudioSink defaultAudioSink = this.E1;
        defaultAudioSink.getClass();
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.i(playbackParameters.X, 0.1f, 8.0f), Util.i(playbackParameters.f17185Y, 0.1f, 8.0f));
        if (!defaultAudioSink.k || Util.f18979a < 23) {
            defaultAudioSink.s(playbackParameters2, defaultAudioSink.g().f17367b);
        } else {
            defaultAudioSink.t(playbackParameters2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (com.google.android.exoplayer2.mediacodec.MediaCodecInfo) r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f0(com.google.android.exoplayer2.mediacodec.d r12, com.google.android.exoplayer2.Format r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.f0(com.google.android.exoplayer2.mediacodec.d, com.google.android.exoplayer2.Format):int");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final MediaClock getMediaClock() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        DefaultAudioSink defaultAudioSink = this.E1;
        return defaultAudioSink.k ? defaultAudioSink.y : defaultAudioSink.g().f17366a;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        if (this.g0 == 2) {
            l0();
        }
        return this.J1;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        DefaultAudioSink defaultAudioSink = this.E1;
        if (i2 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (defaultAudioSink.f17330J != fFloatValue) {
                defaultAudioSink.f17330J = fFloatValue;
                if (defaultAudioSink.m()) {
                    if (Util.f18979a >= 21) {
                        defaultAudioSink.f17349u.setVolume(defaultAudioSink.f17330J);
                        return;
                    }
                    AudioTrack audioTrack = defaultAudioSink.f17349u;
                    float f = defaultAudioSink.f17330J;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (defaultAudioSink.v.equals(audioAttributes)) {
                return;
            }
            defaultAudioSink.v = audioAttributes;
            if (defaultAudioSink.Z) {
                return;
            }
            defaultAudioSink.d();
            return;
        }
        if (i2 == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            if (defaultAudioSink.X.equals(auxEffectInfo)) {
                return;
            }
            auxEffectInfo.getClass();
            if (defaultAudioSink.f17349u != null) {
                defaultAudioSink.X.getClass();
            }
            defaultAudioSink.X = auxEffectInfo;
            return;
        }
        switch (i2) {
            case 9:
                defaultAudioSink.s(defaultAudioSink.g().f17366a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (defaultAudioSink.W != iIntValue) {
                    defaultAudioSink.W = iIntValue;
                    defaultAudioSink.f17336V = iIntValue != 0;
                    defaultAudioSink.d();
                }
                break;
            case 11:
                this.N1 = (Renderer.WakeupListener) obj;
                break;
            case 12:
                if (Util.f18979a >= 23) {
                    Api23.a(defaultAudioSink, obj);
                }
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        if (!this.t1) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.E1;
        if (defaultAudioSink.m()) {
            return defaultAudioSink.S && !defaultAudioSink.k();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return this.E1.k() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void j() {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        this.M1 = true;
        this.H1 = null;
        try {
            this.E1.d();
            try {
                super.j();
            } finally {
                eventDispatcher.a(this.x1);
            }
        } catch (Throwable th) {
            try {
                super.j();
                throw th;
            } finally {
                eventDispatcher.a(this.x1);
            }
        }
    }

    public final int j0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.f18170a) || (i2 = Util.f18979a) >= 24 || (i2 == 23 && Util.A(this.C1))) {
            return format.n0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void k(boolean z2, boolean z3) {
        super.k(z2, z3);
        DecoderCounters decoderCounters = this.x1;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.D1;
        Handler handler = eventDispatcher.f17291a;
        if (handler != null) {
            handler.post(new b(eventDispatcher, decoderCounters, 0));
        }
        RendererConfiguration rendererConfiguration = this.Z;
        rendererConfiguration.getClass();
        boolean z4 = rendererConfiguration.f17197a;
        DefaultAudioSink defaultAudioSink = this.E1;
        if (z4) {
            defaultAudioSink.getClass();
            Assertions.d(Util.f18979a >= 21);
            Assertions.d(defaultAudioSink.f17336V);
            if (!defaultAudioSink.Z) {
                defaultAudioSink.Z = true;
                defaultAudioSink.d();
            }
        } else if (defaultAudioSink.Z) {
            defaultAudioSink.Z = false;
            defaultAudioSink.d();
        }
        PlayerId playerId = this.f0;
        playerId.getClass();
        defaultAudioSink.q = playerId;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        super.l(j, z2);
        this.E1.d();
        this.J1 = j;
        this.K1 = true;
        this.L1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0265  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:81:0x0167  */
    /* JADX WARN: Code duplicated, block: B:84:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:90:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0249 A[Catch: Exception -> 0x025f, TRY_LEAVE, TryCatch #0 {Exception -> 0x025f, blocks: (B:97:0x0221, B:99:0x0249), top: B:173:0x0221 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x0249, please report this as an issue */
    public final void l0() {
        long j;
        long jMax;
        boolean z2;
        AudioTrackPositionTracker.Listener listener;
        float f;
        long jA;
        ArrayDeque arrayDeque;
        long jR;
        long jF;
        AudioRendererEventListener.EventDispatcher eventDispatcher;
        Handler handler;
        int i2;
        long j2;
        boolean timestamp;
        long j3;
        long j4;
        long j5;
        long jA2;
        String str;
        Method method;
        long jMax2;
        boolean zIsEnded = isEnded();
        DefaultAudioSink defaultAudioSink = this.E1;
        if (!defaultAudioSink.m() || defaultAudioSink.H) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.f17345i;
            AudioTrack audioTrack = audioTrackPositionTracker.f17309c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            AudioTrackPositionTracker.Listener listener2 = audioTrackPositionTracker.f17307a;
            j = Long.MIN_VALUE;
            if (playState == 3) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - audioTrackPositionTracker.m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    long jA3 = (audioTrackPositionTracker.a() * 1000000) / ((long) audioTrackPositionTracker.g);
                    if (jA3 != 0) {
                        int i3 = audioTrackPositionTracker.f17317w;
                        float f2 = audioTrackPositionTracker.j;
                        int i4 = Util.f18979a;
                        if (f2 == 1.0f) {
                            i2 = 1;
                        } else {
                            i2 = 1;
                            jA3 = Math.round(jA3 / ((double) f2));
                        }
                        long[] jArr = audioTrackPositionTracker.f17308b;
                        jArr[i3] = jA3 - jNanoTime;
                        audioTrackPositionTracker.f17317w = (audioTrackPositionTracker.f17317w + 1) % 10;
                        int i5 = audioTrackPositionTracker.x;
                        if (i5 < 10) {
                            audioTrackPositionTracker.x = i5 + 1;
                        }
                        audioTrackPositionTracker.m = jNanoTime;
                        audioTrackPositionTracker.f17313l = 0L;
                        int i6 = 0;
                        while (true) {
                            int i7 = audioTrackPositionTracker.x;
                            if (i6 >= i7) {
                                break;
                            }
                            audioTrackPositionTracker.f17313l = (jArr[i6] / ((long) i7)) + audioTrackPositionTracker.f17313l;
                            i6++;
                        }
                    } else {
                        z2 = zIsEnded;
                        listener = listener2;
                        f = 1.0f;
                    }
                } else {
                    i2 = 1;
                }
                if (audioTrackPositionTracker.f17311h) {
                    z2 = zIsEnded;
                    listener = listener2;
                    f = 1.0f;
                } else {
                    AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
                    audioTimestampPoller.getClass();
                    AudioTimestampPoller.AudioTimestampV19 audioTimestampV19 = audioTimestampPoller.f17295a;
                    if (audioTimestampV19 != null) {
                        j2 = 500000;
                        if (jNanoTime - audioTimestampPoller.f17298e >= audioTimestampPoller.d) {
                            audioTimestampPoller.f17298e = jNanoTime;
                            AudioTrack audioTrack2 = audioTimestampV19.f17299a;
                            AudioTimestamp audioTimestamp = audioTimestampV19.f17300b;
                            timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j6 = audioTimestamp.framePosition;
                                if (audioTimestampV19.d > j6) {
                                    audioTimestampV19.f17301c++;
                                }
                                audioTimestampV19.d = j6;
                                audioTimestampV19.f17302e = j6 + (audioTimestampV19.f17301c << 32);
                            }
                            int i8 = audioTimestampPoller.f17296b;
                            if (i8 != 0) {
                                if (i8 != i2) {
                                    if (i8 != 2) {
                                        if (i8 != 3) {
                                            if (i8 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            audioTimestampPoller.a();
                                        }
                                    } else if (!timestamp) {
                                        audioTimestampPoller.a();
                                    }
                                } else if (!timestamp) {
                                    audioTimestampPoller.a();
                                } else if (audioTimestampV19.f17302e > audioTimestampPoller.f) {
                                    audioTimestampPoller.b(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= audioTimestampPoller.f17297c) {
                                    audioTimestampPoller.f = audioTimestampV19.f17302e;
                                    audioTimestampPoller.b(1);
                                }
                            } else if (jNanoTime - audioTimestampPoller.f17297c > 500000) {
                                audioTimestampPoller.b(3);
                            }
                        }
                        if (timestamp) {
                            if (audioTimestampV19 != null) {
                                j3 = audioTimestampV19.f17300b.nanoTime / 1000;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            j4 = 5000000;
                            if (audioTimestampV19 != null) {
                                j5 = audioTimestampV19.f17302e;
                            } else {
                                j5 = -1;
                            }
                            z2 = zIsEnded;
                            jA2 = (audioTrackPositionTracker.a() * 1000000) / ((long) audioTrackPositionTracker.g);
                            f = 1.0f;
                            if (Math.abs(j3 - jNanoTime) > 5000000) {
                                listener = listener2;
                                StringBuilder sbV = android.support.v4.media.a.v(j5, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                sbV.append(j3);
                                androidx.datastore.preferences.protobuf.a.A(sbV, ", ", jNanoTime, ", ");
                                sbV.append(jA2);
                                sbV.append(", ");
                                DefaultAudioSink defaultAudioSink2 = DefaultAudioSink.this;
                                sbV.append(defaultAudioSink2.h());
                                sbV.append(", ");
                                sbV.append(defaultAudioSink2.i());
                                Log.g("DefaultAudioSink", sbV.toString());
                                audioTimestampPoller.b(4);
                                str = "DefaultAudioSink";
                            } else {
                                listener = listener2;
                                if (Math.abs(((j5 * 1000000) / ((long) audioTrackPositionTracker.g)) - jA2) > 5000000) {
                                    StringBuilder sbV2 = android.support.v4.media.a.v(j5, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                    sbV2.append(j3);
                                    androidx.datastore.preferences.protobuf.a.A(sbV2, ", ", jNanoTime, ", ");
                                    sbV2.append(jA2);
                                    sbV2.append(", ");
                                    DefaultAudioSink defaultAudioSink3 = DefaultAudioSink.this;
                                    sbV2.append(defaultAudioSink3.h());
                                    sbV2.append(", ");
                                    sbV2.append(defaultAudioSink3.i());
                                    str = "DefaultAudioSink";
                                    Log.g(str, sbV2.toString());
                                    audioTimestampPoller.b(4);
                                } else {
                                    str = "DefaultAudioSink";
                                    if (audioTimestampPoller.f17296b == 4) {
                                        audioTimestampPoller.a();
                                    }
                                }
                            }
                        } else {
                            z2 = zIsEnded;
                            str = "DefaultAudioSink";
                            listener = listener2;
                            f = 1.0f;
                            j4 = 5000000;
                        }
                        if (audioTrackPositionTracker.q && (method = audioTrackPositionTracker.f17314n) != null && jNanoTime - audioTrackPositionTracker.r >= j2) {
                            try {
                                AudioTrack audioTrack3 = audioTrackPositionTracker.f17309c;
                                audioTrack3.getClass();
                                Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                                int i9 = Util.f18979a;
                                long jIntValue = (((long) num.intValue()) * 1000) - audioTrackPositionTracker.f17312i;
                                audioTrackPositionTracker.o = jIntValue;
                                jMax2 = Math.max(jIntValue, 0L);
                                audioTrackPositionTracker.o = jMax2;
                                if (jMax2 > j4) {
                                    Log.g(str, "Ignoring impossibly large audio latency: " + jMax2);
                                    audioTrackPositionTracker.o = 0L;
                                }
                            } catch (Exception unused) {
                                audioTrackPositionTracker.f17314n = null;
                            }
                            audioTrackPositionTracker.r = jNanoTime;
                        }
                    } else {
                        j2 = 500000;
                    }
                    timestamp = false;
                    if (timestamp) {
                        z2 = zIsEnded;
                        str = "DefaultAudioSink";
                        listener = listener2;
                        f = 1.0f;
                        j4 = 5000000;
                    } else {
                        if (audioTimestampV19 != null) {
                            j3 = audioTimestampV19.f17300b.nanoTime / 1000;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        j4 = 5000000;
                        if (audioTimestampV19 != null) {
                            j5 = audioTimestampV19.f17302e;
                        } else {
                            j5 = -1;
                        }
                        z2 = zIsEnded;
                        jA2 = (audioTrackPositionTracker.a() * 1000000) / ((long) audioTrackPositionTracker.g);
                        f = 1.0f;
                        if (Math.abs(j3 - jNanoTime) > 5000000) {
                            listener = listener2;
                            StringBuilder sbV3 = android.support.v4.media.a.v(j5, "Spurious audio timestamp (system clock mismatch): ", ", ");
                            sbV3.append(j3);
                            androidx.datastore.preferences.protobuf.a.A(sbV3, ", ", jNanoTime, ", ");
                            sbV3.append(jA2);
                            sbV3.append(", ");
                            DefaultAudioSink defaultAudioSink4 = DefaultAudioSink.this;
                            sbV3.append(defaultAudioSink4.h());
                            sbV3.append(", ");
                            sbV3.append(defaultAudioSink4.i());
                            Log.g("DefaultAudioSink", sbV3.toString());
                            audioTimestampPoller.b(4);
                            str = "DefaultAudioSink";
                        } else {
                            listener = listener2;
                            if (Math.abs(((j5 * 1000000) / ((long) audioTrackPositionTracker.g)) - jA2) > 5000000) {
                                StringBuilder sbV4 = android.support.v4.media.a.v(j5, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                sbV4.append(j3);
                                androidx.datastore.preferences.protobuf.a.A(sbV4, ", ", jNanoTime, ", ");
                                sbV4.append(jA2);
                                sbV4.append(", ");
                                DefaultAudioSink defaultAudioSink5 = DefaultAudioSink.this;
                                sbV4.append(defaultAudioSink5.h());
                                sbV4.append(", ");
                                sbV4.append(defaultAudioSink5.i());
                                str = "DefaultAudioSink";
                                Log.g(str, sbV4.toString());
                                audioTimestampPoller.b(4);
                            } else {
                                str = "DefaultAudioSink";
                                if (audioTimestampPoller.f17296b == 4) {
                                    audioTimestampPoller.a();
                                }
                            }
                        }
                    }
                    if (audioTrackPositionTracker.q) {
                        AudioTrack audioTrack4 = audioTrackPositionTracker.f17309c;
                        audioTrack4.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack4, new Object[0]);
                        int i10 = Util.f18979a;
                        long jIntValue2 = (((long) num2.intValue()) * 1000) - audioTrackPositionTracker.f17312i;
                        audioTrackPositionTracker.o = jIntValue2;
                        jMax2 = Math.max(jIntValue2, 0L);
                        audioTrackPositionTracker.o = jMax2;
                        if (jMax2 > j4) {
                            Log.g(str, "Ignoring impossibly large audio latency: " + jMax2);
                            audioTrackPositionTracker.o = 0L;
                        }
                        audioTrackPositionTracker.r = jNanoTime;
                    }
                }
            } else {
                z2 = zIsEnded;
                listener = listener2;
                f = 1.0f;
            }
            long jNanoTime2 = System.nanoTime() / 1000;
            AudioTimestampPoller audioTimestampPoller2 = audioTrackPositionTracker.f;
            audioTimestampPoller2.getClass();
            boolean z3 = audioTimestampPoller2.f17296b == 2;
            if (z3) {
                AudioTimestampPoller.AudioTimestampV19 audioTimestampV110 = audioTimestampPoller2.f17295a;
                jA = Util.r(jNanoTime2 - (audioTimestampV110 != null ? audioTimestampV110.f17300b.nanoTime / 1000 : -9223372036854775807L), audioTrackPositionTracker.j) + (((audioTimestampV110 != null ? audioTimestampV110.f17302e : -1L) * 1000000) / ((long) audioTrackPositionTracker.g));
            } else {
                jA = audioTrackPositionTracker.x == 0 ? (audioTrackPositionTracker.a() * 1000000) / ((long) audioTrackPositionTracker.g) : Util.r(audioTrackPositionTracker.f17313l + jNanoTime2, audioTrackPositionTracker.j);
                if (!z2) {
                    jA = Math.max(0L, jA - audioTrackPositionTracker.o);
                }
            }
            if (audioTrackPositionTracker.f17305E != z3) {
                audioTrackPositionTracker.G = audioTrackPositionTracker.D;
                audioTrackPositionTracker.f17306F = audioTrackPositionTracker.C;
            }
            long j7 = jNanoTime2 - audioTrackPositionTracker.G;
            if (j7 < 1000000) {
                long jR2 = Util.r(j7, audioTrackPositionTracker.j) + audioTrackPositionTracker.f17306F;
                long j8 = (j7 * 1000) / 1000000;
                jA = (((1000 - j8) * jR2) + (jA * j8)) / 1000;
            }
            if (!audioTrackPositionTracker.k) {
                long j9 = audioTrackPositionTracker.C;
                if (jA > j9) {
                    audioTrackPositionTracker.k = true;
                    long J2 = Util.J(jA - j9);
                    float f3 = audioTrackPositionTracker.j;
                    if (f3 != f) {
                        J2 = Math.round(J2 / ((double) f3));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - Util.J(J2);
                    AudioSink.Listener listener3 = DefaultAudioSink.this.r;
                    if (listener3 != null && (handler = (eventDispatcher = MediaCodecAudioRenderer.this.D1).f17291a) != null) {
                        handler.post(new RunnableC0916x(eventDispatcher, jCurrentTimeMillis, 2));
                    }
                }
            }
            audioTrackPositionTracker.D = jNanoTime2;
            audioTrackPositionTracker.C = jA;
            audioTrackPositionTracker.f17305E = z3;
            long jMin = Math.min(jA, (defaultAudioSink.i() * 1000000) / ((long) defaultAudioSink.t.f17360e));
            while (true) {
                arrayDeque = defaultAudioSink.j;
                if (arrayDeque.isEmpty() || jMin < ((DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst()).d) {
                    break;
                } else {
                    defaultAudioSink.x = (DefaultAudioSink.MediaPositionParameters) arrayDeque.remove();
                }
            }
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = defaultAudioSink.x;
            long j10 = jMin - mediaPositionParameters.d;
            boolean zEquals = mediaPositionParameters.f17366a.equals(PlaybackParameters.e0);
            DefaultAudioSink.DefaultAudioProcessorChain defaultAudioProcessorChain = defaultAudioSink.f17339b;
            if (zEquals) {
                jR = defaultAudioSink.x.f17368c + j10;
            } else if (arrayDeque.isEmpty()) {
                SonicAudioProcessor sonicAudioProcessor = defaultAudioProcessorChain.f17365c;
                if (sonicAudioProcessor.o >= 1024) {
                    long j11 = sonicAudioProcessor.f17409n;
                    Sonic sonic = sonicAudioProcessor.j;
                    sonic.getClass();
                    long j12 = j11 - ((long) ((sonic.k * sonic.f17394b) * 2));
                    int i11 = sonicAudioProcessor.f17406h.f17288a;
                    int i12 = sonicAudioProcessor.g.f17288a;
                    jF = i11 == i12 ? Util.F(j10, j12, sonicAudioProcessor.o) : Util.F(j10, j12 * ((long) i11), sonicAudioProcessor.o * ((long) i12));
                } else {
                    jF = (long) (((double) sonicAudioProcessor.f17404c) * j10);
                }
                jR = jF + defaultAudioSink.x.f17368c;
            } else {
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters2 = (DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst();
                jR = mediaPositionParameters2.f17368c - Util.r(mediaPositionParameters2.d - jMin, defaultAudioSink.x.f17366a.X);
            }
            jMax = ((defaultAudioProcessorChain.f17364b.t * 1000000) / ((long) defaultAudioSink.t.f17360e)) + jR;
        }
        if (jMax != j) {
            if (!this.L1) {
                jMax = Math.max(this.J1, jMax);
            }
            this.J1 = jMax;
            this.L1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void m() {
        DefaultAudioSink defaultAudioSink = this.E1;
        try {
            super.m();
        } finally {
            if (this.M1) {
                this.M1 = false;
                defaultAudioSink.r();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void n() {
        this.E1.o();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public final void o() {
        l0();
        DefaultAudioSink defaultAudioSink = this.E1;
        defaultAudioSink.f17335U = false;
        if (defaultAudioSink.m()) {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.f17345i;
            audioTrackPositionTracker.c();
            if (audioTrackPositionTracker.y == -9223372036854775807L) {
                AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
                audioTimestampPoller.getClass();
                audioTimestampPoller.a();
                defaultAudioSink.f17349u.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation s(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        int iJ0 = j0(mediaCodecInfo, format2);
        int i2 = this.F1;
        int i3 = decoderReuseEvaluationB.f17438e;
        if (iJ0 > i2) {
            i3 |= 64;
        }
        int i4 = i3;
        return new DecoderReuseEvaluation(mediaCodecInfo.f18170a, format, format2, i4 != 0 ? 0 : decoderReuseEvaluationB.d, i4);
    }
}
