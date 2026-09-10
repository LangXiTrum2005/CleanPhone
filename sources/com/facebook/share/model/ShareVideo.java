package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Uri f16627Y;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareVideo$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareVideo> {
        @Override // android.os.Parcelable.Creator
        public final ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareVideo[] newArray(int i2) {
            return new ShareVideo[i2];
        }
    }

    public static final class Builder extends ShareMedia.Builder<ShareVideo, Builder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f16628b;
    }

    public ShareVideo(Builder builder) {
        super(builder);
        this.f16627Y = builder.f16628b;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final ShareMedia.Type a() {
        return ShareMedia.Type.f16619Y;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f16627Y, 0);
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.f16627Y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
