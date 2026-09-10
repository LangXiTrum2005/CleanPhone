package h9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new f9.d(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f42247a;

    public a(Intent intent) {
        this.f42247a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.I(parcel, 1, this.f42247a, i10);
        r9.b.S(parcel, iR);
    }
}
