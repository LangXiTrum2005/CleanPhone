package ia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import k9.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends l9.a {
    public static final Parcelable.Creator<f> CREATOR = new f9.d(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionResult f42976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f42977c;

    public f(int i10, ConnectionResult connectionResult, w wVar) {
        this.f42975a = i10;
        this.f42976b = connectionResult;
        this.f42977c = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f42975a);
        r9.b.I(parcel, 2, this.f42976b, i10);
        r9.b.I(parcel, 3, this.f42977c, i10);
        r9.b.S(parcel, iR);
    }
}
