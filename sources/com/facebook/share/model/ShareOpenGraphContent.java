package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Builder> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new AnonymousClass1();
    public final ShareOpenGraphAction h0;
    public final String i0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareOpenGraphContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareOpenGraphContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareOpenGraphContent[] newArray(int i2) {
            return new ShareOpenGraphContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareOpenGraphContent, Builder> {
    }

    public ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        ShareOpenGraphAction.Builder builder = new ShareOpenGraphAction.Builder();
        Bundle bundle = new Bundle();
        builder.f16622a = bundle;
        ShareOpenGraphAction shareOpenGraphAction = (ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader());
        if (shareOpenGraphAction != null) {
            Bundle bundle2 = shareOpenGraphAction.X;
            bundle.putAll((Bundle) bundle2.clone());
            bundle.putString("og:type", bundle2.getString("og:type"));
        }
        this.h0 = new ShareOpenGraphAction(builder);
        this.i0 = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.h0, 0);
        parcel.writeString(this.i0);
    }
}
