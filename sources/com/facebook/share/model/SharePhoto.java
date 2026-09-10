package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Bitmap f16623Y;
    public final Uri Z;
    public final boolean e0;
    public final String f0;

    /* JADX INFO: renamed from: com.facebook.share.model.SharePhoto$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<SharePhoto> {
        @Override // android.os.Parcelable.Creator
        public final SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SharePhoto[] newArray(int i2) {
            return new SharePhoto[i2];
        }
    }

    public static final class Builder extends ShareMedia.Builder<SharePhoto, Builder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f16624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f16625c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16626e;

        public final void a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return;
            }
            this.f16618a.putAll(new Bundle(sharePhoto.X));
            this.f16624b = sharePhoto.f16623Y;
            this.f16625c = sharePhoto.Z;
            this.d = sharePhoto.e0;
            this.f16626e = sharePhoto.f0;
        }
    }

    public SharePhoto(Builder builder) {
        super(builder);
        this.f16623Y = builder.f16624b;
        this.Z = builder.f16625c;
        this.e0 = builder.d;
        this.f0 = builder.f16626e;
    }

    @Override // com.facebook.share.model.ShareMedia
    public final ShareMedia.Type a() {
        return ShareMedia.Type.X;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f16623Y, 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f0);
    }

    public SharePhoto(Parcel parcel) {
        super(parcel);
        this.f16623Y = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.e0 = parcel.readByte() != 0;
        this.f0 = parcel.readString();
    }
}
