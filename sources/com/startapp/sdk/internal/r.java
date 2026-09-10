package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.sdk.adsbase.model.AdDetails;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AdDetails(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new AdDetails[i2];
    }
}
