package ka;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new f9.d(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f44533a, 0);
        parcel.writeInt(bVar.f44534b ? 1 : 0);
    }
}
