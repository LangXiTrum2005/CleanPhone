package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionOverride {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackGroup f5525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f5526b;

    static {
        Util.E(0);
        Util.E(1);
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.f5521a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f5525a = trackGroup;
        this.f5526b = ImmutableList.u(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.f5525a.equals(trackSelectionOverride.f5525a) && this.f5526b.equals(trackSelectionOverride.f5526b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5526b.hashCode() * 31) + this.f5525a.hashCode();
    }
}
