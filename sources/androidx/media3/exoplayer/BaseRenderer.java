package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f5822Y;
    public RendererConfiguration e0;
    public int f0;
    public PlayerId g0;
    public SystemClock h0;
    public int i0;
    public SampleStream j0;
    public Format[] k0;
    public long l0;
    public long m0;
    public boolean o0;
    public boolean p0;
    public RendererCapabilities.Listener r0;
    public final Object X = new Object();
    public final FormatHolder Z = new FormatHolder();
    public long n0 = Long.MIN_VALUE;
    public Timeline q0 = Timeline.f5507a;

    public BaseRenderer(int i2) {
        this.f5822Y = i2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.e(this.i0 == 1);
        this.Z.a();
        this.i0 = 0;
        this.j0 = null;
        this.k0 = null;
        this.o0 = false;
        p();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long e() {
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void f() {
        synchronized (this.X) {
            this.r0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.i0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.j0;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.f5822Y;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.n0 == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void i(int i2, PlayerId playerId, SystemClock systemClock) {
        this.f0 = i2;
        this.g0 = playerId;
        this.h0 = systemClock;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.o0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void k(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.e(!this.o0);
        this.j0 = sampleStream;
        if (this.n0 == Long.MIN_VALUE) {
            this.n0 = j;
        }
        this.k0 = formatArr;
        this.l0 = j2;
        w(formatArr, j, j2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void l(Timeline timeline) {
        if (Util.a(this.q0, timeline)) {
            return;
        }
        this.q0 = timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z2, boolean z3, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.e(this.i0 == 0);
        this.e0 = rendererConfiguration;
        this.i0 = 1;
        q(z2, z3);
        k(formatArr, sampleStream, j, j2, mediaPeriodId);
        this.o0 = false;
        this.m0 = j;
        this.n0 = j;
        r(j, z2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
        SampleStream sampleStream = this.j0;
        sampleStream.getClass();
        sampleStream.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void n(RendererCapabilities.Listener listener) {
        synchronized (this.X) {
            this.r0 = listener;
        }
    }

    public final ExoPlaybackException o(Throwable th, Format format, boolean z2, int i2) {
        int iA;
        if (format == null || this.p0) {
            iA = 4;
        } else {
            this.p0 = true;
            try {
                iA = a(format) & 7;
                this.p0 = false;
            } catch (ExoPlaybackException unused) {
                this.p0 = false;
                iA = 4;
            } catch (Throwable th2) {
                this.p0 = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, th, i2, getName(), this.f0, format, format == null ? 4 : iA, z2);
    }

    public void p() {
    }

    public void q(boolean z2, boolean z3) {
    }

    public void r(long j, boolean z2) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        Assertions.e(this.i0 == 0);
        s();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.e(this.i0 == 0);
        this.Z.a();
        t();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) {
        this.o0 = false;
        this.m0 = j;
        this.n0 = j;
        r(j, false);
    }

    public void s() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.o0 = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        Assertions.e(this.i0 == 1);
        this.i0 = 2;
        u();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.e(this.i0 == 2);
        this.i0 = 1;
        v();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public final int x(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        SampleStream sampleStream = this.j0;
        sampleStream.getClass();
        int iE = sampleStream.e(formatHolder, decoderInputBuffer, i2);
        if (iE == -4) {
            if (decoderInputBuffer.b(4)) {
                this.n0 = Long.MIN_VALUE;
                return this.o0 ? -4 : -3;
            }
            long j = decoderInputBuffer.g0 + this.l0;
            decoderInputBuffer.g0 = j;
            this.n0 = Math.max(this.n0, j);
            return iE;
        }
        if (iE == -5) {
            Format format = formatHolder.f5911b;
            format.getClass();
            long j2 = format.r;
            if (j2 != Long.MAX_VALUE) {
                Format.Builder builderA = format.a();
                builderA.q = j2 + this.l0;
                formatHolder.f5911b = new Format(builderA);
            }
        }
        return iE;
    }

    public void w(Format[] formatArr, long j, long j2) {
    }
}
