package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, SlowMotionData.Segment.class.getClassLoader());
        return new SlowMotionData(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SlowMotionData[i];
    }
}
