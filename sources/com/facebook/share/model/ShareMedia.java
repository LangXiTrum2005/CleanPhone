package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShareMedia implements ShareModel {
    public final Bundle X;

    public static abstract class Builder<M extends ShareMedia, B extends Builder> implements ShareModelBuilder<M, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f16618a = new Bundle();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Type f16619Y;
        public static final /* synthetic */ Type[] Z;

        static {
            Type type = new Type("PHOTO", 0);
            X = type;
            Type type2 = new Type("VIDEO", 1);
            f16619Y = type2;
            Z = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) Z.clone();
        }
    }

    public ShareMedia(Builder builder) {
        this.X = new Bundle(builder.f16618a);
    }

    public abstract Type a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.X);
    }

    public ShareMedia(Parcel parcel) {
        this.X = parcel.readBundle();
    }
}
