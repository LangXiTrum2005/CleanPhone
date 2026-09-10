package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Consumer;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Consumer, Bundleable.Creator {
    public final /* synthetic */ int X;

    public /* synthetic */ i(int i2) {
        this.X = i2;
    }

    public void a(Object obj) {
        ((SampleQueue.SharedSampleMetadata) obj).f18405b.release();
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable e(Bundle bundle) {
        switch (this.X) {
            case 1:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(TrackGroup.g0);
                return new TrackGroup(bundle.getString(TrackGroup.h0, ""), (Format[]) (parcelableArrayList == null ? ImmutableList.x() : BundleableUtil.a(Format.q1, parcelableArrayList)).toArray(new Format[0]));
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(TrackGroupArray.f0);
                return parcelableArrayList2 == null ? new TrackGroupArray(new TrackGroup[0]) : new TrackGroupArray((TrackGroup[]) BundleableUtil.a(TrackGroup.i0, parcelableArrayList2).toArray(new TrackGroup[0]));
        }
    }
}
