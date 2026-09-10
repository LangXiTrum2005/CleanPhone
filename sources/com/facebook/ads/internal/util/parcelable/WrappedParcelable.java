package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new AnonymousClass1();
    public final byte[] X;

    /* JADX INFO: renamed from: com.facebook.ads.internal.util.parcelable.WrappedParcelable$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<WrappedParcelable> {
        @Override // android.os.Parcelable.Creator
        public final WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WrappedParcelable[] newArray(int i2) {
            return new WrappedParcelable[i2];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.X = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] bArr = this.X;
        if (bArr == null) {
            return null;
        }
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        return parcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.X);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.X = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.X = bArr;
    }
}
