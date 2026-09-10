package q0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f48514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48513b = new a();
    public static final Parcelable.Creator<b> CREATOR = new g0(4);

    public b() {
        this.f48514a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f48514a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f48514a = parcelable == f48513b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f48514a = parcelable == null ? f48513b : parcelable;
    }
}
