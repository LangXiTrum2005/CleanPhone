package mercenary;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Codecs.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern {
    static {
        dern.class.getClassLoader();
    }

    public static <T extends Parcelable> T attabal(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void saneness(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
