package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.primitives.Ints;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Bundleable.Creator {
    public final /* synthetic */ int X;

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public final Bundleable e(Bundle bundle) {
        switch (this.X) {
            case 0:
                int i2 = bundle.getInt(DefaultTrackSelector.SelectionOverride.e0, -1);
                int[] intArray = bundle.getIntArray(DefaultTrackSelector.SelectionOverride.f0);
                int i3 = bundle.getInt(DefaultTrackSelector.SelectionOverride.g0, -1);
                Assertions.b(i2 >= 0 && i3 >= 0);
                intArray.getClass();
                return new DefaultTrackSelector.SelectionOverride(i2, i3, intArray);
            default:
                Bundle bundle2 = bundle.getBundle(TrackSelectionOverride.Z);
                bundle2.getClass();
                TrackGroup trackGroup = (TrackGroup) TrackGroup.i0.e(bundle2);
                int[] intArray2 = bundle.getIntArray(TrackSelectionOverride.e0);
                intArray2.getClass();
                return new TrackSelectionOverride(trackGroup, Ints.a(intArray2));
        }
    }
}
