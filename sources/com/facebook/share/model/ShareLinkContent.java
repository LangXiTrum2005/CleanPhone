package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Builder> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new AnonymousClass1();
    public final String h0;
    public final String i0;
    public final Uri j0;
    public final String k0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareLinkContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareLinkContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareLinkContent[] newArray(int i2) {
            return new ShareLinkContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareLinkContent, Builder> {
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
        this.j0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.k0 = parcel.readString();
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
        parcel.writeString(this.k0);
    }
}
