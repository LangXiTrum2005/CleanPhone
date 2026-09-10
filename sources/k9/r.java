package k9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends l9.a {
    public static final Parcelable.Creator<r> CREATOR = new f9.d(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44508e;

    public r(int i10, int i11, long j10, String str, boolean z10) {
        this.f44504a = i10;
        this.f44505b = str;
        this.f44506c = j10;
        this.f44507d = i11;
        this.f44508e = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44504a);
        r9.b.J(parcel, 2, this.f44505b);
        r9.b.Q(parcel, 3, 8);
        parcel.writeLong(this.f44506c);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f44507d);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f44508e ? 1 : 0);
        r9.b.S(parcel, iR);
    }
}
