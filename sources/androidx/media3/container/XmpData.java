package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new AnonymousClass1();
    public final byte[] X;

    /* JADX INFO: renamed from: androidx.media3.container.XmpData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<XmpData> {
        @Override // android.os.Parcelable.Creator
        public final XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final XmpData[] newArray(int i2) {
            return new XmpData[i2];
        }
    }

    public XmpData(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = Util.f5683a;
        this.X = bArrCreateByteArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.X, ((XmpData) obj).X);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    public final String toString() {
        return "XMP: " + Util.S(this.X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.X);
    }
}
