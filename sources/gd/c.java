package gd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new f9.d(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f41844b;

    public c(String str) {
        this.f41843a = str;
        this.f41844b = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f41843a);
        parcel.writeLong(this.f41844b.get());
    }

    public c(Parcel parcel) {
        this.f41843a = parcel.readString();
        this.f41844b = new AtomicLong(parcel.readLong());
    }
}
