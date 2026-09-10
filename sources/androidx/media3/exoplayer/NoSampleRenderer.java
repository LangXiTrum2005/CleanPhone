package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.SystemClock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SampleStream f5960Y;
    public boolean Z;

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return RendererCapabilities.h(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.e(this.X == 1);
        this.X = 0;
        this.f5960Y = null;
        this.Z = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long e() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.X;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.f5960Y;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public final void handleMessage(int i2, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.Z;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void k(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.e(!this.Z);
        this.f5960Y = sampleStream;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void l(Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z2, boolean z3, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.e(this.X == 0);
        this.X = 1;
        k(formatArr, sampleStream, j, j2, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.e(this.X == 0);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) {
        this.Z = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.Z = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        Assertions.e(this.X == 1);
        this.X = 2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.e(this.X == 2);
        this.X = 1;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void i(int i2, PlayerId playerId, SystemClock systemClock) {
    }
}
