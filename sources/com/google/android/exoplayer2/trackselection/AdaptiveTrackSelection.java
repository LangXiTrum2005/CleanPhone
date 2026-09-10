package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public final BandwidthMeter f;

    public static final class AdaptationCheckpoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18663b;

        public AdaptationCheckpoint(long j, long j2) {
            this.f18662a = j;
            this.f18663b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.f18662a == adaptationCheckpoint.f18662a && this.f18663b == adaptationCheckpoint.f18663b;
        }

        public final int hashCode() {
            return (((int) this.f18662a) * 31) + ((int) this.f18663b);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j, long j2, ImmutableList immutableList) {
        super(trackGroup, iArr);
        if (j2 < j) {
            Log.g("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f = bandwidthMeter;
        ImmutableList.u(immutableList);
    }

    public static void d(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i2);
            if (builder != null) {
                builder.h(new AdaptationCheckpoint(j, jArr[i2]));
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void enable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final void onPlaybackSpeed(float f) {
    }
}
