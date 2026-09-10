package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f16620Y;
    public final Uri Z;
    public final ShareMessengerActionButton e0;
    public final ShareMessengerActionButton f0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        @Override // android.os.Parcelable.Creator
        public final ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMessengerGenericTemplateElement[] newArray(int i2) {
            return new ShareMessengerGenericTemplateElement[i2];
        }
    }

    public static class Builder implements ShareModelBuilder<ShareMessengerGenericTemplateElement, Builder> {
    }

    public ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.X = parcel.readString();
        this.f16620Y = parcel.readString();
        this.Z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.e0 = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f0 = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f16620Y);
        parcel.writeParcelable(this.Z, i2);
        parcel.writeParcelable(this.e0, i2);
        parcel.writeParcelable(this.f0, i2);
    }
}
