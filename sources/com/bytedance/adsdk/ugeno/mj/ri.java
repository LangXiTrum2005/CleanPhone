package com.bytedance.adsdk.ugeno.mj;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri implements Parcelable {
    private final Parcelable lr;
    public static final ri ri = new ri() { // from class: com.bytedance.adsdk.ugeno.mj.ri.1
    };
    public static final Parcelable.Creator<ri> CREATOR = new Parcelable.ClassLoaderCreator<ri>() { // from class: com.bytedance.adsdk.ugeno.mj.ri.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ri createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ri createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return ri.ri;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public ri[] newArray(int i) {
            return new ri[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable ri() {
        return this.lr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.lr, i);
    }

    private ri() {
        this.lr = null;
    }

    public ri(Parcelable parcelable) {
        if (parcelable != null) {
            this.lr = parcelable == ri ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public ri(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.lr = parcelable == null ? ri : parcelable;
    }
}
