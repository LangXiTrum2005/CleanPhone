package androidx.media3.exoplayer.audio;

import A.I0;
import A.RunnableC0887e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    public final Context F1;
    public final AudioRendererEventListener.EventDispatcher G1;
    public final DefaultAudioSink H1;
    public int I1;
    public boolean J1;
    public boolean K1;
    public Format L1;
    public Format M1;
    public long N1;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public int R1;

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
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G1;
            Handler handler = eventDispatcher.f6080a;
            if (handler != null) {
                handler.post(new c(eventDispatcher, exc, 1));
            }
        }

        public final void b() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.G0;
            if (wakeupListener != null) {
                wakeupListener.b();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public final void j(AudioSink.AudioTrackConfig audioTrackConfig) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G1;
            Handler handler = eventDispatcher.f6080a;
            if (handler != null) {
                handler.post(new b(eventDispatcher, audioTrackConfig, 1));
            }
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, Handler handler, AudioRendererEventListener audioRendererEventListener, DefaultAudioSink defaultAudioSink) {
        super(1, factory, 44100.0f);
        this.F1 = context.getApplicationContext();
        this.H1 = defaultAudioSink;
        this.R1 = -1000;
        this.G1 = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        defaultAudioSink.s = new AudioSinkListener();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float K(float f, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i2 = format.f5401B;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList L(androidx.media3.exoplayer.mediacodec.d dVar, Format format, boolean z2) {
        Collection collectionG;
        if (format.m == null) {
            collectionG = ImmutableList.x();
        } else if (this.H1.u(format)) {
            List listE = MediaCodecUtil.e("audio/raw", false, false);
            MediaCodecInfo mediaCodecInfo = listE.isEmpty() ? null : (MediaCodecInfo) listE.get(0);
            if (mediaCodecInfo != null) {
                collectionG = ImmutableList.z(mediaCodecInfo);
            } else {
                collectionG = MediaCodecUtil.g(dVar, format, z2, false);
            }
        } else {
            collectionG = MediaCodecUtil.g(dVar, format, z2, false);
        }
        Pattern pattern = MediaCodecUtil.f6305a;
        ArrayList arrayList = new ArrayList(collectionG);
        Collections.sort(arrayList, new androidx.media3.exoplayer.mediacodec.f(new androidx.media3.exoplayer.mediacodec.e(format)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecAdapter.Configuration M(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f) {
        boolean z2;
        Format[] formatArr = this.k0;
        formatArr.getClass();
        int iU0 = u0(mediaCodecInfo, format);
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (mediaCodecInfo.b(format, format2).d != 0) {
                    iU0 = Math.max(iU0, u0(mediaCodecInfo, format2));
                }
            }
        }
        this.I1 = iU0;
        int i2 = Util.f5683a;
        String str = mediaCodecInfo.f6292a;
        if (i2 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Util.f5685c)) {
            String str2 = Util.f5684b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.J1 = z2;
        this.K1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        int i3 = this.I1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mediaCodecInfo.f6294c);
        mediaFormat.setInteger("channel-count", format.f5400A);
        int i4 = format.f5401B;
        mediaFormat.setInteger("sample-rate", i4);
        MediaFormatUtil.b(mediaFormat, format.f5414p);
        MediaFormatUtil.a(mediaFormat, "max-input-size", i3);
        if (i2 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                if (i2 == 23) {
                    String str3 = Util.d;
                    if (!"ZTE B2017G".equals(str3) && !"AXON 7 mini".equals(str3)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str4 = format.m;
        if (i2 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24) {
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l("audio/raw");
            builder.f5434z = format.f5400A;
            builder.f5418A = i4;
            builder.f5419B = 4;
            if (this.H1.f(new Format(builder)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.R1));
        }
        this.M1 = (!"audio/raw".equals(mediaCodecInfo.f6293b) || "audio/raw".equals(str4)) ? null : format;
        return new MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void P(DecoderInputBuffer decoderInputBuffer) {
        Format format;
        DefaultAudioSink.Configuration configuration;
        if (Util.f5683a < 29 || (format = decoderInputBuffer.f5801Y) == null || !Objects.equals(format.m, "audio/opus") || !this.j1) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.h0;
        byteBuffer.getClass();
        Format format2 = decoderInputBuffer.f5801Y;
        format2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            DefaultAudioSink defaultAudioSink = this.H1;
            AudioTrack audioTrack = defaultAudioSink.f6143w;
            if (audioTrack == null || !DefaultAudioSink.m(audioTrack) || (configuration = defaultAudioSink.f6142u) == null || !configuration.k) {
                return;
            }
            defaultAudioSink.f6143w.setOffloadDelayPadding(format2.D, i2);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void U(Exception exc) {
        Log.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        Handler handler = eventDispatcher.f6080a;
        if (handler != null) {
            handler.post(new c(eventDispatcher, exc, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void V(String str, long j, long j2) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        Handler handler = eventDispatcher.f6080a;
        if (handler != null) {
            handler.post(new d(eventDispatcher, str, j, j2, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void W(String str) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        Handler handler = eventDispatcher.f6080a;
        if (handler != null) {
            handler.post(new I0(12, eventDispatcher, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation X(FormatHolder formatHolder) {
        Format format = formatHolder.f5911b;
        format.getClass();
        this.L1 = format;
        DecoderReuseEvaluation decoderReuseEvaluationX = super.X(formatHolder);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        Handler handler = eventDispatcher.f6080a;
        if (handler != null) {
            handler.post(new RunnableC0887e(eventDispatcher, format, decoderReuseEvaluationX, 13));
        }
        return decoderReuseEvaluationX;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fb A[Catch: ConfigurationException -> 0x00f9, TryCatch #0 {ConfigurationException -> 0x00f9, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:52:0x00fb, B:53:0x00fe), top: B:57:0x00d9 }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Y(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iW;
        int i2;
        Format format2 = this.M1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.L0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(format.m)) {
                iW = format.C;
            } else if (Util.f5683a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iW = mediaFormat.containsKey("v-bits-per-sample") ? Util.w(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iW = mediaFormat.getInteger("pcm-encoding");
            }
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l("audio/raw");
            builder.f5419B = iW;
            builder.C = format.D;
            builder.D = format.f5402E;
            builder.j = format.k;
            builder.f5423a = format.f5406a;
            builder.f5424b = format.f5407b;
            builder.f5425c = ImmutableList.u(format.f5408c);
            builder.d = format.d;
            builder.f5426e = format.f5409e;
            builder.f = format.f;
            builder.f5434z = mediaFormat.getInteger("channel-count");
            builder.f5418A = mediaFormat.getInteger("sample-rate");
            Format format3 = new Format(builder);
            boolean z2 = this.J1;
            int i3 = format3.f5400A;
            if (z2 && i3 == 6 && (i2 = format.f5400A) < 6) {
                iArr = new int[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr[i4] = i4;
                }
            } else if (this.K1) {
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            format = format3;
        }
        try {
            int i5 = Util.f5683a;
            DefaultAudioSink defaultAudioSink = this.H1;
            if (i5 >= 29) {
                if (this.j1) {
                    RendererConfiguration rendererConfiguration = this.e0;
                    rendererConfiguration.getClass();
                    if (rendererConfiguration.f5982a != 0) {
                        RendererConfiguration rendererConfiguration2 = this.e0;
                        rendererConfiguration2.getClass();
                        defaultAudioSink.t(rendererConfiguration2.f5982a);
                    } else {
                        defaultAudioSink.t(0);
                    }
                } else {
                    defaultAudioSink.t(0);
                }
            }
            defaultAudioSink.b(format, iArr);
        } catch (AudioSink.ConfigurationException e2) {
            throw o(e2, e2.X, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Z(long j) {
        this.H1.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void b0() {
        this.H1.M = true;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        DefaultAudioSink defaultAudioSink = this.H1;
        defaultAudioSink.getClass();
        defaultAudioSink.D = new PlaybackParameters(Util.i(playbackParameters.f5494a, 0.1f, 8.0f), Util.i(playbackParameters.f5495b, 0.1f, 8.0f));
        if (defaultAudioSink.v()) {
            defaultAudioSink.s();
            return;
        }
        DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(playbackParameters, -9223372036854775807L, -9223372036854775807L);
        if (defaultAudioSink.l()) {
            defaultAudioSink.f6118B = mediaPositionParameters;
        } else {
            defaultAudioSink.C = mediaPositionParameters;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean f0(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i4, long j3, boolean z2, boolean z3, Format format) throws ExoPlaybackException {
        int i5;
        int i6;
        byteBuffer.getClass();
        if (this.M1 != null && (i3 & 2) != 0) {
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.j(i2, false);
            return true;
        }
        DefaultAudioSink defaultAudioSink = this.H1;
        if (z2) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.j(i2, false);
            }
            this.A1.f += i4;
            defaultAudioSink.M = true;
            return true;
        }
        try {
            if (!defaultAudioSink.i(byteBuffer, j3, i4)) {
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.j(i2, false);
            }
            this.A1.f5826e += i4;
            return true;
        } catch (AudioSink.InitializationException e2) {
            Format format2 = this.L1;
            if (this.j1) {
                RendererConfiguration rendererConfiguration = this.e0;
                rendererConfiguration.getClass();
                if (rendererConfiguration.f5982a != 0) {
                    i6 = IronSourceConstants.errorCode_showInProgress;
                } else {
                    i6 = IronSourceConstants.errorCode_biddingDataException;
                }
            } else {
                i6 = IronSourceConstants.errorCode_biddingDataException;
            }
            throw o(e2, format2, e2.f6086Y, i6);
        } catch (AudioSink.WriteException e3) {
            if (this.j1) {
                RendererConfiguration rendererConfiguration2 = this.e0;
                rendererConfiguration2.getClass();
                if (rendererConfiguration2.f5982a != 0) {
                    i5 = IronSourceConstants.errorCode_loadInProgress;
                } else {
                    i5 = IronSourceConstants.errorCode_isReadyException;
                }
            } else {
                i5 = IronSourceConstants.errorCode_isReadyException;
            }
            throw o(e3, format, e3.f6087Y, i5);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.H1.D;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        if (this.i0 == 2) {
            v0();
        }
        return this.N1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        DefaultAudioSink defaultAudioSink = this.H1;
        if (i2 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (defaultAudioSink.f6124P != fFloatValue) {
                defaultAudioSink.f6124P = fFloatValue;
                if (defaultAudioSink.l()) {
                    if (Util.f5683a >= 21) {
                        defaultAudioSink.f6143w.setVolume(defaultAudioSink.f6124P);
                        return;
                    }
                    AudioTrack audioTrack = defaultAudioSink.f6143w;
                    float f = defaultAudioSink.f6124P;
                    audioTrack.setStereoVolume(f, f);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 3) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            audioAttributes.getClass();
            if (defaultAudioSink.f6117A.equals(audioAttributes)) {
                return;
            }
            defaultAudioSink.f6117A = audioAttributes;
            if (defaultAudioSink.f6135d0) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = defaultAudioSink.y;
            if (audioCapabilitiesReceiver != null) {
                audioCapabilitiesReceiver.f6067i = audioAttributes;
                audioCapabilitiesReceiver.a(AudioCapabilities.c(audioCapabilitiesReceiver.f6062a, audioAttributes, audioCapabilitiesReceiver.f6066h));
            }
            defaultAudioSink.d();
            return;
        }
        if (i2 == 6) {
            AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
            auxEffectInfo.getClass();
            if (defaultAudioSink.f6132b0.equals(auxEffectInfo)) {
                return;
            }
            if (defaultAudioSink.f6143w != null) {
                defaultAudioSink.f6132b0.getClass();
            }
            defaultAudioSink.f6132b0 = auxEffectInfo;
            return;
        }
        if (i2 == 12) {
            if (Util.f5683a >= 23) {
                Api23.a(defaultAudioSink, obj);
                return;
            }
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.R1 = ((Integer) obj).intValue();
            MediaCodecAdapter mediaCodecAdapter = this.L0;
            if (mediaCodecAdapter != null && Util.f5683a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.R1));
                mediaCodecAdapter.a(bundle);
                return;
            }
            return;
        }
        if (i2 == 9) {
            obj.getClass();
            defaultAudioSink.f6119E = ((Boolean) obj).booleanValue();
            DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new DefaultAudioSink.MediaPositionParameters(defaultAudioSink.v() ? PlaybackParameters.d : defaultAudioSink.D, -9223372036854775807L, -9223372036854775807L);
            if (defaultAudioSink.l()) {
                defaultAudioSink.f6118B = mediaPositionParameters;
                return;
            } else {
                defaultAudioSink.C = mediaPositionParameters;
                return;
            }
        }
        if (i2 != 10) {
            super.handleMessage(i2, obj);
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (defaultAudioSink.a0 != iIntValue) {
            defaultAudioSink.a0 = iIntValue;
            defaultAudioSink.Z = iIntValue != 0;
            defaultAudioSink.d();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void i0() throws ExoPlaybackException {
        try {
            DefaultAudioSink defaultAudioSink = this.H1;
            if (!defaultAudioSink.f6128V && defaultAudioSink.l() && defaultAudioSink.c()) {
                defaultAudioSink.p();
                defaultAudioSink.f6128V = true;
            }
        } catch (AudioSink.WriteException e2) {
            throw o(e2, e2.Z, e2.f6087Y, this.j1 ? IronSourceConstants.errorCode_loadInProgress : IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        if (!this.w1) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.H1;
        if (defaultAudioSink.l()) {
            return defaultAudioSink.f6128V && !defaultAudioSink.j();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return this.H1.j() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean j() {
        boolean z2 = this.Q1;
        this.Q1 = false;
        return z2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean o0(Format format) {
        RendererConfiguration rendererConfiguration = this.e0;
        rendererConfiguration.getClass();
        if (rendererConfiguration.f5982a != 0) {
            int iT0 = t0(format);
            if ((iT0 & 512) != 0) {
                RendererConfiguration rendererConfiguration2 = this.e0;
                rendererConfiguration2.getClass();
                if (rendererConfiguration2.f5982a == 2 || (iT0 & 1024) != 0) {
                    return true;
                }
                if (format.D == 0 && format.f5402E == 0) {
                    return true;
                }
            }
        }
        return this.H1.u(format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void p() {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        this.P1 = true;
        this.L1 = null;
        try {
            this.H1.d();
            try {
                super.p();
            } finally {
                eventDispatcher.a(this.A1);
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
                eventDispatcher.a(this.A1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int p0(androidx.media3.exoplayer.mediacodec.d dVar, Format format) {
        int iT0;
        List listG;
        MediaCodecInfo mediaCodecInfo;
        boolean z2;
        if (!MimeTypes.h(format.m)) {
            return RendererCapabilities.h(0, 0, 0, 0);
        }
        int i2 = Util.f5683a >= 21 ? 32 : 0;
        boolean z3 = true;
        int i3 = format.f5405J;
        boolean z4 = i3 != 0;
        boolean z5 = i3 == 0 || i3 == 2;
        int i4 = 8;
        DefaultAudioSink defaultAudioSink = this.H1;
        if (z5) {
            if (z4) {
                List listE = MediaCodecUtil.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : (MediaCodecInfo) listE.get(0)) == null) {
                    iT0 = 0;
                }
            }
            iT0 = t0(format);
            if (defaultAudioSink.u(format)) {
                return RendererCapabilities.h(4, 8, i2, iT0);
            }
        } else {
            iT0 = 0;
        }
        String str = format.m;
        if ("audio/raw".equals(str) && !defaultAudioSink.u(format)) {
            return RendererCapabilities.h(1, 0, 0, 0);
        }
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l("audio/raw");
        builder.f5434z = format.f5400A;
        builder.f5418A = format.f5401B;
        builder.f5419B = 2;
        if (!defaultAudioSink.u(new Format(builder))) {
            return RendererCapabilities.h(1, 0, 0, 0);
        }
        if (str == null) {
            listG = ImmutableList.x();
        } else if (defaultAudioSink.u(format)) {
            List listE2 = MediaCodecUtil.e("audio/raw", false, false);
            MediaCodecInfo mediaCodecInfo2 = listE2.isEmpty() ? null : (MediaCodecInfo) listE2.get(0);
            if (mediaCodecInfo2 != null) {
                listG = ImmutableList.z(mediaCodecInfo2);
            } else {
                listG = MediaCodecUtil.g(dVar, format, false, false);
            }
        } else {
            listG = MediaCodecUtil.g(dVar, format, false, false);
        }
        if (((AbstractCollection) listG).isEmpty()) {
            return RendererCapabilities.h(1, 0, 0, 0);
        }
        if (!z5) {
            return RendererCapabilities.h(2, 0, 0, 0);
        }
        MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) listG.get(0);
        boolean zD = mediaCodecInfo3.d(format);
        if (!zD) {
            int i5 = 1;
            while (true) {
                if (i5 >= listG.size()) {
                    mediaCodecInfo = mediaCodecInfo3;
                    z2 = true;
                    z3 = zD;
                    break;
                }
                mediaCodecInfo = (MediaCodecInfo) listG.get(i5);
                if (mediaCodecInfo.d(format)) {
                    z2 = false;
                    break;
                }
                i5++;
            }
        } else {
            mediaCodecInfo = mediaCodecInfo3;
            z2 = true;
            z3 = zD;
            break;
        }
        int i6 = z3 ? 4 : 3;
        if (z3 && mediaCodecInfo.e(format)) {
            i4 = 16;
        }
        return (mediaCodecInfo.g ? 64 : 0) | i2 | i6 | i4 | (z2 ? 128 : 0) | iT0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void q(boolean z2, boolean z3) {
        super.q(z2, z3);
        DecoderCounters decoderCounters = this.A1;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.G1;
        Handler handler = eventDispatcher.f6080a;
        if (handler != null) {
            handler.post(new a(eventDispatcher, decoderCounters, 0));
        }
        RendererConfiguration rendererConfiguration = this.e0;
        rendererConfiguration.getClass();
        boolean z4 = rendererConfiguration.f5983b;
        DefaultAudioSink defaultAudioSink = this.H1;
        if (z4) {
            defaultAudioSink.getClass();
            Assertions.e(Util.f5683a >= 21);
            Assertions.e(defaultAudioSink.Z);
            if (!defaultAudioSink.f6135d0) {
                defaultAudioSink.f6135d0 = true;
                defaultAudioSink.d();
            }
        } else if (defaultAudioSink.f6135d0) {
            defaultAudioSink.f6135d0 = false;
            defaultAudioSink.d();
        }
        PlayerId playerId = this.g0;
        playerId.getClass();
        defaultAudioSink.r = playerId;
        SystemClock systemClock = this.h0;
        systemClock.getClass();
        defaultAudioSink.f6138i.f6101J = systemClock;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        super.r(j, z2);
        this.H1.d();
        this.N1 = j;
        this.Q1 = false;
        this.O1 = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void s() {
        AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.H1.y;
        if (audioCapabilitiesReceiver == null || !audioCapabilitiesReceiver.j) {
            return;
        }
        audioCapabilitiesReceiver.g = null;
        int i2 = Util.f5683a;
        Context context = audioCapabilitiesReceiver.f6062a;
        if (i2 >= 23 && (audioDeviceCallbackV23 = audioCapabilitiesReceiver.d) != null) {
            AudioCapabilitiesReceiver.Api23.b(context, audioDeviceCallbackV23);
        }
        BroadcastReceiver broadcastReceiver = audioCapabilitiesReceiver.f6065e;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
        AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver.f;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.f6069a.unregisterContentObserver(externalSurroundSoundSettingObserver);
        }
        audioCapabilitiesReceiver.j = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void t() {
        DefaultAudioSink defaultAudioSink = this.H1;
        this.Q1 = false;
        try {
            super.t();
        } finally {
            if (this.P1) {
                this.P1 = false;
                defaultAudioSink.r();
            }
        }
    }

    public final int t0(Format format) {
        AudioOffloadSupport audioOffloadSupportE = this.H1.e(format);
        if (!audioOffloadSupportE.f6074a) {
            return 0;
        }
        int i2 = audioOffloadSupportE.f6075b ? 1536 : 512;
        return audioOffloadSupportE.f6076c ? i2 | com.p004ironsource.mediationsdk.metadata.a.f25965n : i2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void u() {
        this.H1.o();
    }

    public final int u0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.f6292a) || (i2 = Util.f5683a) >= 24 || (i2 == 23 && Util.H(this.F1))) {
            return format.f5413n;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void v() {
        v0();
        DefaultAudioSink defaultAudioSink = this.H1;
        defaultAudioSink.f6129Y = false;
        if (defaultAudioSink.l()) {
            AudioTrackPositionTracker audioTrackPositionTracker = defaultAudioSink.f6138i;
            audioTrackPositionTracker.d();
            if (audioTrackPositionTracker.y == -9223372036854775807L) {
                AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
                audioTimestampPoller.getClass();
                audioTimestampPoller.a();
            } else {
                audioTrackPositionTracker.f6096A = audioTrackPositionTracker.b();
                if (!DefaultAudioSink.m(defaultAudioSink.f6143w)) {
                    return;
                }
            }
            defaultAudioSink.f6143w.pause();
        }
    }

    public final void v0() {
        long jMax;
        ArrayDeque arrayDeque;
        long jV;
        boolean zIsEnded = isEnded();
        final DefaultAudioSink defaultAudioSink = this.H1;
        if (!defaultAudioSink.l() || defaultAudioSink.f6123N) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(defaultAudioSink.f6138i.a(zIsEnded), Util.M(defaultAudioSink.f6142u.f6153e, defaultAudioSink.h()));
            while (true) {
                arrayDeque = defaultAudioSink.j;
                if (arrayDeque.isEmpty() || jMin < ((DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst()).f6162c) {
                    break;
                } else {
                    defaultAudioSink.C = (DefaultAudioSink.MediaPositionParameters) arrayDeque.remove();
                }
            }
            long jB = jMin - defaultAudioSink.C.f6162c;
            boolean zIsEmpty = arrayDeque.isEmpty();
            DefaultAudioSink.DefaultAudioProcessorChain defaultAudioProcessorChain = defaultAudioSink.f6131b;
            if (zIsEmpty) {
                androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor = defaultAudioProcessorChain.f6159c;
                if (sonicAudioProcessor.isActive()) {
                    jB = sonicAudioProcessor.b(jB);
                }
                jV = defaultAudioSink.C.f6161b + jB;
            } else {
                DefaultAudioSink.MediaPositionParameters mediaPositionParameters = (DefaultAudioSink.MediaPositionParameters) arrayDeque.getFirst();
                jV = mediaPositionParameters.f6161b - Util.v(mediaPositionParameters.f6162c - jMin, defaultAudioSink.C.f6160a.f5494a);
            }
            long j = defaultAudioProcessorChain.f6158b.q;
            jMax = Util.M(defaultAudioSink.f6142u.f6153e, j) + jV;
            long j2 = defaultAudioSink.j0;
            if (j > j2) {
                long jM = Util.M(defaultAudioSink.f6142u.f6153e, j - j2);
                defaultAudioSink.j0 = j;
                defaultAudioSink.k0 += jM;
                if (defaultAudioSink.l0 == null) {
                    defaultAudioSink.l0 = new Handler(Looper.myLooper());
                }
                defaultAudioSink.l0.removeCallbacksAndMessages(null);
                defaultAudioSink.l0.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink defaultAudioSink2 = defaultAudioSink;
                        if (defaultAudioSink2.k0 >= 300000) {
                            MediaCodecAudioRenderer.this.Q1 = true;
                            defaultAudioSink2.k0 = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.O1) {
                jMax = Math.max(this.N1, jMax);
            }
            this.N1 = jMax;
            this.O1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation z(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        boolean z2 = this.F0 == null && o0(format2);
        int i2 = decoderReuseEvaluationB.f5833e;
        if (z2) {
            i2 |= 32768;
        }
        if (u0(mediaCodecInfo, format2) > this.I1) {
            i2 |= 64;
        }
        int i3 = i2;
        return new DecoderReuseEvaluation(mediaCodecInfo.f6292a, format, format2, i3 == 0 ? decoderReuseEvaluationB.d : 0, i3);
    }
}
