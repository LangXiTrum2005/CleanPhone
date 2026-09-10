package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new android.support.v4.media.a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4980c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4978a);
        parcel.writeInt(this.f4979b);
        parcel.writeInt(this.f4980c ? 1 : 0);
    }
}
