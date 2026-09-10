package ea;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends l9.a {
    public static final Parcelable.Creator<x3> CREATOR = new android.support.v4.media.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39916a;

    public x3(ArrayList arrayList) {
        this.f39916a = arrayList;
    }

    public static x3 b(v2... v2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(v2VarArr[0].f39806a));
        return new x3(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.H(parcel, 1, this.f39916a);
        r9.b.S(parcel, iR);
    }
}
