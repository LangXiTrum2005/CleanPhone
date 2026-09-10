package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LikeContent implements ShareModel {

    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f16579Y;

    /* JADX INFO: renamed from: com.facebook.share.internal.LikeContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<LikeContent> {
        @Override // android.os.Parcelable.Creator
        public final LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LikeContent[] newArray(int i2) {
            return new LikeContent[i2];
        }
    }

    @Deprecated
    public static class Builder implements ShareModelBuilder<LikeContent, Builder> {
    }

    public LikeContent(Parcel parcel) {
        this.X = parcel.readString();
        this.f16579Y = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f16579Y);
    }
}
