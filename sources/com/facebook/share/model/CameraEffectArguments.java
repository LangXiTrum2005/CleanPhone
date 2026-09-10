package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new AnonymousClass1();
    public final Bundle X;

    /* JADX INFO: renamed from: com.facebook.share.model.CameraEffectArguments$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<CameraEffectArguments> {
        @Override // android.os.Parcelable.Creator
        public final CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraEffectArguments[] newArray(int i2) {
            return new CameraEffectArguments[i2];
        }
    }

    public static class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f16608a;
    }

    public CameraEffectArguments(Builder builder) {
        this.X = builder.f16608a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.X);
    }

    public CameraEffectArguments(Parcel parcel) {
        this.X = parcel.readBundle(getClass().getClassLoader());
    }
}
