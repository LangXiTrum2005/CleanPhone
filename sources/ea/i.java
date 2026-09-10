package ea;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends l9.a {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f39467a;

    public i(Bundle bundle) {
        this.f39467a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.C(parcel, 1, this.f39467a);
        r9.b.S(parcel, iR);
    }
}
