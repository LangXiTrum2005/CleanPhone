package androidx.media3.exoplayer.video;

import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.SampleStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    public VideoFrameMetadataListener A0;
    public DrmSession B0;
    public DrmSession C0;
    public int D0;
    public boolean E0;
    public int F0;
    public long G0;
    public boolean H0;
    public VideoSize I0;
    public int J0;
    public DecoderCounters K0;
    public Format s0;
    public Decoder t0;
    public DecoderInputBuffer u0;
    public VideoDecoderOutputBuffer v0;
    public int w0;
    public Object x0;
    public Surface y0;
    public VideoDecoderOutputBufferRenderer z0;

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    public final boolean A() throws ExoPlaybackException {
        DecoderInputBuffer decoderInputBuffer;
        FormatHolder formatHolder;
        int iX;
        Format format;
        DrmSession drmSession;
        Format format2;
        Decoder decoder;
        DecoderReuseEvaluation decoderReuseEvaluation;
        Decoder decoder2 = this.t0;
        if (decoder2 != null && this.D0 != 2 && !this.H0) {
            if (this.u0 == null) {
                DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) decoder2.dequeueInputBuffer();
                this.u0 = decoderInputBuffer2;
                if (decoderInputBuffer2 != null) {
                    decoderInputBuffer = this.u0;
                    decoderInputBuffer.getClass();
                    if (this.D0 == 1) {
                        decoderInputBuffer.X = 4;
                        Decoder decoder3 = this.t0;
                        decoder3.getClass();
                        decoder3.queueInputBuffer(decoderInputBuffer);
                        this.u0 = null;
                        this.D0 = 2;
                        return false;
                    }
                    formatHolder = this.Z;
                    formatHolder.a();
                    iX = x(formatHolder, decoderInputBuffer, 0);
                    if (iX != -5) {
                        format = formatHolder.f5911b;
                        format.getClass();
                        drmSession = formatHolder.f5910a;
                        DrmSession.e(this.C0, drmSession);
                        this.C0 = drmSession;
                        format2 = this.s0;
                        this.s0 = format;
                        decoder = this.t0;
                        if (decoder != null) {
                            B();
                            this.s0.getClass();
                            throw null;
                        }
                        if (drmSession != this.B0) {
                            String name = decoder.getName();
                            format2.getClass();
                            decoderReuseEvaluation = new DecoderReuseEvaluation(name, format2, format, 0, 128);
                        } else {
                            String name2 = decoder.getName();
                            format2.getClass();
                            decoderReuseEvaluation = new DecoderReuseEvaluation(name2, format2, format, 0, 1);
                        }
                        if (decoderReuseEvaluation.d == 0) {
                            if (this.E0) {
                                this.D0 = 1;
                            } else {
                                C();
                                B();
                            }
                        }
                        this.s0.getClass();
                        throw null;
                    }
                    if (iX != -4) {
                        if (decoderInputBuffer.b(4)) {
                            this.s0.getClass();
                            throw null;
                        }
                        this.H0 = true;
                        Decoder decoder4 = this.t0;
                        decoder4.getClass();
                        decoder4.queueInputBuffer(decoderInputBuffer);
                        this.u0 = null;
                        return false;
                    }
                    if (iX != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                decoderInputBuffer = this.u0;
                decoderInputBuffer.getClass();
                if (this.D0 == 1) {
                    decoderInputBuffer.X = 4;
                    Decoder decoder5 = this.t0;
                    decoder5.getClass();
                    decoder5.queueInputBuffer(decoderInputBuffer);
                    this.u0 = null;
                    this.D0 = 2;
                    return false;
                }
                formatHolder = this.Z;
                formatHolder.a();
                iX = x(formatHolder, decoderInputBuffer, 0);
                if (iX != -5) {
                    format = formatHolder.f5911b;
                    format.getClass();
                    drmSession = formatHolder.f5910a;
                    DrmSession.e(this.C0, drmSession);
                    this.C0 = drmSession;
                    format2 = this.s0;
                    this.s0 = format;
                    decoder = this.t0;
                    if (decoder != null) {
                        B();
                        this.s0.getClass();
                        throw null;
                    }
                    if (drmSession != this.B0) {
                        String name3 = decoder.getName();
                        format2.getClass();
                        decoderReuseEvaluation = new DecoderReuseEvaluation(name3, format2, format, 0, 128);
                    } else {
                        String name4 = decoder.getName();
                        format2.getClass();
                        decoderReuseEvaluation = new DecoderReuseEvaluation(name4, format2, format, 0, 1);
                    }
                    if (decoderReuseEvaluation.d == 0) {
                        if (this.E0) {
                            this.D0 = 1;
                        } else {
                            C();
                            B();
                        }
                    }
                    this.s0.getClass();
                    throw null;
                }
                if (iX != -4) {
                    if (decoderInputBuffer.b(4)) {
                        this.s0.getClass();
                        throw null;
                    }
                    this.H0 = true;
                    Decoder decoder6 = this.t0;
                    decoder6.getClass();
                    decoder6.queueInputBuffer(decoderInputBuffer);
                    this.u0 = null;
                    return false;
                }
                if (iX != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void B() throws ExoPlaybackException {
        if (this.t0 != null) {
            return;
        }
        DrmSession drmSession = this.C0;
        DrmSession.e(this.B0, drmSession);
        this.B0 = drmSession;
        if (drmSession != null && drmSession.c() == null && this.B0.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.s0.getClass();
            Decoder decoderY = y();
            this.t0 = decoderY;
            decoderY.a(this.m0);
            D();
            SystemClock.elapsedRealtime();
            this.t0.getClass();
            throw null;
        } catch (DecoderException e2) {
            Log.d("DecoderVideoRenderer", "Video codec error", e2);
            throw null;
        } catch (OutOfMemoryError e3) {
            throw o(e3, this.s0, false, 4001);
        }
    }

    public final void C() {
        this.u0 = null;
        this.v0 = null;
        this.D0 = 0;
        this.E0 = false;
        Decoder decoder = this.t0;
        if (decoder == null) {
            DrmSession.e(this.B0, null);
            this.B0 = null;
        } else {
            this.K0.f5824b++;
            decoder.release();
            this.t0.getClass();
            throw null;
        }
    }

    public abstract void D();

    @Override // androidx.media3.exoplayer.Renderer
    public final void b() {
        if (this.F0 == 0) {
            this.F0 = 1;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 != 1) {
            if (i2 == 7) {
                this.A0 = (VideoFrameMetadataListener) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.y0 = (Surface) obj;
            this.z0 = null;
            this.w0 = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.y0 = null;
            this.z0 = (VideoDecoderOutputBufferRenderer) obj;
            this.w0 = 0;
        } else {
            this.y0 = null;
            this.z0 = null;
            this.w0 = -1;
            obj = null;
        }
        Object obj2 = this.x0;
        if (obj2 == obj) {
            if (obj != null) {
                if (this.I0 != null) {
                    throw null;
                }
                if (this.F0 == 3 && obj2 != null) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.x0 = obj;
        if (obj == null) {
            this.I0 = null;
            this.F0 = Math.min(this.F0, 1);
            return;
        }
        if (this.t0 != null) {
            D();
        }
        if (this.I0 != null) {
            throw null;
        }
        this.F0 = Math.min(this.F0, 1);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        boolean zIsReady;
        if (this.s0 != null) {
            if (hasReadStreamToEnd()) {
                zIsReady = this.o0;
            } else {
                SampleStream sampleStream = this.j0;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (zIsReady || this.v0 != null) {
                if (this.F0 != 3) {
                    if (!(this.w0 != -1)) {
                    }
                }
                return true;
            }
        }
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
            r3.s0 = r0
            r3.I0 = r0
            int r1 = r3.F0
            r2 = 0
            int r1 = java.lang.Math.min(r1, r2)
            r3.F0 = r1
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.C0     // Catch: java.lang.Throwable -> L19
            androidx.media3.exoplayer.drm.DrmSession.e(r1, r0)     // Catch: java.lang.Throwable -> L19
            r3.C0 = r0     // Catch: java.lang.Throwable -> L19
            r3.C()     // Catch: java.lang.Throwable -> L19
            throw r0
        L19:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.DecoderVideoRenderer.p():void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void q(boolean z2, boolean z3) {
        this.K0 = new DecoderCounters();
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void r(long j, boolean z2) throws ExoPlaybackException {
        this.H0 = false;
        this.F0 = Math.min(this.F0, 1);
        this.G0 = -9223372036854775807L;
        Decoder decoder = this.t0;
        if (decoder == null) {
            throw null;
        }
        if (this.D0 != 0) {
            C();
            B();
            throw null;
        }
        this.u0 = null;
        if (this.v0 != null) {
            throw null;
        }
        decoder.flush();
        decoder.a(this.m0);
        this.E0 = false;
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.s0 == null) {
            this.Z.a();
            throw null;
        }
        B();
        if (this.t0 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                z(j);
                A();
                Trace.endSection();
                synchronized (this.K0) {
                }
            } catch (DecoderException e2) {
                Log.d("DecoderVideoRenderer", "Video codec error", e2);
                throw null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void u() {
        this.J0 = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        int i2 = Util.f5683a;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void v() {
        if (this.J0 <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    public abstract Decoder y();

    public final void z(long j) throws ExoPlaybackException {
        if (this.v0 == null) {
            Decoder decoder = this.t0;
            decoder.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) decoder.dequeueOutputBuffer();
            this.v0 = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return;
            }
            this.K0.f += videoDecoderOutputBuffer.Z;
        }
        if (this.v0.b(4)) {
            if (this.D0 != 2) {
                this.v0.getClass();
                throw null;
            }
            C();
            B();
            return;
        }
        if (this.G0 == -9223372036854775807L) {
            this.G0 = j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.v0;
        videoDecoderOutputBuffer2.getClass();
        long j2 = videoDecoderOutputBuffer2.f5802Y - j;
        if (this.w0 != -1) {
            throw null;
        }
        if (j2 >= -30000) {
            return;
        }
        this.K0.f++;
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void w(Format[] formatArr, long j, long j2) {
    }
}
