package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AppInviteContent implements ShareModel {

    @Deprecated
    public static final Parcelable.Creator<AppInviteContent> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f16606Y;
    public final String Z;
    public final String e0;
    public final Builder.Destination f0;

    /* JADX INFO: renamed from: com.facebook.share.model.AppInviteContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<AppInviteContent> {
        @Override // android.os.Parcelable.Creator
        public final AppInviteContent createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInviteContent[] newArray(int i2) {
            return new AppInviteContent[i2];
        }
    }

    @Deprecated
    public static class Builder implements ShareModelBuilder<AppInviteContent, Builder> {

        @Deprecated
        public enum Destination {
            FACEBOOK("facebook"),
            /* JADX INFO: Fake field, exist only in values array */
            MESSENGER("messenger");

            public final String X;

            Destination(String str) {
                this.X = str;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return this.X;
            }
        }
    }

    public AppInviteContent(Parcel parcel) {
        this.X = parcel.readString();
        this.f16606Y = parcel.readString();
        this.e0 = parcel.readString();
        this.Z = parcel.readString();
        String string = parcel.readString();
        if (string.length() > 0) {
            this.f0 = Builder.Destination.valueOf(string);
        } else {
            this.f0 = Builder.Destination.FACEBOOK;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f16606Y);
        parcel.writeString(this.e0);
        parcel.writeString(this.Z);
        parcel.writeString(this.f0.X);
    }
}
