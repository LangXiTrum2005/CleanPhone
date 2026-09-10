package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectorResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RendererConfiguration[] f18710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExoTrackSelection[] f18711c;
    public final Tracks d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MappingTrackSelector.MappedTrackInfo f18712e;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        this.f18710b = rendererConfigurationArr;
        this.f18711c = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.d = tracks;
        this.f18712e = mappedTrackInfo;
        this.f18709a = rendererConfigurationArr.length;
    }

    public final boolean a(TrackSelectorResult trackSelectorResult, int i2) {
        return trackSelectorResult != null && Util.a(this.f18710b[i2], trackSelectorResult.f18710b[i2]) && Util.a(this.f18711c[i2], trackSelectorResult.f18711c[i2]);
    }

    public final boolean b(int i2) {
        return this.f18710b[i2] != null;
    }
}
