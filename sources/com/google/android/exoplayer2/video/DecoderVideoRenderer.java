package com.google.android.exoplayer2.video;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    public boolean A0;
    public long B0;
    public boolean C0;
    public VideoSize D0;
    public int E0;
    public DecoderCounters F0;
    public Format n0;
    public Decoder o0;
    public DecoderInputBuffer p0;
    public VideoDecoderOutputBuffer q0;
    public int r0;
    public Object s0;
    public Surface t0;
    public VideoDecoderOutputBufferRenderer u0;
    public VideoFrameMetadataListener v0;
    public DrmSession w0;
    public DrmSession x0;
    public int y0;
    public boolean z0;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
        if (i2 != 1) {
            if (i2 == 7) {
                this.v0 = (VideoFrameMetadataListener) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.t0 = (Surface) obj;
            this.u0 = null;
            this.r0 = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.t0 = null;
            this.u0 = (VideoDecoderOutputBufferRenderer) obj;
            this.r0 = 0;
        } else {
            this.t0 = null;
            this.u0 = null;
            this.r0 = -1;
            obj = null;
        }
        if (this.s0 == obj) {
            if (obj != null) {
                if (this.D0 != null || this.A0) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.s0 = obj;
        if (obj == null) {
            this.D0 = null;
            this.A0 = false;
            return;
        }
        if (this.o0 != null) {
            w();
        }
        if (this.D0 != null) {
            throw null;
        }
        this.A0 = false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        boolean zIsReady;
        if (this.n0 != null) {
            if (hasReadStreamToEnd()) {
                zIsReady = this.l0;
            } else {
                SampleStream sampleStream = this.h0;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (zIsReady || this.q0 != null) {
                if (!this.A0) {
                    if (!(this.r0 != -1)) {
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
    @Override // com.google.android.exoplayer2.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r2 = this;
            r0 = 0
            r2.n0 = r0
            r2.D0 = r0
            r1 = 0
            r2.A0 = r1
            com.google.android.exoplayer2.drm.DrmSession r1 = r2.x0     // Catch: java.lang.Throwable -> L13
            com.google.android.exoplayer2.drm.DrmSession.g(r1, r0)     // Catch: java.lang.Throwable -> L13
            r2.x0 = r0     // Catch: java.lang.Throwable -> L13
            r2.v()     // Catch: java.lang.Throwable -> L13
            throw r0
        L13:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DecoderVideoRenderer.j():void");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void k(boolean z2, boolean z3) {
        this.F0 = new DecoderCounters();
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void l(long j, boolean z2) throws ExoPlaybackException {
        this.C0 = false;
        this.A0 = false;
        this.B0 = -9223372036854775807L;
        Decoder decoder = this.o0;
        if (decoder == null) {
            throw null;
        }
        if (this.y0 != 0) {
            v();
            u();
            throw null;
        }
        this.p0 = null;
        if (this.q0 != null) {
            throw null;
        }
        decoder.flush();
        this.z0 = false;
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void n() {
        this.E0 = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void o() {
        if (this.E0 <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public final void p(Format[] formatArr, long j, long j2) {
    }

    public abstract Decoder r();

    @Override // com.google.android.exoplayer2.Renderer
    public final void render(long j, long j2) throws ExoPlaybackException {
        if (this.n0 == null) {
            this.f16996Y.a();
            throw null;
        }
        u();
        if (this.o0 != null) {
            try {
                TraceUtil.a("drainAndFeed");
                s(j);
                t();
                TraceUtil.b();
                synchronized (this.F0) {
                }
            } catch (DecoderException e2) {
                Log.d("DecoderVideoRenderer", "Video codec error", e2);
                throw null;
            }
        }
    }

    public final void s(long j) throws ExoPlaybackException {
        if (this.q0 == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.o0.dequeueOutputBuffer();
            this.q0 = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return;
            }
            this.F0.f += videoDecoderOutputBuffer.Z;
        }
        if (this.q0.b(4)) {
            if (this.y0 != 2) {
                this.q0.getClass();
                throw null;
            }
            v();
            u();
            return;
        }
        if (this.B0 == -9223372036854775807L) {
            this.B0 = j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.q0;
        long j2 = videoDecoderOutputBuffer2.f17434Y - j;
        if (this.r0 != -1) {
            throw null;
        }
        if (j2 >= -30000) {
            return;
        }
        this.F0.f++;
        videoDecoderOutputBuffer2.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:? A[SYNTHETIC] */
    public final boolean t() throws ExoPlaybackException {
        FormatHolder formatHolder;
        int iQ;
        Format format;
        DrmSession drmSession;
        Format format2;
        Decoder decoder;
        DecoderReuseEvaluation decoderReuseEvaluation;
        Decoder decoder2 = this.o0;
        if (decoder2 != null && this.y0 != 2 && !this.C0) {
            if (this.p0 == null) {
                DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) decoder2.dequeueInputBuffer();
                this.p0 = decoderInputBuffer;
                if (decoderInputBuffer != null) {
                    if (this.y0 == 1) {
                        DecoderInputBuffer decoderInputBuffer2 = this.p0;
                        decoderInputBuffer2.X = 4;
                        this.o0.queueInputBuffer(decoderInputBuffer2);
                        this.p0 = null;
                        this.y0 = 2;
                        return false;
                    }
                    formatHolder = this.f16996Y;
                    formatHolder.a();
                    iQ = q(formatHolder, this.p0, 0);
                    if (iQ != -5) {
                        format = formatHolder.f17094b;
                        format.getClass();
                        drmSession = formatHolder.f17093a;
                        DrmSession.g(this.x0, drmSession);
                        this.x0 = drmSession;
                        format2 = this.n0;
                        this.n0 = format;
                        decoder = this.o0;
                        if (decoder != null) {
                            u();
                            throw null;
                        }
                        if (drmSession != this.w0) {
                            decoderReuseEvaluation = new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 128);
                        } else {
                            decoderReuseEvaluation = new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 1);
                        }
                        if (decoderReuseEvaluation.d == 0) {
                            throw null;
                        }
                        if (this.z0) {
                            this.y0 = 1;
                            throw null;
                        }
                        v();
                        u();
                        throw null;
                    }
                    if (iQ != -4) {
                        if (this.p0.b(4)) {
                            long j = this.p0.f0;
                            throw null;
                        }
                        this.C0 = true;
                        this.o0.queueInputBuffer(this.p0);
                        this.p0 = null;
                        return false;
                    }
                    if (iQ != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (this.y0 == 1) {
                    DecoderInputBuffer decoderInputBuffer3 = this.p0;
                    decoderInputBuffer3.X = 4;
                    this.o0.queueInputBuffer(decoderInputBuffer3);
                    this.p0 = null;
                    this.y0 = 2;
                    return false;
                }
                formatHolder = this.f16996Y;
                formatHolder.a();
                iQ = q(formatHolder, this.p0, 0);
                if (iQ != -5) {
                    format = formatHolder.f17094b;
                    format.getClass();
                    drmSession = formatHolder.f17093a;
                    DrmSession.g(this.x0, drmSession);
                    this.x0 = drmSession;
                    format2 = this.n0;
                    this.n0 = format;
                    decoder = this.o0;
                    if (decoder != null) {
                        u();
                        throw null;
                    }
                    if (drmSession != this.w0) {
                        decoderReuseEvaluation = new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 128);
                    } else {
                        decoderReuseEvaluation = new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 1);
                    }
                    if (decoderReuseEvaluation.d == 0) {
                        throw null;
                    }
                    if (this.z0) {
                        this.y0 = 1;
                        throw null;
                    }
                    v();
                    u();
                    throw null;
                }
                if (iQ != -4) {
                    if (this.p0.b(4)) {
                        long j2 = this.p0.f0;
                        throw null;
                    }
                    this.C0 = true;
                    this.o0.queueInputBuffer(this.p0);
                    this.p0 = null;
                    return false;
                }
                if (iQ != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    public final void u() throws ExoPlaybackException {
        if (this.o0 != null) {
            return;
        }
        DrmSession drmSession = this.x0;
        DrmSession.g(this.w0, drmSession);
        this.w0 = drmSession;
        if (drmSession != null && drmSession.c() == null && this.w0.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.o0 = r();
            w();
            SystemClock.elapsedRealtime();
            this.o0.getClass();
            throw null;
        } catch (DecoderException e2) {
            Log.d("DecoderVideoRenderer", "Video codec error", e2);
            throw null;
        } catch (OutOfMemoryError e3) {
            throw i(e3, this.n0, false, 4001);
        }
    }

    public final void v() {
        this.p0 = null;
        this.q0 = null;
        this.y0 = 0;
        this.z0 = false;
        Decoder decoder = this.o0;
        if (decoder == null) {
            DrmSession.g(this.w0, null);
            this.w0 = null;
        } else {
            this.F0.f17427b++;
            decoder.release();
            this.o0.getClass();
            throw null;
        }
    }

    public abstract void w();
}
