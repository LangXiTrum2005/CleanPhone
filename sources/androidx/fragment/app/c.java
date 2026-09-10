package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4266b;

    public c(Parcel parcel) {
        this.f4265a = parcel.createStringArrayList();
        this.f4266b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f4265a);
        parcel.writeTypedList(this.f4266b);
    }
}
