package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareHashtag$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareHashtag> {
        @Override // android.os.Parcelable.Creator
        public final ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareHashtag[] newArray(int i2) {
            return new ShareHashtag[i2];
        }
    }

    public static class Builder implements ShareModelBuilder<ShareHashtag, Builder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16617a;
    }

    public ShareHashtag(Builder builder) {
        this.X = builder.f16617a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
    }

    public ShareHashtag(Parcel parcel) {
        this.X = parcel.readString();
    }
}
