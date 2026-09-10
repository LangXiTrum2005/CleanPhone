package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Builder> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new AnonymousClass1();
    public final boolean h0;
    public final ImageAspectRatio i0;
    public final ShareMessengerGenericTemplateElement j0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMessengerGenericTemplateContent[] newArray(int i2) {
            return new ShareMessengerGenericTemplateContent[i2];
        }
    }

    public static class Builder extends ShareContent.Builder<ShareMessengerGenericTemplateContent, Builder> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImageAspectRatio {
        public static final /* synthetic */ ImageAspectRatio[] X = {new ImageAspectRatio("HORIZONTAL", 0), new ImageAspectRatio("SQUARE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ImageAspectRatio EF5;

        public static ImageAspectRatio valueOf(String str) {
            return (ImageAspectRatio) Enum.valueOf(ImageAspectRatio.class, str);
        }

        public static ImageAspectRatio[] values() {
            return (ImageAspectRatio[]) X.clone();
        }
    }

    public ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.h0 = parcel.readByte() != 0;
        this.i0 = (ImageAspectRatio) parcel.readSerializable();
        this.j0 = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.h0 ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.i0);
        parcel.writeParcelable(this.j0, i2);
    }
}
