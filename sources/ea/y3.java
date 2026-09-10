package ea;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends l9.a {
    public static final Parcelable.Creator<y3> CREATOR = new android.support.v4.media.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39930a;

    public y3(ArrayList arrayList) {
        this.f39930a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.O(parcel, 1, this.f39930a);
        r9.b.S(parcel, iR);
    }
}
