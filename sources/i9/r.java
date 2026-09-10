package i9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends l9.a {
    public static final Parcelable.Creator<r> CREATOR = new f9.d(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42964e;

    public r(int i10, int i11, long j10, String str, boolean z10) {
        this.f42960a = z10;
        this.f42961b = str;
        this.f42962c = com.google.android.gms.internal.auth.o.B(i10) - 1;
        this.f42963d = com.google.android.gms.internal.auth.i.H(i11) - 1;
        this.f42964e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f42960a ? 1 : 0);
        r9.b.J(parcel, 2, this.f42961b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f42962c);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f42963d);
        r9.b.Q(parcel, 5, 8);
        parcel.writeLong(this.f42964e);
        r9.b.S(parcel, iR);
    }
}
