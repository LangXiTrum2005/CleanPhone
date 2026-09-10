package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f16605Y;
    public final AppGroupPrivacy Z;

    /* JADX INFO: renamed from: com.facebook.share.model.AppGroupCreationContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<AppGroupCreationContent> {
        @Override // android.os.Parcelable.Creator
        public final AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AppGroupCreationContent[] newArray(int i2) {
            return new AppGroupCreationContent[i2];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AppGroupPrivacy {
        public static final /* synthetic */ AppGroupPrivacy[] X = {new AppGroupPrivacy("Open", 0), new AppGroupPrivacy("Closed", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        AppGroupPrivacy EF5;

        public static AppGroupPrivacy valueOf(String str) {
            return (AppGroupPrivacy) Enum.valueOf(AppGroupPrivacy.class, str);
        }

        public static AppGroupPrivacy[] values() {
            return (AppGroupPrivacy[]) X.clone();
        }
    }

    public static class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
    }

    public AppGroupCreationContent(Parcel parcel) {
        this.X = parcel.readString();
        this.f16605Y = parcel.readString();
        this.Z = (AppGroupPrivacy) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f16605Y);
        parcel.writeSerializable(this.Z);
    }
}
