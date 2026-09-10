package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectorResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RendererConfiguration[] f6540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoTrackSelection[] f6541c;
    public final Tracks d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MappingTrackSelector.MappedTrackInfo f6542e;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        Assertions.b(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.f6540b = rendererConfigurationArr;
        this.f6541c = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.d = tracks;
        this.f6542e = mappedTrackInfo;
        this.f6539a = rendererConfigurationArr.length;
    }

    public final boolean a(TrackSelectorResult trackSelectorResult, int i2) {
        return trackSelectorResult != null && Util.a(this.f6540b[i2], trackSelectorResult.f6540b[i2]) && Util.a(this.f6541c[i2], trackSelectorResult.f6541c[i2]);
    }

    public final boolean b(int i2) {
        return this.f6540b[i2] != null;
    }
}
