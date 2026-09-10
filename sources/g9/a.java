package g9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new f9.d(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f41743c;

    public a(int i10, int i11, Bundle bundle) {
        this.f41741a = i10;
        this.f41742b = i11;
        this.f41743c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f41741a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f41742b);
        r9.b.C(parcel, 3, this.f41743c);
        r9.b.S(parcel, iR);
    }
}
