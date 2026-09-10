package androidx.media3.exoplayer.audio;

import A.K;
import A.r0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessingPipeline;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.ToInt16PcmAudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;
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
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {
    public static final Object m0 = new Object();
    public static ExecutorService n0;
    public static int o0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AudioAttributes f6117A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MediaPositionParameters f6118B;
    public MediaPositionParameters C;
    public PlaybackParameters D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6119E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ByteBuffer f6120F;
    public int G;
    public long H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f6121I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f6122J;
    public long K;
    public int L;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f6123N;
    public long O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f6124P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ByteBuffer f6125Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f6126R;
    public ByteBuffer S;
    public byte[] T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f6127U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6128V;
    public boolean W;
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6129Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6130a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultAudioProcessorChain f6131b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AuxEffectInfo f6132b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6133c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public AudioDeviceInfoApi23 f6134c0;
    public final ChannelMappingAudioProcessor d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6135d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TrimmingAudioProcessor f6136e;
    public long e0;
    public final ImmutableList f;
    public long f0;
    public final ImmutableList g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionVariable f6137h;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AudioTrackPositionTracker f6138i;
    public Looper i0;
    public final ArrayDeque j;
    public long j0;
    public final boolean k;
    public long k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6139l;
    public Handler l0;
    public StreamEventCallbackV29 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PendingExceptionHolder f6140n;
    public final PendingExceptionHolder o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DefaultAudioTrackBufferSizeProvider f6141p;
    public final DefaultAudioOffloadSupportProvider q;
    public PlayerId r;
    public AudioSink.Listener s;
    public Configuration t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Configuration f6142u;
    public AudioProcessingPipeline v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AudioTrack f6143w;
    public AudioCapabilities x;
    public AudioCapabilitiesReceiver y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OnRoutingChangedListenerApi24 f6144z;

    public static final class Api23 {
        public static void a(AudioTrack audioTrack, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.f6073a);
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

    public interface AudioOffloadSupportProvider {
    }

    @Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DefaultAudioTrackBufferSizeProvider f6145a = new DefaultAudioTrackBufferSizeProvider();
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DefaultAudioProcessorChain f6147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f6148c;
        public final DefaultAudioTrackBufferSizeProvider d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DefaultAudioOffloadSupportProvider f6149e;

        public Builder(Context context) {
            this.f6146a = context;
            AudioCapabilities audioCapabilities = AudioCapabilities.f6055c;
            this.d = AudioTrackBufferSizeProvider.f6145a;
        }
    }

    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f6150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6152c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6153e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f6154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AudioProcessingPipeline f6155i;
        public final boolean j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f6156l;

        public Configuration(Format format, int i2, int i3, int i4, int i5, int i6, int i7, int i8, AudioProcessingPipeline audioProcessingPipeline, boolean z2, boolean z3, boolean z4) {
            this.f6150a = format;
            this.f6151b = i2;
            this.f6152c = i3;
            this.d = i4;
            this.f6153e = i5;
            this.f = i6;
            this.g = i7;
            this.f6154h = i8;
            this.f6155i = audioProcessingPipeline;
            this.j = z2;
            this.k = z3;
            this.f6156l = z4;
        }

        public static android.media.AudioAttributes c(AudioAttributes audioAttributes, boolean z2) {
            return z2 ? new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.a().f5376a;
        }

        public final AudioTrack a(AudioAttributes audioAttributes, int i2) throws AudioSink.InitializationException {
            int i3 = this.f6152c;
            try {
                AudioTrack audioTrackB = b(audioAttributes, i2);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f6153e, this.f, this.f6154h, this.f6150a, i3 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new AudioSink.InitializationException(0, this.f6153e, this.f, this.f6154h, this.f6150a, i3 == 1, e2);
            }
        }

        public final AudioTrack b(AudioAttributes audioAttributes, int i2) {
            int i3 = Util.f5683a;
            boolean z2 = this.f6156l;
            int i4 = this.f6153e;
            int i5 = this.g;
            int i6 = this.f;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(c(audioAttributes, z2)).setAudioFormat(Util.p(i4, i6, i5)).setTransferMode(1).setBufferSizeInBytes(this.f6154h).setSessionId(i2).setOffloadedPlayback(this.f6152c == 1).build();
            }
            if (i3 >= 21) {
                return new AudioTrack(c(audioAttributes, z2), Util.p(i4, i6, i5), this.f6154h, 1, i2);
            }
            audioAttributes.getClass();
            if (i2 == 0) {
                return new AudioTrack(3, this.f6153e, this.f, this.g, this.f6154h, 1);
            }
            return new AudioTrack(3, this.f6153e, this.f, this.g, this.f6154h, 1, i2);
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f6157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SilenceSkippingAudioProcessor f6158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.audio.SonicAudioProcessor f6159c;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor = new androidx.media3.common.audio.SonicAudioProcessor();
            sonicAudioProcessor.f5579c = 1.0f;
            sonicAudioProcessor.d = 1.0f;
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
            sonicAudioProcessor.f5580e = audioFormat;
            sonicAudioProcessor.f = audioFormat;
            sonicAudioProcessor.g = audioFormat;
            sonicAudioProcessor.f5581h = audioFormat;
            ByteBuffer byteBuffer = AudioProcessor.f5559a;
            sonicAudioProcessor.k = byteBuffer;
            sonicAudioProcessor.f5583l = byteBuffer.asShortBuffer();
            sonicAudioProcessor.m = byteBuffer;
            sonicAudioProcessor.f5578b = -1;
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f6157a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f6158b = silenceSkippingAudioProcessor;
            this.f6159c = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class MediaPositionParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaybackParameters f6160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6162c;

        public MediaPositionParameters(PlaybackParameters playbackParameters, long j, long j2) {
            this.f6160a = playbackParameters;
            this.f6161b = j;
            this.f6162c = j2;
        }
    }

    public static final class OnRoutingChangedListenerApi24 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f6163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioCapabilitiesReceiver f6164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f6165c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.h
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f6193a.b(audioRouting);
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.audio.h] */
        public OnRoutingChangedListenerApi24(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.f6163a = audioTrack;
            this.f6164b = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.f6165c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f6165c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.f6164b.b(audioRouting.getRoutedDevice());
        }

        public void c() {
            h hVar = this.f6165c;
            hVar.getClass();
            this.f6163a.removeOnRoutingChangedListener(hVar);
            this.f6165c = null;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Exception f6166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6167b;

        public final void a(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6166a == null) {
                this.f6166a = exc;
                this.f6167b = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f6167b) {
                Exception exc2 = this.f6166a;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f6166a;
                this.f6166a = null;
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
        public final Handler f6169a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f6170b = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
            public final void onDataRequest(AudioTrack audioTrack, int i2) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.f6143w) && (listener = (defaultAudioSink = DefaultAudioSink.this).s) != null && defaultAudioSink.f6129Y) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).b();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f6143w)) {
                    DefaultAudioSink.this.X = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.Listener listener;
                if (audioTrack.equals(DefaultAudioSink.this.f6143w) && (listener = (defaultAudioSink = DefaultAudioSink.this).s) != null && defaultAudioSink.f6129Y) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener).b();
                }
            }
        };

        public StreamEventCallbackV29() {
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f6169a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new i(handler), this.f6170b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f6170b);
            this.f6169a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(Builder builder) {
        Context context = builder.f6146a;
        this.f6130a = context;
        AudioAttributes audioAttributes = AudioAttributes.f5374b;
        this.f6117A = audioAttributes;
        AudioCapabilities audioCapabilities = AudioCapabilities.f6055c;
        int i2 = Util.f5683a;
        this.x = AudioCapabilities.c(context, audioAttributes, null);
        this.f6131b = builder.f6147b;
        int i3 = Util.f5683a;
        this.f6133c = false;
        this.k = false;
        this.f6139l = 0;
        this.f6141p = builder.d;
        DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = builder.f6149e;
        defaultAudioOffloadSupportProvider.getClass();
        this.q = defaultAudioOffloadSupportProvider;
        ConditionVariable conditionVariable = new ConditionVariable(0);
        this.f6137h = conditionVariable;
        conditionVariable.d();
        this.f6138i = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.d = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        trimmingAudioProcessor.m = Util.f;
        this.f6136e = trimmingAudioProcessor;
        ToInt16PcmAudioProcessor toInt16PcmAudioProcessor = new ToInt16PcmAudioProcessor();
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        Object[] objArr = {toInt16PcmAudioProcessor, channelMappingAudioProcessor, trimmingAudioProcessor};
        ObjectArrays.a(3, objArr);
        this.f = ImmutableList.p(3, objArr);
        this.g = ImmutableList.z(new ToFloatPcmAudioProcessor());
        this.f6124P = 1.0f;
        this.a0 = 0;
        this.f6132b0 = new AuxEffectInfo();
        PlaybackParameters playbackParameters = PlaybackParameters.d;
        this.C = new MediaPositionParameters(playbackParameters, 0L, 0L);
        this.D = playbackParameters;
        this.f6119E = false;
        this.j = new ArrayDeque();
        this.f6140n = new PendingExceptionHolder();
        this.o = new PendingExceptionHolder();
    }

    public static boolean m(AudioTrack audioTrack) {
        return Util.f5683a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    public final void a(long j) {
        PlaybackParameters playbackParameters;
        boolean z2;
        boolean zV = v();
        DefaultAudioProcessorChain defaultAudioProcessorChain = this.f6131b;
        boolean z3 = this.f6133c;
        if (zV) {
            playbackParameters = PlaybackParameters.d;
        } else {
            if (this.f6135d0) {
                playbackParameters = PlaybackParameters.d;
            } else {
                Configuration configuration = this.f6142u;
                if (configuration.f6152c == 0) {
                    int i2 = configuration.f6150a.C;
                    if (z3) {
                        int i3 = Util.f5683a;
                        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
                            playbackParameters = PlaybackParameters.d;
                        }
                    }
                    playbackParameters = this.D;
                    defaultAudioProcessorChain.getClass();
                    float f = playbackParameters.f5494a;
                    androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor = defaultAudioProcessorChain.f6159c;
                    if (sonicAudioProcessor.f5579c != f) {
                        sonicAudioProcessor.f5579c = f;
                        sonicAudioProcessor.f5582i = true;
                    }
                    float f2 = sonicAudioProcessor.d;
                    float f3 = playbackParameters.f5495b;
                    if (f2 != f3) {
                        sonicAudioProcessor.d = f3;
                        sonicAudioProcessor.f5582i = true;
                    }
                } else {
                    playbackParameters = PlaybackParameters.d;
                }
            }
            this.D = playbackParameters;
        }
        PlaybackParameters playbackParameters2 = playbackParameters;
        if (this.f6135d0) {
            z2 = false;
        } else {
            Configuration configuration2 = this.f6142u;
            if (configuration2.f6152c == 0) {
                int i4 = configuration2.f6150a.C;
                if (z3) {
                    int i5 = Util.f5683a;
                    if (i4 == 21 || i4 == 1342177280 || i4 == 22 || i4 == 1610612736 || i4 == 4) {
                        z2 = false;
                    }
                }
                z2 = this.f6119E;
                defaultAudioProcessorChain.f6158b.o = z2;
            } else {
                z2 = false;
            }
        }
        this.f6119E = z2;
        ArrayDeque arrayDeque = this.j;
        long jMax = Math.max(0L, j);
        Configuration configuration3 = this.f6142u;
        arrayDeque.add(new MediaPositionParameters(playbackParameters2, jMax, Util.M(configuration3.f6153e, h())));
        AudioProcessingPipeline audioProcessingPipeline = this.f6142u.f6155i;
        this.v = audioProcessingPipeline;
        audioProcessingPipeline.b();
        AudioSink.Listener listener = this.s;
        if (listener != null) {
            boolean z4 = this.f6119E;
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G1;
            Handler handler = eventDispatcher.f6080a;
            if (handler != null) {
                handler.post(new K(3, eventDispatcher, z4));
            }
        }
    }

    public final void b(Format format, int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessingPipeline audioProcessingPipeline;
        int iIntValue;
        int iIntValue2;
        int i2;
        boolean z2;
        int i3;
        int iX;
        boolean z3;
        int i4;
        int iJ;
        int i5;
        int i6;
        int iA;
        int[] iArr2;
        n();
        boolean zEquals = "audio/raw".equals(format.m);
        boolean z4 = this.k;
        String str = format.m;
        int i7 = format.f5401B;
        int i8 = format.f5400A;
        if (zEquals) {
            int i9 = format.C;
            Assertions.b(Util.F(i9));
            int iX2 = Util.x(i9, i8);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (this.f6133c && (i9 == 21 || i9 == 1342177280 || i9 == 22 || i9 == 1610612736 || i9 == 4)) {
                builder.f(this.g);
            } else {
                builder.f(this.f);
                builder.i(this.f6131b.f6157a);
            }
            audioProcessingPipeline = new AudioProcessingPipeline(builder.j());
            if (audioProcessingPipeline.equals(this.v)) {
                audioProcessingPipeline = this.v;
            }
            int i10 = format.D;
            TrimmingAudioProcessor trimmingAudioProcessor = this.f6136e;
            trimmingAudioProcessor.f6184i = i10;
            trimmingAudioProcessor.j = format.f5402E;
            if (Util.f5683a < 21 && i8 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr2[i11] = i11;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.f6114i = iArr2;
            try {
                AudioProcessor.AudioFormat audioFormatA = audioProcessingPipeline.a(new AudioProcessor.AudioFormat(i7, i8, i9));
                int i12 = audioFormatA.f5562b;
                iIntValue2 = Util.q(i12);
                iIntValue = audioFormatA.f5563c;
                iX = Util.x(iIntValue, i12);
                i2 = audioFormatA.f5561a;
                z2 = z4;
                i3 = iX2;
                z3 = false;
                i4 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                throw new AudioSink.ConfigurationException(e2, format);
            }
        } else {
            audioProcessingPipeline = new AudioProcessingPipeline(ImmutableList.x());
            AudioOffloadSupport audioOffloadSupportE = this.f6139l != 0 ? e(format) : AudioOffloadSupport.d;
            if (this.f6139l == 0 || !audioOffloadSupportE.f6074a) {
                Pair pairD = this.x.d(this.f6117A, format);
                if (pairD == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) pairD.first).intValue();
                iIntValue2 = ((Integer) pairD.second).intValue();
                i2 = i7;
                z2 = z4;
                i3 = -1;
                iX = -1;
                z3 = false;
                i4 = 2;
            } else {
                str.getClass();
                int iB = MimeTypes.b(str, format.j);
                int iQ = Util.q(i8);
                z3 = audioOffloadSupportE.f6075b;
                iIntValue = iB;
                i3 = -1;
                i2 = i7;
                z2 = true;
                i4 = 1;
                iIntValue2 = iQ;
                iX = -1;
            }
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + format, format);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + format, format);
        }
        boolean zEquals2 = "audio/vnd.dts.hd;profile=lbr".equals(str);
        int i13 = format.f5411i;
        if (zEquals2 && i13 == -1) {
            i13 = 768000;
        }
        DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider = this.f6141p;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        Assertions.e(minBufferSize != -2);
        int i14 = iX != -1 ? iX : 1;
        double d = z2 ? 8.0d : 1.0d;
        defaultAudioTrackBufferSizeProvider.getClass();
        if (i4 == 0) {
            i3 = i3;
            long j = i2;
            long j2 = ((long) 250000) * j;
            long j3 = i14;
            iJ = Util.j(minBufferSize * 4, Ints.b((j2 * j3) / 1000000), Ints.b(((((long) 750000) * j) * j3) / 1000000));
        } else if (i4 == 1) {
            iJ = Ints.b((((long) 50000000) * ((long) DefaultAudioTrackBufferSizeProvider.a(iIntValue))) / 1000000);
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException();
            }
            if (iIntValue == 5) {
                i6 = 500000;
                i5 = 8;
            } else {
                i5 = 8;
                i6 = iIntValue == 8 ? 1000000 : 250000;
            }
            if (i13 != -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                iA = IntMath.c(i13, i5);
            } else {
                iA = DefaultAudioTrackBufferSizeProvider.a(iIntValue);
            }
            iJ = Ints.b((((long) i6) * ((long) iA)) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d)) + i14) - 1) / i14) * i14;
        this.g0 = false;
        Configuration configuration = new Configuration(format, i3, i4, iX, i2, iIntValue2, iIntValue, iMax, audioProcessingPipeline, z2, z3, this.f6135d0);
        if (l()) {
            this.t = configuration;
        } else {
            this.f6142u = configuration;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[RETURN] */
    public final boolean c() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.v.e()) {
            ByteBuffer byteBuffer2 = this.S;
            if (byteBuffer2 != null) {
                w(byteBuffer2, Long.MIN_VALUE);
                if (this.S != null) {
                    return false;
                }
            }
            return true;
        }
        AudioProcessingPipeline audioProcessingPipeline = this.v;
        if (audioProcessingPipeline.e() && !audioProcessingPipeline.d) {
            audioProcessingPipeline.d = true;
            ((AudioProcessor) audioProcessingPipeline.f5557b.get(0)).queueEndOfStream();
        }
        q(Long.MIN_VALUE);
        if (!this.v.d() || ((byteBuffer = this.S) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void d() {
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (l()) {
            this.H = 0L;
            this.f6121I = 0L;
            this.f6122J = 0L;
            this.K = 0L;
            this.h0 = false;
            this.L = 0;
            this.C = new MediaPositionParameters(this.D, 0L, 0L);
            this.O = 0L;
            this.f6118B = null;
            this.j.clear();
            this.f6125Q = null;
            this.f6126R = 0;
            this.S = null;
            this.W = false;
            this.f6128V = false;
            this.X = false;
            this.f6120F = null;
            this.G = 0;
            this.f6136e.o = 0L;
            AudioProcessingPipeline audioProcessingPipeline = this.f6142u.f6155i;
            this.v = audioProcessingPipeline;
            audioProcessingPipeline.b();
            AudioTrack audioTrack = this.f6138i.f6104c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f6143w.pause();
            }
            if (m(this.f6143w)) {
                StreamEventCallbackV29 streamEventCallbackV29 = this.m;
                streamEventCallbackV29.getClass();
                streamEventCallbackV29.b(this.f6143w);
            }
            int i2 = Util.f5683a;
            if (i2 < 21 && !this.Z) {
                this.a0 = 0;
            }
            Configuration configuration = this.f6142u;
            AudioSink.AudioTrackConfig audioTrackConfig = new AudioSink.AudioTrackConfig(configuration.g, configuration.f6153e, configuration.f, configuration.f6156l, configuration.f6152c == 1, configuration.f6154h);
            Configuration configuration2 = this.t;
            if (configuration2 != null) {
                this.f6142u = configuration2;
                this.t = null;
            }
            AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
            audioTrackPositionTracker.d();
            audioTrackPositionTracker.f6104c = null;
            audioTrackPositionTracker.f = null;
            if (i2 >= 24 && (onRoutingChangedListenerApi24 = this.f6144z) != null) {
                onRoutingChangedListenerApi24.c();
                this.f6144z = null;
            }
            AudioTrack audioTrack2 = this.f6143w;
            ConditionVariable conditionVariable = this.f6137h;
            AudioSink.Listener listener = this.s;
            conditionVariable.c();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (m0) {
                try {
                    if (n0 == null) {
                        n0 = Executors.newSingleThreadExecutor(new androidx.media3.common.util.c("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    o0++;
                    n0.execute(new r0(audioTrack2, listener, handler, audioTrackConfig, conditionVariable, 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6143w = null;
        }
        this.o.f6166a = null;
        this.f6140n.f6166a = null;
        this.j0 = 0L;
        this.k0 = 0L;
        Handler handler2 = this.l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final AudioOffloadSupport e(Format format) {
        int i2;
        boolean zBooleanValue;
        if (this.g0) {
            return AudioOffloadSupport.d;
        }
        AudioAttributes audioAttributes = this.f6117A;
        DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = this.q;
        defaultAudioOffloadSupportProvider.getClass();
        format.getClass();
        audioAttributes.getClass();
        int i3 = Util.f5683a;
        if (i3 < 29 || (i2 = format.f5401B) == -1) {
            return AudioOffloadSupport.d;
        }
        Boolean bool = defaultAudioOffloadSupportProvider.f6116b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            AudioManager audioManager = (AudioManager) defaultAudioOffloadSupportProvider.f6115a.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                defaultAudioOffloadSupportProvider.f6116b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                defaultAudioOffloadSupportProvider.f6116b = Boolean.FALSE;
            }
            zBooleanValue = defaultAudioOffloadSupportProvider.f6116b.booleanValue();
        }
        String str = format.m;
        str.getClass();
        int iB = MimeTypes.b(str, format.j);
        if (iB == 0 || i3 < Util.o(iB)) {
            return AudioOffloadSupport.d;
        }
        int iQ = Util.q(format.f5400A);
        if (iQ == 0) {
            return AudioOffloadSupport.d;
        }
        try {
            AudioFormat audioFormatP = Util.p(i2, iQ, iB);
            return i3 >= 31 ? DefaultAudioOffloadSupportProvider.Api31.a(audioFormatP, audioAttributes.a().f5376a, zBooleanValue) : DefaultAudioOffloadSupportProvider.Api29.a(audioFormatP, audioAttributes.a().f5376a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.d;
        }
    }

    public final int f(Format format) {
        n();
        if (!"audio/raw".equals(format.m)) {
            return this.x.d(this.f6117A, format) != null ? 2 : 0;
        }
        int i2 = format.C;
        if (Util.F(i2)) {
            return (i2 == 2 || (this.f6133c && i2 == 4)) ? 2 : 1;
        }
        Log.g("DefaultAudioSink", "Invalid PCM encoding: " + i2);
        return 0;
    }

    public final long g() {
        Configuration configuration = this.f6142u;
        return configuration.f6152c == 0 ? this.H / ((long) configuration.f6151b) : this.f6121I;
    }

    public final long h() {
        Configuration configuration = this.f6142u;
        if (configuration.f6152c != 0) {
            return this.K;
        }
        long j = this.f6122J;
        long j2 = configuration.d;
        int i2 = Util.f5683a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:102:0x0186  */
    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e1 A[LOOP:0: B:110:0x01c2->B:118:0x01e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0201  */
    /* JADX WARN: Code duplicated, block: B:128:0x0209  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:131:0x021f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:138:0x023e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0275  */
    /* JADX WARN: Code duplicated, block: B:165:0x027b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0289  */
    /* JADX WARN: Code duplicated, block: B:170:0x029a  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:193:0x033b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0345  */
    /* JADX WARN: Code duplicated, block: B:196:0x0347  */
    /* JADX WARN: Code duplicated, block: B:198:0x0353 A[LOOP:1: B:197:0x0351->B:198:0x0353, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0366 A[LOOP:2: B:200:0x0364->B:201:0x0366, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0386  */
    /* JADX WARN: Code duplicated, block: B:206:0x038c  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:219:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:223:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:227:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:230:0x0404  */
    /* JADX WARN: Code duplicated, block: B:232:0x0415  */
    /* JADX WARN: Code duplicated, block: B:237:0x0425  */
    /* JADX WARN: Code duplicated, block: B:238:0x0430  */
    /* JADX WARN: Code duplicated, block: B:240:0x043e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0449  */
    /* JADX WARN: Code duplicated, block: B:244:0x0450  */
    /* JADX WARN: Code duplicated, block: B:246:0x045f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0475  */
    /* JADX WARN: Code duplicated, block: B:253:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:92:0x016a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x039c, code lost:
    
        if (r13 == 0) goto L210;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DefaultAudioSink.i(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean j() {
        if (l()) {
            return !(Util.f5683a >= 29 && this.f6143w.isOffloadedPlayback() && this.X) && this.f6138i.c(h());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x019e  */
    public final boolean k() throws AudioSink.InitializationException {
        boolean z2;
        AudioTrack audioTrackA;
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        PlayerId playerId;
        ConditionVariable conditionVariable = this.f6137h;
        synchronized (conditionVariable) {
            z2 = conditionVariable.f5633b;
        }
        if (!z2) {
            return false;
        }
        try {
            Configuration configuration = this.f6142u;
            configuration.getClass();
            try {
                audioTrackA = configuration.a(this.f6117A, this.a0);
                this.f6143w = audioTrackA;
                if (m(audioTrackA)) {
                    AudioTrack audioTrack = this.f6143w;
                    if (this.m == null) {
                        this.m = new StreamEventCallbackV29();
                    }
                    this.m.a(audioTrack);
                    Configuration configuration2 = this.f6142u;
                    if (configuration2.k) {
                        AudioTrack audioTrack2 = this.f6143w;
                        Format format = configuration2.f6150a;
                        audioTrack2.setOffloadDelayPadding(format.D, format.f5402E);
                    }
                }
                int i2 = Util.f5683a;
                if (i2 >= 31 && (playerId = this.r) != null) {
                    Api31.a(this.f6143w, playerId);
                }
                this.a0 = this.f6143w.getAudioSessionId();
                AudioTrack audioTrack3 = this.f6143w;
                Configuration configuration3 = this.f6142u;
                boolean z3 = configuration3.f6152c == 2;
                int i3 = configuration3.g;
                int i4 = configuration3.d;
                int i5 = configuration3.f6154h;
                AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
                audioTrackPositionTracker.f6104c = audioTrack3;
                audioTrackPositionTracker.d = i4;
                audioTrackPositionTracker.f6105e = i5;
                audioTrackPositionTracker.f = new AudioTimestampPoller(audioTrack3);
                audioTrackPositionTracker.g = audioTrack3.getSampleRate();
                audioTrackPositionTracker.f6106h = z3 && i2 < 23 && (i3 == 5 || i3 == 6);
                boolean zF = Util.F(i3);
                audioTrackPositionTracker.q = zF;
                audioTrackPositionTracker.f6107i = zF ? Util.M(audioTrackPositionTracker.g, i5 / i4) : -9223372036854775807L;
                audioTrackPositionTracker.t = 0L;
                audioTrackPositionTracker.f6111u = 0L;
                audioTrackPositionTracker.H = false;
                audioTrackPositionTracker.f6100I = 0L;
                audioTrackPositionTracker.v = 0L;
                audioTrackPositionTracker.f6110p = false;
                audioTrackPositionTracker.y = -9223372036854775807L;
                audioTrackPositionTracker.f6113z = -9223372036854775807L;
                audioTrackPositionTracker.r = 0L;
                audioTrackPositionTracker.o = 0L;
                audioTrackPositionTracker.j = 1.0f;
                if (l()) {
                    if (i2 >= 21) {
                        this.f6143w.setVolume(this.f6124P);
                    } else {
                        AudioTrack audioTrack4 = this.f6143w;
                        float f = this.f6124P;
                        audioTrack4.setStereoVolume(f, f);
                    }
                }
                this.f6132b0.getClass();
                AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.f6134c0;
                if (audioDeviceInfoApi23 != null && i2 >= 23) {
                    Api23.a(this.f6143w, audioDeviceInfoApi23);
                    AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = this.y;
                    if (audioCapabilitiesReceiver2 != null) {
                        audioCapabilitiesReceiver2.b(this.f6134c0.f6073a);
                    }
                }
                if (i2 >= 24 && (audioCapabilitiesReceiver = this.y) != null) {
                    this.f6144z = new OnRoutingChangedListenerApi24(this.f6143w, audioCapabilitiesReceiver);
                }
                this.f6123N = true;
                AudioSink.Listener listener = this.s;
                if (listener != null) {
                    Configuration configuration4 = this.f6142u;
                    AudioSink.AudioTrackConfig audioTrackConfig = new AudioSink.AudioTrackConfig(configuration4.g, configuration4.f6153e, configuration4.f, configuration4.f6156l, configuration4.f6152c == 1, configuration4.f6154h);
                    AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.G1;
                    Handler handler = eventDispatcher.f6080a;
                    if (handler != null) {
                        handler.post(new b(eventDispatcher, audioTrackConfig, 0));
                    }
                }
                return true;
            } catch (AudioSink.InitializationException e2) {
                AudioSink.Listener listener2 = this.s;
                if (listener2 != null) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener2).a(e2);
                }
                throw e2;
            }
        } catch (AudioSink.InitializationException e3) {
            Configuration configuration5 = this.f6142u;
            if (configuration5.f6154h > 1000000) {
                Configuration configuration6 = new Configuration(configuration5.f6150a, configuration5.f6151b, configuration5.f6152c, configuration5.d, configuration5.f6153e, configuration5.f, configuration5.g, 1000000, configuration5.f6155i, configuration5.j, configuration5.k, configuration5.f6156l);
                try {
                    try {
                        audioTrackA = configuration6.a(this.f6117A, this.a0);
                        this.f6142u = configuration6;
                    } catch (AudioSink.InitializationException e4) {
                        AudioSink.Listener listener3 = this.s;
                        if (listener3 != null) {
                            ((MediaCodecAudioRenderer.AudioSinkListener) listener3).a(e4);
                        }
                        throw e4;
                    }
                } catch (AudioSink.InitializationException e5) {
                    e3.addSuppressed(e5);
                    if (this.f6142u.f6152c == 1) {
                        throw e3;
                    }
                    this.g0 = true;
                    throw e3;
                }
            }
            if (this.f6142u.f6152c == 1) {
                throw e3;
            }
            this.g0 = true;
            throw e3;
        }
    }

    public final boolean l() {
        return this.f6143w != null;
    }

    public final void n() {
        AudioCapabilities audioCapabilitiesB;
        AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        if (this.y == null) {
            Context context = this.f6130a;
            this.i0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new g(this), this.f6117A, this.f6134c0);
            this.y = audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver.j) {
                audioCapabilitiesB = audioCapabilitiesReceiver.g;
                audioCapabilitiesB.getClass();
            } else {
                audioCapabilitiesReceiver.j = true;
                AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = audioCapabilitiesReceiver.f;
                if (externalSurroundSoundSettingObserver != null) {
                    externalSurroundSoundSettingObserver.f6069a.registerContentObserver(externalSurroundSoundSettingObserver.f6070b, false, externalSurroundSoundSettingObserver);
                }
                int i2 = Util.f5683a;
                Handler handler = audioCapabilitiesReceiver.f6064c;
                Context context2 = audioCapabilitiesReceiver.f6062a;
                if (i2 >= 23 && (audioDeviceCallbackV23 = audioCapabilitiesReceiver.d) != null) {
                    AudioCapabilitiesReceiver.Api23.a(context2, audioDeviceCallbackV23, handler);
                }
                BroadcastReceiver broadcastReceiver = audioCapabilitiesReceiver.f6065e;
                audioCapabilitiesB = AudioCapabilities.b(context2, broadcastReceiver != null ? context2.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, audioCapabilitiesReceiver.f6067i, audioCapabilitiesReceiver.f6066h);
                audioCapabilitiesReceiver.g = audioCapabilitiesB;
            }
            this.x = audioCapabilitiesB;
        }
    }

    public final void o() {
        this.f6129Y = true;
        if (l()) {
            AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
            if (audioTrackPositionTracker.y != -9223372036854775807L) {
                audioTrackPositionTracker.f6101J.getClass();
                audioTrackPositionTracker.y = Util.I(SystemClock.elapsedRealtime());
            }
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
            audioTimestampPoller.getClass();
            audioTimestampPoller.a();
            this.f6143w.play();
        }
    }

    public final void p() {
        if (this.W) {
            return;
        }
        this.W = true;
        long jH = h();
        AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
        audioTrackPositionTracker.f6096A = audioTrackPositionTracker.b();
        audioTrackPositionTracker.f6101J.getClass();
        audioTrackPositionTracker.y = Util.I(SystemClock.elapsedRealtime());
        audioTrackPositionTracker.f6097B = jH;
        if (m(this.f6143w)) {
            this.X = false;
        }
        this.f6143w.stop();
        this.G = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.v.e()) {
            ByteBuffer byteBuffer2 = this.f6125Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = AudioProcessor.f5559a;
            }
            w(byteBuffer2, j);
            return;
        }
        while (!this.v.d()) {
            do {
                AudioProcessingPipeline audioProcessingPipeline = this.v;
                if (audioProcessingPipeline.e()) {
                    ByteBuffer byteBuffer3 = audioProcessingPipeline.f5558c[audioProcessingPipeline.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        audioProcessingPipeline.f(AudioProcessor.f5559a);
                        byteBuffer = audioProcessingPipeline.f5558c[audioProcessingPipeline.c()];
                    }
                } else {
                    byteBuffer = AudioProcessor.f5559a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f6125Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    AudioProcessingPipeline audioProcessingPipeline2 = this.v;
                    ByteBuffer byteBuffer5 = this.f6125Q;
                    if (audioProcessingPipeline2.e() && !audioProcessingPipeline2.d) {
                        audioProcessingPipeline2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void r() {
        d();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = this.f.listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            ((AudioProcessor) unmodifiableListIteratorListIterator.next()).reset();
        }
        UnmodifiableListIterator unmodifiableListIteratorListIterator2 = this.g.listIterator(0);
        while (unmodifiableListIteratorListIterator2.hasNext()) {
            ((AudioProcessor) unmodifiableListIteratorListIterator2.next()).reset();
        }
        AudioProcessingPipeline audioProcessingPipeline = this.v;
        if (audioProcessingPipeline != null) {
            int i2 = 0;
            while (true) {
                ImmutableList immutableList = audioProcessingPipeline.f5556a;
                if (i2 >= immutableList.size()) {
                    break;
                }
                AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i2);
                audioProcessor.flush();
                audioProcessor.reset();
                i2++;
            }
            audioProcessingPipeline.f5558c = new ByteBuffer[0];
            AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f5560e;
            audioProcessingPipeline.d = false;
        }
        this.f6129Y = false;
        this.g0 = false;
    }

    public final void s() {
        if (l()) {
            try {
                this.f6143w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.f5494a).setPitch(this.D.f5495b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                Log.h("DefaultAudioSink", "Failed to set playback params", e2);
            }
            PlaybackParameters playbackParameters = new PlaybackParameters(this.f6143w.getPlaybackParams().getSpeed(), this.f6143w.getPlaybackParams().getPitch());
            this.D = playbackParameters;
            AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
            audioTrackPositionTracker.j = playbackParameters.f5494a;
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f;
            if (audioTimestampPoller != null) {
                audioTimestampPoller.a();
            }
            audioTrackPositionTracker.d();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f6134c0 = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.y;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f6143w;
        if (audioTrack != null) {
            Api23.a(audioTrack, this.f6134c0);
        }
    }

    public final void t(int i2) {
        Assertions.e(Util.f5683a >= 29);
        this.f6139l = i2;
    }

    public final boolean u(Format format) {
        return f(format) != 0;
    }

    public final boolean v() {
        Configuration configuration = this.f6142u;
        return configuration != null && configuration.j && Util.f5683a >= 23;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    public final void w(ByteBuffer byteBuffer, long j) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        AudioSink.Listener listener;
        Renderer.WakeupListener wakeupListener;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.S;
            boolean z2 = true;
            if (byteBuffer3 != null) {
                Assertions.b(byteBuffer3 == byteBuffer);
            } else {
                this.S = byteBuffer;
                if (Util.f5683a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.T;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.T = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.T, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f6127U = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i2 = Util.f5683a;
            if (i2 < 21) {
                long j2 = this.f6122J;
                AudioTrackPositionTracker audioTrackPositionTracker = this.f6138i;
                int iB = audioTrackPositionTracker.f6105e - ((int) (j2 - (audioTrackPositionTracker.b() * ((long) audioTrackPositionTracker.d))));
                if (iB > 0) {
                    iWrite = this.f6143w.write(this.T, this.f6127U, Math.min(iRemaining2, iB));
                    if (iWrite > 0) {
                        this.f6127U += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f6135d0) {
                Assertions.e(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.e0;
                } else {
                    this.e0 = j;
                }
                AudioTrack audioTrack = this.f6143w;
                if (i2 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f6120F == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f6120F = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f6120F.putInt(1431633921);
                    }
                    if (this.G == 0) {
                        this.f6120F.putInt(4, iRemaining2);
                        this.f6120F.putLong(8, j * 1000);
                        this.f6120F.position(0);
                        this.G = iRemaining2;
                    }
                    int iRemaining3 = this.f6120F.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f6120F, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.G = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.G = 0;
                    } else {
                        this.G -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f6143w.write(byteBuffer2, iRemaining2, 1);
            }
            this.f0 = SystemClock.elapsedRealtime();
            PendingExceptionHolder pendingExceptionHolder = this.o;
            if (iWrite < 0) {
                if ((i2 < 24 || iWrite != -6) && iWrite != -32) {
                    z2 = false;
                } else if (h() <= 0) {
                    if (!m(this.f6143w)) {
                        z2 = false;
                    } else if (this.f6142u.f6152c == 1) {
                        this.g0 = true;
                    }
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.f6142u.f6150a, z2);
                AudioSink.Listener listener2 = this.s;
                if (listener2 != null) {
                    ((MediaCodecAudioRenderer.AudioSinkListener) listener2).a(writeException);
                }
                if (writeException.f6087Y) {
                    this.x = AudioCapabilities.f6055c;
                    throw writeException;
                }
                pendingExceptionHolder.a(writeException);
                return;
            }
            pendingExceptionHolder.f6166a = null;
            if (m(this.f6143w)) {
                if (this.K > 0) {
                    this.h0 = false;
                }
                if (this.f6129Y && (listener = this.s) != null && iWrite < iRemaining2 && !this.h0 && (wakeupListener = MediaCodecAudioRenderer.this.G0) != null) {
                    wakeupListener.a();
                }
            }
            int i3 = this.f6142u.f6152c;
            if (i3 == 0) {
                this.f6122J += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i3 != 0) {
                    Assertions.e(byteBuffer2 == this.f6125Q);
                    this.K = (((long) this.L) * ((long) this.f6126R)) + this.K;
                }
                this.S = null;
            }
        }
    }
}
