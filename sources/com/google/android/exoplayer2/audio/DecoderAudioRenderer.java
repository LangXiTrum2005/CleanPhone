package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import android.os.SystemClock;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    public DecoderCounters n0;
    public Format o0;
    public Decoder p0;
    public SimpleDecoderOutputBuffer q0;
    public DrmSession r0;
    public DrmSession s0;
    public int t0;
    public long u0;

    public static final class Api23 {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public final class AudioSinkListener implements AudioSink.Listener {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) {
        if (!MimeTypes.g(format.m0)) {
            return RendererCapabilities.c(0, 0, 0);
        }
        int iW = w();
        if (iW <= 2) {
            return RendererCapabilities.c(iW, 0, 0);
        }
        return RendererCapabilities.c(iW, 8, Util.f18979a >= 21 ? 32 : 0);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final void f(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final MediaClock getMediaClock() {
        return this;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        if (this.g0 != 2) {
            return 0L;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
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
            if (Util.f18979a >= 23) {
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

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // com.google.android.exoplayer2.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r3 = this;
            r0 = 0
            r3.o0 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.u0 = r1
            com.google.android.exoplayer2.drm.DrmSession r1 = r3.s0     // Catch: java.lang.Throwable -> L15
            com.google.android.exoplayer2.drm.DrmSession.g(r1, r0)     // Catch: java.lang.Throwable -> L15
            r3.s0 = r0     // Catch: java.lang.Throwable -> L15
            r3.v()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DecoderAudioRenderer.j():void");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void k(boolean z2, boolean z3) {
        this.n0 = new DecoderCounters();
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void n() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void o() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void p(Format[] formatArr, long j, long j2) {
        if (this.u0 != -9223372036854775807L) {
            throw null;
        }
        this.u0 = j2;
        if (j2 != -9223372036854775807L) {
            throw null;
        }
    }

    public abstract Decoder r();

    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.o0 == null) {
            this.f16996Y.a();
            throw null;
        }
        u();
        if (this.p0 != null) {
            try {
                TraceUtil.a("drainAndFeed");
                s();
                TraceUtil.b();
                synchronized (this.n0) {
                }
            } catch (AudioSink.ConfigurationException e2) {
                throw i(e2, e2.X, false, IronSourceConstants.errorCode_biddingDataException);
            } catch (AudioSink.InitializationException e3) {
                throw i(e3, e3.Z, e3.f17293Y, IronSourceConstants.errorCode_biddingDataException);
            } catch (AudioSink.WriteException e4) {
                throw i(e4, e4.Z, e4.f17294Y, IronSourceConstants.errorCode_isReadyException);
            } catch (DecoderException e5) {
                Log.d("DecoderAudioRenderer", "Audio codec error", e5);
                throw null;
            }
        }
    }

    public final void s() throws ExoPlaybackException {
        if (this.q0 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.p0.dequeueOutputBuffer();
            this.q0 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return;
            }
            int i2 = simpleDecoderOutputBuffer.Z;
            if (i2 > 0) {
                this.n0.f += i2;
                throw null;
            }
            if (simpleDecoderOutputBuffer.b(134217728)) {
                throw null;
            }
        }
        if (!this.q0.b(4)) {
            Format.Builder builderA = t().a();
            builderA.f17077A = 0;
            builderA.f17078B = 0;
            builderA.a();
            throw null;
        }
        if (this.t0 != 2) {
            this.q0.getClass();
            throw null;
        }
        v();
        u();
    }

    public abstract Format t();

    public final void u() throws ExoPlaybackException {
        if (this.p0 != null) {
            return;
        }
        DrmSession drmSession = this.s0;
        DrmSession.g(this.r0, drmSession);
        this.r0 = drmSession;
        if (drmSession != null && drmSession.c() == null && this.r0.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            TraceUtil.a("createAudioDecoder");
            this.p0 = r();
            TraceUtil.b();
            SystemClock.elapsedRealtime();
            this.p0.getClass();
            throw null;
        } catch (DecoderException e2) {
            Log.d("DecoderAudioRenderer", "Audio codec error", e2);
            throw null;
        } catch (OutOfMemoryError e3) {
            throw i(e3, this.o0, false, 4001);
        }
    }

    public final void v() {
        this.q0 = null;
        this.t0 = 0;
        Decoder decoder = this.p0;
        if (decoder == null) {
            DrmSession.g(this.r0, null);
            this.r0 = null;
        } else {
            this.n0.f17427b++;
            decoder.release();
            this.p0.getClass();
            throw null;
        }
    }

    public abstract int w();
}
