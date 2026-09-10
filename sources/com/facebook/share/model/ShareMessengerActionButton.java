package com.facebook.share.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ShareMessengerActionButton implements ShareModel {
    public final String X;

    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder> implements ShareModelBuilder<M, B> {
    }

    public ShareMessengerActionButton(Parcel parcel) {
        this.X = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
    }
}
