package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4OrientationData> CREATOR = new AnonymousClass1();
    public final int X;

    /* JADX INFO: renamed from: androidx.media3.container.Mp4OrientationData$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Mp4OrientationData> {
        @Override // android.os.Parcelable.Creator
        public final Mp4OrientationData createFromParcel(Parcel parcel) {
            return new Mp4OrientationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Mp4OrientationData[] newArray(int i2) {
            return new Mp4OrientationData[i2];
        }
    }

    public Mp4OrientationData(Parcel parcel) {
        this.X = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.X == ((Mp4OrientationData) obj).X;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        return "Orientation= " + this.X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.X);
    }
}
