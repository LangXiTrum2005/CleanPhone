package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrackSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InvalidationListener f6537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BandwidthMeter f6538b;

    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    public TrackSelectionParameters b() {
        return TrackSelectionParameters.t;
    }

    public RendererCapabilities.Listener c() {
        return null;
    }

    public abstract void d(MappingTrackSelector.MappedTrackInfo mappedTrackInfo);

    public void e() {
        this.f6537a = null;
        this.f6538b = null;
    }

    public abstract TrackSelectorResult f(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    public void g(AudioAttributes audioAttributes) {
    }

    public void h(TrackSelectionParameters trackSelectionParameters) {
    }
}
