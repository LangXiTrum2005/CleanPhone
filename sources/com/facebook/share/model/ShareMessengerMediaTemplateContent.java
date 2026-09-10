package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Builder> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new AnonymousClass1();
    public final MediaType h0;
    public final String i0;
    public final Uri j0;
    public final ShareMessengerActionButton k0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMessengerMediaTemplateContent[] newArray(int i2) {
            return new ShareMessengerMediaTemplateContent[i2];
        }
    }

    public static class Builder extends ShareContent.Builder<ShareMessengerMediaTemplateContent, Builder> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MediaType {
        public static final /* synthetic */ MediaType[] X = {new MediaType("IMAGE", 0), new MediaType("VIDEO", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        MediaType EF5;

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) X.clone();
        }
    }

    public ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.h0 = (MediaType) parcel.readSerializable();
        this.i0 = parcel.readString();
        this.j0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.k0 = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.h0);
        parcel.writeString(this.i0);
        parcel.writeParcelable(this.j0, i2);
        parcel.writeParcelable(this.k0, i2);
    }
}
