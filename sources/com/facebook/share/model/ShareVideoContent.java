package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Builder> implements ShareModel {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new AnonymousClass1();
    public final String h0;
    public final String i0;
    public final SharePhoto j0;
    public final ShareVideo k0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareVideoContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareVideoContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareVideoContent[] newArray(int i2) {
            return new ShareVideoContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareVideoContent, Builder> {
    }

    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
        SharePhoto.Builder builder = new SharePhoto.Builder();
        builder.a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        if (builder.f16625c == null && builder.f16624b == null) {
            this.j0 = null;
        } else {
            this.j0 = new SharePhoto(builder);
        }
        ShareVideo.Builder builder2 = new ShareVideo.Builder();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            builder2.f16618a.putAll(new Bundle(shareVideo.X));
            builder2.f16628b = shareVideo.f16627Y;
        }
        this.k0 = new ShareVideo(builder2);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.h0);
        parcel.writeString(this.i0);
        parcel.writeParcelable(this.j0, 0);
        parcel.writeParcelable(this.k0, 0);
    }
}
