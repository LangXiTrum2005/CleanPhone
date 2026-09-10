package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SampleStream f17173Y;
    public boolean Z;

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int a(Format format) {
        return RendererCapabilities.c(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void b(int i2, PlayerId playerId) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
        Assertions.d(this.X == 1);
        this.X = 0;
        this.f17173Y = null;
        this.Z = false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long e() {
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void g(Format[] formatArr, SampleStream sampleStream, long j, long j2) {
        Assertions.d(!this.Z);
        this.f17173Y = sampleStream;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final MediaClock getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
        return this.X;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final SampleStream getStream() {
        return this.f17173Y;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void h(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z2, boolean z3, long j2, long j3) {
        Assertions.d(this.X == 0);
        this.X = 1;
        g(formatArr, sampleStream, j2, j3);
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.Z;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isEnded() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
        Assertions.d(this.X == 0);
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j) {
        this.Z = false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
        this.Z = true;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() {
        Assertions.d(this.X == 1);
        this.X = 2;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
        Assertions.d(this.X == 2);
        this.X = 1;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 0;
    }
}
