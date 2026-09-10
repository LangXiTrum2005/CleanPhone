package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new AnonymousClass1();
    public final Bundle X;

    /* JADX INFO: renamed from: com.facebook.share.model.CameraEffectTextures$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<CameraEffectTextures> {
        @Override // android.os.Parcelable.Creator
        public final CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraEffectTextures[] newArray(int i2) {
            return new CameraEffectTextures[i2];
        }
    }

    public static class Builder implements ShareModelBuilder<CameraEffectTextures, Builder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bundle f16609a;
    }

    public CameraEffectTextures(Builder builder) {
        this.X = builder.f16609a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.X);
    }

    public CameraEffectTextures(Parcel parcel) {
        this.X = parcel.readBundle(getClass().getClassLoader());
    }
}
