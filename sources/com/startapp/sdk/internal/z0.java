package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new a1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new a1[i2];
    }
}
