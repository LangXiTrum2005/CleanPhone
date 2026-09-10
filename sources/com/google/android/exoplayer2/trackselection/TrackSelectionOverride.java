package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionOverride implements Bundleable {
    public static final String Z;
    public static final String e0;
    public final TrackGroup X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ImmutableList f18693Y;

    static {
        int i2 = Util.f18979a;
        Z = Integer.toString(0, 36);
        e0 = Integer.toString(1, 36);
    }

    public TrackSelectionOverride(TrackGroup trackGroup, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.X)) {
            throw new IndexOutOfBoundsException();
        }
        this.X = trackGroup;
        this.f18693Y = ImmutableList.u(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackSelectionOverride.class == obj.getClass()) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            if (this.X.equals(trackSelectionOverride.X) && this.f18693Y.equals(trackSelectionOverride.f18693Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18693Y.hashCode() * 31) + this.X.hashCode();
    }
}
