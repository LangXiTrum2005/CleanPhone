package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    public final int X;
    public RendererConfiguration Z;
    public int e0;
    public PlayerId f0;
    public int g0;
    public SampleStream h0;
    public Format[] i0;
    public long j0;
    public boolean l0;
    public boolean m0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final FormatHolder f16996Y = new FormatHolder();
    public long k0 = Long.MIN_VALUE;

    public BaseRenderer(int i2) {
        this.X = i2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void b(int i2, PlayerId playerId) {
        this.e0 = i2;
        this.f0 = playerId;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        Assertions.d(this.g0 == 1);
        this.f16996Y.a();
        this.g0 = 0;
        this.h0 = null;
        this.i0 = null;
        this.l0 = false;
        j();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long e() {
        return this.k0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void g(Format[] formatArr, SampleStream sampleStream, long j, long j2) {
        Assertions.d(!this.l0);
        this.h0 = sampleStream;
        if (this.k0 == Long.MIN_VALUE) {
            this.k0 = j;
        }
        this.i0 = formatArr;
        this.j0 = j2;
        p(formatArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.g0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final SampleStream getStream() {
        return this.h0;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return this.X;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void h(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z2, boolean z3, long j2, long j3) {
        Assertions.d(this.g0 == 0);
        this.Z = rendererConfiguration;
        this.g0 = 1;
        k(z2, z3);
        g(formatArr, sampleStream, j2, j3);
        this.l0 = false;
        this.k0 = j;
        l(j, z2);
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.k0 == Long.MIN_VALUE;
    }

    public final ExoPlaybackException i(Throwable th, Format format, boolean z2, int i2) {
        int iA;
        if (format == null || this.m0) {
            iA = 4;
        } else {
            this.m0 = true;
            try {
                iA = a(format) & 7;
                this.m0 = false;
            } catch (ExoPlaybackException unused) {
                this.m0 = false;
                iA = 4;
            } catch (Throwable th2) {
                this.m0 = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, th, i2, getName(), this.e0, format, format == null ? 4 : iA, z2);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.l0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    public void j() {
    }

    public void k(boolean z2, boolean z3) {
    }

    public void l(long j, boolean z2) {
    }

    public void m() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() {
        SampleStream sampleStream = this.h0;
        sampleStream.getClass();
        sampleStream.maybeThrowError();
    }

    public void n() {
    }

    public void o() {
    }

    public void p(Format[] formatArr, long j, long j2) {
    }

    public final int q(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        SampleStream sampleStream = this.h0;
        sampleStream.getClass();
        int iG = sampleStream.g(formatHolder, decoderInputBuffer, i2);
        if (iG == -4) {
            if (decoderInputBuffer.b(4)) {
                this.k0 = Long.MIN_VALUE;
                return this.l0 ? -4 : -3;
            }
            long j = decoderInputBuffer.f0 + this.j0;
            decoderInputBuffer.f0 = j;
            this.k0 = Math.max(this.k0, j);
            return iG;
        }
        if (iG == -5) {
            Format format = formatHolder.f17094b;
            format.getClass();
            long j2 = format.q0;
            if (j2 != Long.MAX_VALUE) {
                Format.Builder builderA = format.a();
                builderA.o = j2 + this.j0;
                formatHolder.f17094b = new Format(builderA);
            }
        }
        return iG;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.d(this.g0 == 0);
        this.f16996Y.a();
        m();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j) {
        this.l0 = false;
        this.k0 = j;
        l(j, false);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.l0 = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() {
        Assertions.d(this.g0 == 1);
        this.g0 = 2;
        n();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.d(this.g0 == 2);
        this.g0 = 1;
        o();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }
}
