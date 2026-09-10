package ia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j9.o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends l9.a implements o {
    public static final Parcelable.Creator<e> CREATOR = new f9.d(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42974b;

    public e(ArrayList arrayList, String str) {
        this.f42973a = arrayList;
        this.f42974b = str;
    }

    @Override // j9.o
    public final Status getStatus() {
        return this.f42974b != null ? Status.f11649e : Status.f11653i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.L(parcel, 1, this.f42973a);
        r9.b.J(parcel, 2, this.f42974b);
        r9.b.S(parcel, iR);
    }
}
