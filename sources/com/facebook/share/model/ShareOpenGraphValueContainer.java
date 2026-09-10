package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.Builder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends Builder> implements ShareModel {
    public final Bundle X;

    public static abstract class Builder<P extends ShareOpenGraphValueContainer, E extends Builder> implements ShareModelBuilder<P, E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f16622a;
    }

    public ShareOpenGraphValueContainer(ShareOpenGraphAction.Builder builder) {
        this.X = (Bundle) builder.f16622a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.X);
    }

    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.X = parcel.readBundle(Builder.class.getClassLoader());
    }
}
