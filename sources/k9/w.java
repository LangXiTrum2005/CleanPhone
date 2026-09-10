package k9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends l9.a {
    public static final Parcelable.Creator<w> CREATOR = new f9.d(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f44522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectionResult f44523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44525e;

    public w(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f44521a = i10;
        this.f44522b = iBinder;
        this.f44523c = connectionResult;
        this.f44524d = z10;
        this.f44525e = z11;
    }

    public final boolean equals(Object obj) {
        Object p0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f44523c.equals(wVar.f44523c)) {
            return false;
        }
        Object p0Var2 = null;
        IBinder iBinder = this.f44522b;
        if (iBinder == null) {
            p0Var = null;
        } else {
            int i10 = a.f44397b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            p0Var = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new p0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 5);
        }
        IBinder iBinder2 = wVar.f44522b;
        if (iBinder2 != null) {
            int i11 = a.f44397b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            p0Var2 = iInterfaceQueryLocalInterface2 instanceof j ? (j) iInterfaceQueryLocalInterface2 : new p0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 5);
        }
        return c0.l(p0Var, p0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f44521a);
        r9.b.F(parcel, 2, this.f44522b);
        r9.b.I(parcel, 3, this.f44523c, i10);
        r9.b.Q(parcel, 4, 4);
        parcel.writeInt(this.f44524d ? 1 : 0);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f44525e ? 1 : 0);
        r9.b.S(parcel, iR);
    }
}
