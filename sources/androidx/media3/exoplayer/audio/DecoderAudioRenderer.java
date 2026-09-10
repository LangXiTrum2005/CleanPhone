package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    public DecoderCounters s0;
    public Format t0;
    public Decoder u0;
    public SimpleDecoderOutputBuffer v0;
    public DrmSession w0;
    public DrmSession x0;
    public int y0;
    public long z0;

    public static final class Api23 {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public final class AudioSinkListener implements AudioSink.Listener {
        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public final void j(AudioSink.AudioTrackConfig audioTrackConfig) {
            throw null;
        }
    }

    public abstract Format A();

    public final void B() throws ExoPlaybackException {
        if (this.u0 != null) {
            return;
        }
        DrmSession drmSession = this.x0;
        DrmSession.e(this.w0, drmSession);
        this.w0 = drmSession;
        if (drmSession != null && drmSession.c() == null && this.w0.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            Decoder decoderY = y();
            this.u0 = decoderY;
            decoderY.a(this.m0);
            Trace.endSection();
            SystemClock.elapsedRealtime();
            this.u0.getClass();
            throw null;
        } catch (DecoderException e2) {
            Log.d("DecoderAudioRenderer", "Audio codec error", e2);
            throw null;
        } catch (OutOfMemoryError e3) {
            throw o(e3, this.t0, false, 4001);
        }
    }

    public final void C() {
        this.v0 = null;
        this.y0 = 0;
        Decoder decoder = this.u0;
        if (decoder == null) {
            DrmSession.e(this.w0, null);
            this.w0 = null;
        } else {
            this.s0.f5824b++;
            decoder.release();
            this.u0.getClass();
            throw null;
        }
    }

    public abstract int D();

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (!MimeTypes.h(format.m)) {
            return RendererCapabilities.h(0, 0, 0, 0);
        }
        int iD = D();
        if (iD <= 2) {
            return RendererCapabilities.h(iD, 0, 0, 0);
        }
        return iD | 8 | (Util.f5683a >= 21 ? 32 : 0) | 128;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        if (this.i0 != 2) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 == 2) {
            ((Float) obj).getClass();
            throw null;
        }
        if (i2 == 3) {
            throw null;
        }
        if (i2 == 6) {
            throw null;
        }
        if (i2 == 12) {
            if (Util.f5683a >= 23) {
                Api23.a(null, obj);
            }
        } else {
            if (i2 == 9) {
                ((Boolean) obj).getClass();
                throw null;
            }
            if (i2 != 10) {
                return;
            }
            ((Integer) obj).getClass();
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r3 = this;
            r0 = 0
            r3.t0 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.z0 = r1
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.x0     // Catch: java.lang.Throwable -> L15
            androidx.media3.exoplayer.drm.DrmSession.e(r1, r0)     // Catch: java.lang.Throwable -> L15
            r3.x0 = r0     // Catch: java.lang.Throwable -> L15
            r3.C()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DecoderAudioRenderer.p():void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void q(boolean z2, boolean z3) {
        this.s0 = new DecoderCounters();
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.t0 == null) {
            this.Z.a();
            throw null;
        }
        B();
        if (this.u0 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                z();
                Trace.endSection();
                synchronized (this.s0) {
                }
            } catch (DecoderException e2) {
                Log.d("DecoderAudioRenderer", "Audio codec error", e2);
                throw null;
            } catch (AudioSink.ConfigurationException e3) {
                throw o(e3, e3.X, false, IronSourceConstants.errorCode_biddingDataException);
            } catch (AudioSink.InitializationException e4) {
                throw o(e4, e4.Z, e4.f6086Y, IronSourceConstants.errorCode_biddingDataException);
            } catch (AudioSink.WriteException e5) {
                throw o(e5, e5.Z, e5.f6087Y, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void u() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void v() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void w(Format[] formatArr, long j, long j2) {
        if (this.z0 != -9223372036854775807L) {
            throw null;
        }
        this.z0 = j2;
        if (j2 != -9223372036854775807L) {
            throw null;
        }
    }

    public abstract Decoder y();

    public final void z() throws ExoPlaybackException {
        if (this.v0 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.u0.dequeueOutputBuffer();
            this.v0 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return;
            }
            int i2 = simpleDecoderOutputBuffer.Z;
            if (i2 > 0) {
                this.s0.f += i2;
                throw null;
            }
            if (simpleDecoderOutputBuffer.b(134217728)) {
                throw null;
            }
        }
        if (this.v0.b(4)) {
            if (this.y0 != 2) {
                this.v0.getClass();
                throw null;
            }
            C();
            B();
            return;
        }
        Format.Builder builderA = A().a();
        builderA.C = 0;
        builderA.D = 0;
        Format format = this.t0;
        builderA.j = format.k;
        builderA.f5423a = format.f5406a;
        builderA.f5424b = format.f5407b;
        builderA.f5425c = ImmutableList.u(format.f5408c);
        Format format2 = this.t0;
        builderA.d = format2.d;
        builderA.f5426e = format2.f5409e;
        builderA.f = format2.f;
        builderA.a();
        throw null;
    }
}
