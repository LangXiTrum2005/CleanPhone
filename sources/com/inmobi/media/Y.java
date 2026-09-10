package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        Intrinsics.f(source, "source");
        return new Z(source, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new Z[i2];
    }
}
