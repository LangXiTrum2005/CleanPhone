package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Builder> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new AnonymousClass1();
    public final List h0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMediaContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMediaContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMediaContent[] newArray(int i2) {
            return new ShareMediaContent[i2];
        }
    }

    public static class Builder extends ShareContent.Builder<ShareMediaContent, Builder> {
    }

    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.h0 = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelableArray((ShareMedia[]) this.h0.toArray(), i2);
    }
}
