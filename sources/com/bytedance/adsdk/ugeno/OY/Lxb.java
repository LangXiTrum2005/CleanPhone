package com.bytedance.adsdk.ugeno.OY;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb implements Parcelable {
    private final Parcelable LD;
    public static final Lxb Lxb = new Lxb() { // from class: com.bytedance.adsdk.ugeno.OY.Lxb.1
    };
    public static final Parcelable.Creator<Lxb> CREATOR = new Parcelable.ClassLoaderCreator<Lxb>() { // from class: com.bytedance.adsdk.ugeno.OY.Lxb.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Lxb createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Lxb createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return Lxb.Lxb;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public Lxb[] newArray(int i) {
            return new Lxb[i];
        }
    };

    public final Parcelable Lxb() {
        return this.LD;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LD, i);
    }

    private Lxb() {
        this.LD = null;
    }

    public Lxb(Parcelable parcelable) {
        if (parcelable != null) {
            this.LD = parcelable == Lxb ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public Lxb(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.LD = parcelable == null ? Lxb : parcelable;
    }
}
