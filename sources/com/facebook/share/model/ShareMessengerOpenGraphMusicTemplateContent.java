package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Builder> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new AnonymousClass1();
    public final Uri h0;
    public final ShareMessengerActionButton i0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i2) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i2];
        }
    }

    public static class Builder extends ShareContent.Builder<ShareMessengerOpenGraphMusicTemplateContent, Builder> {
    }

    public ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.h0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.i0 = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.h0, i2);
        parcel.writeParcelable(this.i0, i2);
    }
}
