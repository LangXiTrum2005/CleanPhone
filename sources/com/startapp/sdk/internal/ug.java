package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ug extends u6 {
    public static final Parcelable.Creator<ug> CREATOR = new tg();
    public final float f;
    public final float g;

    public ug() {
        this.f = 0.9f;
        this.g = 0.6f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.startapp.sdk.internal.u6, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
    }

    public ug(Parcel parcel) {
        super(parcel);
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
    }
}
