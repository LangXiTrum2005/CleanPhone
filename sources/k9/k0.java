package k9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l9.a {
    public static final Parcelable.Creator<k0> CREATOR = new f9.d(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f44467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i9.c[] f44468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f44470d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.C(parcel, 1, this.f44467a);
        r9.b.N(parcel, 2, this.f44468b, i10);
        int i11 = this.f44469c;
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(i11);
        r9.b.I(parcel, 4, this.f44470d, i10);
        r9.b.S(parcel, iR);
    }
}
