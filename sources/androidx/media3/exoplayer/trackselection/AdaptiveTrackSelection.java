package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public final BandwidthMeter f;

    public static final class AdaptationCheckpoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6505b;

        public AdaptationCheckpoint(long j, long j2) {
            this.f6504a = j;
            this.f6505b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.f6504a == adaptationCheckpoint.f6504a && this.f6505b == adaptationCheckpoint.f6505b;
        }

        public final int hashCode() {
            return (((int) this.f6504a) * 31) + ((int) this.f6505b);
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

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void enable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndex() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void onPlaybackSpeed(float f) {
    }
}
