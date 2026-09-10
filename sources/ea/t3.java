package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends l9.a {
    public static final Parcelable.Creator<t3> CREATOR = new android.support.v4.media.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39770c;

    public t3(int i10, long j10, String str) {
        this.f39768a = str;
        this.f39769b = j10;
        this.f39770c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f39768a);
        r9.b.Q(parcel, 2, 8);
        parcel.writeLong(this.f39769b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f39770c);
        r9.b.S(parcel, iR);
    }
}
