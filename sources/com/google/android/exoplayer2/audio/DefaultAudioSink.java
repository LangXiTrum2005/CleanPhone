package com.google.android.exoplayer2.audio;

import A.I0;
import A.K;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.audio.i;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.c;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Object f17324d0 = new Object();
    public static ExecutorService e0;
    public static int f0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f17325A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f17326B;
    public long C;
    public long D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f17327E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f17328F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f17329I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f17330J;
    public AudioProcessor[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f17331N;
    public ByteBuffer O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public byte[] f17332P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f17333Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f17334R;
    public boolean S;
    public boolean T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f17335U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f17336V;
    public int W;
    public AuxEffectInfo X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AudioDeviceInfoApi23 f17337Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioCapabilities f17338a;
    public long a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultAudioProcessorChain f17339b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f17340b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17341c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f17342c0;
    public final ChannelMappingAudioProcessor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TrimmingAudioProcessor f17343e;
    public final AudioProcessor[] f;
    public final AudioProcessor[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionVariable f17344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AudioTrackPositionTracker f17345i;
    public final ArrayDeque j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17346l;
    public StreamEventCallbackV29 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PendingExceptionHolder f17347n;
    public final PendingExceptionHolder o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DefaultAudioTrackBufferSizeProvider f17348p;
    public PlayerId q;
    public AudioSink.Listener r;
    public Configuration s;
    public Configuration t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f17349u;
    public AudioAttributes v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MediaPositionParameters f17350w;
    public MediaPositionParameters x;
    public PlaybackParameters y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f17351z;

    public static final class Api23 {
        public static void a(AudioTrack audioTrack, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.f17352a);
        }
    }

    public static final class Api31 {
        public static void a(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionIdA = playerId.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public static final class AudioDeviceInfoApi23 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioDeviceInfo f17352a;

        public AudioDeviceInfoApi23(AudioDeviceInfo audioDeviceInfo) {
            this.f17352a = audioDeviceInfo;
        }
    }

    @Deprecated
    public interface AudioProcessorChain extends com.google.android.exoplayer2.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultAudioTrackBufferSizeProvider f17353a = new DefaultAudioTrackBufferSizeProvider();
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AudioCapabilities f17354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DefaultAudioProcessorChain f17355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DefaultAudioTrackBufferSizeProvider f17356c;
    }

    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f17357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17359c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17360e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f17361h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioProcessor[] f17362i;

        public Configuration(Format format, int i2, int i3, int i4, int i5, int i6, int i7, int i8, AudioProcessor[] audioProcessorArr) {
            this.f17357a = format;
            this.f17358b = i2;
            this.f17359c = i3;
            this.d = i4;
            this.f17360e = i5;
            this.f = i6;
            this.g = i7;
            this.f17361h = i8;
            this.f17362i = audioProcessorArr;
        }

        public static android.media.AudioAttributes c(AudioAttributes audioAttributes, boolean z2) {
            return z2 ? new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.a().f17280a;
        }

        public final AudioTrack a(boolean z2, AudioAttributes audioAttributes, int i2) throws AudioSink.InitializationException {
            int i3 = this.f17359c;
            try {
                AudioTrack audioTrackB = b(z2, audioAttributes, i2);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f17360e, this.f, this.f17361h, this.f17357a, i3 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new AudioSink.InitializationException(0, this.f17360e, this.f, this.f17361h, this.f17357a, i3 == 1, e2);
            }
        }

        public final AudioTrack b(boolean z2, AudioAttributes audioAttributes, int i2) {
            int i3 = Util.f18979a;
            int i4 = this.g;
            int i5 = this.f;
            int i6 = this.f17360e;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(c(audioAttributes, z2)).setAudioFormat(DefaultAudioSink.e(i6, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.f17361h).setSessionId(i2).setOffloadedPlayback(this.f17359c == 1).build();
            }
            if (i3 >= 21) {
                return new AudioTrack(c(audioAttributes, z2), DefaultAudioSink.e(i6, i5, i4), this.f17361h, 1, i2);
            }
            int iU = Util.u(audioAttributes.Z);
            if (i2 == 0) {
                return new AudioTrack(iU, this.f17360e, this.f, this.g, this.f17361h, 1);
            }
            return new AudioTrack(iU, this.f17360e, this.f, this.g, this.f17361h, 1, i2);
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f17363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SilenceSkippingAudioProcessor f17364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SonicAudioProcessor f17365c;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            sonicAudioProcessor.f17404c = 1.0f;
            sonicAudioProcessor.d = 1.0f;
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f17287e;
            sonicAudioProcessor.f17405e = audioFormat;
            sonicAudioProcessor.f = audioFormat;
            sonicAudioProcessor.g = audioFormat;
            sonicAudioProcessor.f17406h = audioFormat;
            ByteBuffer byteBuffer = AudioProcessor.f17286a;
            sonicAudioProcessor.k = byteBuffer;
            sonicAudioProcessor.f17408l = byteBuffer.asShortBuffer();
            sonicAudioProcessor.m = byteBuffer;
            sonicAudioProcessor.f17403b = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f17363a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f17364b = silenceSkippingAudioProcessor;
            this.f17365c = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class MediaPositionParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaybackParameters f17366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17368c;
        public final long d;

        public MediaPositionParameters(PlaybackParameters playbackParameters, boolean z2, long j, long j2) {
            this.f17366a = playbackParameters;
            this.f17367b = z2;
            this.f17368c = j;
            this.d = j2;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Exception f17369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f17370b;

        public final void a(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f17369a == null) {
                this.f17369a = exc;
                this.f17370b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f17370b) {
                Exception exc2 = this.f17369a;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f17369a;
                this.f17369a = null;
                throw exc3;
            }
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        public PositionTrackerListener() {
        }
    }

    public final class StreamEventCallbackV29 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f17372a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f17373b = new AudioTrack$StreamEventCallback() { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29.1
            public final void onDataRequest(AudioTrack audioTrack, int i2) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.f17349u) && (listener = (defaultAudioSink = DefaultAudioSink.this).r) != null && defaultAudioSink.f17335U) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).b();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.f17349u) && (listener = (defaultAudioSink = DefaultAudioSink.this).r) != null && defaultAudioSink.f17335U) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).b();
                }
            }
        };

        public StreamEventCallbackV29() {
        }
    }

    public DefaultAudioSink(Builder builder) {
        this.f17338a = builder.f17354a;
        DefaultAudioProcessorChain defaultAudioProcessorChain = builder.f17355b;
        this.f17339b = defaultAudioProcessorChain;
        int i2 = Util.f18979a;
        this.f17341c = false;
        this.k = false;
        this.f17346l = 0;
        this.f17348p = builder.f17356c;
        ConditionVariable conditionVariable = new ConditionVariable(0);
        this.f17344h = conditionVariable;
        conditionVariable.d();
        this.f17345i = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.d = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        trimmingAudioProcessor.m = Util.f;
        this.f17343e = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, defaultAudioProcessorChain.f17363a);
        this.f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.g = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.f17330J = 1.0f;
        this.v = AudioAttributes.h0;
        this.W = 0;
        this.X = new AuxEffectInfo();
        PlaybackParameters playbackParameters = PlaybackParameters.e0;
        this.x = new MediaPositionParameters(playbackParameters, false, 0L, 0L);
        this.y = playbackParameters;
        this.f17334R = -1;
        this.K = new AudioProcessor[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.f17347n = new PendingExceptionHolder();
        this.o = new PendingExceptionHolder();
    }

    public static AudioFormat e(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return Util.f18979a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        PlaybackParameters playbackParameters;
        boolean z2;
        AudioRendererEventListener.EventDispatcher eventDispatcher;
        Handler handler;
        boolean zU = u();
        DefaultAudioProcessorChain defaultAudioProcessorChain = this.f17339b;
        if (zU) {
            playbackParameters = g().f17366a;
            defaultAudioProcessorChain.getClass();
            float f = playbackParameters.X;
            SonicAudioProcessor sonicAudioProcessor = defaultAudioProcessorChain.f17365c;
            if (sonicAudioProcessor.f17404c != f) {
                sonicAudioProcessor.f17404c = f;
                sonicAudioProcessor.f17407i = true;
            }
            float f2 = sonicAudioProcessor.d;
            float f3 = playbackParameters.f17185Y;
            if (f2 != f3) {
                sonicAudioProcessor.d = f3;
                sonicAudioProcessor.f17407i = true;
            }
        } else {
            playbackParameters = PlaybackParameters.e0;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        int i2 = 0;
        if (u()) {
            boolean z3 = g().f17367b;
            defaultAudioProcessorChain.f17364b.m = z3;
            z2 = z3;
        } else {
            z2 = false;
        }
        this.j.add(new MediaPositionParameters(playbackParameters2, z2, Math.max(0L, j), (i() * 1000000) / ((long) this.t.f17360e)));
        AudioProcessor[] audioProcessorArr = this.t.f17362i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.K = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            AudioProcessor[] audioProcessorArr2 = this.K;
            if (i2 >= audioProcessorArr2.length) {
                break;
            }
            AudioProcessor audioProcessor2 = audioProcessorArr2[i2];
            audioProcessor2.flush();
            this.L[i2] = audioProcessor2.getOutput();
            i2++;
        }
        AudioSink.Listener listener = this.r;
        if (listener == null || (handler = (eventDispatcher = MediaCodecAudioRenderer.this.D1).f17291a) == null) {
            return;
        }
        handler.post(new K(5, eventDispatcher, z2));
    }

    public final void b(Format format, int[] iArr) {
        AudioProcessor[] audioProcessorArr;
        int iIntValue;
        int iIntValue2;
        int i2;
        int i3;
        int iJ;
        int iA;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(format.m0);
        int iT = -1;
        int i4 = format.A0;
        int i5 = format.z0;
        if (zEquals) {
            int i6 = format.B0;
            Assertions.b(Util.z(i6));
            int iT2 = Util.t(i6, i5);
            AudioProcessor[] audioProcessorArr2 = (this.f17341c && (i6 == 536870912 || i6 == 805306368 || i6 == 4)) ? this.g : this.f;
            int i7 = format.C0;
            TrimmingAudioProcessor trimmingAudioProcessor = this.f17343e;
            trimmingAudioProcessor.f17411i = i7;
            trimmingAudioProcessor.j = format.D0;
            if (Util.f18979a < 21 && i5 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.f17323i = iArr2;
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(i4, i5, i6);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.AudioFormat audioFormatA = audioProcessor.a(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatA;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                    throw new AudioSink.ConfigurationException(e2, format);
                }
            }
            int i9 = audioFormat.f17290c;
            int i10 = audioFormat.f17289b;
            int iN = Util.n(i10);
            iIntValue = i9;
            iT = Util.t(i9, i10);
            i4 = audioFormat.f17288a;
            audioProcessorArr = audioProcessorArr2;
            i3 = iT2;
            iIntValue2 = iN;
            i2 = 0;
        } else {
            audioProcessorArr = new AudioProcessor[0];
            if (v(format, this.v)) {
                String str = format.m0;
                str.getClass();
                int iB = MimeTypes.b(str, format.j0);
                i2 = 1;
                iIntValue2 = Util.n(i5);
                iIntValue = iB;
            } else {
                Pair pairB = this.f17338a.b(format);
                if (pairB == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) pairB.first).intValue();
                iIntValue2 = ((Integer) pairB.second).intValue();
                i2 = 2;
            }
            i3 = iT;
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i2 + ") for: " + format, format);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i2 + ") for: " + format, format);
        }
        DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider = this.f17348p;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue2, iIntValue);
        Assertions.d(minBufferSize != -2);
        int i11 = iT != -1 ? iT : 1;
        double d = this.k ? 8.0d : 1.0d;
        defaultAudioTrackBufferSizeProvider.getClass();
        if (i2 == 0) {
            i11 = i11;
            long j = i4;
            long j2 = i11;
            iJ = Util.j(minBufferSize * 4, Ints.b(((((long) 250000) * j) * j2) / 1000000), Ints.b(((((long) 750000) * j) * j2) / 1000000));
        } else if (i2 == 1) {
            iJ = Ints.b((((long) 50000000) * ((long) DefaultAudioTrackBufferSizeProvider.a(iIntValue))) / 1000000);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            int i12 = iIntValue == 5 ? 500000 : 250000;
            int i13 = format.i0;
            if (i13 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                iA = IntMath.c(i13, 8);
            } else {
                iA = DefaultAudioTrackBufferSizeProvider.a(iIntValue);
            }
            iJ = Ints.b((((long) i12) * ((long) iA)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + i11) - 1) / i11) * i11;
        this.f17340b0 = false;
        Configuration configuration = new Configuration(format, i3, i2, iT, i4, iIntValue2, iIntValue, iMax, audioProcessorArr);
        if (m()) {
            this.s = configuration;
        } else {
            this.t = configuration;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.f17334R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f17334R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f17334R
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.q(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.f17334R
            int r0 = r0 + r1
            r9.f17334R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.w(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.f17334R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.c():boolean");
    }

    public final void d() {
        if (m()) {
            this.f17326B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.f17327E = 0L;
            this.f17342c0 = false;
            this.f17328F = 0;
            this.x = new MediaPositionParameters(g().f17366a, g().f17367b, 0L, 0L);
            this.f17329I = 0L;
            this.f17350w = null;
            this.j.clear();
            this.M = null;
            this.f17331N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.f17334R = -1;
            this.f17351z = null;
            this.f17325A = 0;
            this.f17343e.o = 0L;
            int i2 = 0;
            while (true) {
                AudioProcessor[] audioProcessorArr = this.K;
                if (i2 >= audioProcessorArr.length) {
                    break;
                }
                AudioProcessor audioProcessor = audioProcessorArr[i2];
                audioProcessor.flush();
                this.L[i2] = audioProcessor.getOutput();
                i2++;
            }
            AudioTrack audioTrack = this.f17345i.f17309c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f17349u.pause();
            }
            if (n(this.f17349u)) {
                StreamEventCallbackV29 streamEventCallbackV29 = this.m;
                streamEventCallbackV29.getClass();
                this.f17349u.unregisterStreamEventCallback(streamEventCallbackV29.f17373b);
                streamEventCallbackV29.f17372a.removeCallbacksAndMessages(null);
            }
            if (Util.f18979a < 21 && !this.f17336V) {
                this.W = 0;
            }
            Configuration configuration = this.s;
            if (configuration != null) {
                this.t = configuration;
                this.s = null;
            }
            AudioTrackPositionTracker audioTrackPositionTracker = this.f17345i;
            audioTrackPositionTracker.c();
            audioTrackPositionTracker.f17309c = null;
            audioTrackPositionTracker.f = null;
            AudioTrack audioTrack2 = this.f17349u;
            ConditionVariable conditionVariable = this.f17344h;
            conditionVariable.c();
            synchronized (f17324d0) {
                try {
                    if (e0 == null) {
                        e0 = Executors.newSingleThreadExecutor(new c("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f0++;
                    e0.execute(new I0(28, audioTrack2, conditionVariable));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f17349u = null;
        }
        this.o.f17369a = null;
        this.f17347n.f17369a = null;
    }

    public final int f(Format format) {
        if ("audio/raw".equals(format.m0)) {
            int i2 = format.B0;
            if (!Util.z(i2)) {
                Z.s(i2, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i2 != 2 && (!this.f17341c || i2 != 4)) {
                return 1;
            }
        } else if ((this.f17340b0 || !v(format, this.v)) && this.f17338a.b(format) == null) {
            return 0;
        }
        return 2;
    }

    public final MediaPositionParameters g() {
        MediaPositionParameters mediaPositionParameters = this.f17350w;
        if (mediaPositionParameters != null) {
            return mediaPositionParameters;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (MediaPositionParameters) arrayDeque.getLast() : this.x;
    }

    public final long h() {
        Configuration configuration = this.t;
        return configuration.f17359c == 0 ? this.f17326B / ((long) configuration.f17358b) : this.C;
    }

    public final long i() {
        Configuration configuration = this.t;
        return configuration.f17359c == 0 ? this.D / ((long) configuration.d) : this.f17327E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:158:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0316  */
    /* JADX WARN: Code duplicated, block: B:171:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x0346  */
    /* JADX WARN: Code duplicated, block: B:178:0x034d  */
    /* JADX WARN: Code duplicated, block: B:180:0x035e  */
    /* JADX WARN: Code duplicated, block: B:185:0x036e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0379  */
    /* JADX WARN: Code duplicated, block: B:188:0x0387  */
    /* JADX WARN: Code duplicated, block: B:190:0x0392  */
    /* JADX WARN: Code duplicated, block: B:192:0x0398  */
    /* JADX WARN: Code duplicated, block: B:194:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:201:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e3, code lost:
    
        if (r7 == 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f2, code lost:
    
        if (r5.a() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r27, long r28, int r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        return m() && this.f17345i.b(i());
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    public final boolean l() throws AudioSink.InitializationException {
        boolean z2;
        AudioTrack audioTrackA;
        PlayerId playerId;
        ConditionVariable conditionVariable = this.f17344h;
        synchronized (conditionVariable) {
            z2 = conditionVariable.f18899b;
        }
        if (!z2) {
            return false;
        }
        try {
            Configuration configuration = this.t;
            configuration.getClass();
            try {
                audioTrackA = configuration.a(this.Z, this.v, this.W);
            } catch (AudioSink.InitializationException e2) {
                AudioSink.Listener listener = this.r;
                if (listener != null) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).a(e2);
                }
                throw e2;
            }
        } catch (AudioSink.InitializationException e3) {
            Configuration configuration2 = this.t;
            if (configuration2.f17361h > 1000000) {
                Configuration configuration3 = new Configuration(configuration2.f17357a, configuration2.f17358b, configuration2.f17359c, configuration2.d, configuration2.f17360e, configuration2.f, configuration2.g, 1000000, configuration2.f17362i);
                try {
                    try {
                        audioTrackA = configuration3.a(this.Z, this.v, this.W);
                        this.t = configuration3;
                    } catch (AudioSink.InitializationException e4) {
                        AudioSink.Listener listener2 = this.r;
                        if (listener2 != null) {
                            ((MediaCodecAudioRenderer.AudioSinkListener) listener2).a(e4);
                        }
                        throw e4;
                    }
                } catch (AudioSink.InitializationException e5) {
                    e3.addSuppressed(e5);
                    if (this.t.f17359c == 1) {
                        throw e3;
                    }
                    this.f17340b0 = true;
                    throw e3;
                }
            }
            if (this.t.f17359c == 1) {
                throw e3;
            }
            this.f17340b0 = true;
            throw e3;
        }
        this.f17349u = audioTrackA;
        if (n(audioTrackA)) {
            AudioTrack audioTrack = this.f17349u;
            if (this.m == null) {
                this.m = new StreamEventCallbackV29();
            }
            StreamEventCallbackV29 streamEventCallbackV29 = this.m;
            Handler handler = streamEventCallbackV29.f17372a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new i(handler), streamEventCallbackV29.f17373b);
            if (this.f17346l != 3) {
                AudioTrack audioTrack2 = this.f17349u;
                Format format = this.t.f17357a;
                audioTrack2.setOffloadDelayPadding(format.C0, format.D0);
            }
        }
        int i2 = Util.f18979a;
        if (i2 >= 31 && (playerId = this.q) != null) {
            Api31.a(this.f17349u, playerId);
        }
        this.W = this.f17349u.getAudioSessionId();
        AudioTrack audioTrack3 = this.f17349u;
        Configuration configuration4 = this.t;
        boolean z3 = configuration4.f17359c == 2;
        int i3 = configuration4.g;
        int i4 = configuration4.d;
        int i5 = configuration4.f17361h;
        AudioTrackPositionTracker audioTrackPositionTracker = this.f17345i;
        audioTrackPositionTracker.f17309c = audioTrack3;
        audioTrackPositionTracker.d = i4;
        audioTrackPositionTracker.f17310e = i5;
        audioTrackPositionTracker.f = new AudioTimestampPoller(audioTrack3);
        audioTrackPositionTracker.g = audioTrack3.getSampleRate();
        audioTrackPositionTracker.f17311h = z3 && i2 < 23 && (i3 == 5 || i3 == 6);
        boolean z4 = Util.z(i3);
        audioTrackPositionTracker.q = z4;
        audioTrackPositionTracker.f17312i = z4 ? (((long) (i5 / i4)) * 1000000) / ((long) audioTrackPositionTracker.g) : -9223372036854775807L;
        audioTrackPositionTracker.t = 0L;
        audioTrackPositionTracker.f17316u = 0L;
        audioTrackPositionTracker.v = 0L;
        audioTrackPositionTracker.f17315p = false;
        audioTrackPositionTracker.y = -9223372036854775807L;
        audioTrackPositionTracker.f17318z = -9223372036854775807L;
        audioTrackPositionTracker.r = 0L;
        audioTrackPositionTracker.o = 0L;
        audioTrackPositionTracker.j = 1.0f;
        if (m()) {
            if (i2 >= 21) {
                this.f17349u.setVolume(this.f17330J);
            } else {
                AudioTrack audioTrack4 = this.f17349u;
                float f = this.f17330J;
                audioTrack4.setStereoVolume(f, f);
            }
        }
        this.X.getClass();
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.f17337Y;
        if (audioDeviceInfoApi23 != null && i2 >= 23) {
            Api23.a(this.f17349u, audioDeviceInfoApi23);
        }
        this.H = true;
        return true;
    }

    public final boolean m() {
        return this.f17349u != null;
    }

    public final void o() {
        this.f17335U = true;
        if (m()) {
            AudioTimestampPoller audioTimestampPoller = this.f17345i.f;
            audioTimestampPoller.getClass();
            audioTimestampPoller.a();
            this.f17349u.play();
        }
    }

    public final void p() {
        if (this.T) {
            return;
        }
        this.T = true;
        long jI = i();
        AudioTrackPositionTracker audioTrackPositionTracker = this.f17345i;
        audioTrackPositionTracker.f17303A = audioTrackPositionTracker.a();
        audioTrackPositionTracker.y = SystemClock.elapsedRealtime() * 1000;
        audioTrackPositionTracker.f17304B = jI;
        this.f17349u.stop();
        this.f17325A = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.L[i2 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f17286a;
                }
            }
            if (i2 == length) {
                w(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.K[i2];
                if (i2 > this.f17334R) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.L[i2] = output;
                if (output.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    public final void r() {
        d();
        for (AudioProcessor audioProcessor : this.f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.g) {
            audioProcessor2.reset();
        }
        this.f17335U = false;
        this.f17340b0 = false;
    }

    public final void s(PlaybackParameters playbackParameters, boolean z2) {
        MediaPositionParameters mediaPositionParametersG = g();
        if (playbackParameters.equals(mediaPositionParametersG.f17366a) && z2 == mediaPositionParametersG.f17367b) {
            return;
        }
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, z2, -9223372036854775807L, -9223372036854775807L);
        if (m()) {
            this.f17350w = mediaPositionParameters;
        } else {
            this.x = mediaPositionParameters;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        this.f17337Y = audioDeviceInfoApi23;
        AudioTrack audioTrack = this.f17349u;
        if (audioTrack != null) {
            Api23.a(audioTrack, audioDeviceInfoApi23);
        }
    }

    public final void t(PlaybackParameters playbackParameters) {
        if (m()) {
            try {
                this.f17349u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.X).setPitch(playbackParameters.f17185Y).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                Log.h("DefaultAudioSink", "Failed to set playback params", e2);
            }
            playbackParameters = new PlaybackParameters(this.f17349u.getPlaybackParams().getSpeed(), this.f17349u.getPlaybackParams().getPitch());
            float f = playbackParameters.X;
            AudioTrackPositionTracker audioTrackPositionTracker = this.f17345i;
            audioTrackPositionTracker.j = f;
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
            if (audioTimestampPoller != null) {
                audioTimestampPoller.a();
            }
            audioTrackPositionTracker.c();
        }
        this.y = playbackParameters;
    }

    public final boolean u() {
        if (this.Z || !"audio/raw".equals(this.t.f17357a.m0)) {
            return false;
        }
        int i2 = this.t.f17357a.B0;
        if (!this.f17341c) {
            return true;
        }
        int i3 = Util.f18979a;
        return (i2 == 536870912 || i2 == 805306368 || i2 == 4) ? false : true;
    }

    public final boolean v(Format format, AudioAttributes audioAttributes) {
        int i2;
        int iN;
        int playbackOffloadSupport;
        int i3 = Util.f18979a;
        if (i3 >= 29 && (i2 = this.f17346l) != 0) {
            String str = format.m0;
            str.getClass();
            int iB = MimeTypes.b(str, format.j0);
            if (iB != 0 && (iN = Util.n(format.z0)) != 0) {
                AudioFormat audioFormatE = e(format.A0, iN, iB);
                android.media.AudioAttributes audioAttributes2 = audioAttributes.a().f17280a;
                if (i3 >= 31) {
                    playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes2);
                } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes2)) {
                    playbackOffloadSupport = (i3 == 30 && Util.d.startsWith("Pixel")) ? 2 : 1;
                } else {
                    playbackOffloadSupport = 0;
                }
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z2 = (format.C0 == 0 && format.D0 == 0) ? false : true;
                        boolean z3 = i2 == 1;
                        if (!z2 || !z3) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void w(ByteBuffer byteBuffer, long j) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        AudioSink.Listener listener;
        Renderer.WakeupListener wakeupListener;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                Assertions.b(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (Util.f18979a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f17332P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f17332P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f17332P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f17333Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i2 = Util.f18979a;
            if (i2 < 21) {
                long j2 = this.D;
                AudioTrackPositionTracker audioTrackPositionTracker = this.f17345i;
                int iA = audioTrackPositionTracker.f17310e - ((int) (j2 - (audioTrackPositionTracker.a() * ((long) audioTrackPositionTracker.d))));
                if (iA > 0) {
                    iWrite = this.f17349u.write(this.f17332P, this.f17333Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.f17333Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                Assertions.d(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f17349u;
                if (i2 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f17351z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f17351z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f17351z.putInt(1431633921);
                    }
                    if (this.f17325A == 0) {
                        this.f17351z.putInt(4, iRemaining2);
                        this.f17351z.putLong(8, j * 1000);
                        this.f17351z.position(0);
                        this.f17325A = iRemaining2;
                    }
                    int iRemaining3 = this.f17351z.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f17351z, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.f17325A = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f17325A = 0;
                    } else {
                        this.f17325A -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f17349u.write(byteBuffer2, iRemaining2, 1);
            }
            this.a0 = SystemClock.elapsedRealtime();
            PendingExceptionHolder pendingExceptionHolder = this.o;
            if (iWrite < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.t.f17357a, ((i2 >= 24 && iWrite == -6) || iWrite == -32) && this.f17327E > 0);
                AudioSink.Listener listener2 = this.r;
                if (listener2 != null) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener2).a(writeException);
                }
                if (writeException.f17294Y) {
                    throw writeException;
                }
                pendingExceptionHolder.a(writeException);
                return;
            }
            pendingExceptionHolder.f17369a = null;
            if (n(this.f17349u)) {
                if (this.f17327E > 0) {
                    this.f17342c0 = false;
                }
                if (this.f17335U && (listener = this.r) != null && iWrite < iRemaining2 && !this.f17342c0 && (wakeupListener = MediaCodecAudioRenderer.this.N1) != null) {
                    wakeupListener.a();
                }
            }
            int i3 = this.t.f17359c;
            if (i3 == 0) {
                this.D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i3 != 0) {
                    Assertions.d(byteBuffer2 == this.M);
                    this.f17327E = (((long) this.f17328F) * ((long) this.f17331N)) + this.f17327E;
                }
                this.O = null;
            }
        }
    }
}
