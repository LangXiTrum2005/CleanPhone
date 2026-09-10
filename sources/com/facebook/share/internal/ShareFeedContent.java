package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

/* JADX INFO: loaded from: classes3.dex */
public class ShareFeedContent extends ShareContent<ShareFeedContent, Builder> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new AnonymousClass1();
    public final String h0;
    public final String i0;
    public final String j0;
    public final String k0;
    public final String l0;
    public final String m0;
    public final String n0;

    /* JADX INFO: renamed from: com.facebook.share.internal.ShareFeedContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<ShareFeedContent> {
        @Override // android.os.Parcelable.Creator
        public final ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareFeedContent[] newArray(int i2) {
            return new ShareFeedContent[i2];
        }
    }

    public static final class Builder extends ShareContent.Builder<ShareFeedContent, Builder> {
    }

    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
        this.j0 = parcel.readString();
        this.k0 = parcel.readString();
        this.l0 = parcel.readString();
        this.m0 = parcel.readString();
        this.n0 = parcel.readString();
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
        parcel.writeString(this.j0);
        parcel.writeString(this.k0);
        parcel.writeString(this.l0);
        parcel.writeString(this.m0);
        parcel.writeString(this.n0);
    }
}
