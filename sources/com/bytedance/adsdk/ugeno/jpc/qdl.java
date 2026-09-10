package com.bytedance.adsdk.ugeno.jpc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl implements Parcelable {
    private final Parcelable ud;
    public static final qdl qdl = new qdl() { // from class: com.bytedance.adsdk.ugeno.jpc.qdl.1
    };
    public static final Parcelable.Creator<qdl> CREATOR = new Parcelable.ClassLoaderCreator<qdl>() { // from class: com.bytedance.adsdk.ugeno.jpc.qdl.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public qdl createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public qdl createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return qdl.qdl;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public qdl[] newArray(int i2) {
            return new qdl[i2];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable qdl() {
        return this.ud;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.ud, i2);
    }

    private qdl() {
        this.ud = null;
    }

    public qdl(Parcelable parcelable) {
        if (parcelable != null) {
            this.ud = parcelable == qdl ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public qdl(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.ud = parcelable == null ? qdl : parcelable;
    }
}
