package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4270b;

    public c1(String str, int i10) {
        this.f4269a = str;
        this.f4270b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4269a);
        parcel.writeInt(this.f4270b);
    }
}
