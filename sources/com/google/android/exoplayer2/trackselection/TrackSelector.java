package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TrackSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InvalidationListener f18707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BandwidthMeter f18708b;

    public interface InvalidationListener {
        void onTrackSelectionsInvalidated();
    }

    public abstract void a(MappingTrackSelector.MappedTrackInfo mappedTrackInfo);

    public void b() {
        this.f18707a = null;
        this.f18708b = null;
    }

    public abstract TrackSelectorResult c(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    public void d(AudioAttributes audioAttributes) {
    }
}
