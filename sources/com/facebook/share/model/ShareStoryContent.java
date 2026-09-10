package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new AnonymousClass1();
    public final ShareMedia h0;
    public final SharePhoto i0;
    public final List j0;
    public final String k0;

    /* JADX INFO: renamed from: com.facebook.share.model.ShareStoryContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareStoryContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareStoryContent[] newArray(int i2) {
            return new ShareStoryContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
    }

    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.h0 = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.i0 = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.j0 = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.k0 = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.h0, 0);
        parcel.writeParcelable(this.i0, 0);
        parcel.writeStringList(this.j0);
        parcel.writeString(this.k0);
    }
}
